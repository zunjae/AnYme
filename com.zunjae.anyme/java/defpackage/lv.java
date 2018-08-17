package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public final class lv {
    private final Set<mi> a = Collections.newSetFromMap(new WeakHashMap());
    private final List<mi> b = new ArrayList();
    private boolean c;

    public final void a() {
        this.c = true;
        for (mi miVar : nw.a(this.a)) {
            if (miVar.e()) {
                miVar.d();
                this.b.add(miVar);
            }
        }
    }

    public final void a(mi miVar) {
        this.a.add(miVar);
        if (this.c) {
            this.b.add(miVar);
        } else {
            miVar.b();
        }
    }

    public final void b() {
        this.c = false;
        for (mi miVar : nw.a(this.a)) {
            if (!(miVar.f() || miVar.h() || miVar.e())) {
                miVar.b();
            }
        }
        this.b.clear();
    }

    public final void b(mi miVar) {
        this.a.remove(miVar);
        this.b.remove(miVar);
    }

    public final void c() {
        for (mi c : nw.a(this.a)) {
            c.c();
        }
        this.b.clear();
    }

    public final void d() {
        for (mi miVar : nw.a(this.a)) {
            if (!(miVar.f() || miVar.h())) {
                miVar.d();
                if (this.c) {
                    this.b.add(miVar);
                } else {
                    miVar.b();
                }
            }
        }
    }
}
