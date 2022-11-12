package com.example.anishlabwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LargestNum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_largest_num);
        Button sum;
        EditText n1, n2, n3;
        TextView res;
        sum = findViewById(R.id.sum);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        n3 = findViewById(R.id.n3);

        res = findViewById(R.id.res);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(String.valueOf(n1.getText()));
                int b = Integer.parseInt(String.valueOf(n2.getText()));
                int c = Integer.parseInt(String.valueOf(n3.getText()));

                if(a > b && a > c){
                    res.setText(a+ " is the largest number");
                }else if (b> a && b > c){
                    res.setText(b+" is the largest number");
                }else {
                    res.setText(c+ " is the largest number");
                }




            }
        });
    }
}