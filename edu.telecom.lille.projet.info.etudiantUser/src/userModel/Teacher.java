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
	 */
	public Teacher() {
		// Start of user code constructor for Teacher)
		super();
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
	public void createContrainteH(String idContrainte, Date dateDebut, Date dateFin, String commentaire,
			String idTeacher) {
		// Start of user code for method createContrainteH
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
