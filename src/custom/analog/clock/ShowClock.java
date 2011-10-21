package custom.analog.clock;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;

public class ShowClock extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm_clock);
       
    }
 /*   @Override
   public boolean onKeyDown (int keyCode, KeyEvent event)
   {
    	if(keyCode==KeyEvent.KEYCODE_BACK)
    	{
    		Toast.makeText(this, "text", Toast.LENGTH_SHORT).show();
    	}
	return false;
	   
   }*/
}