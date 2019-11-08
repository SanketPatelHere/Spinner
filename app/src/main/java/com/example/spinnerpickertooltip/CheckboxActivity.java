package com.example.spinnerpickertooltip;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CheckboxActivity extends AppCompatActivity {
    CheckBox chk1, chk2, chk3;
    TextView tv;
    String msg = "";
    ListView lv;
    ArrayList<String> lst;
    ArrayAdapter<String> aa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        chk1 = (CheckBox)findViewById(R.id.chk1);
        chk2 = (CheckBox)findViewById(R.id.chk2);
        chk3 = (CheckBox)findViewById(R.id.chk3);
        tv = (TextView) findViewById(R.id.tv);
        lv = (ListView) findViewById(R.id.lv);
        lst = new ArrayList<>();
        aa = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, lst);
        lv.setAdapter(aa);
        //aa = new ArrayAdapter<String>();
    }
    public void onCheckboxClicked(View view)
    {
        boolean checked = ((CheckBox)view).isChecked();
        switch (view.getId())
        {
            case R.id.chk1:
                if(checked)
                {
                    Toast.makeText(this, "Checked = "+view.getId(), Toast.LENGTH_SHORT).show();
                    msg = msg+chk1.getText()+" ";
                    lst.add(chk1.getText().toString());
                }
                else
                {
                    lst.remove(chk1.getText().toString());
                }
            break;
            case R.id.chk2:
                if(checked)
                {
                    Toast.makeText(this, "Checked = "+view.getId(), Toast.LENGTH_SHORT).show();
                    msg = msg+chk2.getText()+" ";
                    lst.add(chk2.getText().toString());
                }
                else
                {
                    lst.remove(chk2.getText().toString());
                }
                break;

            case R.id.chk3:
                if(checked)
                {
                    Toast.makeText(this, "Checked = "+view.getId(), Toast.LENGTH_SHORT).show();
                    msg = msg+chk3.getText()+" ";
                    lst.add(chk3.getText().toString());
                }
                else
                {
                    lst.remove(chk3.getText().toString());
                }
                break;
        }

        /*if(chk1.isChecked())
        {
            msg = msg+chk1.getText()+" ";
        }
        else if(chk2.isChecked())
        {
            msg = msg+chk2.getText()+" ";
        }*/

        //Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        //aa = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lst);
        //aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lst);
        tv.setText(lst+"");
        //lv.setAdapter(aa);

        //aa.setNotifyOnChange(false);
        aa.notifyDataSetChanged();

    }

}
