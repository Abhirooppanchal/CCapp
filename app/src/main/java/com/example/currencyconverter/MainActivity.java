package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convertMoney(View view){
        EditText inputKd = (EditText) findViewById(R.id.editText);

        String amountInKd = inputKd.getText().toString();
        double amountInKdDouble=Double.parseDouble(amountInKd);
        double amountInInrDouble= amountInKdDouble*245.32;
        String amountInInr=Double.toString(amountInInrDouble);


        Toast.makeText(this, "INR ="+amountInInrDouble, Toast.LENGTH_LONG).show();
        Log.i("info","Button Presed");
        Log.i("Money Input",inputKd.getText().toString());
        Log.i("Money Output", amountInInr);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
