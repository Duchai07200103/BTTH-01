package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    EditText edt1, edt2, edt3;
    View btncong;
    View btntru;
    View btnnhan;
    View btnchia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        edt3 = findViewById(R.id.edt3);
        btncong = findViewById(R.id.btncong);
        btntru = findViewById(R.id.btntru);
        btnchia = findViewById(R.id.btnchia);
        btnnhan = findViewById(R.id.btnnhan);
        btncong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt("0"+edt1.getText());
                int b = Integer.parseInt("0"+edt2.getText());
                // TODO Auto-generated method stub
                edt3.setText("a + b =" +(a+b));
            }
        });
        btntru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt("0"+edt1.getText());
                int b = Integer.parseInt("0"+edt2.getText());
                // TODO Auto-generated method stub
                edt3.setText("a - b =" +(a-b));

            }
        });
        btnnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt("0"+edt1.getText());
                int b = Integer.parseInt("0"+edt2.getText());
                // TODO Auto-generated method stub
                edt3.setText("a * b =" +(a*b));
            }
        });
        btnchia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                int a = Integer.parseInt("0"+edt1.getText());
                int b = Integer.parseInt("0"+edt2.getText());
                if (b == 0)
                {
                    edt3.setText("B phai khac 0");
                }
                else
                {
                    edt3.setText("a / b =" +(a/b));
                }
            }
        });
    }
}