package finappers.eazybk.parent.business;

import java.util.List;

import finappers.eazybk.common.business.BasicAccount;
import finappers.eazybk.common.business.BasicLoan;
import finappers.eazybk.common.business.BasicLoanRequest;
import finappers.eazybk.common.data.StaticDAOFactory;
import finappers.eazybk.parent.data.StaticParentDAO;

public class BasicChild implements ChildInterface {
	
	protected static int counter;
	protected String name;
	protected StaticParentDAO parentDAO;

	public BasicChild() {
		name = name + " " + Integer.toString(counter++);
		parentDAO = (StaticParentDAO) StaticDAOFactory.getInstance().getParentDAO(); 
	}
	
	public String getName() {
		return name;
	}	

	public List<BasicAccount> getAccounts() {
		return parentDAO.getAccounts(name);
	}

	public List<BasicLoanRequest> getLoansRequest() {
		return parentDAO.getLoanRequests(name);
	}

	public List<BasicLoan> getLoans() {
		return parentDAO.getLoans(name);
	}



}
