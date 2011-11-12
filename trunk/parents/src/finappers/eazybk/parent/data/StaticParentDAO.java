/**
 * 
 */
package finappers.eazybk.parent.data;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import finappers.eazybk.common.business.AccountInterface;
import finappers.eazybk.common.business.BasicAccount;
import finappers.eazybk.common.business.BasicLoan;
import finappers.eazybk.common.business.BasicLoanRequest;
import finappers.eazybk.common.business.LoanInterface;
import finappers.eazybk.common.business.LoanRequestInterface;
import finappers.eazybk.common.business.PayInterface;
import finappers.eazybk.parent.business.BasicChild;
import finappers.eazybk.parent.business.ChildInterface;

/**
 * @author ifraixedes
 *
 */
public class StaticParentDAO implements ParentDAOInterface {

	/* (non-Javadoc)
	 * @see finappers.eazybk.parent.data.ParentDAOInterface#getAccounts(finappers.eazybk.parent.business.ChildInterface)
	 */
	public List<BasicAccount> getAccounts(String childName) {
	
		LinkedList<BasicAccount> accountList = new LinkedList<BasicAccount>(); 
		accountList.add(new BasicAccount("CASH", 200.0f));
		accountList.add(new BasicAccount("SAVING", 1000.0f));
		
		return accountList;	
	}

	/* (non-Javadoc)
	 * @see finappers.eazybk.parent.data.ParentDAOInterface#getLoans(finappers.eazybk.parent.business.ChildInterface)
	 */
	public List<BasicLoan> getLoans(String childName) {
		LinkedList<BasicLoan> loanList = new LinkedList<BasicLoan>(); 
		loanList.add(new BasicLoan("X-Box", 250, 2, new Date(), new Date(2012, 07, 30)));
		
		return loanList;	
	}

	/* (non-Javadoc)
	 * @see finappers.eazybk.parent.data.ParentDAOInterface#getLoan(int)
	 */
	public LoanInterface getLoan(int id) {
		return new BasicLoan("X-Box", 250, 2, new Date(2011, 07, 30), new Date(2012, 07, 30));
	}

	/* (non-Javadoc)
	 * @see finappers.eazybk.parent.data.ParentDAOInterface#getLoanRequests(finappers.eazybk.parent.business.ChildInterface)
	 */
	public List<BasicLoanRequest> getLoanRequests(String childName) {
		LinkedList<BasicLoanRequest> loanReqList = new LinkedList<BasicLoanRequest>(); 
		loanReqList.add(new BasicLoanRequest("Play 3", 500, new Date(), new Date(2013, 2, 30)));
		
		return loanReqList;
	}

	/* (non-Javadoc)
	 * @see finappers.eazybk.parent.data.ParentDAOInterface#getLoanRequest(int)
	 */
	public LoanRequestInterface getLoanRequest(int id) {
		return new BasicLoanRequest("Play 3", 500, new Date(), new Date(2013, 2, 30));
	}

	/* (non-Javadoc)
	 * @see finappers.eazybk.parent.data.ParentDAOInterface#getChildren()
	 */
	public List<BasicChild> getChildren() {
		LinkedList<BasicChild> children = new LinkedList<BasicChild>();
		children.add(new BasicChild());
		children.add(new BasicChild());
		
		return children;
	}

	/* (non-Javadoc)
	 * @see finappers.eazybk.parent.data.ParentDAOInterface#updateAccount(finappers.eazybk.common.business.AccountInterface)
	 */
	public void updateAccount(AccountInterface account) {
		// This basic class not make anything in this method

	}

	/* (non-Javadoc)
	 * @see finappers.eazybk.parent.data.ParentDAOInterface#setPayChild(finappers.eazybk.common.business.PayInterface, finappers.eazybk.parent.business.ChildInterface)
	 */
	public void setPayChild(PayInterface pay, ChildInterface child) {
		//This basic class not make anything in this method

	}

	public void setPayChild(PayInterface pay, String childName) {
		// TODO Auto-generated method stub
		
	}

}
