package de.dkiefner.fossets.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

import de.dkiefner.fossets.Fossets;
import de.dkiefner.fossets.TypeFaceView;

public class TypefaceButton extends Button implements TypeFaceView {

    public TypefaceButton(Context context) {
        super(context);
    }

    public TypefaceButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        Fossets.with(context).set(this, attrs);
    }

    public TypefaceButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Fossets.with(context).set(this, attrs);
    }

    @Override
    public void setTypeface(Context context, String fontPath) {
        Fossets.with(context).set(this, fontPath);
    }

}
