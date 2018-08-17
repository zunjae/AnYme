package defpackage;

final class fd implements ex {
    private final go a;
    private volatile gn b;

    public fd(go goVar) {
        this.a = goVar;
    }

    public final gn a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = this.a.a();
                }
                if (this.b == null) {
                    this.b = new gq();
                }
            }
        }
        return this.b;
    }
}
