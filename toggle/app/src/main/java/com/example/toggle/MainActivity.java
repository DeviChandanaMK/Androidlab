package com.example.toggle;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;
public class MainActivity extends AppCompatActivity {
    ImageView im;
    ToggleButton tg;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        im = findViewById(R.id.im);
        tg = findViewById(R.id.tg);
        im.setVisibility(View.INVISIBLE);
        tg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tg.isChecked()){
                    im.setVisibility(View.VISIBLE);
                }
                else {
                    im.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}