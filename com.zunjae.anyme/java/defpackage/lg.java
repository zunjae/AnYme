package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

final class lg implements lo {
    private final Set<lp> a = Collections.newSetFromMap(new WeakHashMap());
    private boolean b;
    private boolean c;

    lg() {
    }

    final void a() {
        this.b = true;
        for (lp b : nw.a(this.a)) {
            b.b();
        }
    }

    public final void a(lp lpVar) {
        this.a.add(lpVar);
        if (this.c) {
            lpVar.a_();
        } else if (this.b) {
            lpVar.b();
        } else {
            lpVar.c();
        }
    }

    final void b() {
        this.b = false;
        for (lp c : nw.a(this.a)) {
            c.c();
        }
    }

    final void c() {
        this.c = true;
        for (lp a_ : nw.a(this.a)) {
            a_.a_();
        }
    }
}
