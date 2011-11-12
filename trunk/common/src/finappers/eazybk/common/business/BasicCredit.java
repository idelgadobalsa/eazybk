/**
 * 
 */
package finappers.eazybk.common.business;

import java.util.Date;

/**
 * @author ifraixedes
 * 
 */
public class BasicCredit implements CreditInterface {
	/** Attributes */
	protected float totalAmount;
	protected float returnedAmount;
	protected float percentageInterest;
	protected float paidAmountInterest;
	protected Date initDate;
	protected Date endDate;
	protected String name;
	/**
	 * @return the totalAmount
	 */
	public float getTotalAmount() {
		return totalAmount;
	}
	/**
	 * @param totalAmount the totalAmount to set
	 */
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
	/**
	 * @return the percentageInterest
	 */
	public float getPercentageInterest() {
		return percentageInterest;
	}
	/**
	 * @param percentageInterest the percentageInterest to set
	 */
	public void setPercentageInterest(float percentageInterest) {
		this.percentageInterest = percentageInterest;
	}
	/**
	 * @return the initDate
	 */
	public Date getInitDate() {
		return initDate;
	}
	/**
	 * @param initDate the initDate to set
	 */
	public void setInitDate(Date initDate) {
		this.initDate = initDate;
	}
	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}
	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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
	 * @return the returnedAmount
	 */
	public float getReturnedAmount() {
		return returnedAmount;
	}
	/**
	 * @return the paidAmountInterest
	 */
	public float getPaidAmountInterest() {
		return paidAmountInterest;
	}
	
	//@todo check this method for warranty precision
	public int getTotalNumMonths() {
		float numMonths = (endDate.getTime() - initDate.getTime()) / 2592000000f;
		
		return (int) numMonths;
	}
	
	//@todo check this method for warranty precision
	public int getRemainingNumMonths() {
		float numMonths = (endDate.getTime() - (new Date()).getTime()) / 2592000000f;
		
		return (int) numMonths;		
	}
	
	
}
