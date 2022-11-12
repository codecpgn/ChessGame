package com.example.anishlabwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CheckPrime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_prime);
        Button sum;
        EditText n1;
        TextView res;
        sum = findViewById(R.id.sum);
        n1 = findViewById(R.id.n1);


        res = findViewById(R.id.res);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(String.valueOf(n1.getText()));
                int flag = 0;
                for(int i = 2; i < num/2; i++){
                    if(num % i == 0) {
                        res.setText(num+ " is composite number");
                        flag = 1;
                    }
                }
                if(flag == 0){
                    res.setText(num + " is prime number");
                }

            }
        });
    }
}