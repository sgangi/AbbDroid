package com.abbdroid;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class AbbDroidActivity extends Activity implements OnClickListener {
	Button feedbackButton;
	Button gameButton;
	Button manualButton;
	Button simulatorButton;
	LinearLayout mainContent;
	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        manualButton = (Button) findViewById(R.id.manualButton);
        
        manualButton.setOnClickListener(this);
        
    }


	@Override
	public void onClick(View v) {
		Log.d("StatusActivity", "onClick'd Manual Button");
		setContentView(R.layout.manual);
	}
}