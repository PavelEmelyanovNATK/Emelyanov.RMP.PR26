package com.example.rmppr26;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnWeb = findViewById(R.id.btnWeb);
        Button btnMap = findViewById(R.id.btnMap);
        Button btnCall = findViewById(R.id.btnCall);

        btnWeb.setOnClickListener(this);
        btnMap.setOnClickListener(this);
        btnCall.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btnWeb:
                btnWeb_Click();
                break;
            case R.id.btnMap:
                btnMap_Click();
                break;
            case R.id.btnCall:
                btnCall_Click();
                break;
        }
    }

    private void btnWeb_Click() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://metanit.com/java/android/8.1.php"));
        startActivity(intent);
    }

    private void btnMap_Click() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:54.983019, 82.893211"));
        startActivity(intent);
    }

    private void btnCall_Click() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:88005553535"));
        startActivity(intent);
    }
}