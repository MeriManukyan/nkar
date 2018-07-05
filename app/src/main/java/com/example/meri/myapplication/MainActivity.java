package com.example.meri.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    int[]ab={R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background};
GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=(GridView)findViewById(R.id.o);
        nkar a=new nkar(getApplicationContext(), ab);
        gridView.setNumColumns(GridView.AUTO_FIT);
        gridView.setAdapter(a);
    }
}
