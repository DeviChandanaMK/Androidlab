package com.example.loginform;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText us,ps;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        us = (EditText) findViewById(R.id.EmailAddress);
        ps = (EditText) findViewById(R.id.Password);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String k = "user1";
                int p=123;
                int pss = Integer.parseInt(ps.getText().toString()
                );
                String uss=us.getText().toString();
                if ( uss.equals(k) && pss==p)
                {
                    Toast.makeText(MainActivity.this, "Login success", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Login failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}