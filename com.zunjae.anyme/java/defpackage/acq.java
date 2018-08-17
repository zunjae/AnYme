package defpackage;

import com.mikepenz.fastadapter.u;
import java.util.Set;

final class acq implements acr<Item> {
    final /* synthetic */ Set a;
    final /* synthetic */ acm b;

    acq(acm acm, Set set) {
        this.b = acm;
        this.a = set;
    }

    public final boolean a(Item item, int i) {
        if (this.a.contains(item)) {
            this.b.a((u) item, i);
        }
        return false;
    }
}
