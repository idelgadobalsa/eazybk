package finappers.eazybk.child;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import finappers.eazybk.child.data.StaticChildDAO;
import finappers.eazybk.common.business.BasicAccount;
import finappers.eazybk.common.data.StaticDAOFactory;

public class Dashboard extends Activity {
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        
        
        StaticChildDAO dao = (StaticChildDAO) StaticDAOFactory.getInstance().getChildDAO();
        
        BasicAccount account = (BasicAccount) dao.getAccount(0);
        TextView balance;
        
        if (account != null) {
        	balance = (TextView) findViewById(R.id.cashBalance);
        	balance.setText(Float.toString(account.getBalance()));
        }
        
        account = (BasicAccount) dao.getAccount(1);
        
        if (account != null) {
        	balance = (TextView) findViewById(R.id.savingsBalance);
        	balance.setText(Float.toString(account.getBalance()));
        }
         
    }
    
    public void addIncome(View view) {
    	Intent transactionIntent = new Intent(view.getContext(), ModifyCash.class);     	
    	transactionIntent.putExtra("transactionType", 1);
    	
    	startActivity(transactionIntent);
    	
    }
    
    public void subtractExpense(View view) {
    	Intent transactionIntent = new Intent(view.getContext(), ModifyCash.class);     	
    	transactionIntent.putExtra("transactionType", -1);
    	
    	startActivity(transactionIntent);
    }

}
