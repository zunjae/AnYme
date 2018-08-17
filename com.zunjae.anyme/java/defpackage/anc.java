package defpackage;

import java.util.Comparator;

final class anc implements Comparator<anb> {
    anc() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((anb) obj).b.compareTo(((anb) obj2).b);
    }
}
