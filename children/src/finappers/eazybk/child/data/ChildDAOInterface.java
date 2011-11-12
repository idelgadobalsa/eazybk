package finappers.eazybk.child.data;

import java.util.List;

import finappers.eazybk.common.business.AccountInterface;
import finappers.eazybk.common.business.LoanInterface;
import finappers.eazybk.common.business.LoanRequestInterface;

public interface ChildDAOInterface {

	public List<?> getAccounts();

	public AccountInterface getAccount(int id);

	public List<?> getLoans();

	public LoanInterface getLoan(int id);

	public List<?> getLoanRequests();

	public LoanRequestInterface getLoanRequest(int id);

	public void createLoanRequest(LoanRequestInterface loanRequest);

	public void updateAccount(AccountInterface account);
}
