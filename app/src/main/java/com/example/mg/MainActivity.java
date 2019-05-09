package com.example.mg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick1(View v) {
        Toast.makeText(getApplicationContext(), "한식이 클릭됨", Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this, KRActivity.class);
        startActivity(intent);
    }
    public void onClick2(View v) {
        Toast.makeText(getApplicationContext(), "일식이 클릭됨", Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this, JPActivity.class);
        startActivity(intent);
    }
    public void onClick3(View v) {
        Toast.makeText(getApplicationContext(), "중식이 클릭됨", Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this, JPActivity.class);
        startActivity(intent);
    }
    public void onClick4(View v) {
        Toast.makeText(getApplicationContext(), "양식이 클릭됨", Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this, YangActivity.class);
        startActivity(intent);
    }
    public void onClick5(View v) {
        Toast.makeText(getApplicationContext(), "치킨이 클릭됨", Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this, ChiActivity.class);
        startActivity(intent);
    }
    public void onClick6(View v) {
        Toast.makeText(getApplicationContext(), "피자가 클릭됨", Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this, PiActivity.class);
        startActivity(intent);
    }
    public void onClick7(View v) {
        Toast.makeText(getApplicationContext(), "카페가 클릭됨", Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this, CaActivity.class);
        startActivity(intent);
    }
    public void onClick8(View v) {
        Toast.makeText(getApplicationContext(), "고기가 클릭됨", Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this, GogiActivity.class);
        startActivity(intent);
    }
    public void onClick9(View v) {
        Toast.makeText(getApplicationContext(), "햄버거가 클릭됨", Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this, HamActivity.class);
        startActivity(intent);
    }
}
