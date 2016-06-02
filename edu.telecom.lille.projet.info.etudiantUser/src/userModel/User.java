/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package userModel;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of User.
 * 
 * @author ckabous
 */
public class User {
	/**
	 * Description of the property login.
	 */
	protected String login = "";

	/**
	 * Description of the property surname.
	 */
	protected String surname = "";

	/**
	 * Description of the property firstname.
	 */
	protected String firstname = "";

	/**
	 * Description of the property password.
	 */
	protected String password = "";

	// Start of user code (user defined attributes for User)

	// End of user code

	/**
	 * The constructor.
	 */
	public User(String login, String name, String firstname, String password) {
		// Start of user code constructor for User)

		// End of user code
	}

	// Start of user code (user defined methods for User)

	// End of user code
	/**
	 * Returns login.
	 * @return login 
	 */
	public String getLogin() {
		return this.login;
	}

	/**
	 * Sets a value to attribute login. 
	 * @param newLogin 
	 */
	public void setLogin(String newLogin) {
		this.login = newLogin;
	}

	/**
	 * Returns surname.
	 * @return surname 
	 */
	public String getSurname() {
		return this.surname;
	}

	/**
	 * Sets a value to attribute surname. 
	 * @param newSurname 
	 */
	public void setSurname(String newSurname) {
		this.surname = newSurname;
	}

	/**
	 * Returns firstname.
	 * @return firstname 
	 */
	public String getFirstname() {
		return this.firstname;
	}

	/**
	 * Sets a value to attribute firstname. 
	 * @param newFirstname 
	 */
	public void setFirstname(String newFirstname) {
		this.firstname = newFirstname;
	}

	/**
	 * Returns password.
	 * @return password 
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * Sets a value to attribute password. 
	 * @param newPassword 
	 */
	public void setPassword(String newPassword) {
		this.password = newPassword;
	}

}
