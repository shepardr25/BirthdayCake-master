package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        //find View By ID
        CakeView viewById = findViewById(R.id.cakeview);
        //make new CakeController Object
        CakeController cakeObj = new CakeController(viewById);

        //Blow Out Candles
        Button button = (Button) findViewById(R.id.blowOut);
        button.setOnClickListener(cakeObj);

        //Are there candles switch
        CompoundButton candlesSwitch = (CompoundButton) findViewById(R.id.areCandles);
        candlesSwitch.setOnCheckedChangeListener(cakeObj);


    }

    public void goodbye(View button) {
        Log.i("button", "Goodbye");
    }
}
