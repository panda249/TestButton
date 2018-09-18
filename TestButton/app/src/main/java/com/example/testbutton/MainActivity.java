package com.example.testbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button) findViewById(R.id.btn);
        button.setOnClickListener(this);

    }
    @Override
    public  void onClick(View v) {
        switch (v.getId()){
            case R.id.btn:        Log.i("MainActivity", "中国我爱你 ");
        break;
        }
    }
}

