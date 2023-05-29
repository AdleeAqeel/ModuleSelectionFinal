package sg.edu.rp.id22020682.mylocalbanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button OCBC;
    Button UOB;
    Button DBS;

    String wordClicked = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OCBC = findViewById(R.id.button);
        UOB = findViewById(R.id.button2);
        DBS = findViewById(R.id.button3);

        registerForContextMenu(OCBC);
        registerForContextMenu(UOB);
        registerForContextMenu(DBS);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();

        if (id == R.id.EnglishSelection) {
            OCBC.setText("OCBC");
            UOB.setText("UOB");
            DBS.setText("DBS");
            return true;

        } else if (id == R.id.ChineseSelection) {
            OCBC.setText("华侨银行");
            UOB.setText("大华银行");
            DBS.setText("星展银行");
            return true;
        } else {
            OCBC.setText("Error translation");
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        //…
        menu.add(0, 0, 0, "Website");
        menu.add(0, 1, 1, "Contact the Bank");

        if (v == OCBC) {
            wordClicked = "OCBC";
        } else if (v == UOB) {
            wordClicked = "UOB";
        } else if (v == DBS) {
            wordClicked = "DBS";
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (wordClicked.equalsIgnoreCase("OCBC")) {
            if (item.getItemId() == 0) { //check whether the selected menu item ID is 0
                //code for action
                Toast.makeText(MainActivity.this, "Website is showing", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ocbc.com/group/gateway.page"));
                startActivity(intent);


                return true; //menu item successfully handled

            } else if (item.getItemId() == 1) { //check if the selected menu item ID is 1
                //code for action
                Toast.makeText(MainActivity.this, "Bank is Being contacted", Toast.LENGTH_SHORT).show();
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "+ +003633333));
                startActivity(intentCall);


                return true;  //menu item successfully handled
            }
        }
        else if (wordClicked.equalsIgnoreCase("UOB")) {
            if (item.getItemId() == 0) { //check whether the selected menu item ID is 0
                //code for action
                Toast.makeText(MainActivity.this, "Website is showing", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uob.com.sg"));
                startActivity(intent);


                return true; //menu item successfully handled

            } else if (item.getItemId() == 1) { //check if the selected menu item ID is 1
                //code for action
                Toast.makeText(MainActivity.this, "Bank is Being contacted", Toast.LENGTH_SHORT).show();
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "+ +002222121));
                startActivity(intentCall);


                return true;  //menu item successfully handled
            }
        }
        else if (wordClicked.equalsIgnoreCase("DBS")) {
            if (item.getItemId() == 0) { //check whether the selected menu item ID is 0
                //code for action
                Toast.makeText(MainActivity.this, "Website is showing", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dbs.com.sg"));
                startActivity(intent);


                return true; //menu item successfully handled

            } else if (item.getItemId() == 1) { //check if the selected menu item ID is 1
                //code for action
                Toast.makeText(MainActivity.this, "Bank is Being contacted", Toast.LENGTH_SHORT).show();
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "+ +002222121));
                startActivity(intentCall);


                return true;  //menu item successfully handled
            }
        }

        return super.onContextItemSelected(item);
    }

}