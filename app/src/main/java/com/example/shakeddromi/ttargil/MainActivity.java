package com.example.shakeddromi.ttargil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4;
    TextView txt1,txt2,txt3;
    Random rd=new Random();
    int r,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button) findViewById(R.id.onceClicked);
        btn2=(Button) findViewById(R.id.big);
        btn3=(Button) findViewById(R.id.eq);
        btn4=(Button) findViewById(R.id.small);
        txt1=(TextView) findViewById(R.id.first);
        txt2=(TextView) findViewById(R.id.second);
        txt3=(TextView) findViewById(R.id.yesno);
    }

    public void onceClicked(View view) {
        r=rd.nextInt();
        d=rd.nextInt();
        txt1.setText("number = "+r);
        txt2.setText("number = "+d);
    }

    public void big(View view) {
        if (r>d){
            txt3.setText("YES!");
        }
        else{
            txt3.setText("NO!");
        }
    }

    public void eq(View view) {
        if (r==d){
            txt3.setText("YES!");
        }
        else{
            txt3.setText("NO!");
        }
    }

    public void small(View view) {
        if (r<d){
            txt3.setText("YES!");
        }
        else{
            txt3.setText("NO!");
        }
    }
}

