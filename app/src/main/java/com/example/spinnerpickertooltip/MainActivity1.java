package com.example.spinnerpickertooltip;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;
public class MainActivity1 extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        //spinner
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(MainActivity1.this, SpinnerActivity.class);
                startActivity(i1);
            }
        });
        //time picker
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent i1 = new Intent(MainActivity.this, TimePickerActivityForFragment.class);
                //startActivity(i1);
                //Toast.makeText(MainActivity.this, "TimePicker", Toast.LENGTH_SHORT).show();
                DialogFragment newFragment = new TimePickerFragment();
                newFragment.setCancelable(false);
                newFragment.show(getSupportFragmentManager(), "timePicker");


            }
        });
        //date picker
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment newFragment = new DatePickerFragment();
                newFragment.setCancelable(false);
                newFragment.show(getSupportFragmentManager(), "datePicker");
            }
        });
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            btn3.setTooltipText("Sanket's Tooltip");
        }
        //tooltip
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent i1 = new Intent(MainActivity.this, TimePickerFragment1.class);
                //startActivity(i1);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    btn3.setTooltipText("Tooltip button clicked");
                    Toast.makeText(MainActivity1.this, "Tooltip", Toast.LENGTH_SHORT).show();
                }
                //Toast.makeText(MainActivity.this, "TimePicker", Toast.LENGTH_SHORT).show();
            }
        });

        //radio buttons
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity1.this, RadioButtonActivity.class);
                startActivity(i);
            }
        });

        //checkboxes
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity1.this, CheckboxActivity.class);
                startActivity(i);
            }
        });

        //toggle buttons
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity1.this, ToggleButtonActivity.class);
                startActivity(i);
            }
        });

        //constaint layout
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity1.this, cons.class);
                startActivity(i);
            }
        });
    }

}

