package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

public final class bdq {
    private final Set<bcx> a = new LinkedHashSet();

    public final synchronized void a(bcx bcx) {
        this.a.add(bcx);
    }

    public final synchronized void b(bcx bcx) {
        this.a.remove(bcx);
    }

    public final synchronized boolean c(bcx bcx) {
        return this.a.contains(bcx);
    }
}
