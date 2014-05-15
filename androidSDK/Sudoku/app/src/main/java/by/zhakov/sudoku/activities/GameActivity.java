package by.zhakov.sudoku.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import by.zhakov.sudoku.R;
import by.zhakov.sudoku.views.SudokuFieldView;

/**
 * Created by Aleksei on 13.05.14.
 */
public class GameActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_field);
    }

    public void onDigitsPress(View v){
        int num = 0;
        switch (v.getId()){
            case R.id.button_1 : num = 1; break;
            case R.id.button_2 : num = 2; break;
            case R.id.button_3 : num = 3; break;
            case R.id.button_4 : num = 4; break;
            case R.id.button_5 : num = 5; break;
            case R.id.button_6 : num = 6; break;
            case R.id.button_7 : num = 7; break;
            case R.id.button_8 : num = 8; break;
            case R.id.button_9 : num = 9; break;
        }
        ((SudokuFieldView)findViewById(R.id.game_field)).onDigitsPress(num);
    }
}
