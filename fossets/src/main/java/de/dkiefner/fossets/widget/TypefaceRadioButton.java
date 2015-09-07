package de.dkiefner.fossets.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioButton;

import de.dkiefner.fossets.Fossets;
import de.dkiefner.fossets.TypeFaceView;

public class TypefaceRadioButton extends RadioButton implements TypeFaceView {

    public TypefaceRadioButton(Context context) {
        super(context);
    }

    public TypefaceRadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        Fossets.with(context).set(attrs, this);
    }

    public TypefaceRadioButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Fossets.with(context).set(attrs, this);
    }

    @Override
    public void setTypeface(String fontPath) {
        Fossets.with(getContext()).set(fontPath, this);
    }

}
