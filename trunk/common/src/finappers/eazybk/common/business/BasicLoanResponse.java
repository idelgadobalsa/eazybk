/**
 * 
 */
package finappers.eazybk.common.business;

import java.util.Date;

/**
 * @author ifraixedes
 * 
 */

public class BasicLoanResponse extends BasicLoanWorkflowAbstract implements LoanResponseInterface {

	protected String details;
	protected Date responseDate;

	
	public BasicLoanResponse() {
		this.state = simpleStates.WAITING;
	}
	
	/**
	 * @return the details
	 */
	public String getDetails() {
		return details;
	}

	/**
	 * @param details
	 *            the details to set
	 */
	public void setDetails(String details) {
		this.details = details;
	}

	/**
	 * @return the responseDate
	 */
	public Date getResponseDate() {
		return responseDate;
	}

	/**
	 * @param responseDate
	 *            the responseDate to set
	 */
	public void setResponseDate(Date responseDate) {
		this.responseDate = responseDate;
	}
	

}
