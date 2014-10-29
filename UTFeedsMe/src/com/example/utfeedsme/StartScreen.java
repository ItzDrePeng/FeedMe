package com.example.utfeedsme;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;



public class StartScreen extends Activity {

	Button happening_now_btn, near_you_btn, all_events_btn, add_event_btn;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
        happening_now_btn = (Button) findViewById(R.id.happening_now);
        near_you_btn = (Button) findViewById(R.id.near_you);
        all_events_btn = (Button) findViewById(R.id.all_events);
        add_event_btn = (Button) findViewById(R.id.add_event);

        happening_now_btn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent openHappeningNow = new Intent("com.example.utfeedsme.HAPPENINGNOW");
				startActivity(openHappeningNow);
			}
		});
        
        near_you_btn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent openNearYou = new Intent("com.example.utfeedsme.NEARYOU");
				startActivity(openNearYou);
			}
		});
        
        all_events_btn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent openNearYou = new Intent("com.example.utfeedsme.ALLEVENTS");
				startActivity(openNearYou);
			}
		});
        
        add_event_btn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent openNearYou = new Intent("com.example.utfeedsme.ADDEVENT");
				startActivity(openNearYou);
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.start_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}