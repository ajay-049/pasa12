package com.ajay.pasa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    private Button  roll_btn,restart;
    private ImageView imageVala;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageVala=(ImageView) findViewById(R.id.imageVala);
        roll_btn=(Button) findViewById(R.id.roll_btn);
        restart=findViewById(com.airbnb.lottie.R.id.restart);


        roll_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String [] dice =new String[6];
                dice[0]="1";
                dice[1]="2";
                dice[2]="3";
                dice[3]="4";
                dice[4]="5";
                dice[5]="6";

                int min=0;
                int max=5;
                int roll=(int) ((Math.random()*10)%6);

                switch (dice[roll]){
                    case "1":
                      imageVala.setBackgroundResource(R.drawable.img_01);
                      break;
                    case "2":
                        imageVala.setBackgroundResource(R.drawable.img_02);
                        return;
                    case "3":
                        imageVala.setBackgroundResource(R.drawable.img_03);
                        return;
                    case "4":
                        imageVala.setBackgroundResource(R.drawable.img_04);
                        return;
                    case "5":
                        imageVala.setBackgroundResource(R.drawable.img_05);
                        return;
                    case "6":
                        imageVala.setBackgroundResource(R.drawable.img_06);
                        return;
                }

            }
        });

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });




    }

}