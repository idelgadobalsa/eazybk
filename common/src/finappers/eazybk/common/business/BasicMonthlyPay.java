/**
 * 
 */
package finappers.eazybk.common.business;

/**
 * @author ifraixedes
 *
 */
public class BasicMonthlyPay implements PayInterface {

	protected float amount;
	/* (non-Javadoc)
	 * @see finappers.eazybk.common.business.PayInterface#getAmount()
	 */
	@Override
	public float getAmount() {
		return amount;
	}

	/* (non-Javadoc)
	 * @see finappers.eazybk.common.business.PayInterface#setAmount(float)
	 */
	@Override
	public void setAmount(float amount) {
		this.amount = amount;
	}

	/* (non-Javadoc)
	 * @see finappers.eazybk.common.business.PayInterface#getPeriodType()
	 */
	@Override
	public PeriodTypes getPeriodType() {
		return PeriodTypes.MONTHLY;
	}

	/* (non-Javadoc)
	 * @see finappers.eazybk.common.business.PayInterface#setPeriodType(finappers.eazybk.common.business.PayInterface.PeriodTypes)
	 */
	@Override
	public void setPeriodType(PeriodTypes type) {
		//This basic class not allow change period type

	}

	/* (non-Javadoc)
	 * @see finappers.eazybk.common.business.PayInterface#getPeriodUnits()
	 */
	@Override
	public byte getPeriodUnits() {
		return 1;
	}

	/* (non-Javadoc)
	 * @see finappers.eazybk.common.business.PayInterface#setPeriodUnits(byte)
	 */
	@Override
	public void setPeriodUnits(byte units) {
		//This basic class not allow change units
	}

}
