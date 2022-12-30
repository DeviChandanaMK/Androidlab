package com.example.simplecalculator;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1,n2;
    Button sum,mul,div,sub;
    TextView rslt;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText) findViewById(R.id.first);
        n2 = (EditText) findViewById(R.id.second);
        sum = findViewById(R.id.sum);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        sub = findViewById(R.id.sub);
        rslt = findViewById(R.id.rslt);
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1 = Integer.parseInt(n1.getText().toString());
                int f2 = Integer.parseInt(n2.getText().toString());
                int cal = f1+f2;
                rslt.setText("Addition = "+cal);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1 = Integer.parseInt(n1.getText().toString());
                int f2 = Integer.parseInt(n2.getText().toString());
                int cal = f1-f2;
                rslt.setText("Subtraction = "+cal);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1 = Integer.parseInt(n1.getText().toString());
                int f2 = Integer.parseInt(n2.getText().toString());
                int cal = f1/f2;
                rslt.setText("Division = "+cal);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1 = Integer.parseInt(n1.getText().toString());
                int f2 = Integer.parseInt(n2.getText().toString());
                int cal = f1*f2;
                rslt.setText("Multiplication = "+cal);
            }
        });
    }
}