package com.example.linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText Pada, Subject, Pesan;
    Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pada = findViewById(R.id.Pada);
        Subject = findViewById(R.id.Subject);
        Pesan = findViewById(R.id.Pesan);
        Submit = findViewById(R.id.Submit);

    }
}