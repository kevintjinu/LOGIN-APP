package com.example.login1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Display extends Activity

{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        String username = getIntent().getStringExtra("Username");
        TextView tv = (TextView)findViewById(R.id.TVusername);
        tv.setText(username);

        String password = getIntent().getStringExtra("Password");
        TextView tvk = (TextView)findViewById(R.id.TVpassword);
        tvk.setText(password);

    }
}
