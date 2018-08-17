package org.jsoup.nodes;

import me.zhanghai.android.materialprogressbar.BuildConfig;

public class BooleanAttribute extends Attribute {
    public BooleanAttribute(String str) {
        super(str, BuildConfig.FLAVOR);
    }

    protected final boolean b() {
        return true;
    }
}
