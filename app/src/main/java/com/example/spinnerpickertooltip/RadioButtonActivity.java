package com.example.spinnerpickertooltip;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class RadioButtonActivity extends AppCompatActivity {
    RadioGroup rg;
    RadioButton Yes, Maybe, No;
    Button submit, clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        rg = (RadioGroup) findViewById(R.id.rg);
        Yes = (RadioButton) findViewById(R.id.Yes);
        Maybe = (RadioButton) findViewById(R.id.Maybe);
        No = (RadioButton) findViewById(R.id.No);
        submit = (Button) findViewById(R.id.submit);
        clear = (Button) findViewById(R.id.clear);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                Toast.makeText(RadioButtonActivity.this, "onCheckedChanged = "+i, Toast.LENGTH_SHORT).show();
                switch (i)
                {
                    case R.id.Yes:
                        Log.i("MyLog = ","Yes = "+i+"");
                        break;
                    case R.id.Maybe:
                        Log.i("MyLog = ","Maybe = "+i+"");
                        break;
                    case R.id.No:
                        Log.i("MyLog = ","No = "+i+"");
                        break;
                    default:
                        Log.i("MyLog = ","defult");
                        break;
                }
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioButton rb = (RadioButton)rg.findViewById(rg.getCheckedRadioButtonId());
                Toast.makeText(RadioButtonActivity.this, "Selected RadioButton : name = " + rb.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rg.clearCheck();
            }
        });

    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId())
        {
            case R.id.Yes:
                if(checked)
                {
                    Toast.makeText(RadioButtonActivity.this, "RadioButton : Yes", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.Maybe:
                if(checked)
                {
                    Toast.makeText(RadioButtonActivity.this, "RadioButton : Maybe", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.No:
                if(checked)
                {
                    Toast.makeText(RadioButtonActivity.this, "RadioButton : No", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}