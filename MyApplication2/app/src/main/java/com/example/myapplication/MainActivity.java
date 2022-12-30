package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    ListView ls;
    String[] list = {"Apple","Orange","Mango","Pineapple"};
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ls = findViewById(R.id.ls);
        ArrayAdapter<String> arr = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,list);
        ls.setAdapter(arr);
    }
}