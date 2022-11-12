package com.example.anishlabwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UserForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_form);
        Button sum;
        EditText n1, n2, n3, n4, n5;
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
                String name = String.valueOf(n1.getText());
                String address = String.valueOf(n2.getText());
                String phone = (String.valueOf(n3.getText()));
                String email = String.valueOf(n4.getText());
                int pan = Integer.parseInt(String.valueOf(n5.getText()));

                res.setText(name +"\t"+ address + "\t"+ phone + "\n" + email +"\t"+ pan);



            }
        });
    }
}