package defpackage;

public final class aso {
    @xe(a = "AnimeId")
    private final int a;
    @xe(a = "EpisodeNumber")
    private final int b;
    @xe(a = "Note")
    private String c;
    @xe(a = "DateCreated")
    private long d;

    public aso(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final int a() {
        return this.b;
    }

    public final void a(String str) {
        this.c = str;
    }

    public final String b() {
        if (this.b == 0) {
            return "Summary";
        }
        StringBuilder stringBuilder = new StringBuilder("Episode ");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }

    public final String c() {
        return this.c;
    }

    public final void d() {
        this.d = System.currentTimeMillis() / 1000;
    }

    public final long e() {
        return this.d;
    }
}
