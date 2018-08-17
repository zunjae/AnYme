package defpackage;

final class aco implements acr<Item> {
    final /* synthetic */ long a;
    final /* synthetic */ boolean b = false;
    final /* synthetic */ boolean c = true;
    final /* synthetic */ acm d;

    aco(acm acm, long j) {
        this.d = acm;
        this.a = j;
    }

    public final boolean a(Item item, int i) {
        if (item.c() != this.a) {
            return false;
        }
        this.d.a(item, i, this.b, this.c);
        return true;
    }
}
