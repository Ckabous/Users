/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package userModel;

import java.util.Date;

import userModel.User;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Teacher.
 * 
 * @author ckabous
 */
public class Teacher extends User {
	/**
	 * Description of the property idTeacher.
	 */
	private String idTeacher = "";

	// Start of user code (user defined attributes for Teacher)

	// End of user code

	/**
	 * The constructor.
	 * @param password 
	 * @param firstname 
	 * @param name 
	 * @param idTeacher2 
	 * @param login 
	 */
	public Teacher(String login, String idTeacher2, String name, String firstname, String password) {
		// Start of user code constructor for Teacher)
		super(login, name, firstname, password);
		this.idTeacher = idTeacher2;
		// End of user code
	}

	/**
	 * Description of the method createContrainteH.
	 * @param idContrainte 
	 * @param dateDebut 
	 * @param dateFin 
	 * @param commentaire 
	 * @param idTeacher 
	 */
	public static ContrainteH createContrainteH(String idContrainte, Date dateDebut, Date dateFin, String commentaire,
			String idTeacher) {
		// Start of user code for method createContrainteH
		ContrainteH contrainte = new ContrainteH(idContrainte, dateDebut, dateFin, commentaire);
		return (contrainte);
		// End of user code
	}

	// Start of user code (user defined methods for Teacher)

	// End of user code
	/**
	 * Returns idTeacher.
	 * @return idTeacher 
	 */
	public String getIdTeacher() {
		return this.idTeacher;
	}

	/**
	 * Sets a value to attribute idTeacher. 
	 * @param newIdTeacher 
	 */
	public void setIdTeacher(String newIdTeacher) {
		this.idTeacher = newIdTeacher;
	}

}
