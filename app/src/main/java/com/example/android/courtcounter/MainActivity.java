package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity{

    int teamAScore=0;
    int teamBScore=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void plusOneA(View view){
        teamAScore=teamAScore+1;
        displayForTeamA(teamAScore);
    }

    public void plusTwoA(View view){
        teamAScore=teamAScore+2;
        displayForTeamA(teamAScore);
    }

    public void plusThreeA(View view){
        teamAScore=teamAScore+3;
        displayForTeamA(teamAScore);
    }

    public void plusOneB(View view){
        teamBScore=teamBScore+1;
        displayForTeamB(teamBScore);
    }

    public void plusTwoB(View view){
        teamBScore=teamBScore+2;
        displayForTeamB(teamBScore);
    }

    public void plusThreeB(View view){
        teamBScore=teamBScore+3;
        displayForTeamB(teamBScore);
    }

    public void reset(View view){
        teamAScore=0;
        teamBScore=0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


}
