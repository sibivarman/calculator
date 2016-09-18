package com.sibivarmanl.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2,res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    void init(){
         et1 = (EditText)findViewById(R.id.editText);
         et2 = (EditText)findViewById(R.id.editText2);
         res = (EditText)findViewById(R.id.editText3);
         Button addition = (Button)findViewById(R.id.button);
         Button subtraction = (Button)findViewById(R.id.button2);
         Button division = (Button)findViewById(R.id.button3);
         Button multiplication = (Button)findViewById(R.id.button4);
         Button modulo = (Button)findViewById(R.id.button5);
         Button clear = (Button)findViewById(R.id.button6);

         addition.setOnClickListener(new OnClickListener(){
             @Override
             public void onClick(View v){
                 System.out.println("came here");
                 add();
             }
         });

         subtraction.setOnClickListener(new OnClickListener() {
             @Override
             public void onClick(View view) {
                 sub();
             }
         });

        multiplication.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                mul();
            }
        });

        division.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                div();
            }
        });

        modulo.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                mod();
            }
        });

        clear.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                clc();
            }
        });
    }

    void add(){



        int num1 = Integer.parseInt(et1.getText().toString());
        int num2 = Integer.parseInt(et2.getText().toString());

        res.setText(Integer.toString(num1+num2));
    }

    void sub(){

        int num1 = Integer.parseInt(et1.getText().toString());
        int num2 = Integer.parseInt(et2.getText().toString());

        res.setText(Integer.toString(num1-num2));
    }

    void mul(){

        int num1 = Integer.parseInt(et1.getText().toString());
        int num2 = Integer.parseInt(et2.getText().toString());

        res.setText(Integer.toString(num1*num2));
    }

    void div(){

        int num1 = Integer.parseInt(et1.getText().toString());
        int num2 = Integer.parseInt(et2.getText().toString());

        res.setText(Integer.toString(num1/num2));
    }

    void mod(){

        int num1 = Integer.parseInt(et1.getText().toString());
        int num2 = Integer.parseInt(et2.getText().toString());

        res.setText(Integer.toString(num1%num2));
    }

    void clc(){

        et1.setText("");
        et2.setText("");
        res.setText("");
    }
}
