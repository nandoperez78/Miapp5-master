package com.example.miapp5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name, password, phone, description, email;
    Button btn;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.etName);
        password = findViewById(R.id.etPassword);
        phone = findViewById(R.id.etPhone);
        description = findViewById(R.id.etDescription);
        email = findViewById(R.id.etEmail);

        btn = findViewById(R.id.btn);
        textView = findViewById(R.id.Textview);

        btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String etName = name.getText().toString().trim();
                String etPassword = password.getText().toString().trim();
                String etPhone  = phone.getText().toString().trim();
                String etDescription = description.getText().toString().trim();
                String etEmail = email.getText().toString().trim();

                if (!etName.isEmpty() && !etPassword.isEmpty() && !etPhone.isEmpty() && !etDescription.isEmpty() && !etEmail.isEmpty()){
                    textView.setText(etName + "\n" + etPassword + "\n" + etPhone + "\n"+ etDescription + "\n"+ etEmail );
                }else{
                    Toast.makeText(MainActivity.this, "Por favor completa todos los Datos", Toast.LENGTH_SHORT).show();
                }

            }

        });

    }
}

