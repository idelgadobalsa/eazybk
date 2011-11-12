package finappers.eazybk.common.business;



public interface PayInterface {
	
	enum PeriodTypes {ANNUAL, MONTHLY, WEEKELY, DAYLY};	

	float getAmount();
	void setAmount(float amount);
	PeriodTypes getPeriodType();
	void setPeriodType(PeriodTypes type);
	byte getPeriodUnits();
	void setPeriodUnits(byte units);	
}
