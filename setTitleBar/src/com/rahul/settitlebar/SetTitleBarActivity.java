package com.rahul.settitlebar;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

/*you can also Change the Title of each screen (i.e. Activity)
     by  setting their Android:label

	<activity android:name=".Hello_World"
	          android:label="This is the Hello World Application">
	</activity>
*/


public class SetTitleBarActivity extends Activity {
    /** Called when the activity is first created. */
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	           super.onCreate(savedInstanceState);

	           final boolean customTitleSupported = requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);

	           setContentView(R.layout.main);


	           if ( customTitleSupported ) {
	               getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.titlebar);
	               }

	           final TextView myTitleText = (TextView) findViewById(R.id.myTitle);
	           if ( myTitleText != null ) {
	               myTitleText.setText("NEW TITLE");

	               // user can also set color using "Color" and then "Color value constant"
	               myTitleText.setBackgroundColor(Color.MAGENTA);
	           }
	   }
}