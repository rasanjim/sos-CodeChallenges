package fi.arcada.codechallenge;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView outputText;
    EditText inputText;

    double [] testdata = { 658457, 297132, 244223, 239206, 209551, 195137, 144473, 121543, 120027, 83482, 80454, 77261, 72634, 67971, 67615, 64736, 64180, 52122, 51400, 51241, 51149, 47909, 46880, 45988, 45226, 38959, 37232, 36493, 35497, 34884 };
    ArrayList<Double> values = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outputText = findViewById(R.id.outText);
        inputText = findViewById(R.id.inputText);

        // Vi fyller vår ArrayList med värdena från testdata-arrayen
       for (double value : testdata) {
           values.add(value);
       }

       double version = 3.14159;
       int year = 2024;
       String author = "Jimmy";

       outputText.setText(String.format(
               "Appens version %.1f år %d by %s",
               version,
               year,
               author)
       );

    }

    public void calculate(View view) {

        outputText.setText(String.format("Medelvärde: %.2f\nMedian: %.2f\nStandardavvikelse: %.2f",
                Statistics.calcMean(values),
                Statistics.calcMedian(values),
                Statistics.calcStdev(values)
                ));

    }

    public void buttonHandler(View view) {
        outputText.setText(inputText.getText().toString());
    }
}