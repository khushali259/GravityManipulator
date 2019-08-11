package com.example.gravitymanipulator;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    View layout;
    ImageView ball;
    ImageView ball1;
    ImageView ball2;
    ImageView ball3;
    ImageView ball4;
    ImageView ball5;
    int dur=1200;
    int X;
    int Y;
    boolean isBottom=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         layout=findViewById(R.id.layout);
         ball=(ImageView)findViewById(R.id.imageView);
        ball1=(ImageView)findViewById(R.id.imageView1);
        ball2=(ImageView)findViewById(R.id.imageView2);
        ball3=(ImageView)findViewById(R.id.imageView3);
        ball4=(ImageView)findViewById(R.id.imageView4);
        ball5=(ImageView)findViewById(R.id.imageView5);
         layout.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (isBottom){
                     SlideToAbove();
                     isBottom=false;
                 }
                 else{
                     SlideToDown();
                     isBottom=true;
                 }
             }
         });


    }
    public void SlideToAbove() {
        ObjectAnimator b=ObjectAnimator.ofFloat(ball,"y",10f);
        b.setDuration(dur);
        ObjectAnimator g =ObjectAnimator.ofFloat(ball1,"y",10f);
        g.setDuration(dur);
        ObjectAnimator o =ObjectAnimator.ofFloat(ball2,"y",10f);
        o.setDuration(dur);
        ObjectAnimator y =ObjectAnimator.ofFloat(ball3,"y",10f);
        y.setDuration(dur);
        ObjectAnimator r =ObjectAnimator.ofFloat(ball4,"y",10f);
        r.setDuration(dur);
        ObjectAnimator p =ObjectAnimator.ofFloat(ball5,"y",10f);
        p.setDuration(dur);

        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether( b,g,o,y,r,p);
        animatorSet.start();
    }
    public void SlideToDown() {

        ObjectAnimator b=ObjectAnimator.ofFloat(ball,"y",2000f);
        b.setDuration(dur);
        ObjectAnimator g =ObjectAnimator.ofFloat(ball1,"y",2000f);
        g.setDuration(dur);
        ObjectAnimator o =ObjectAnimator.ofFloat(ball2,"y",2000f);
        o.setDuration(dur);
        ObjectAnimator y =ObjectAnimator.ofFloat(ball3,"y",2000f);
        y.setDuration(dur);
        ObjectAnimator r =ObjectAnimator.ofFloat(ball4,"y",2000f);
        r.setDuration(dur);
        ObjectAnimator p =ObjectAnimator.ofFloat(ball5,"y",2000f);
        p.setDuration(dur);

        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether( b,g,o,y,r,p);
        animatorSet.start();
    }
    public void generateRandom(View view) {

        ball.setVisibility(View.INVISIBLE);
        ball1.setVisibility(View.INVISIBLE);
        ball2.setVisibility(View.INVISIBLE);
        ball3.setVisibility(View.INVISIBLE);
        ball4.setVisibility(View.INVISIBLE);
        ball5.setVisibility(View.INVISIBLE);

        int y;

        Random color = new Random();
        y = color.nextInt(6);

        Random random = new Random();

        if (y != 0) {
            X = random.nextInt(600);
            Y = random.nextInt(800);
            ball.setX(X);
            ball.setY(Y);
            ball.setVisibility(View.VISIBLE);
        }

        if (y != 1) {
            X = random.nextInt(600);
            Y = random.nextInt(800);
            ball1.setX(X);
            ball1.setY(Y);
            ball1.setVisibility(View.VISIBLE);
        }

        if (y != 2) {
            X = random.nextInt(600);
            Y = random.nextInt(800);
            ball2.setX(X);
            ball2.setY(Y);
            ball2.setVisibility(View.VISIBLE);
        }

        if (y != 3) {
            X = random.nextInt(600);
            Y = random.nextInt(800);
            ball3.setX(X);
            ball3.setY(Y);
            ball3.setVisibility(View.VISIBLE);
        }

        if (y != 4) {
           X = random.nextInt(600);
            Y = random.nextInt(800);
            ball4.setX(X);
            ball4.setY(Y);
            ball4.setVisibility(View.VISIBLE);
        }

        if (y != 5) {
            X = random.nextInt(600);
            Y = random.nextInt(800);
            ball5.setX(X);
            ball5.setY(Y);
            ball5.setVisibility(View.VISIBLE);
        }
    }
}





