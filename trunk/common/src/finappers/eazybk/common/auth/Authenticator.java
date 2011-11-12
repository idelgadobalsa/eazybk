package finappers.eazybk.common.auth;


public class Authenticator {

	private static Authenticator instance;
	
	private Authenticator() {
	}

	public static Authenticator getInstance() {
		if (Authenticator.instance == null) {
			Authenticator.instance = new Authenticator();
		}

		return Authenticator.instance;
	}
	
	public AuthResult authenticate(AuthAdapterInterface adpater) {
		return adpater.authenticate();
	}
}
