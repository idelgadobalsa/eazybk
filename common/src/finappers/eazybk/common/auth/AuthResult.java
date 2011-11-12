package finappers.eazybk.common.auth;



public class AuthResult {

	public static enum Results {SUCCESS, FAILS};
	
	protected Results result;
	
	public boolean isSuscessful() {
		if (result == AuthResult.Results.SUCCESS) {
			return true;
		} else {
			return false;
		}
	}
	
	public Results getResult() {
		return result;
	}
	
	public void success() {
		result = Results.SUCCESS;		
	}
	
	public void fail() {
		result = Results.FAILS;		
	}
}
