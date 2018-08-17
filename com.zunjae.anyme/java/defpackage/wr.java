package defpackage;

import java.util.Map.Entry;
import java.util.Set;

public final class wr extends wo {
    private final yf<String, wo> a = new yf();

    public final void a(String str, wo woVar) {
        Object obj;
        if (woVar == null) {
            obj = wq.a;
        }
        this.a.put(str, obj);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof wr) || !((wr) obj).a.equals(this.a)) {
                return false;
            }
        }
        return true;
    }

    public final Set<Entry<String, wo>> h() {
        return this.a.entrySet();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
