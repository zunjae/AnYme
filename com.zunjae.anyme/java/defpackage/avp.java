package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Collection;

public abstract class avp<Result> implements Comparable<avp> {
    avf e;
    avo<Result> f = new avo(this);
    Context g;
    avl<Result> h;
    aww i;
    final axv j = ((axv) getClass().getAnnotation(axv.class));

    private boolean a(avp avp) {
        if (c()) {
            for (Class isAssignableFrom : this.j.a()) {
                if (isAssignableFrom.isAssignableFrom(avp.getClass())) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean c() {
        return this.j != null;
    }

    public abstract String a();

    final void a(Context context, avf avf, avl<Result> avl_Result, aww aww) {
        this.e = avf;
        this.g = new avj(context, b(), o());
        this.h = avl_Result;
        this.i = aww;
    }

    public abstract String b();

    public /* synthetic */ int compareTo(Object obj) {
        avp avp = (avp) obj;
        return a(avp) ? 1 : avp.a(this) ? -1 : (!c() || avp.c()) ? (c() || !avp.c()) ? 0 : -1 : 1;
    }

    protected abstract Result d();

    protected boolean e() {
        return true;
    }

    final void k() {
        this.f.a(this.e.b(), null);
    }

    protected final aww l() {
        return this.i;
    }

    public final Context m() {
        return this.g;
    }

    public final avf n() {
        return this.e;
    }

    public final String o() {
        StringBuilder stringBuilder = new StringBuilder(".Fabric");
        stringBuilder.append(File.separator);
        stringBuilder.append(b());
        return stringBuilder.toString();
    }

    protected final Collection<ayg> p() {
        return this.f.f();
    }
}
