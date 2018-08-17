package defpackage;

final class qe implements st {
    private final sw a;
    private final tk b;

    public qe(sw swVar, tk tkVar) {
        this.a = swVar;
        this.b = tkVar;
    }

    public final boolean a(ss ssVar) {
        switch (qf.a[ssVar.b.g() - 1]) {
            case tw.a /*1*/:
                this.a.a(ssVar);
                return true;
            case tw.b /*2*/:
                this.b.a(ssVar);
                return true;
            default:
                return false;
        }
    }
}
