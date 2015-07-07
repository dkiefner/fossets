package de.dkiefner.fossets.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import de.dkiefner.fossets.Fossets;
import de.dkiefner.fossets.TypeFaceView;

public class TypefaceTextView extends TextView implements TypeFaceView {

    public TypefaceTextView(Context context) {
        super(context);
    }

    public TypefaceTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Fossets.with(context).set(this, attrs);
    }

    public TypefaceTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Fossets.with(context).set(this, attrs);
    }

    @Override
    public void setTypeface(Context context, String fontPath) {
        Fossets.with(context).set(this, fontPath);
    }
}
