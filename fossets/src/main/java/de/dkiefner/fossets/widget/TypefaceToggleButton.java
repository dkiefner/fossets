package de.dkiefner.fossets.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;

import de.dkiefner.fossets.Fossets;
import de.dkiefner.fossets.TypeFaceView;

public class TypefaceToggleButton extends ToggleButton implements TypeFaceView {

    public TypefaceToggleButton(Context context) {
        super(context);
    }

    public TypefaceToggleButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        Fossets.with(context).set(attrs, this);
    }

    public TypefaceToggleButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Fossets.with(context).set(attrs, this);
    }

    @Override
    public void setTypeface(String fontPath) {
        Fossets.with(getContext()).set(fontPath, this);
    }
}
