package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] BallArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        final ImageView image_8ball = (ImageView) findViewById(R.id.image_8ball);

        Button AskButton;
        AskButton = (Button) findViewById(R.id.button_ask);

        AskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("magiceightball", "Button was pressed.");

                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(5);

                Log.d("magiceightball", "The random number is:" + number);

                image_8ball.setImageResource(BallArray[number]);


            }
        });
    }
}
