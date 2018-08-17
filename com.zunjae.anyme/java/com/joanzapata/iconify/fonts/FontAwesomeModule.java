package com.joanzapata.iconify.fonts;

import com.joanzapata.iconify.Icon;
import com.joanzapata.iconify.IconFontDescriptor;

public class FontAwesomeModule implements IconFontDescriptor {
    public Icon[] characters() {
        return FontAwesomeIcons.values();
    }

    public String ttfFileName() {
        return "iconify/android-iconify-fontawesome.ttf";
    }
}
