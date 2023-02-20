package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
    // instance variable
private CakeView cakeView;
private CakeModel cakeModel;



/**
 * constructor method
 *
 */
public CakeController(CakeView cakeView)
{
    this.cakeView = cakeView;
    this.cakeModel = cakeView.getCakeModel();
}


    @Override
    public void onClick(View view)
    {
        Log.d("button", "clicked");
        this.cakeModel.isLit = false;
        this.cakeView.invalidate();

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked)
    {
        this.cakeModel.hasCandles = isChecked;
        this.cakeView.invalidate();


    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        this.cakeModel.amountCandles = i;
        this.cakeView.invalidate();


    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
