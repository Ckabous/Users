/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package userModel;

import userModel.User;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Student.
 * 
 * @author ckabous
 */
public class Student extends User {
	/**
	 * Description of the property idStudent.
	 */
	private String idStudent = "";

	/**
	 * Description of the property idGroup.
	 */
	private String idGroup = "";

	// Start of user code (user defined attributes for Student)

	// End of user code

	/**
	 * The constructor.
	 * @param password 
	 * @param firstname 
	 * @param name 
	 * @param login 
	 */
	public Student(String login, String name, String firstname, String password, String idStudent) {
		// Start of user code constructor for Student)
		super(login, name, firstname, password);
		this.idStudent=idStudent;
		// End of user code
	}

	// Start of user code (user defined methods for Student)

	// End of user code
	/**
	 * Returns idStudent.
	 * @return idStudent 
	 */
	public String getIdStudent() {
		return this.idStudent;
	}

	/**
	 * Sets a value to attribute idStudent. 
	 * @param newIdStudent 
	 */
	public void setIdStudent(String newIdStudent) {
		this.idStudent = newIdStudent;
	}

	/**
	 * Returns idGroup.
	 * @return idGroup 
	 */
	public String getIdGroup() {
		return this.idGroup;
	}

	/**
	 * Sets a value to attribute idGroup. 
	 * @param newIdGroup 
	 */
	public void setIdGroup(String newIdGroup) {
		this.idGroup = newIdGroup;
	}

}
