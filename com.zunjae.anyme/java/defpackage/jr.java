package defpackage;

import android.graphics.drawable.Drawable;

public abstract class jr<T extends Drawable> implements ft<T> {
    protected final T a;

    public jr(T t) {
        if (t != null) {
            this.a = t;
            return;
        }
        throw new NullPointerException("Drawable must not be null!");
    }

    public final /* synthetic */ Object b() {
        return this.a.getConstantState().newDrawable();
    }
}
