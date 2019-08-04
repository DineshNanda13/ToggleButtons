package com.meterstoinches.togglebuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private ToggleButton toggleButton;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView) findViewById(R.id.result_id);
        toggleButton = (ToggleButton) findViewById(R.id.toggle_btnID);

        result.setVisibility(View.INVISIBLE);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    //Toggle is enabled
                    result.setVisibility(View.VISIBLE);
                }else {
                    //Toggle is disabled
                    result.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
