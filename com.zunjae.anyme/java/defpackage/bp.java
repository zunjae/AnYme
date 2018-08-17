package defpackage;

import java.util.HashSet;
import java.util.Iterator;

public class bp {
    HashSet<bp> h = new HashSet(2);
    int i = 0;

    public void a() {
    }

    public final void a(bp bpVar) {
        this.h.add(bpVar);
    }

    public void b() {
        this.i = 0;
        this.h.clear();
    }

    public final void d() {
        this.i = 0;
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((bp) it.next()).d();
        }
    }

    public final void e() {
        this.i = 1;
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((bp) it.next()).a();
        }
    }

    public final boolean f() {
        return this.i == 1;
    }
}
