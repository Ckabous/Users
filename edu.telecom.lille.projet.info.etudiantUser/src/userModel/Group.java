/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package userModel;

import java.util.HashSet;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Group.
 * 
 * @author ckabous
 */
public class Group {
	/**
	 * Description of the property idGroup.
	 */
	private String idGroup = "";

	/**
	 * Description of the property nbPart.
	 */
	private HashSet<Real> nbPart = new HashSet<Real>();

	/**
	 * Description of the property idStudent.
	 */
	private HashSet<String> idStudent = new HashSet<String>();

	// Start of user code (user defined attributes for Group)

	// End of user code

	/**
	 * The constructor.
	 */
	public Group() {
		// Start of user code constructor for Group)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Group)

	// End of user code
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

	/**
	 * Returns nbPart.
	 * @return nbPart 
	 */
	public HashSet<Real> getNbPart() {
		return this.nbPart;
	}

	/**
	 * Returns idStudent.
	 * @return idStudent 
	 */
	public HashSet<String> getIdStudent() {
		return this.idStudent;
	}

}