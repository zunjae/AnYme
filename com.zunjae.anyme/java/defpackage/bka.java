package defpackage;

final class bka extends bcu {
    private final bcd a;
    private final long b;

    bka(bcd bcd, long j) {
        this.a = bcd;
        this.b = j;
    }

    public final bcd a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final bhh c() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
