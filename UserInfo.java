package com.example.anishlabwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UserInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        Button sum;
        EditText n1, n2;

        sum = findViewById(R.id.sum);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = String.valueOf(n1.getText());
                String address = String.valueOf(n2.getText());
                Intent i = new Intent(UserInfo.this, UserInfoDisplay.class);

                // passing data using putExtra

                i.putExtra("name", name);
                i.putExtra("address", address);
                startActivity(i);

            }
        });
    }
}