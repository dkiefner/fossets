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
        Fossets.with(context).set(attrs, this);
    }

    public TypefaceTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Fossets.with(context).set(attrs, this);
    }

    @Override
    public void setTypeface(String fontPath) {
        Fossets.with(getContext()).set(fontPath, this);
    }
}
