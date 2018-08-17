package com.joanzapata.iconify.internal;

import android.content.Context;
import android.graphics.Typeface;
import com.joanzapata.iconify.Icon;
import com.joanzapata.iconify.IconFontDescriptor;
import java.util.HashMap;
import java.util.Map;

public class IconFontDescriptorWrapper {
    private Typeface cachedTypeface;
    private final IconFontDescriptor iconFontDescriptor;
    private final Map<String, Icon> iconsByKey = new HashMap();

    public IconFontDescriptorWrapper(IconFontDescriptor iconFontDescriptor) {
        this.iconFontDescriptor = iconFontDescriptor;
        for (Icon icon : iconFontDescriptor.characters()) {
            this.iconsByKey.put(icon.key(), icon);
        }
    }

    public Icon getIcon(String str) {
        return (Icon) this.iconsByKey.get(str);
    }

    public IconFontDescriptor getIconFontDescriptor() {
        return this.iconFontDescriptor;
    }

    public Typeface getTypeface(Context context) {
        Typeface typeface = this.cachedTypeface;
        if (typeface != null) {
            return typeface;
        }
        synchronized (this) {
            if (this.cachedTypeface != null) {
                Typeface typeface2 = this.cachedTypeface;
                return typeface2;
            }
            this.cachedTypeface = Typeface.createFromAsset(context.getAssets(), this.iconFontDescriptor.ttfFileName());
            typeface2 = this.cachedTypeface;
            return typeface2;
        }
    }

    public boolean hasIcon(Icon icon) {
        return this.iconsByKey.values().contains(icon);
    }
}
