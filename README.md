[![Build Status](https://travis-ci.org/dkiefner/fossets.svg?branch=master)](https://travis-ci.org/dkiefner)
# fossets
A helper library to use custom fonts

# Usage
*For a working implementation, have a look at the fossets-sample project*

1. Put your custom font into your [Assets](https://developer.android.com/tools/projects/index.html#ApplicationModules) e.g. ../assets/fonts/myfont.otf

2.  Use predefined views in layout:
    ``` xml
    <de.dkiefner.fossets.widget.TypefaceTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello typfaced TextView"
        app:typeface="fonts/myfont.otf" />
    ```
    
    or use Fossets to inject the system views with your custom font:
    ``` java
    Fossets.with(context).set(view, fontPath);
    ```
    
### Version: 1.0.0

  * Initial Build