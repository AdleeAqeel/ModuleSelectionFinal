package sg.edu.rp.id22020682.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
TextView tvAnswer;
TextView tvAnswer2;
TextView tvAnswer3;
TextView tvAnswer4;
TextView tvAnswer5;
TextView tvAnswer6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvAnswer = findViewById(R.id.textView3);
        tvAnswer2 = findViewById(R.id.textView4);
        tvAnswer3 = findViewById(R.id.textView5);
        tvAnswer4 = findViewById(R.id.textView6);
        tvAnswer5 = findViewById(R.id.textView7);
        tvAnswer6 = findViewById(R.id.textView8);

        Intent intentReceieved = getIntent();
        String moduleSelectedCode = intentReceieved.getStringExtra("Module Code");
        String moduleSelectedName = intentReceieved.getStringExtra("Module Name");
        int moduleSelectedYear = intentReceieved.getIntExtra("Academic Year", 0);
        int moduleSelectedSem = intentReceieved.getIntExtra("Semester", 0);
        int moduleSelectedCredit = intentReceieved.getIntExtra("Credit Amount", 0);
        String moduleSelectedVenue = intentReceieved.getStringExtra("Venue");

        if(moduleSelectedCode.equals("C346")){
            tvAnswer.setText("Module code: " + moduleSelectedCode);
            tvAnswer2.setText("Module name: " + moduleSelectedName);
            tvAnswer3.setText("Academic Year: " + moduleSelectedYear);
            tvAnswer4.setText("Semester: " + moduleSelectedSem);
            tvAnswer5.setText("Module Credits: " + moduleSelectedCredit);
            tvAnswer6.setText("Module Venue: " + moduleSelectedVenue);
        }
        else if(moduleSelectedCode.equals("C206")){
            tvAnswer.setText("Module code: " + moduleSelectedCode);
            tvAnswer2.setText("Module name: " + moduleSelectedName);
            tvAnswer3.setText("Academic Year: " + moduleSelectedYear);
            tvAnswer4.setText("Semester: " + moduleSelectedSem);
            tvAnswer5.setText("Module Credits: " + moduleSelectedCredit);
            tvAnswer6.setText("Module Venue: " + moduleSelectedVenue);
        }
        else if(moduleSelectedCode.equals("C203")){
            tvAnswer.setText("Module code: " + moduleSelectedCode);
            tvAnswer2.setText("Module name: " + moduleSelectedName);
            tvAnswer3.setText("Academic Year: " + moduleSelectedYear);
            tvAnswer4.setText("Semester: " + moduleSelectedSem);
            tvAnswer5.setText("Module Credits: " + moduleSelectedCredit);
            tvAnswer6.setText("Module Venue: " + moduleSelectedVenue);
        }
        else if(moduleSelectedCode.equals("C218")){
            tvAnswer.setText("Module code: " + moduleSelectedCode);
            tvAnswer2.setText("Module name: " + moduleSelectedName);
            tvAnswer3.setText("Academic Year: " + moduleSelectedYear);
            tvAnswer4.setText("Semester: " + moduleSelectedSem);
            tvAnswer5.setText("Module Credits: " + moduleSelectedCredit);
            tvAnswer6.setText("Module Venue: " + moduleSelectedVenue);
        }
        else if(moduleSelectedCode.equals("C235")){
            tvAnswer.setText("Module code: " + moduleSelectedCode);
            tvAnswer2.setText("Module name: " + moduleSelectedName);
            tvAnswer3.setText("Academic Year: " + moduleSelectedYear);
            tvAnswer4.setText("Semester: " + moduleSelectedSem);
            tvAnswer5.setText("Module Credits: " + moduleSelectedCredit);
            tvAnswer6.setText("Module Venue: " + moduleSelectedVenue);
        }





    }
}