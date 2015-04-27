package de.thepivi.fossets.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

import de.thepivi.fossets.Fossets;
import de.thepivi.fossets.TypeFaceView;

public class TypefaceButton extends Button implements TypeFaceView {

    public TypefaceButton(Context context) {
        super(context);
    }

    public TypefaceButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        Fossets.with(context).load(this, attrs);
    }

    public TypefaceButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Fossets.with(context).load(this, attrs);
    }

    @Override
    public void setTypeface(Context context, String fontPath) {
        Fossets.with(context).set(this, fontPath);
    }

}
