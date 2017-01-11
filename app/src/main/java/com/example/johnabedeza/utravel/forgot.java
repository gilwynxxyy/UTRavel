package com.example.johnabedeza.utravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class forgot extends AppCompatActivity {

    public Button btnreg;

    public void init(){
        btnreg = (Button)findViewById(R.id.btnback4);
        btnreg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent layreg = new Intent(forgot.this,loginpage.class);

                startActivity(layreg);
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);
        init();

        ImageView myImageView = (ImageView) findViewById(R.id.imageView2);
        myImageView.setImageResource(R.drawable.utlogo);
    }
}
