package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
private TextView textView;
private Button button;
private EditText editTextNumber;
private TextView textView2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= findViewById(R.id.textView);
        button= findViewById(R.id.button);
        editTextNumber= findViewById(R.id.editTextNumber);
        textView2= findViewById(R.id.textView2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= editTextNumber.getText().toString();
                int kg= Integer.parseInt(s);
                double pound= 2.205* kg;
                textView2.setText("Your value in pounds is "+ pound);

            }
        });


                                  }
        ;
    }
