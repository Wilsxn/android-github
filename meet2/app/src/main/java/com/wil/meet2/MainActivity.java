package com.wil.meet2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.wil.WelcomeActivity;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    Button buttonLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.editUsername);
        password = (EditText) findViewById(R.id.editPassword);
        buttonLogin = (Button) findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameKey = username.getText().toString();
                String passwordeKey = password.getText().toString();

                if(usernameKey.equals("root") && passwordeKey.equals("password")){
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(), "login Suksess",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
                    MainActivity.this.startActivity(intent);
                    finish();
                }
                else{
                    //jika login gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Username atau Password salah!")
                            .setNegativeButton("Retry",null).create().show();
                }

            }
        });
    }
}