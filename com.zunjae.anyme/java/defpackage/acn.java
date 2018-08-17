package defpackage;

import java.util.Set;

final class acn implements acr<Item> {
    final /* synthetic */ Set a;
    final /* synthetic */ acm b;

    acn(acm acm, Set set) {
        this.b = acm;
        this.a = set;
    }

    public final boolean a(Item item, int i) {
        if (item.e()) {
            this.a.add(item);
        }
        return false;
    }
}
