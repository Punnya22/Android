package com.example.intent_nav;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView a1, a2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        a1=findViewById(R.id.textView);
        a2=findViewById(R.id.textView2);

        Bundle extra=getIntent().getExtras();
        String text=extra.getString("name");
        String text2=extra.getString("age");
        a1.setText(text);
        a2.setText(text2);
    }

}

