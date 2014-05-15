package by.zhakov.sudoku.activities;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;

import by.zhakov.sudoku.R;

public class MainMenuActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void onButtonClick(View v){
        Intent intent = null;
        switch (v.getId()){
            case R.id.new_game_button:
                intent = new Intent(this, GameActivity.class);
                break;
            case R.id.solve_sudoku_button:
                intent = new Intent(this, SolveActivity.class);
                break;
            case R.id.options_button:
                intent = new Intent(this, OptionsActivity.class);
                break;
            case R.id.statistics_button:
                intent = new Intent(this, StatisticsActivity.class);
                break;
        }
        if (intent != null){
            startActivity(intent);
        }
    }
}
