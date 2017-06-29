package com.example.supun.taxi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button directPay = (Button) findViewById(R.id.button_directpay);

        directPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                payByDirectPay();
            }
        });

    }

    private void payByDirectPay(){
        Intent intent = new Intent(this,DirectPay.class);
        startActivity(intent);


    }
}
