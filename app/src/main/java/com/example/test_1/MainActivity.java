package com.example.test_1;

import androidx.appcompat.app.AppCompatActivity;

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

        final Button rollButton = findViewById(R.id.rollButton);
        final ImageView leftDice = findViewById(R.id.leftDice);
        final ImageView rightDice = findViewById(R.id.rightDice);

        final int[] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,}; // {1,2,3,4,5,6}


        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee", "Ze Button has been pressed");

                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(6); // 0 - 5
                leftDice.setImageResource(diceArray[number]);

                Log.d("DIce", "The result is " + number);

                number = randomNumberGenerator.nextInt(6); //0 - 5
                rightDice.setImageResource(diceArray[number]);


            }
        });


    }
}
