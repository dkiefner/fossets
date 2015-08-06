package de.dkiefner.fossets.sample;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import de.dkiefner.fossets.Fossets;
import de.dkiefner.fossets.widget.TypefaceButton;
import de.dkiefner.fossets.widget.TypefaceEditText;
import de.dkiefner.fossets.widget.TypefaceTextView;
import de.dkiefner.fossets.widget.TypefaceToggleButton;


public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener {

    private TextView text;
    private TypefaceTextView tfText;
    private TypefaceEditText tfEdit;
    private TypefaceButton tfButton;
    private TypefaceToggleButton tfToggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(de.dkiefner.fossets.sample.R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        text = (TextView) findViewById(R.id.text);
        tfText = (TypefaceTextView) findViewById(R.id.tf_text);
        tfEdit = (TypefaceEditText) findViewById(R.id.tf_edit);
        tfButton = (TypefaceButton) findViewById(R.id.tf_button);
        tfToggleButton = (TypefaceToggleButton) findViewById(R.id.tf_togglebutton);

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

        // using Fossets on normal TextView
        Fossets.with(context).set(fontPath, text);

        // using TypeFaceViews
        tfText.setTypeface(fontPath);
        tfEdit.setTypeface(fontPath);
        tfButton.setTypeface(fontPath);
        tfToggleButton.setTypeface(fontPath);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        String fontPath = getFontPath(pos);
        updateFont(fontPath);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        updateFont(null);
    }
}
