package devashish.datepickerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    DatePicker d1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        d1 = (DatePicker) findViewById(R.id.datePicker1);
        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int day = d1.getDayOfMonth();
                int month = d1.getMonth();
                int year = d1.getYear();
                Toast.makeText(MainActivity.this, "You selected " + day + month + year, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
