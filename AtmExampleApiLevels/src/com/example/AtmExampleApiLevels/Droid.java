package com.example.AtmExampleApiLevels;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * @author Piotr Makowski (<a href=\"mailto:Piotr.Makowski@allegrogroup.pl\">Piotr.Makowski@allegrogroup.pl</a>)
 */
public class Droid extends ImageView {

    public Droid(Context context) {
        super(context);
    }

    public Droid(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Droid(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setMarginLeft(final int margin) {
        final ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) getLayoutParams();

        params.leftMargin = margin;

        setLayoutParams(params);
    }

}
