package com.college.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button addButton;
    EditText firstNumber;
    EditText secondNumber;
    int n1, n2, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addButton = findViewById(R.id.addButton);
        firstNumber = findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);



        addButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Intent i = new Intent(getApplicationContext(), Result.class);
                n1 = Integer.parseInt(firstNumber.getText().toString());
                n2 = Integer.parseInt(secondNumber.getText().toString());
                result = n1+n2;

                Intent i = new Intent(getApplicationContext(), Result.class);
                i.putExtra("equation", n1+" + " + n2 + " = " + result);
                startActivity(i);

            }

        });
    }

}


/*
public class MainActivity extends AppCompatActivity {
    Button callSecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        callSecondActivity = findViewById(R.id.button);
        callSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), SecondActivity.class);
                i.putExtra("Username","maazsheikh");
                i.putExtra("Geo","asdfasf");
                startActivity(i);
            }
        });

    }

}*/