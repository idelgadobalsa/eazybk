/**
 * 
 */
package finappers.eazybk.common.business;

/**
 * @author ifraixedes
 *
 */
public class TransactionAbstract implements TransactionInterface {

	 /** Attributes */
	  protected float amount;
	  protected String name;
	  
	/* (non-Javadoc)
	 * @see finappers.eazybk.common.business.TransactionInterface#getAmount()
	 */
	@Override
	public float getAmount() {
		return amount;
	}

	/* (non-Javadoc)
	 * @see finappers.eazybk.common.business.TransactionInterface#setAmount(float)
	 */
	@Override
	public void setAmount(float amount) {
		this.amount = amount;
	}

	/* (non-Javadoc)
	 * @see finappers.eazybk.common.business.TransactionInterface#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see finappers.eazybk.common.business.TransactionInterface#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

}
