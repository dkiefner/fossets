package de.thepivi.fossets.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

import de.thepivi.fossets.TypeFaceView;
import de.thepivi.fossets.Fossets;

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
