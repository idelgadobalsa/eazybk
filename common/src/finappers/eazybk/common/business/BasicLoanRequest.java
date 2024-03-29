/**
 * 
 */
package finappers.eazybk.common.business;

import java.util.Date;

/**
 * @author ifraixedes
 * 
 */


public class BasicLoanRequest extends BasicLoanWorkflowAbstract implements LoanRequestInterface { 

	protected String concept;
	protected String description;
	protected float amount;
	protected Date initDate;
	protected Date endDate;
	protected Date requestDate;
	protected BasicLoanResponse response;

	
	public BasicLoanRequest() {
		response = null;
	}

	public BasicLoanRequest(String concept, float amount, Date initDate,
			Date endDate) {
		this.response = null;
		this.concept = concept;
		this.amount = amount;
		this.initDate = initDate;
		this.endDate = endDate;
	}

	/**
	 * @return the concept
	 */
	public String getConcept() {
		return concept;
	}

	/**
	 * @param concept the concept to set
	 */
	public void setConcept(String concept) {
		this.concept = concept;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the amount
	 */
	public float getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(float amount) {
		this.amount = amount;
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
	 * @return the requestDate
	 */
	public Date getRequestDate() {
		return requestDate;
	}
	/**
	 * @param requestDate the requestDate to set
	 */
	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	@Override
	public LoanResponseInterface getResponse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setResponse(LoanResponseInterface response) {
		// TODO Auto-generated method stub
		
	}
	
	
}
