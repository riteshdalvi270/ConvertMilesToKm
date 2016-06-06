package course.coursera.convertmilestokm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ConvertMilesToKm extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert_miles_to_km);

        final Button convertMilesToKm = (Button)findViewById(R.id.button);

        final Button convertKmToMiles = (Button) findViewById(R.id.button2);

        convertKmToMiles.setOnClickListener(this);

        convertMilesToKm.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        final EditText km = (EditText)findViewById(R.id.editText);

        final EditText miles = (EditText)findViewById(R.id.editText2);

        String output = null;

        switch (v.getId()) {
            case R.id.button2 :

                output = String.valueOf(0.62137 * Double.parseDouble(km.getText().toString()));

                miles.setText(output);

                break;

            case  R.id.button :

                output = String.valueOf(Double.parseDouble(miles.getText().toString()) / 0.62137);

                km.setText(output);

                break;
        }
    }
}
