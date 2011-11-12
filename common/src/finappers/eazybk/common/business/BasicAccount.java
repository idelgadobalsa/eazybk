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
	protected float balance;
	protected String name;



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
	public void substract(float amount) {
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
