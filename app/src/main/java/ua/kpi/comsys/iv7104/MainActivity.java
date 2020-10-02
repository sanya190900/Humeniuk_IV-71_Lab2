package ua.kpi.comsys.iv7104;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import java.sql.Time;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            //task 8
            TimeOH t1 = new TimeOH();
            TimeOH t2 = new TimeOH(13, 12, 11);;
            TimeOH t3 = new TimeOH(new Time(13, 12,12));

            //task 9
            //Note : format 1:12:11 PM is correct (I sent a message to you in Telegram about it)
            // You tell that I need remind you this thing when I will send a link for checking
            Log.i("toString", t2.toString()); //1:12:11 PM
            Log.i("sum", t1.sum(t2).toString()); // 1:12:11 PM
            Log.i("diff", t1.diff(t3).toString()); //10:47:48 AM
            Log.i("static sum", TimeOH.sum(t2, t3).toString()); // 2:24:23 AM
            Log.i("static diff", TimeOH.diff(t2, t3).toString()); //11:59:59 PM
            // task 10 : output is correct
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}