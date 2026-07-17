package com.example.sc;

import android.annotation.SuppressLint;
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

    EditText n1, n2;
    Button div, sub, add, mul;
    TextView result;

    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        n1 = (EditText) findViewById(R.id.first);
        n2 = (EditText) findViewById(R.id.second);
        div = findViewById(R.id.div);
        sub = findViewById(R.id.sub);
        add = findViewById(R.id.add);
        mul = findViewById(R.id.mul);
        result = findViewById(R.id.result);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1 =  Integer.parseInt(n1.getText().toString());
                int f2 =  Integer.parseInt(n2.getText().toString());
                int cal = f1 + f2;
                result.setText("Addition = " + cal);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1 =  Integer.parseInt(n1.getText().toString());
                int f2 =  Integer.parseInt(n2.getText().toString());
                int cal = f1 - f2;
                result.setText("Subtraction = " + cal);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1 =  Integer.parseInt(n1.getText().toString());
                int f2 =  Integer.parseInt(n2.getText().toString());
                int cal = f1 / f2;
                result.setText("Division = " + cal);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1 =  Integer.parseInt(n1.getText().toString());
                int f2 =  Integer.parseInt(n2.getText().toString());
                int cal = f1 * f2;
                result.setText("Multiplication = " + cal);
            }
        });

    }
}
