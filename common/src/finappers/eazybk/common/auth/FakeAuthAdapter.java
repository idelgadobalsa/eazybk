/**
 * 
 */
package finappers.eazybk.common.auth;


/**
 * @author ifraixedes
 *
 */
public class FakeAuthAdapter implements AuthAdapterInterface {

	protected String userName;
	protected String password;
	
	/* (non-Javadoc)
	 * @see finappers.eazybk.common.auth.AuthAdapterInterface#authenticate()
	 */
	@Override
	public AuthResult authenticate() {
		// This method is a fake login
		AuthResult authResult = new AuthResult();
		
		if ((userName.compareToIgnoreCase("Manolo") == 0) && (password.compareTo("fake") == 0)) {
			authResult.success();
		} else {
			authResult.fail();
		}
		
		return authResult;				
	}
	
	public void setCredentials(String userName, String password) {
		this.userName = userName;
		this.password = password;				
	}

}
