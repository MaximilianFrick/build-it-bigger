package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.udacity.gradle.builditbigger.android.jokes.JokeTellingActivity;
import com.udacity.gradle.builditbigger.jokes.JokeSupplier;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tellJoke(View view) {
        startActivity(JokeTellingActivity.newIntent(this, JokeSupplier.getJoke()));
    }
}
