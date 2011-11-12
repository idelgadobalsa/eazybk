/**
 * 
 */
package finappers.eazybk.common.business;

/**
 * @author ifraixedes
 * 
 */
public class BasicAccount implements AccountInterface {
	/** Attributes */
	protected String name;
	protected float balance;




	public BasicAccount(String name, float balance) {
		super();
		this.name = name;
		this.balance = balance;
	}

	/**
	 * @return the balance
	 */
	public float getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(float balance) {
		this.balance = balance;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Operation
	 * 
	 * @param amount
	 * @return
	 */
	public void subtract(float amount) {
	}

	/**
	 * Operation
	 * 
	 * @param amount
	 * @return
	 */
	public void add(float amount) {
	}
}
