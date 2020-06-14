package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view) {

        Log.i("Info", "Button pressed");

        EditText amountEditText = findViewById(R.id.amountEditText);

        Log.i("Info", amountEditText.getText().toString());

        double amountInRupees = Double.parseDouble(amountEditText.getText().toString());

        // this is hardcoded based on 06/14/2020
        double amountInDollars = amountInRupees * 0.013;

        //String.format("%.2f", amountInDollars)
        Toast.makeText(this, "Rs." + amountInRupees + " is $" + amountInDollars,
                Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}