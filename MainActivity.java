package com.example.mohammadsyed.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void button(View view)

    {
        Log.i("info","Button Pressed");
        EditText username = (EditText)findViewById(R.id.username);
        EditText password = (EditText)findViewById(R.id.password);

        Log.i("info",username.getText().toString());
        Log.i("info",password.getText().toString());

        double arr[]={76.76,73.33,70.00};
        char grade[]={'A','A','A'};
        char sign[]={'+',' ','-'};

        double a,b,c,d; //intialising some variables :)

        double i = 76.67 - Double.parseDouble(password.getText().toString()); // the Double.parseDouble changes from a string to double 
        double j = 100*(i / Double.parseDouble(username.getText().toString()));
        double z = Math.round(j * 100.0) / 100.0;
        String total2 = String.valueOf(z);
        Log.i("info",total2);
        Toast.makeText(MainActivity.this,"you need a "+total2+ " in the final exam to get an A+",Toast.LENGTH_LONG).show();




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
