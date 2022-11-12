package com.example.anishlabwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class UserInfoDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info_display);

        // receiving data
        Intent i = getIntent();
        String name = i.getStringExtra("name");
        String address = i.getStringExtra("address");

        // Displaying received data in TextView
        TextView txt = findViewById(R.id.tv1);

        txt.setText("Name : "+name+"\n"+"Address : "+address);

    }
}