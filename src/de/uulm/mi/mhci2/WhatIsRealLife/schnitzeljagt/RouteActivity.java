package de.uulm.mi.mhci2.WhatIsRealLife.schnitzeljagt;

import de.uulm.mi.mhci2.WhatIsRealLife.schnitzeljagt.control.RouteController;
import de.uulm.mi.mhci2.WhatIsRealLife.schnitzeljagt.resource.Route;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class RouteActivity extends Activity {
	
	RouteController rc;
	Route r;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_route);		
		rc = RouteController.getRouteController();
		r = rc.getActiveRoute();
		
		TextView title = (TextView) findViewById(R.id.LocationTitle);
		title.setText(r.getCurrendLocation().getTitle());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.route, menu);
		return true;
	}

}
