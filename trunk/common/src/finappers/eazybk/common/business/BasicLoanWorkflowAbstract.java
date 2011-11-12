package finappers.eazybk.common.business;

enum simpleStates {WAITING, APPROVED, DENIED};

public class BasicLoanWorkflowAbstract implements LoanWorkflowInterface {
	
	protected simpleStates state;
	
	@Override
	public boolean isApproved() {
		switch (this.state) {
		case APPROVED:
			return true;
		default:
			return false;
		}
	}

	@Override
	public boolean isDenied() {
		switch (this.state) {
		case DENIED:
			return true;
		default:
			return false;
		}
	}

	@Override
	public boolean isWaiting() {
		switch (this.state) {
		case WAITING:
			return true;
		default:
			return false;
		}
	}
	
	@Override
	public void approve() {
		this.state = simpleStates.APPROVED;
		
	}

	@Override
	public void deny() {
		this.state = simpleStates.DENIED;
		
	}

}

