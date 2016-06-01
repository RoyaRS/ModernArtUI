package com.example.roya.modernart;

import android.app.FragmentManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "Moddern_ArtLab";

    private SeekBar seekBar;
    private View stateBlueView;
    private View violetRedView;
    private View maroonView;
    private View grayView;
    private View midnightBlueView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initializeVariables();

        seekBar.getProgress();
        seekBar.getMax();


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int valueprogress, boolean fromUser) {
                progress = valueprogress;
                Log.i(TAG, String.valueOf(progress));

                if (progress >= 0 && progress <= 25) {
                    stateBlueView.setBackgroundColor(Color.parseColor("#7B68EE"));
                    violetRedView.setBackgroundColor(Color.parseColor("#DB7093"));
                    maroonView.setBackgroundColor(Color.parseColor("#800000"));
                    midnightBlueView.setBackgroundColor(Color.parseColor("#191970"));
                }

                if (progress > 25 && progress <= 50) {
                    stateBlueView.setBackgroundColor(Color.parseColor("#CD5C5C"));
                    violetRedView.setBackgroundColor(Color.parseColor("#6A5ACD"));
                    maroonView.setBackgroundColor(Color.parseColor("#FF4500"));
                    midnightBlueView.setBackgroundColor(Color.parseColor("#1E90FF"));
                }
                if (progress > 50 && progress <= 75) {
                    stateBlueView.setBackgroundColor(Color.parseColor("#E9967A"));
                    violetRedView.setBackgroundColor(Color.parseColor("#F4A460"));
                    maroonView.setBackgroundColor(Color.parseColor("#FF6347"));
                    midnightBlueView.setBackgroundColor(Color.parseColor("#00FFFF"));
                }
                if (progress > 75 && progress <= 100) {
                    stateBlueView.setBackgroundColor(Color.parseColor("#FFA07A"));
                    violetRedView.setBackgroundColor(Color.parseColor("#FFDEAD"));
                    maroonView.setBackgroundColor(Color.parseColor("#FFD700"));
                    midnightBlueView.setBackgroundColor(Color.parseColor("#B0E0E6"));
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {


            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
            FragmentManager fragmentManager = getFragmentManager();
            InfoDialogFragment infoDialogFragment = new InfoDialogFragment();
            infoDialogFragment.show(fragmentManager, "First");
        }

        return super.onOptionsItemSelected(item);
    }

    private void initializeVariables() {
        seekBar = (SeekBar) findViewById(R.id.skbar);
        stateBlueView = findViewById(R.id.stateblue_rect);
        violetRedView = findViewById(R.id.violet_rect);
        maroonView = findViewById(R.id.maroon_rect);
        grayView = findViewById(R.id.lightgray_rect);
        midnightBlueView = findViewById(R.id.midnightblue_rect);
    }

}

