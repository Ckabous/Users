package userController;

import java.util.Iterator;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import java.io.*;

import userModel.UserDB;
import userModel.*;
/**
 * Cette classe est le controleur d'utilisateurs que vous devez implementer. 
 * Elle contient un attribut correspondant a� la base de donnees utilisateurs que vous allez creer.
 * Elle contient toutes les fonctions de l'interface IUserController que vous devez implementer.
 * 
 * @author Jose Mennesson (Mettre à jour)
 * @version 04/2016 (Mettre à jour)
 * 
 */

//TODO Classe à modifier

public class UserController implements IUserController
{
	
	/**
	 * Contient une instance de base de données d'utilisateurs
	 * 
	 */
	
	/*private UserDB userDB1=null;
	Element rootElt = new Element("Users");
	org.jdom2.Document document = new Document(rootElt);
		Element UserModelElt = new Element("UserModel");
			Element AdminElt = new Element("Admin");
		 
	rootElt.addcontent(UserModelElt);*/
	
	
	private UserDB userDB=null;
	
	
	/**
	 * Constructeur de controleur d'utilisateurs créant la base de données d'utilisateurs
	 * 
	 * @param userfile
	 * 		Fichier XML contenant la base de données d'utilisateurs
	 */
	public UserController(String userfile){
		UserDB userDB=new UserDB(userfile);
		this.setUserDB(userDB);
	}

	@Override
	public String getUserName(String userLogin) {
		
		
		
		return null;
	}

	@Override
	public String getUserClass(String userLogin, String userPwd) {
		User user = User.getUser;
		
		return null;
	}

	@Override
	public int getStudentGroup(String studentLogin) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean addAdmin(String adminLogin, String newAdminlogin, int adminID, String firstname, String surname,
			String pwd) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addTeacher(String adminLogin, String newteacherLogin, int teacherID, String firstname,
			String surname, String pwd) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addStudent(String adminLogin, String newStudentLogin, int studentID, String firstname,
			String surname, String pwd) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeUser(String adminLogin, String userLogin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addGroup(String adminLogin, int groupId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeGroup(String adminLogin, int groupId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean associateStudToGroup(String adminLogin, String studentLogin, int groupId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String[] usersToString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] usersLoginToString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] studentsLoginToString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] groupsIdToString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] groupsToString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean loadDB() {
		org.jdom2.Document document = null ;
		Element rootElt;
		SAXBuilder sxb = new SAXBuilder();
		
		try{
			document = sxb.build(new File("Users.xml"));
		}
		catch(Exception e){}
		
		if(document!=null){
			rootElt = document.getRootElement();
			List<Element> adminElts = rootElt.getChildren("Admin");
			Iterator<Element> itAdmin = adminElts.iterator();
			while(itAdmin.hasNext()){
					Element anAdminElt = (Element)itAdmin.next();
					String idAdmin=anAdminElt.getChild("idAdmin").getText();
			}
		}
		
		return false;
			
	}

	@Override
	public boolean saveDB() {
		try{
			XMLOutputter sortie =
					new XMLOutputter(Format.getPrettyFormat());
			sortie.output(document, new FileOutputStream("Users.xml"));
			
		}catch (IOException e){}
		return false;
	}

	public UserDB getUserDB() {
		return userDB1;
	}

	public void setUserDB(UserDB userDB) {
		this.userDB1 = userDB;
	}
	
	

}

