package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerCourse;
    TextView txtResult;

    String[] courses = {
            "Select Course",
            "MCA",
            "B.Tech",
            "MBA",
            "M.Tech"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerCourse = findViewById(R.id.spinnerCourse);
        txtResult = findViewById(R.id.txtResult);

        // Create adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                courses
        );

        // Dropdown layout
        adapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item
        );

        // Set adapter to Spinner
        spinnerCourse.setAdapter(adapter);

        // Handle item selection
        spinnerCourse.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {

                    @Override
                    public void onItemSelected(
                            AdapterView<?> parent,
                            View view,
                            int position,
                            long id) {

                        String selectedCourse = courses[position];

                        if (position == 0) {
                            txtResult.setText("No course selected");
                        } else {
                            txtResult.setText(
                                    "Selected Course: " + selectedCourse
                            );
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                        txtResult.setText("No course selected");
                    }
                }
        );
    }
}
