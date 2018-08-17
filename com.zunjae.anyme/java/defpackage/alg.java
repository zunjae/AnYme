package defpackage;

public final class alg {
    private final int a;
    private final String b;

    public alg(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean c() {
        int i = this.a;
        return i >= 200 && i < 300;
    }

    public final boolean d() {
        return !c();
    }
}
