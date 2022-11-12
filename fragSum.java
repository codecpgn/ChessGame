package com.example.anishlabwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.Override;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class fragSum extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_frag_sum, container, false);

        // wiring up widgets
        Button sum;
        EditText n1, n2;
        TextView res;
        sum = view.findViewById(R.id.sum);
        n1 = view.findViewById(R.id.n1);
        n2 = view.findViewById(R.id.n2);
        res = view.findViewById(R.id.res);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(String.valueOf(n1.getText()));
                int b = Integer.parseInt(String.valueOf(n2.getText()));
                int c = a + b;
                res.setText("The sum of " + a + "and " + b + " is " + c);
            }
        });


        return view;
    }
}