package com.example.spinnerpickertooltip;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
public class SpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner sp;
    SpinnerActivity sa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        sp = (Spinner)findViewById(R.id.sp);
        sp.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> aa = ArrayAdapter.createFromResource(this, R.array.day, android.R.layout.simple_spinner_item);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(aa);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        Toast.makeText(this, "position = "+position+", id = "+id, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        Toast.makeText(getApplicationContext(), "nothing selected in spinner", Toast.LENGTH_SHORT).show();
    }
}
