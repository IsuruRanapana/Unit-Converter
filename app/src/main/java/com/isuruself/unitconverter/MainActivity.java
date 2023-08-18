package com.isuruself.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //declaring widgets
    EditText editText;
    TextView textView, textView2, textView3, valueInPounds;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instantiating widgets
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        valueInPounds = findViewById(R.id.valueOfPounds);

        editText = findViewById(R.id.editText);

        button = findViewById(R.id.button);

        // click event for the button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConvertFromKiloToPound();
            }
        });
    }

    private void ConvertFromKiloToPound() {
        String valueEnteredInKilo = editText.getText().toString();
        //String to number
        double kilo = Double.parseDouble(valueEnteredInKilo);

        //convert kilo to pound
        double pounds = kilo * 2.205;

        //display value
        valueInPounds.setText(""+ pounds);
    }
}