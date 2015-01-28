package com.example.adrian.miaplicacion1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity2 extends ActionBarActivity {
    final String TAG="MIO";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_3);
        Log.i(TAG, "onCreate2");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onRestart2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause2");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
