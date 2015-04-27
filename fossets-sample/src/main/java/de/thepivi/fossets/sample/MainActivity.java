package de.thepivi.fossets.sample;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import de.thepivi.fossets.widget.TypefaceButton;
import de.thepivi.fossets.widget.TypefaceEditText;
import de.thepivi.fossets.widget.TypefaceTextView;


public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener {

    private static final String TAG = "Fossets-Sample";

    private TypefaceTextView mText;
    private TypefaceEditText mEdit;
    private TypefaceButton mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(de.thepivi.fossets.sample.R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        mText = (TypefaceTextView) findViewById(R.id.text);
        mEdit = (TypefaceEditText) findViewById(R.id.edit);
        mButton = (TypefaceButton) findViewById(R.id.button);

        Spinner mSpinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.fonts_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinner.setAdapter(adapter);
        mSpinner.setOnItemSelectedListener(this);
    }

    private String getFontPath(int position) {
        switch (position) {
            case 0:
                return getString(R.string.font_good_dog);
            case 1:
                return getString(R.string.font_quicksand_bold);
            case 2:
                return getString(R.string.font_quicksand_italic);
            case 3:
                return getString(R.string.font_quicksand_regular);
            default:
                return null;
        }
    }

    private void updateFont(String fontPath) {
        Context context = getBaseContext();
        mText.setTypeface(context, fontPath);
        mEdit.setTypeface(context, fontPath);
        mButton.setTypeface(context, fontPath);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        String fontPath = getFontPath(pos);
        updateFont(fontPath);
        Log.d(TAG, "pos=" + pos + " fontPath=" + fontPath);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        updateFont(null);
    }
}
