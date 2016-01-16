package ca.wince.puzzler;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity{
    //MEMBER VARIABLES
    //Private
    WView wView;

    //END MEMEBER VARIABLES


    //STARTING AND PAUSING APPLICATION
    /*
    onCreate() is called when the activity initialized, is the entrance to the activity.
    If the activity was in the paused state, onResume() will be called instead.
     */
    @Override
    public void onCreate(Bundle savedInstance){
        //Call Parent
        super.onCreate(savedInstance);

        //Create a wView
        //Set as activity view
        wView = new WView(this);
        setContentView(wView);

    }

    /*
    onResume() is called when the activity initialized from the paused state.
    If the activity was dead, onCreate() will be called instead.
     */
    @Override
    public void onResume(){
        //Call Parent
        super.onResume();

    }

    /*
    onPause() is called when the activity initialized from the paused state.
    If the activity was dead, onCreate() will be called instead.
     */
    @Override
    public void onPause(){
        //Call Parent
        super.onPause();

    }
    //END STARTING AND PAUSING APPLICATION
}
