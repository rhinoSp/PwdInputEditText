package com.rhino.pwdinputedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;

import com.rhino.pwdinputedittext.view.PwdInputEditText;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PwdInputEditText p1 = findViewById(R.id.PwdInputEditText1);
        p1.setShowPassword(true);
        p1.setInputType(InputType.TYPE_CLASS_NUMBER);

        PwdInputEditText p2 = findViewById(R.id.PwdInputEditText2);
        p2.setShowPassword("X");

        PwdInputEditText p3 = findViewById(R.id.PwdInputEditText3);
        p3.setShowPassword(R.mipmap.ic_launcher);

        PwdInputEditText p4 = findViewById(R.id.PwdInputEditText4);
        p4.setShowPassword(false);
    }
}
