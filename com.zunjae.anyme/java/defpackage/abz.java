package defpackage;

import com.mikepenz.fastadapter.n;
import com.mikepenz.fastadapter.y;

final class abz implements acr<Item> {
    final /* synthetic */ long a;
    final /* synthetic */ aby b;

    abz(aby aby, long j) {
        this.b = aby;
        this.a = j;
    }

    public final boolean a(Item item, int i) {
        if (this.a == item.c()) {
            if (item instanceof y) {
                n nVar = (n) ((y) item).h();
                if (nVar != null) {
                    nVar.b().remove(item);
                }
            }
            if (i != -1) {
                this.b.d(i);
            }
        }
        return false;
    }
}
