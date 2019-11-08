package com.example.spinnerpickertooltip;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;
import androidx.appcompat.app.AppCompatActivity;
public class ToggleButtonActivity extends AppCompatActivity {
    ToggleButton toggle1, toggle2;
    Switch switch1, switch2;
    Button submitToggle, submitSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);
        toggle1 = (ToggleButton)findViewById(R.id.toggle1);
        toggle2 = (ToggleButton)findViewById(R.id.toggle2);
        switch1 = (Switch) findViewById(R.id.switch1);
        switch2 = (Switch) findViewById(R.id.switch2);
        submitToggle = (Button)findViewById(R.id.submitToggle);
        submitSwitch = (Button)findViewById(R.id.submitSwitch);

        submitToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String status = "ToggleButton1 = "+toggle1.getText() + "\n"+"ToggleButton2 = "+toggle2.getText();
                Toast.makeText(ToggleButtonActivity.this, status, Toast.LENGTH_SHORT).show();
            }
        });

        submitSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String st1, st2;
                if(switch1.isChecked())
                {
                    st1 = switch1.getTextOn().toString();
                }
                else
                {
                    st1 = switch1.getTextOff().toString();
                }
                if(switch2.isChecked())
                {
                    st2 = switch2.getTextOn().toString();
                }
                else
                {
                    st2 = switch2.getTextOff().toString();
                }
                Toast.makeText(ToggleButtonActivity.this, "Alarm = "+st1+"\n"+"Wifi = "+st2, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
