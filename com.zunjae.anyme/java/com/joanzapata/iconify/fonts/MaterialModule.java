package com.joanzapata.iconify.fonts;

import com.joanzapata.iconify.Icon;
import com.joanzapata.iconify.IconFontDescriptor;

public class MaterialModule implements IconFontDescriptor {
    public Icon[] characters() {
        return MaterialIcons.values();
    }

    public String ttfFileName() {
        return "iconify/android-iconify-material.ttf";
    }
}
