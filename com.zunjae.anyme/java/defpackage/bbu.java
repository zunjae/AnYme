package defpackage;

import java.util.List;
import javax.annotation.Nullable;

public final class bbu extends bcp {
    private static final bcd a = bcd.a("application/x-www-form-urlencoded");
    private final List<String> b;
    private final List<String> c;

    bbu(List<String> list, List<String> list2) {
        this.b = bdb.a((List) list);
        this.c = bdb.a((List) list2);
    }

    private long a(@Nullable bhg bhg, boolean z) {
        bhd bhd = z ? new bhd() : bhg.c();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                bhd.b(38);
            }
            bhd.a((String) this.b.get(i));
            bhd.b(61);
            bhd.a((String) this.c.get(i));
        }
        if (!z) {
            return 0;
        }
        long b = bhd.b();
        bhd.s();
        return b;
    }

    public final bcd a() {
        return a;
    }

    public final void a(bhg bhg) {
        a(bhg, false);
    }

    public final long b() {
        return a(null, true);
    }
}
