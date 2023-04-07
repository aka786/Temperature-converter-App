package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
TextView textView;
TextView textView2;
Button button1;
Button button2;
EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button1=findViewById(R.id.b2);

        button2=findViewById(R.id.b3);
        textView=findViewById(R.id.textView);
        textView2=findViewById(R.id.tv3);
        Intent intent = getIntent();
     String name=intent.getStringExtra(MainActivity.EXTRA_NAME);
        textView.setText("Welcome  "  + name + "  to Temperature Converter App ");



        editText=findViewById(R.id.e1);
        textView=findViewById(R.id.tv3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=editText.getText().toString();
                double t=Double.parseDouble(s);
                double c=(9/5)*(t)+32;

                textView.setText(t+" Celsius converted into\n fahrenheit  is :\n"+c);

                Toast.makeText(MainActivity2.this, "You can convert a celsius into a fahrenheit", Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=editText.getText().toString();
                double t=Double.parseDouble(s);

                double k=t+273.15;
                textView.setText( t+ " Celsius converted into kelvin is : "+k);

                Toast.makeText(MainActivity2.this, "You can convert a celsius into a fahrenheit", Toast.LENGTH_SHORT).show();
            }
        });





    }


}