package com.example.mg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CHActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch);
    }

    public void back1(View v) {
        Toast.makeText(this, "돌아가기", Toast.LENGTH_LONG).show();

        finish();
    }
}