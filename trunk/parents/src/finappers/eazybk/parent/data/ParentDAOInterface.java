package finappers.eazybk.parent.data;

import java.util.List;

import finappers.eazybk.common.business.AccountInterface;
import finappers.eazybk.common.business.LoanInterface;
import finappers.eazybk.common.business.LoanRequestInterface;
import finappers.eazybk.common.business.PayInterface;


public interface ParentDAOInterface {

	public List<?> getAccounts(String childName);


	public List<?> getLoans(String childName);


	public LoanInterface getLoan(int id);


	public List<?> getLoanRequests(String childName);


	public LoanRequestInterface getLoanRequest(int id);


	public List<?> getChildren();


	public void updateAccount(AccountInterface account);


	public void setPayChild(PayInterface pay, String childName);
}
