package defpackage;

import android.content.res.Resources;
import android.util.TypedValue;

public final class aii {
    public static int a(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, Resources.getSystem().getDisplayMetrics());
    }
}
