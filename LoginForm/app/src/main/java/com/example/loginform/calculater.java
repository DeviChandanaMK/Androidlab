package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class calculater extends AppCompatActivity {
    Button n1,n2,n3,n4,n5,n6,n7,n8,n9,n00,n0,dot,clr,div,modu,mul,sub,plus,eql;
    EditText inputs,ans;
    float valueOne,valueTwo;
    boolean substract,division,multiplication,add,modulus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculater);
        n1 = (Button) findViewById(R.id.n1);
        n2 = (Button) findViewById(R.id.n2);
        n3 = (Button) findViewById(R.id.n3);
        n4 = (Button) findViewById(R.id.n4);
        n5 = (Button) findViewById(R.id.n5);
        n6 = (Button) findViewById(R.id.n6);
        n7 = (Button) findViewById(R.id.n7);
        n8 = (Button) findViewById(R.id.n8);
        n9 = (Button) findViewById(R.id.n9);
        n00 = (Button) findViewById(R.id.n00);
        n0 = (Button) findViewById(R.id.n0);
        dot = (Button) findViewById(R.id.dot);
        sub = (Button) findViewById(R.id.sub);
        plus = (Button) findViewById(R.id.plus);
        eql = (Button) findViewById(R.id.eql);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        modu = (Button) findViewById(R.id.modu);
        clr = (Button) findViewById(R.id.clr);
        inputs = (EditText) findViewById(R.id.inputs);
        ans = (EditText) findViewById(R.id.ans);

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputs.setText(inputs.getText()+"1");

            }
        });
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputs.setText(inputs.getText()+"2");
            }
        });
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputs.setText(inputs.getText()+"3");
            }
        });
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputs.setText(inputs.getText()+"4");
            }
        });
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputs.setText(inputs.getText()+"5");
            }
        });
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputs.setText(inputs.getText()+"6");
            }
        });
        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputs.setText(inputs.getText()+"7");
            }
        });
        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputs.setText(inputs.getText()+"8");
            }
        });
        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputs.setText(inputs.getText()+"9");
            }
        });
        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputs.setText(inputs.getText()+"0");
            }
        });
        n00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputs.setText(inputs.getText()+"00");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputs.setText(inputs.getText()+".");
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputs.setText(null);
            }
        });
        eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueTwo=Float.parseFloat(inputs.getText()+"");
                if(modulus==true)
                {
                    ans.setText(valueOne % valueTwo +"");
                    modulus=false;
                }
                if(multiplication==true)
                {
                    ans.setText(valueOne * valueTwo +"");
                    multiplication=false;
                }
                if(add==true)
                {
                    ans.setText(valueOne + valueTwo +"");
                    add=false;
                }
                if(substract==true)
                {
                    ans.setText(valueOne - valueTwo +"");
                    substract=false;
                }
                if(division==true)
                {
                    ans.setText(valueOne / valueTwo +"");
                    division=false;
                }


            }
        });
        modu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueOne=Float.parseFloat(inputs.getText()+"");
                modulus=true;
                inputs.setText(null);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueOne = Float.parseFloat(inputs.getText()+"");
                multiplication=true;
                inputs.setText(null);
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputs == null )
                {
                    inputs.setText("");
                }
                else
                {
                    valueOne = Float.parseFloat(inputs.getText()+"");
                    add = true;
                    inputs.setText(null);
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueOne = Float.parseFloat(inputs.getText()+"");
                substract=true;
                inputs.setText(null);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueOne = Float.parseFloat(inputs.getText()+"");
                division = true;
                inputs.setText(null);
            }
        });
    }
}