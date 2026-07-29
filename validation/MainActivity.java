package com.example.validation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText etName, etEmail, etPassword;
    RadioGroup rgGender;
    Spinner spCountry;
    CheckBox chkTerms;
    Button btnSubmit;
    String[] country = {"Select country", "India", "usa", "uk", "canada"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.editTextText);
        etEmail = findViewById(R.id.editTextText2);
        etPassword = findViewById(R.id.editTextText3);
        rgGender = findViewById(R.id.radioGroup);
        spCountry = findViewById(R.id.spinner2);
        chkTerms = findViewById(R.id.checkBox);
        btnSubmit = findViewById(R.id.button);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item, country
        );
        spCountry.setAdapter(adapter);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString().trim();
                String email = etEmail.getText().toString().trim();
                String password = etPassword.getText().toString().trim();
                if (name.isEmpty()) {
                    etName.setError("Enter Name");
                    return;
                }
                if (email.isEmpty()) {
                    etEmail.setError("Enter Email");
                    return;
                }
                if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    etEmail.setError("Invalid email");
                    return;
                }
                if (password.length() < 4) {
                    etPassword.setError("password must be atleast 4 character");
                    return;
                }
                if (rgGender.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(MainActivity.this,
                            "select gender",
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                if (spCountry.getSelectedItemPosition() == 0) {
                    Toast.makeText(MainActivity.this,
                            "select country",
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                if (!chkTerms.isChecked()) {
                    Toast.makeText(MainActivity.this,
                            "Accept terms and conditions",
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                Toast.makeText(MainActivity.this,
                        "validation successfull", Toast.LENGTH_LONG).show();

            }
        });
    }
}
