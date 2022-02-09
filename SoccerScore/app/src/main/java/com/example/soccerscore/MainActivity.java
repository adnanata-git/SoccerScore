package com.example.soccerscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int redCardTeamA = 0;
    int redCardTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 1 goal.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    ;

    /**
     * Increase the score for Team B by 1 goal.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Red Card.
     */

    /**
     * Increase the score for Red Card Team A by 1.
     */
    public void addOneForRedCardTeamA(View v) {
        redCardTeamA = redCardTeamA + 1;
        displayForRedCardTeamA(redCardTeamA);
    }

    /**
     * Displays the given score for Red Card.
     */
    public void displayForRedCardTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_card_team_a);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Red Card.
     */

    /**
     * Increase the score for  Red Card Team B by 1.
     */
    public void addOneForRedCardTeamB(View v) {
        redCardTeamB = redCardTeamB + 1;
        displayForRedCardTeamB(redCardTeamB);
    }

    /**
     * Displays the given score for Team B Red Card.
     */
    public void displayForRedCardTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_card_team_b);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for both Team B and Team A.
     */

    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        redCardTeamA = 0;
        redCardTeamB = 0;
        displayForRedCardTeamA(redCardTeamA);
        displayForRedCardTeamB(redCardTeamB);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }

}

