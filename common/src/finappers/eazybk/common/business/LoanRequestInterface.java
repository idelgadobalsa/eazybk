package finappers.eazybk.common.business;

import java.util.Date;

public interface LoanRequestInterface extends LoanWorkflowInterface {

	float getAmount();
	void setAmount(float amount);
	Date getInitDate();
	void setInitDate(Date date);
	Date getEndDate();
	void setEndDate(Date date);
	String getConcept();
	void setConcept(String concept);
	LoanResponseInterface getResponse();
	void setResponse(LoanResponseInterface response);
}
