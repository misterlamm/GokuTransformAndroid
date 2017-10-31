package com.example.alamm7.ssjfade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {


        ImageView baseGoku = (ImageView) findViewById(R.id.baseGoku);

        ImageView gokuS2 = (ImageView) findViewById(R.id.gokussj2);


        baseGoku.animate().alpha(0f).setDuration(2000);

        gokuS2.animate().alpha(1f).setDuration(2000);
    }

//    public void fadeBack(View view) {
//
//        ImageView baseGoku = (ImageView) findViewById(R.id.baseGoku);
//
//        ImageView gokuS2 = (ImageView) findViewById(R.id.gokussj2);
//
//        gokuS2.animate().alpha(0f).setDuration(2000);
//
//        baseGoku.animate().alpha(1f).setDuration(2000);
//
//    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
