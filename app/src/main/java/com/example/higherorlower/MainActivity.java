package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;
    public void makeToast(String string){
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_LONG).show();
    }

    public void clickTheButton(View view){
        EditText guessEditText = (EditText) findViewById(R.id.guessEditText);

        int guessInt = Integer.parseInt(guessEditText.getText().toString());

        if (guessInt > randomNumber){

            makeToast("Lower!");

        }else if (guessInt < randomNumber){

            makeToast("Higher!");

        } else {
//random number generator
            makeToast("That's right! Try again!");

            Random rand= new Random();

            randomNumber = rand.nextInt(20) + 1;



        }





    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Random rand = new Random();

        randomNumber = rand.nextInt(20) + 1;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
