/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package userModel;

import userModel.User;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Admin.
 * 
 * @author ckabous
 */
public class Admin extends User {
	/**
	 * Description of the property idAdmin.
	 */
	private String idAdmin = "";

	// Start of user code (user defined attributes for Admin)

	// End of user code

	/**
	 * The constructor.
	 */
	public Admin() {
		// Start of user code constructor for Admin)
		super();
		// End of user code
	}

	/**
	 * Description of the method createStudent.
	 * @param login 
	 * @param name 
	 * @param firstname 
	 * @param password 
	 */
	public void createStudent(String login, String name, String firstname, String password, String idStudent) {
		// Start of user code for method createStudent
		Student student = new Student (login, name, firstname, password, idStudent);

		// End of user code
	}

	/**
	 * Description of the method associateStudentGroup.
	 * @param idStudent 
	 * @param idGroup 
	 */
	public void associateStudentGroup(String idStudent, String idGroup) {
		// Start of user code for method associateStudentGroup
		// End of user code
	}

	/**
	 * Description of the method createGroup.
	 * @param idGroup 
	 * @param nbPart 
	 */
	public void createGroup(String idGroup, int nbPart) {
		// Start of user code for method createGroup
		Group group;
		group = new Group (idGroup, nbPart);
		
		// End of user code
	}

	/**
	 * Description of the method createTeacher.
	 * @param login 
	 * @param name 
	 * @param firstname 
	 * @param password 
	 */
	public void createTeacher(String login, String name, String firstname, String password) {
		// Start of user code for method createTeacher
		// End of user code
	}

	/**
	 * Description of the method createAdmin.
	 * @param login 
	 * @param name 
	 * @param firstname 
	 * @param password 
	 */
	public void createAdmin(String login, String name, String firstname, String password) {
		// Start of user code for method createAdmin
		// End of user code
	}

	// Start of user code (user defined methods for Admin)

	// End of user code
	/**
	 * Returns idAdmin.
	 * @return idAdmin 
	 */
	public String getIdAdmin() {
		return this.idAdmin;
	}

	/**
	 * Sets a value to attribute idAdmin. 
	 * @param newIdAdmin 
	 */
	public void setIdAdmin(String newIdAdmin) {
		this.idAdmin = newIdAdmin;
	}

}
