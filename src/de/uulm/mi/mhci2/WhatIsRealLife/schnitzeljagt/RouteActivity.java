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
		
		TextView hint1 = (TextView) findViewById(R.id.locationHint1);
		TextView hint2 = (TextView) findViewById(R.id.locationHint2);
		TextView hint3 = (TextView) findViewById(R.id.locationHint3);
		TextView hint4 = (TextView) findViewById(R.id.locationHint4);
		TextView hint5 = (TextView) findViewById(R.id.locationHint5);
		TextView[] tvHints = {hint1, hint2, hint3, hint4, hint5};
		String[] hints = r.getCurrendLocation().getHints();
		
		for(int i = 0; i < 5; i++){
			try{
				tvHints[i].setText(hints[i]);
			}catch(ArrayIndexOutOfBoundsException e){
				tvHints[i].setText("");
			}
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.route, menu);
		return true;
	}

}
