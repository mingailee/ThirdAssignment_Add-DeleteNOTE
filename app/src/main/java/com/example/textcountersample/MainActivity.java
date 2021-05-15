package com.example.textcountersample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.textcountersample.utils.ElementsCalculator;
import com.example.textcountersample.utils.NumbersCalculator;
import com.example.textcountersample.utils.WordsCalculator;

import java.util.ArrayList;

import static com.example.textcountersample.utils.ElementsCalculator.getCharsCount;

public class MainActivity extends AppCompatActivity {

    Spinner ddSelection;
    EditText edUserInput;
    TextView tvOutput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.ddSelection = (Spinner) findViewById(R.id.ddSelection);
        this.edUserInput = findViewById(R.id.edUserInput);
        this.tvOutput = findViewById(R.id.tvOutput);

        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(this, R.array.planets_array, android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.ddSelection.setAdapter(arrayAdapter);

    }

    public void btnCalculateOnClick(View view) {
        // EditText edUserInput = findViewById(R.id.edUserInput);
        // TextView tvOutput = findViewById(R.id.tvOutput);
        String userInputText = edUserInput.getText().toString();

        String selection = this.ddSelection.getSelectedItem().toString();

        String resValueChars = getResources().getString(R.string.CharsSelection);
        Toast.makeText(this, String.valueOf(resValueChars), Toast.LENGTH_SHORT).show();

        String resValueWords = getResources().getString(R.string.WordsSelection);
        Toast.makeText(this, String.valueOf(resValueWords), Toast.LENGTH_SHORT).show();

        String resValueNumbers = getResources().getString(R.string.NumbersSelection);
        Toast.makeText(this, String.valueOf(resValueNumbers), Toast.LENGTH_SHORT).show();

        if (selection.equalsIgnoreCase(resValueChars)) {
            int count = ElementsCalculator.getCharsCount(userInputText);
            tvOutput.setText(String.valueOf(count));
        }
        if (selection.equalsIgnoreCase(resValueWords)) {
            int count = WordsCalculator.getWordsCount(userInputText);
            tvOutput.setText(String.valueOf(count));
        }
        if (selection.equalsIgnoreCase(resValueNumbers)) {
            int count = NumbersCalculator.getNumbersCount(userInputText);
            tvOutput.setText(String.valueOf(count));
        }
    }
}

