package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        //chkpt 1
        CakeView cakeView = findViewById(R.id.cakeview);
        CakeController cakeController = new CakeController(cakeView);

        //chkpt 2
        Button blowOut = (Button) findViewById(R.id.blowout);
        blowOut.setOnClickListener(cakeController);

        CompoundButton candlesButton = (CompoundButton) findViewById(R.id.switch2);
        candlesButton.setOnCheckedChangeListener(cakeController);

       SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(cakeController);


    }

    public void goodbye(View button)
    {
        Log.i("button", "Goodbye");
    }


}
