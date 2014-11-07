package com.example.AtmExampleApiLevels;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.LinearInterpolator;
import android.widget.Button;

public class RidingDroidActivity extends Activity {

    public static final int TWO_SECONDS = 2000;

    private Droid droid;
    private int rideLength;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        droid = (Droid) findViewById(R.id.droid);
        rideLength = new RideLength().getRideLength(this);

        setupRideButton();
        setupResetButton();
    }

    private void setupRideButton() {
        Button button = (Button) findViewById(R.id.rideButton);
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                moveDroidWithAnimation();
//                moveDroidWithoutAnimation();
            }
        });
    }

    private void setupResetButton() {
        Button button = (Button) findViewById(R.id.resetButton);
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                resetDroid();
            }
        });
    }

    private void moveDroidWithAnimation() {
        final ObjectAnimator rideAnimator = ObjectAnimator.ofInt(droid, "marginLeft", 0, rideLength);

        rideAnimator.setDuration(TWO_SECONDS);
        rideAnimator.setInterpolator(new LinearInterpolator());

        rideAnimator.start();
    }

    private void moveDroidWithoutAnimation() {
        //TODO
    }

    private void resetDroid() {
        droid.setMarginLeft(0);
    }

}
