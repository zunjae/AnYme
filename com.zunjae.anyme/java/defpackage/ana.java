package defpackage;

public final class ana {
    @xe(a = "title")
    private String a;
    @xe(a = "image")
    private String b;
    @xe(a = "malid")
    private int c;
    @xe(a = "suggested_by")
    private String d;
    private String e;

    public final String a() {
        return this.e;
    }

    public final void a(String str) {
        this.e = str;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b.contains("{{MI}}") ? this.b.replace("{{MI}}", "https://myanimelist.cdn-dena.com/images/anime/") : this.b;
    }

    public final int d() {
        return this.c;
    }

    public final String e() {
        return this.d;
    }
}
