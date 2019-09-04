package com.example.puneet.tempapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseActivity extends AppCompatActivity {
    private Button mDriver, mPassenger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose);
        mDriver = (Button) findViewById(R.id.driver);
        mPassenger = (Button) findViewById(R.id.passenger);

        mDriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseActivity.this, DriverLoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        mPassenger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseActivity.this, PassengerLoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });


    }

}

