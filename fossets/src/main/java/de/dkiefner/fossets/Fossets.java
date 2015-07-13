package de.dkiefner.fossets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class Fossets {

    private static final String TAG = "Fossets";

    private static Fossets instance;

    private final Context context;
    private final Map<String, Typeface> sCachedFonts;

    Fossets(Context context) {
        this.context = context;
        this.sCachedFonts = new HashMap<>();
    }

    public static Fossets with(Context context) {
        if (instance == null) {
            synchronized (Fossets.class) {
                if (instance == null) {
                    instance = new Fossets(context);
                }
            }
        }
        return instance;
    }

    Typeface createFromAsset(String path) {
        Typeface resultObject = sCachedFonts.get(path);

        if (resultObject == null) {
            resultObject = Typeface.createFromAsset(context.getAssets(), path);
            sCachedFonts.put(path, resultObject);
        }

        return resultObject;
    }

    public <T extends TextView> void set(AttributeSet attrs, T view) {
        if (view.isInEditMode()) {
            return;
        }

        TypedArray styledAttrs = context.obtainStyledAttributes(attrs, R.styleable.TypefaceView);
        String fontPath = styledAttrs.getString(R.styleable.TypefaceView_typeface);
        styledAttrs.recycle();

        set(fontPath, view);
    }

    public <T extends TextView> void set(String fontPath, T... view) {
        Typeface typeface;

        if (fontPath != null) {
            typeface = createFromAsset(fontPath);
        } else {
            Log.w(TAG, "Custom font not set. Use system font instead.");
            typeface = Typeface.DEFAULT;
        }

        for (T singleView : view) {
            singleView.setTypeface(typeface);
        }
    }

}
