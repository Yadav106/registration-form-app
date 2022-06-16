package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick (View view) {
        TextView txtFirstName = findViewById(R.id.showFirstName);
        TextView txtLastName = findViewById(R.id.showLastName);
        TextView txtEmail = findViewById(R.id.showEmail);

        EditText edtFirstName = findViewById(R.id.setFirstName);
        EditText edtLastName = findViewById(R.id.setLastName);
        EditText edtEmail = findViewById(R.id.setEmail);

        txtFirstName.setText("First Name : " + edtFirstName.getText().toString());
        txtLastName.setText("Last Name : " + edtLastName.getText().toString());
        txtEmail.setText("Email : " + edtEmail.getText().toString());
    }
}