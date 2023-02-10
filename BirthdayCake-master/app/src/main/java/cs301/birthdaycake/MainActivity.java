package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;

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

        //retrieve reference to blow out button view -- user interface
        //call setOnClickListener() method button for cake controoller to listen for button cl

    }

    public void goodbye(View button) {
        Log.i("button", "Goodbye");
    }
}
