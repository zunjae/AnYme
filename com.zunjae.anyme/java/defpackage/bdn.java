package defpackage;

public final class bdn implements bcb {
    public final bch a;

    public bdn(bch bch) {
        this.a = bch;
    }

    public final bcs intercept(bcc bcc) {
        bee bee = (bee) bcc;
        bcn a = bee.a();
        bdu f = bee.f();
        return bee.a(a, f, f.a(this.a, bcc, a.b().equals("GET") ^ 1), f.c());
    }
}
