/**
 * 
 */
package finappers.eazybk.common.business;

import java.util.Date;

/**
 * @author ifraixedes
 *
 */
 interface CreditInterface {

	 float getTotalAmount() ;
	 void setTotalAmount(float totalAmount);
	 float getPercentageInterest();
	 void setPercentageInterest(float percentageInterest);
	 Date getInitDate();
	 void setInitDate(Date initDate);
	 Date getEndDate();
	 void setEndDate(Date endDate);
	 String getName();
	 void setName(String name);
	
}
