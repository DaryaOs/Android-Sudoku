package me.kirkhorn.knut.android_sudoku;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

import static android.preference.PreferenceManager.getDefaultSharedPreferences;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStartNewGameButtonClicked(View view) {
        Intent intent = new Intent("me.kirkhorn.knut.GameDifficultyActivity");
        startActivity(intent);
    }

    public void onAddNewBoardButtonClicked(View view) {
        Intent intent = new Intent("me.kirkhorn.knut.NewBoardActivity");
        startActivity(intent);
    }

    public void onShowInstructionsButtonClicked(View view) {
        Intent intent = new Intent("me.kirkhorn.knut.InstructionsActivity");
        startActivity(intent);
    }
}
