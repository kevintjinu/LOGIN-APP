package com.example.login1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import java.net.PasswordAuthentication;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v) {
        if (v.getId() == R.id.Blogin)
        {
            EditText a = (EditText) findViewById(R.id.Tfusername);
            String str =a.getText().toString();
            EditText b = (EditText) findViewById(R.id.Tfpassword);
            String strl =b.getText().toString();

            Intent i = new Intent(MainActivity.this, Display.class);
            i.putExtra("Username", str);
            i.putExtra("Password", strl);
            startActivity(i);
        }
    }
}