package defpackage;

import android.view.View;

public abstract class nj<T extends View, Z> extends my<Z> {
    private static boolean b;
    private static Integer c;
    protected final T a;
    private final nk d;

    public nj(T t) {
        if (t != null) {
            this.a = t;
            this.d = new nk(t);
            return;
        }
        throw new NullPointerException("View must not be null!");
    }

    public final T a() {
        return this.a;
    }

    public final void a(mi miVar) {
        Integer num = c;
        if (num == null) {
            b = true;
            this.a.setTag(miVar);
            return;
        }
        this.a.setTag(num.intValue(), miVar);
    }

    public final void a(nf nfVar) {
        this.d.a(nfVar);
    }

    public final mi e() {
        Integer num = c;
        Object tag = num == null ? this.a.getTag() : this.a.getTag(num.intValue());
        if (tag == null) {
            return null;
        }
        if (tag instanceof mi) {
            return (mi) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Target for: ");
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }
}
