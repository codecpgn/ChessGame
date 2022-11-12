package com.example.anishlabwork;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragCompInterest extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_compound_interest, container, false);

        Button sum;
        EditText n1, n2, n3, n4;
        TextView res;
        sum = view.findViewById(R.id.sum);
        n1 = view.findViewById(R.id.n1);
        n2 = view.findViewById(R.id.n2);
        n3 = view.findViewById(R.id.n3);
        n4 = view.findViewById(R.id.n4);

        res = view.findViewById(R.id.res);

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

        return view;
    }
}