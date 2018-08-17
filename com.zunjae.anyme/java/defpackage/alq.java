package defpackage;

import java.util.Comparator;

final class alq implements Comparator<alo> {
    alq() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return Double.compare((double) ((alo) obj).d(), (double) ((alo) obj2).d());
    }
}
