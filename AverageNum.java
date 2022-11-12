package com.example.anishlabwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AverageNum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_average_num);
        Button sum;
        EditText n1, n2, n3,n4, n5;
        TextView res;
        sum = findViewById(R.id.sum);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        n3 = findViewById(R.id.n3);
        n4 = findViewById(R.id.n4);
        n5 = findViewById(R.id.n5);

        res = findViewById(R.id.res);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(String.valueOf(n1.getText()));
                int b = Integer.parseInt(String.valueOf(n2.getText()));
                int c = Integer.parseInt(String.valueOf(n3.getText()));
                int d = Integer.parseInt(String.valueOf(n4.getText()));
                int e = Integer.parseInt(String.valueOf(n5.getText()));

                int result = (a+b+c+d+e)/5;

                res.setText("The average of 5 number is "+result);




            }
        });

    }
}