package finappers.eazybk.common.business;

interface AccountInterface {
	
	float getBalance();
	void setBalance(float balance); 
	String getName();
	void setName(String name);
	void substract(float amount);
	void add(float amount);
}