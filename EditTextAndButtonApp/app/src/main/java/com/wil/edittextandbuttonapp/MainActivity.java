package com.wil.edittextandbuttonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonOk = findViewById(R.id.buttonOk);
        buttonOk.setOnClickListener(new View.OnClickListener());
            @Override
            public void onClick(View view) {
                EditText editNama = findViewById(R.id.editTextNama);
                TextView TextInfo = findViewById(R.id.textViewInfo);
                String nama = editNama.getText().toString();
                String pesan = "Hello, "+nama+ "! ";
                TextInfo.setText(pesan);
        };
    }
}