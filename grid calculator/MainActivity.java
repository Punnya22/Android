package com.example.gridcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView t1, t2;
    EditText e1, e2;
    Button b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.textView4);
        e1 = findViewById(R.id.editTextText6);
        e2 = findViewById(R.id.editTextText7);
        b1 = findViewById(R.id.button6);
        b2 = findViewById(R.id.button7);
        b3 = findViewById(R.id.button8);
        b4 = findViewById(R.id.button9);
        t2 = findViewById(R.id.textView5);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1 =  Integer.parseInt(e1.getText().toString());
                int f2 =  Integer.parseInt(e2.getText().toString());
                int cal = f1 + f2;
                t2.setText("Addition = " + cal);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1 =  Integer.parseInt(e1.getText().toString());
                int f2 =  Integer.parseInt(e2.getText().toString());
                int cal = f1 - f2;
                t2.setText("Subtraction = " + cal);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1 =  Integer.parseInt(e1.getText().toString());
                int f2 =  Integer.parseInt(e2.getText().toString());
                int cal = f1 / f2;
                t2.setText("Division = " + cal);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1 =  Integer.parseInt(e1.getText().toString());
                int f2 =  Integer.parseInt(e2.getText().toString());
                int cal = f1 * f2;
                t2.setText("Multiplication = " + cal);
            }

        });
    }
}
