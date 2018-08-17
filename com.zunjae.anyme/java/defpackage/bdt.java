package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public final class bdt {
    private final List<bcx> a;
    private int b = 0;

    bdt(List<bcx> list) {
        this.a = list;
    }

    public final boolean a() {
        return this.b < this.a.size();
    }

    public final bcx b() {
        if (a()) {
            List list = this.a;
            int i = this.b;
            this.b = i + 1;
            return (bcx) list.get(i);
        }
        throw new NoSuchElementException();
    }

    public final List<bcx> c() {
        return new ArrayList(this.a);
    }
}
