package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static int score = 0;
    static int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plusThree(View view){
        score += 3;
        TextView scoreView = findViewById(R.id.teamAScore);
        scoreView.setText(String.valueOf(score));
    }
    public void plusTwo(View view){
        score += 2;
        TextView scoreView = findViewById(R.id.teamAScore);
        scoreView.setText(String.valueOf(score));
    }

    public void freeThrow(View view){
        score += 1;
        TextView scoreView = findViewById(R.id.teamAScore);
        scoreView.setText(String.valueOf(score));
    }

    public void plusTwoB(View view) {
        scoreB += 2;
        TextView scoreView = findViewById(R.id.teamBScore);
        scoreView.setText(String.valueOf(scoreB));
    }

    public void freeThrowB(View view) {
        scoreB += 1;
        TextView scoreView = findViewById(R.id.teamBScore);
        scoreView.setText(String.valueOf(scoreB));
    }

    public void plusThreeB(View view) {
        scoreB += 3;
        TextView scoreView = findViewById(R.id.teamBScore);
        scoreView.setText(String.valueOf(scoreB));
    }

    public void Resets(View view) {
        score = 0;
        scoreB = 0;
        TextView scoreView = findViewById(R.id.teamAScore);
        TextView scoreViewB = findViewById(R.id.teamBScore);

        scoreView.setText(String.valueOf(score));

        scoreViewB.setText(String.valueOf(scoreB));


    }
}