package com.example.spinnerpickertooltip;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.TimePicker;
import android.widget.Toast;
import android.text.format.DateFormat;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.util.Calendar;

public class TimePickerActivityForFragment extends AppCompatActivity //implements TimePickerDialog.OnTimeSetListener {
{
    FrameLayout fm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker_fragment1);
        fm = (FrameLayout)findViewById(R.id.fm);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        Fragment f = new TimePickerFragment();
        ft.replace(R.id.fm, f);
        ft.commit();

        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        /*onTimeSet(new TimePickerDialog(getApplicationContext(), this, hour, minute,
                DateFormat.is24HourFormat(getApplicationContext()));*/
        //onTimeSet(new TimePickerDialog(getApplicationContext(), this, hour, minute, DateFormat.is24HourFormat(getParent())));
        /*DatePickerDialog datePickerDialog =
                new DatePickerDialog(this, R.style.MyDialogTheme, listener, 2016, 21, 3);*/
        //datePickerDialog.show();
    }


}
