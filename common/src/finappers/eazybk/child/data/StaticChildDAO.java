/**
 * 
 */
package finappers.eazybk.child.data;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import finappers.eazybk.common.business.AccountInterface;
import finappers.eazybk.common.business.BasicAccount;
import finappers.eazybk.common.business.BasicLoan;
import finappers.eazybk.common.business.BasicLoanRequest;
import finappers.eazybk.common.business.LoanInterface;
import finappers.eazybk.common.business.LoanRequestInterface;

/**
 * @author ifraixedes
 * 
 */
public class StaticChildDAO implements ChildDAOInterface {

	protected static LinkedList<BasicAccount> accountList;
	
	public StaticChildDAO() {
		accountList = new LinkedList<BasicAccount>();
		accountList.add(new BasicAccount("CASH", 200.0f));
		accountList.add(new BasicAccount("SAVING", 1000.0f));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see finappers.eazybk.child.data.ChildDAOInterface#getAccounts()
	 */
	public List<BasicAccount> getAccounts() {
		return accountList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see finappers.eazybk.child.data.ChildDAOInterface#getAccount(int)
	 */
	public AccountInterface getAccount(int id) {
		if (id < accountList.size() && id >= 0) {
			return (AccountInterface) accountList.get(id);
		} else {
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see finappers.eazybk.child.data.ChildDAOInterface#getLoans()
	 */
	public List<BasicLoan> getLoans() {
		LinkedList<BasicLoan> loanList = new LinkedList<BasicLoan>();
		loanList.add(new BasicLoan("X-Box", 250, 2, new Date(), new Date(2012,
				07, 30)));

		return loanList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see finappers.eazybk.child.data.ChildDAOInterface#getLoan(int)
	 */
	public LoanInterface getLoan(int id) {
		return new BasicLoan("X-Box", 250, 2, new Date(2011, 07, 30), new Date(
				2012, 07, 30));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see finappers.eazybk.child.data.ChildDAOInterface#getLoanRequests()
	 */
	public List<BasicLoanRequest> getLoanRequests() {
		LinkedList<BasicLoanRequest> loanReqList = new LinkedList<BasicLoanRequest>();
		loanReqList.add(new BasicLoanRequest("Play 3", 500, new Date(),
				new Date(2013, 2, 30)));

		return loanReqList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see finappers.eazybk.child.data.ChildDAOInterface#getLoanRequest(int)
	 */
	public LoanRequestInterface getLoanRequest(int id) {
		return new BasicLoanRequest("Play 3", 500, new Date(), new Date(2013,
				2, 30));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * finappers.eazybk.child.data.ChildDAOInterface#createLoanRequest(finappers
	 * .eazybk.common.business.LoanRequestInterface)
	 */
	public void createLoanRequest(LoanRequestInterface loanReques) {
		// This basic class not make anything in this method

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * finappers.eazybk.child.data.ChildDAOInterface#updateAccount(finappers
	 * .eazybk.common.business.AccountInterface)
	 */
	public void updateAccount(AccountInterface account) {
		// This basic class not make anything in this method

	}

}
