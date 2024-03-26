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

public class MainActivity extends AppCompatActivity {

    TextView outputText;
    EditText inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outputText = findViewById(R.id.outText);
        inputText = findViewById(R.id.inputText);

        outputText.setText("Min app funkar!");



    }

    public void calculate(View view) {
        double[] values = { 3.5, 4.4, 9, 1.2, 6.5, 12.1 };

        outputText.setText(String.format("Medelvärde: %.2f", Statistics.calcMean(values)));

    }

    public void buttonHandler(View view) {
        outputText.setText(inputText.getText().toString());
    }
}