/**
 * 
 */
package finappers.eazybk.common.business;

/**
 * @author ifraixedes
 *
 */
public interface LoanWorkflowInterface {

	boolean isApproved();
	boolean isDenied();
	boolean isWaiting();
	void approve();
	void deny();
}
