package de.thepivi.fossets.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import de.thepivi.fossets.Fossets;
import de.thepivi.fossets.TypeFaceView;

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
