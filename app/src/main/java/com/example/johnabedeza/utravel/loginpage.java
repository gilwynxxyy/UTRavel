package com.example.johnabedeza.utravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class loginpage extends AppCompatActivity {

    public Button btnreg;
    public Button btnfor;
    public Button btnhome;

    public void init(){
        btnreg = (Button)findViewById(R.id.btnreg);
        btnreg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent layreg = new Intent(loginpage.this,reg1.class);

                startActivity(layreg);
            }
        });

    }

    public void init2(){
        btnfor = (Button)findViewById(R.id.btnforgot);
        btnfor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent layreg = new Intent(loginpage.this,forgot.class);

                startActivity(layreg);
            }
        });

    }

    public void init3(){
        btnhome = (Button)findViewById(R.id.btnhome);
        btnhome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent layreg = new Intent(loginpage.this,homapage.class);

                startActivity(layreg);
            }
        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        init();
        init2();
        init3();

        ImageView myImageView = (ImageView) findViewById(R.id.imageView2);
        myImageView.setImageResource(R.drawable.utlogo);

    }
}
