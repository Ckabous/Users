package userModel;

import java.util.Date;

import java.util.HashMap;
import java.io.*;
import org.jdom2.*;
import org.jdom2.output.*;
import userModel.Admin;

import userModel.*;

/**
 * 
 * Cette classe gére la base de données d'utilisateurs. Elle doit permettre de sauvegarder et charger les utilisateurs et les groupes à partir d'un fichier XML. 
 * La structure du fichier XML devra être la même que celle du fichier userDB.xml.
 * @see <a href="../../userDB.xml">userDB.xml</a> 
 * 
 * @author Jose Mennesson (Mettre à jour)
 * @version 04/2016 (Mettre à jour)
 * 
 */

//TODO Classe à modifier

public class UserDB {
	
	/**
	 * 
	 * Le fichier contenant la base de données.
	 * 
	 */
	
	public static HashMap<String,User> users;
	public static HashMap<String,Group> groups;
	public static HashMap<String,ContrainteH> horaire;
	
	private String file;
	
	/**
	 * 
	 * Constructeur de UserDB. 
	 * 
	 * !!!!!!!!!!!! PENSEZ À AJOUTER UN ADMINISTRATEUR (su par exemple) QUI VOUS PERMETTRA DE CHARGER LA BASE DE DONNÉES AU DEMARRAGE DE L'APPLICATION !!!!!!
	 * 
	 * @param file
	 * 		Le nom du fichier qui contient la base de données.
	 */
	public UserDB(String file){
		//TODO Fonction à modifier
		super();
		Admin admin = new Admin ("su", "0001", "su", "su", "superUser" );
		users.put("su", admin);
		this.setFile(file);
	}
	
	/**
	 * Getter de file
	 * 
	 * @return 
	 * 		Le nom du fichier qui contient la base de données.
	 */
	
	public String getFile() {
		return file;
	}
	
	/**
	 * Setter de file
	 * 
	 * @param file
	 * 		Le nom du fichier qui contient la base de données.
	 */
	
	public void setFile(String file) {
		this.file = file;
	}
	public boolean addAdmin(String login,String idAdmin, String surname, String firstname, String password){
		//creer l'instance java
		Admin admin= userModel.Admin.createAdmin(login,idAdmin,surname,firstname,password);
		users.put(login, admin);
		userController.UserController.saveDB();
		//mettre dans ta base de donnee
		
		
		return true;
	}
	
	public void addTeacher(String login, String idTeacher, String name, String firstname, String password) {
		// Start of user code for method createTeacher
		Teacher teacher = userModel.Admin.createTeacher(login, idTeacher, name, firstname, password);
		users.put(login,teacher);
		userController.UserController.saveDB();
		// End of user code
	}
	
	public void addGroup(String idGroup, int nbPart) {
		// Start of user code for method createGroup
		Group group = userModel.Admin.createGroup (idGroup, nbPart);
		groups.put(idGroup, group);
		userController.UserController.saveDB();
		// End of user code
	}
	
	public void addStudent(String login, String name, String firstname, String password, String idStudent, String idGroup) {
		// Start of user code for method createStudent
		Student student = userModel.Admin.createStudent (login, name, firstname, password, idStudent, idGroup);
		users.put(login, student);
		userController.UserController.saveDB();
		// End of user code
	}
	
	public void addContrainteH(String idContrainte, Date dateDebut, Date dateFin, String commentaire,
			String idTeacher) {
		// Start of user code for method createContrainteH
		ContrainteH contrainte = userModel.Teacher.createContrainteH(idContrainte, dateDebut, dateFin, commentaire, idTeacher);
		horaire.put(idContrainte, contrainte);
		userController.UserController.saveDB();
		// End of user code
	}
}
