package finappers.eazybk.child;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import finappers.eazybk.common.auth.AuthResult;
import finappers.eazybk.common.auth.Authenticator;
import finappers.eazybk.common.auth.FakeAuthAdapter;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    }
    
    public void submitAuth(View view) {
    	
    	EditText userName = (EditText) findViewById(R.id.input_username);
    	EditText password = (EditText) findViewById(R.id.input_password);
    	
    	FakeAuthAdapter fakeAdapter = new FakeAuthAdapter();
    	fakeAdapter.setCredentials(userName.getEditableText().toString(), password.getEditableText().toString());
    	AuthResult result = Authenticator.getInstance().authenticate(fakeAdapter);   	
    	
    	if (result.isSuscessful()) {
    		startActivity(new Intent(view.getContext(), Dashboard.class));
    	} else {
    		
    	}
    	
    	//startActivity(new Intent(view.getContext(), Dashboard.class));
    	
    	
    }
}