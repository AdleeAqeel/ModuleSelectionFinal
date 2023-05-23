package sg.edu.rp.id22020682.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvC346;
    TextView tvC206;
    TextView tvC203;
    TextView tvC218;
    TextView tvC235;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC346 = findViewById(R.id.textViewC346);
        tvC206 = findViewById(R.id.textViewC206);
        tvC203 = findViewById(R.id.textViewC203);
        tvC218 = findViewById(R.id.textViewC218);
        tvC235 = findViewById(R.id.textViewC235);

        tvC346.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code","C346");
                intent.putExtra("Module Name","iPad Programming");
                intent.putExtra("Academic Year: ",2023);
                intent.putExtra("Sem",2);
                intent.putExtra("Credit amount",4);
                intent.putExtra("Venue ","E63A");
                startActivity(intent);
            }
        });
        tvC206.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code","C206");
                intent.putExtra("Module Name"," Software Development Process ");
                intent.putExtra("Academic Year: ",2023);
                intent.putExtra("Sem",2);
                intent.putExtra("Credit amount",4);
                intent.putExtra("Venue ","W64N");
                startActivity(intent);
            }
        });
        tvC203.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code","C203");
                intent.putExtra("Module Name"," Web Application Development in PHP ");
                intent.putExtra("Academic Year: ",2023);
                intent.putExtra("Sem",2);
                intent.putExtra("Credit amount",4);
                intent.putExtra("Venue ","W64N");
                startActivity(intent);
            }
        });
        tvC218.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code","C218");
                intent.putExtra("Module Name"," UI/UX design for apps ");
                intent.putExtra("Academic Year: ",2023);
                intent.putExtra("Sem",2);
                intent.putExtra("Credit amount",4);
                intent.putExtra("Venue ","W64N");
                startActivity(intent);
            }
        });
        tvC235.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code","C235");
                intent.putExtra("Module Name"," IT and Security management ");
                intent.putExtra("Academic Year",2023);
                intent.putExtra("Semester",2);
                intent.putExtra("Credit amount",4);
                intent.putExtra("Venue ","W64N");
                startActivity(intent);
            }
        });

        
    }
}