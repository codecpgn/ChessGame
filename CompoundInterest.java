package com.example.anishlabwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class CompoundInterest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compound_interest);

        Button sum;
        EditText n1, n2, n3, n4;
        TextView res;
        sum = findViewById(R.id.sum);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        n3 = findViewById(R.id.n3);
        n4 = findViewById(R.id.n4);

        res = findViewById(R.id.res);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double p = Double.parseDouble(String.valueOf(n1.getText()));
                double r = Double.parseDouble(String.valueOf(n2.getText()));
                double t = Double.parseDouble(String.valueOf(n3.getText()));
                double n = Double.parseDouble(String.valueOf(n4.getText()));

                double ci = p * Math.pow(1 + (r/n), (n*t)) - p;

                res.setText("Compound Interest = "+ci);






            }
        });
    }
}