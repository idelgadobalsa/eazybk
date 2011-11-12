package finappers.eazybk.child;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ModifyCash extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.modifycash);

		byte transactionType = getIntent().getExtras().getByte("transactionType");
				
		TextView transactionName = (TextView) findViewById(R.id.transactionTypeName);

		if (transactionType > 0) {
			transactionName.setText("Incomming");
		} else if (transactionType < 0) {
			transactionName.setText("Expense");
		} else {
			transactionName.setText("Unknow");
		}
	}
}
