package edu.washington.humzam.lifecounter;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static android.util.Log.i;


public class MainActivity extends ActionBarActivity {

    public static final String TAG = "MainActivity";

//    Button p1p1;
//    Button p1m1;
//    Button p1p5;
//    Button p1m5;
//
//    TextView p1_total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        p1_total = (TextView) findViewById(R.id.player1_total);
//        p1p1 = (Button) findViewById(R.id.player1_btn_plus1);
//        p1p1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                 TextView total = (TextView) findViewById(R.id.player1_total);
//                 int newTotal = Integer.parseInt(p1_total.getText().toString()) + 1;
//                 p1_total.setText("" + newTotal);
//            }
//        });
//        p1m1 = (Button) findViewById(R.id.player1_btn_minus1);
//        p1p5 = (Button) findViewById(R.id.player1_btn_plus5);
//        p1m5 = (Button) findViewById(R.id.player1_btn_minus1);

    }

    public void onClick(View v) {
        TextView p1_total = (TextView) findViewById(R.id.player1_total);
        TextView p2_total = (TextView) findViewById(R.id.player2_total);
        TextView p3_total = (TextView) findViewById(R.id.player3_total);
        TextView p4_total = (TextView) findViewById(R.id.player4_total);
        int p1_oldTotal = Integer.parseInt(p1_total.getText().toString());
        int p2_oldTotal = Integer.parseInt(p2_total.getText().toString());
        int p3_oldTotal = Integer.parseInt(p3_total.getText().toString());
        int p4_oldTotal = Integer.parseInt(p4_total.getText().toString());
        int newTotal;
        if (v.getId() == R.id.player1_btn_plus1) {
            newTotal = p1_oldTotal + 1;
            p1_total.setText("" + newTotal);
        } else if (v.getId() == R.id.player1_btn_minus1) {
            newTotal = p1_oldTotal - 1;
            p1_total.setText("" + newTotal);
            checkTotal(1, newTotal);
        } else if (v.getId() == R.id.player1_btn_plus5) {
            newTotal = p1_oldTotal + 5;
            p1_total.setText("" + newTotal);
        } else if (v.getId() == R.id.player1_btn_minus5) {
            newTotal = p1_oldTotal - 5;
            checkTotal(1, newTotal);
            p1_total.setText("" + newTotal);
        } else if (v.getId() == R.id.player2_btn_plus1) {
            newTotal = p2_oldTotal + 1;
            p2_total.setText("" + newTotal);
        } else if (v.getId() == R.id.player2_btn_minus1) {
            newTotal = p2_oldTotal - 1;
            p2_total.setText("" + newTotal);
            checkTotal(2, newTotal);
        } else if (v.getId() == R.id.player2_btn_plus5) {
            newTotal = p2_oldTotal + 5;
            p2_total.setText("" + newTotal);
        } else if (v.getId() == R.id.player2_btn_minus5) {
            newTotal = p2_oldTotal - 5;
            checkTotal(2, newTotal);
            p2_total.setText("" + newTotal);
        } else if (v.getId() == R.id.player3_btn_plus1) {
            newTotal = p3_oldTotal + 1;
            p3_total.setText("" + newTotal);
        } else if (v.getId() == R.id.player3_btn_minus1) {
            newTotal = p3_oldTotal - 1;
            p3_total.setText("" + newTotal);
            checkTotal(3, newTotal);
        } else if (v.getId() == R.id.player3_btn_plus5) {
            newTotal = p3_oldTotal + 5;
            p3_total.setText("" + newTotal);
        } else if (v.getId() == R.id.player3_btn_minus5) {
            newTotal = p3_oldTotal - 5;
            checkTotal(3, newTotal);
            p3_total.setText("" + newTotal);
        } else if (v.getId() == R.id.player4_btn_plus1) {
            newTotal = p4_oldTotal + 1;
            p4_total.setText("" + newTotal);
        } else if (v.getId() == R.id.player4_btn_minus1) {
            newTotal = p4_oldTotal - 1;
            p4_total.setText("" + newTotal);
            checkTotal(4, newTotal);
        } else if (v.getId() == R.id.player4_btn_plus5) {
            newTotal = p4_oldTotal + 5;
            p4_total.setText("" + newTotal);
        } else if (v.getId() == R.id.player4_btn_minus5) {
            newTotal = p4_oldTotal - 5;
            checkTotal(4, newTotal);
            p4_total.setText("" + newTotal);
        }
    }

    private void checkTotal(int player, int total) {
        if (total < 0) {
            CharSequence text = "Player " + player +  " LOSES!";
            Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
            toast.show();
        }
    }


/*
    public void onClick(View v) {
        String tag = String.valueOf(v.getTag());     //player1_btn_minus5
        String player_num = tag.substring(0, 7);     // grabs the number of player embedded in string
        tag = tag.substring(12);    //cuts string down to "minus5" or "plus1"
        int value = tag.charAt(tag.length() - 1);
        String textViewName = player_num + "_total";   // player1_total
        int id = getResources().getIdentifier(textViewName, "id", getPackageName());
        TextView total = (TextView) findViewById(id);
        int oldTotal = Integer.parseInt((String) total.getText());
        int newTotal;
        if (tag.substring(0, 1) == "m") {
            newTotal = oldTotal - value;
        } else {
            newTotal = oldTotal + value;
        }
        total.setText(newTotal);
    }
  */

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
