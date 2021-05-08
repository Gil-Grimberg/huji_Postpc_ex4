package exercise.find.roots;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultsActivity extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results_activity);
        Intent intentCreatedMe = getIntent();
        TextView original_number = findViewById(R.id.original_number);
        TextView root1 = findViewById(R.id.root1_output);
        TextView root2 = findViewById(R.id.root2_output);
        TextView calcTime = findViewById(R.id.time_output);

        long orig_number_long = intentCreatedMe.getLongExtra("original_number",0);
        long root1_long = intentCreatedMe.getLongExtra("root1",0);
        long root2_long = intentCreatedMe.getLongExtra("root2",0);
        long time = intentCreatedMe.getLongExtra("calculated_time",0);

        original_number.setText(Long.toString(orig_number_long));
        root1.setText(Long.toString(root1_long));
        root2.setText(Long.toString(root2_long));
        calcTime.setText(Long.toString(time));

    }
}
