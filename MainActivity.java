package com.example.anishlabwork;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button sum;
        EditText n1, n2;
        TextView res;
        sum = findViewById(R.id.sum);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        res = findViewById(R.id.res);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             int a = Integer.parseInt(String.valueOf(n1.getText()));
             int b = Integer.parseInt(String.valueOf(n2.getText()));
             int c = a + b;
             res.setText("The sum of "+a+"and "+b+" is "+c);

            }
        });
    }



}