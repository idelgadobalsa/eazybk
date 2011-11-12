package finappers.eazybk.child;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

public class LoanListAdapter extends BaseAdapter implements OnClickListener {
    private Context context;

    private List<LoanListItem> listLoan;

    public LoanListAdapter(Context context, List<LoanListItem> listLoan) {
        this.context = context;
        this.listLoan = listLoan;
    }

    public int getCount() {
        return listLoan.size();
    }

    public Object getItem(int position) {
        return listLoan.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup viewGroup) {
        LoanListItem entry = listLoan.get(position);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.loan_row, null);
        }
        TextView loanName = (TextView) convertView.findViewById(R.id.loanName);
        loanName.setText(entry.getName());

        //TODO do same for startDate, endDate, fee, progressbar
        

        return convertView;
    }

    
    public void onClick(View view) {
        LoanListItem entry = (LoanListItem) view.getTag();
        listLoan.remove(entry);
        // listPhonebook.remove(view.getId());
        notifyDataSetChanged();

    }

    private void showDialog(LoanListItem entry) {
        // Create and show your dialog
        // Depending on the Dialogs button clicks delete it or do nothing
    }

}
