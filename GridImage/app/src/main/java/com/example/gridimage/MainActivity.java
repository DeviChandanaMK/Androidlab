package com.example.gridimage;
import static com.example.gridimage.R.layout.activity_list_v;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    GridView grid;
    int[] im = {R.drawable.pic1,R.drawable.pic2};
    String name[] = {"ship","car"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid = findViewById(R.id.grid);
        ArrayList<HashMap<String,Object>> list = new ArrayList<>();
        for(int i=0;i< name.length;i++)
        {
            HashMap<String,Object> map = new HashMap<>();
            map.put("name",name[i]);
            map.put("image",im[i]);
            list.add(map);
        }
        String[] ff = {"name","image"};
        int kk[] = {R.id.textView,R.id.imageView};
        SimpleAdapter adapter = new SimpleAdapter(getApplicationContext(),list, activity_list_v,ff,kk);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Alert");
                builder.setMessage("You clicked on "+name[i]);
                AlertDialog al = builder.create();
                al.show();
            }
        });
    }
}