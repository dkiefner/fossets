[![Build Status](https://travis-ci.org/dkiefner/fossets.svg?branch=master)](https://travis-ci.org/dkiefner)
# fossets
A helper library to use custom fonts

# Gradle
``` groovy
dependencies {
    ...
    compile 'de.dkiefner:fossets:1.1.0'
}
```

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
    Fossets.with(context).set(fontPath, view);
    Fossets.with(context).set(fontPath, view1, view2, ...);
    ```

# Changelog
* **1.1.0**
    * Inject multiple Views with single call
* **1.0.0**
    * Initial release


# License
    The MIT License (MIT)

    Copyright (c) 2015 Danny Kiefner

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.