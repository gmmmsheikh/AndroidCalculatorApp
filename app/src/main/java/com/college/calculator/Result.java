package com.college.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Result extends AppCompatActivity {
    TextView equationView;
    Button returnButton;
    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        equationView = findViewById(R.id.EquationLabel);
        returnButton = findViewById(R.id.returnButton);
        Bundle extras= getIntent().getExtras();
        equationView.setText(extras.getString("equation"));
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                // TODO
                startActivity(i);
            }
        });
    }
}
