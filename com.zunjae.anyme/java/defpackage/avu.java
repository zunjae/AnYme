package defpackage;

import android.content.Context;

public abstract class avu<T> implements avw<T> {
    private final avw<T> a = null;

    protected abstract T a();

    public final synchronized T a(Context context, avx<T> avx_T) {
        T a;
        a = a();
        if (a == null) {
            a = this.a != null ? this.a.a(context, avx_T) : avx_T.a(context);
            if (a != null) {
                a(a);
            } else {
                throw new NullPointerException();
            }
        }
        return a;
    }

    protected abstract void a(T t);
}
