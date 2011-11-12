package finappers.eazybk.child;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class Loans extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ListView list = (ListView) findViewById(R.id.ListView01);
        list.setClickable(true);

        final List<LoanListItem> listOfLoans = new ArrayList<LoanListItem>();
        listOfLoans.add(new LoanListItem("Test", new Date(), new Date(),0));
        listOfLoans.add(new LoanListItem("Test", new Date(), new Date(),0));
        listOfLoans.add(new LoanListItem("Test", new Date(), new Date(),0));

        LoanListAdapter adapter = new LoanListAdapter(this, listOfLoans);

        /*
        list.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View view, int position, long index) {
                System.out.println("sadsfsf");
                showToast(listOfLoans.get(position).getName());
            }
        });
*/
        list.setAdapter(adapter);
    }
}