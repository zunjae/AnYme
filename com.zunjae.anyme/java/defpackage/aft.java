package defpackage;

import android.annotation.SuppressLint;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

@SuppressLint({"InlinedApi"})
public final class aft extends StateListDrawable {
    private int a;
    private int b;

    public aft(Drawable drawable, int i, int i2) {
        drawable = drawable.mutate();
        addState(new int[]{16842913}, drawable);
        addState(new int[0], drawable);
        this.a = i;
        this.b = i2;
    }

    public aft(Drawable drawable, Drawable drawable2, int i, int i2) {
        drawable = drawable.mutate();
        int[] iArr = new int[]{16842913};
        addState(iArr, drawable2.mutate());
        addState(new int[0], drawable);
        this.a = i;
        this.b = i2;
    }

    public final boolean isStateful() {
        return true;
    }

    protected final boolean onStateChange(int[] iArr) {
        Object obj = null;
        for (int i : iArr) {
            if (i == 16842913) {
                obj = 1;
            }
        }
        super.setColorFilter(obj != null ? this.b : this.a, Mode.SRC_IN);
        return super.onStateChange(iArr);
    }
}
