package com.example.user.doitorno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class Coin extends AppCompatActivity {

    Button b_flip;

    ImageView iv_coin;

    Random r;

    int coinSide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coin);


        b_flip = (Button) findViewById(R.id.b_flip);


        iv_coin = (ImageView) findViewById(R.id.iv_coin);

        r = new Random();

        b_flip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coinSide = r.nextInt(2);

                if(coinSide ==0) {
                    iv_coin.setImageResource(R.drawable.head);
                    Toast.makeText(Coin.this, " Heads !", Toast.LENGTH_SHORT).show();
                }else if (coinSide == 1){
                    iv_coin.setImageResource(R.drawable.tail);
                    Toast.makeText(Coin.this, " Tails !", Toast.LENGTH_SHORT).show();

                }
                RotateAnimation rotate = new RotateAnimation(0, 360,
                        RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                rotate.setDuration(1000);
                iv_coin.startAnimation(rotate);
            }
        });

    }
}

