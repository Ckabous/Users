/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package userModel;

import java.util.Date;
import java.text.SimpleDateFormat;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of ContrainteH.
 * 
 * @author ckabous
 */
public class ContrainteH {
	/**
	 * Description of the property dateDebut.
	 */
	private Date dateDebut =new Date() ;

	/**
	 * Description of the property dateFin.
	 */
	private Date dateFin = new Date();

	/**
	 * Description of the property idContrainte.
	 */
	private String idContrainte = "";

	/**
	 * Description of the property commentaire.
	 */
	private String commentaire = "";

	// Start of user code (user defined attributes for ContrainteH)

	// End of user code

	/**
	 * The constructor.
	 * @param commentaire2 
	 * @param dateFin2 
	 * @param dateDebut2 
	 * @param idContrainte2 
	 */
	public ContrainteH(String idContrainte2, Date dateDebut2, Date dateFin2, String commentaire2) {
		// Start of user code constructor for ContrainteH)
		this.idContrainte = idContrainte2;
		this.dateDebut = dateDebut2;
		this.dateFin= dateFin2;
		this.commentaire = commentaire2;
		// End of user code
	}

	// Start of user code (user defined methods for ContrainteH)

	// End of user code
	/**
	 * Returns dateDebut.
	 * @return dateDebut 
	 */
	public Date getDateDebut() {
		return this.dateDebut;
	}

	/**
	 * Sets a value to attribute dateDebut. 
	 * @param newDateDebut 
	 */
	public void setDateDebut(Date newDateDebut) {
		this.dateDebut = newDateDebut;
	}

	/**
	 * Returns dateFin.
	 * @return dateFin 
	 */
	public Date getDateFin() {
		return this.dateFin;
	}

	/**
	 * Sets a value to attribute dateFin. 
	 * @param newDateFin 
	 */
	public void setDateFin(Date newDateFin) {
		this.dateFin = newDateFin;
	}

	/**
	 * Returns idContrainte.
	 * @return idContrainte 
	 */
	public String getIdContrainte() {
		return this.idContrainte;
	}

	/**
	 * Sets a value to attribute idContrainte. 
	 * @param newIdContrainte 
	 */
	public void setIdContrainte(String newIdContrainte) {
		this.idContrainte = newIdContrainte;
	}

	/**
	 * Returns commentaire.
	 * @return commentaire 
	 */
	public String getCommentaire() {
		return this.commentaire;
	}

	/**
	 * Sets a value to attribute commentaire. 
	 * @param newCommentaire 
	 */
	public void setCommentaire(String newCommentaire) {
		this.commentaire = newCommentaire;
	}

}
