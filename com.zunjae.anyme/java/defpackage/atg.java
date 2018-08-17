package defpackage;

import java.util.concurrent.TimeUnit;

public final class atg {
    private static atg a;
    private bky b;

    private atg() {
        bla a = new bla().a("https://api.jikan.moe/").a(blh.a());
        bcb bgu = new bgu();
        bgu.a(bgv.d);
        this.b = a.a(new bcj().b(5, TimeUnit.SECONDS).a(5, TimeUnit.SECONDS).a(bgu).a()).a();
    }

    public static atg a() {
        if (a == null) {
            a = new atg();
        }
        return a;
    }

    public final atf b() {
        return (atf) this.b.a(atf.class);
    }
}
