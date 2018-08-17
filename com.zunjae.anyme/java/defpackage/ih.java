package defpackage;

import java.util.Queue;

final class ih<A> {
    private static final Queue<ih<?>> a = nw.a(0);
    private int b;
    private int c;
    private A d;

    private ih() {
    }

    static <A> ih<A> a(A a) {
        ih<A> ihVar = (ih) a.poll();
        if (ihVar == null) {
            ihVar = new ih();
        }
        ihVar.d = a;
        ihVar.c = 0;
        ihVar.b = 0;
        return ihVar;
    }

    public final void a() {
        a.offer(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ih) {
            ih ihVar = (ih) obj;
            if (this.c == ihVar.c && this.b == ihVar.b && this.d.equals(ihVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b * 31) + this.c) * 31) + this.d.hashCode();
    }
}
