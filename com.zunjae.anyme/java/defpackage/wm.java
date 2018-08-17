package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class wm extends wo implements Iterable<wo> {
    private final List<wo> a = new ArrayList();

    public final Number a() {
        if (this.a.size() == 1) {
            return ((wo) this.a.get(0)).a();
        }
        throw new IllegalStateException();
    }

    public final void a(wo woVar) {
        Object obj;
        if (woVar == null) {
            obj = wq.a;
        }
        this.a.add(obj);
    }

    public final String b() {
        if (this.a.size() == 1) {
            return ((wo) this.a.get(0)).b();
        }
        throw new IllegalStateException();
    }

    public final double c() {
        if (this.a.size() == 1) {
            return ((wo) this.a.get(0)).c();
        }
        throw new IllegalStateException();
    }

    public final long d() {
        if (this.a.size() == 1) {
            return ((wo) this.a.get(0)).d();
        }
        throw new IllegalStateException();
    }

    public final int e() {
        if (this.a.size() == 1) {
            return ((wo) this.a.get(0)).e();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof wm) || !((wm) obj).a.equals(this.a)) {
                return false;
            }
        }
        return true;
    }

    public final boolean f() {
        if (this.a.size() == 1) {
            return ((wo) this.a.get(0)).f();
        }
        throw new IllegalStateException();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final Iterator<wo> iterator() {
        return this.a.iterator();
    }
}
