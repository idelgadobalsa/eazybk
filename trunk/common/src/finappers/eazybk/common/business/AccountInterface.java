package finappers.eazybk.common.business;

public interface AccountInterface {
	
	float getBalance();
	void setBalance(float balance); 
	String getName();
	void setName(String name);
	void subtract(float amount);
	void add(float amount);
}
