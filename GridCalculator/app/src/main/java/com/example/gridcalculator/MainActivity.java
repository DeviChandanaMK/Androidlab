package com.example.gridcalculator;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    EditText fNo,sNo;
    Button sum,div,sub,mul;
    TextView rslt;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fNo = findViewById(R.id.fNo);
        sNo = findViewById(R.id.sNo);
        sum = findViewById(R.id.sum);
        div = findViewById(R.id.div);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        rslt = findViewById(R.id.rslt);
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(fNo.getText().toString());
                int n2 = Integer.parseInt(sNo.getText().toString());
                int cal = n1+n2;
                rslt.setText("Addition = "+cal);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(fNo.getText().toString());
                int n2 = Integer.parseInt(sNo.getText().toString());
                int cal = n1-n2;
                rslt.setText("Subtraction = "+cal);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(fNo.getText().toString());
                int n2 = Integer.parseInt(sNo.getText().toString());
                int cal = n1/n2;
                rslt.setText("Division = "+cal);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(fNo.getText().toString());
                int n2 = Integer.parseInt(sNo.getText().toString());
                int cal = n1*n2;
                rslt.setText("Multiplication = "+cal);
            }
        });
    }
}