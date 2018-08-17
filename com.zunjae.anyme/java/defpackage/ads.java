package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.TypedValue;

public final class ads {
    public static int a(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static StateListDrawable a(Context context, Drawable drawable, Drawable drawable2, boolean z) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, drawable2);
        stateListDrawable.addState(new int[]{-16842912}, drawable);
        if (z) {
            int integer = context.getResources().getInteger(17694720);
            stateListDrawable.setEnterFadeDuration(integer);
            stateListDrawable.setExitFadeDuration(integer);
        }
        return stateListDrawable;
    }
}
