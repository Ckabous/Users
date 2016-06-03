package userModel;

import userController.UserController;
/**
 * Cette classe permet de tester les fonctions du contrôleur d'utilisateurs.
 * Elle crée une base de données de 6 utilisateurs et les sauvegarde dans le fichier "usersDB.xml". 
 * 
 * @author Jose Mennesson (Mettre à jour)
 * @version 04/2016 (Mettre à jour)
 * 
 */

//TODO Classe pouvant être modifiée suivant vos besoins

public class Main {
	/**
	 * Fonction principale 
	 * 
	 * @param args
	 * 			Les arguments donnés en entrée du programme.
	 * 
	 */
	public static void main(String args[]){
		/*final String userfile="userDB.xml";
		final String tTfile="timeTableDB.xml";
	    final UserController userController=new UserController(userfile);
	    final TimeTableController tTController=new TimeTableController(tTfile);
		java.awt.EventQueue.invokeLater(new Runnable() {
	         public void run() {
	            createAndShowUI(userController,tTController);
	         }*/
		final String userfile="userDB.xml";
		UserDB userDB=new UserDB(userfile);
		userDB.addTeacher("Lol","1024","Tony","Bouboule","Globe");
		userDB.addStudent("Deux","322","Valve","Dota","42","MOBA");
		userDB.addAdmin(" login"," idAdmin", " surname", " firstname"," password");
		System.out.println(userDB.users);
	      };
	}

