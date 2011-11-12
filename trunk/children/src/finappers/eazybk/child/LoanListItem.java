package finappers.eazybk.child;

import java.util.Date;

public class LoanListItem {

	private String name;
	private Date startDate;
	private Date endDate;
	private float fee;
	
	public LoanListItem(String name, Date startDate, Date endDate, float fee){
		super();
		this.name=name;
		this.startDate=startDate;
		this.endDate=endDate;
		this.fee=fee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public float getFee() {
		return fee;
	}

	public void setFee(float fee) {
		this.fee = fee;
	}
}
