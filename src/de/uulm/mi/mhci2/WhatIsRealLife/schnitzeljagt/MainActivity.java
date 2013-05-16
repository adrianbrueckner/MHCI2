package de.uulm.mi.mhci2.WhatIsRealLife.schnitzeljagt;

import de.uulm.mi.mhci2.WhatIsRealLife.schnitzeljagt.control.RouteController;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	
	private RouteController rc;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		rc = RouteController.generateRouteController(1);
		rc.getDefaultRoute();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void start_route(View v){
		Intent intent = new Intent(this, RouteActivity.class);
    	startActivity(intent);
	}

}
