package de.dkiefner.fossets.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

import de.dkiefner.fossets.Fossets;
import de.dkiefner.fossets.TypeFaceView;

public class TypefaceEditText extends EditText implements TypeFaceView {

    public TypefaceEditText(Context context) {
        super(context);
    }

    public TypefaceEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        Fossets.with(context).set(this, attrs);
    }

    public TypefaceEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Fossets.with(context).set(this, attrs);
    }

    @Override
    public void setTypeface(Context context, String fontPath) {
        Fossets.with(context).set(this, fontPath);
    }

}
