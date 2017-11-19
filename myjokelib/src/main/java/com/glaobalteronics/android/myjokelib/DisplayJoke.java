package com.glaobalteronics.android.myjokelib;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJoke extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        TextView textview = (TextView) findViewById(R.id.joke_text);
        String JokeResult = null;
        Intent intent = getIntent();
        JokeResult = intent.getStringExtra(getString(R.string.jokeEnvelope));

        if (JokeResult != null) {
            textview.setText(JokeResult);
        } else {
            textview.setText("Dig deeped, we gotta find the joke!");
        }
    }
}
