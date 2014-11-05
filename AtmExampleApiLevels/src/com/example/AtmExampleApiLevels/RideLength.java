package com.example.AtmExampleApiLevels;

import android.app.Activity;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.Display;

/**
 * @author Piotr Makowski (<a href=\"mailto:Piotr.Makowski@allegrogroup.pl\">Piotr.Makowski@allegrogroup.pl</a>)
 */
public class RideLength {

    public static final int DROID_WIDTH = 100;

    public int getRideLength(Activity activity) {
        Display display = activity.getWindowManager().getDefaultDisplay();

        int screenWidth = display.getWidth();

        Resources res = activity.getResources();
        int droidWidth = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, DROID_WIDTH, res.getDisplayMetrics());

        return screenWidth - droidWidth;
    }

}
