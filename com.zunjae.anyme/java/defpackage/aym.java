package defpackage;

public final class aym {
    private final int a;
    private final ayi b;
    private final ayl c;

    private aym(int i, ayi ayi, ayl ayl) {
        this.a = i;
        this.b = ayi;
        this.c = ayl;
    }

    public aym(ayi ayi, ayl ayl) {
        this(0, ayi, ayl);
    }

    public final long a() {
        return this.b.a(this.a);
    }

    public final aym b() {
        return new aym(this.a + 1, this.b, this.c);
    }

    public final aym c() {
        return new aym(this.b, this.c);
    }
}
