package defpackage;

public final class arl {
    @xe(a = "malid")
    public Integer a;
    @xe(a = "timestamp")
    public long b;
    @xe(a = "series_cover")
    public String c;
    @xe(a = "tags")
    public String d;
    @xe(a = "title")
    public String e;
    @xe(a = "episode")
    public int f;
    public int g;

    public final boolean a() {
        return this.b < System.currentTimeMillis() / 1000;
    }
}
