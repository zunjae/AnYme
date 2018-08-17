package defpackage;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class ati {
    private static ati b;
    private final String a = "https://kanonapp.com";
    private bky c;

    private ati() {
        bla a = new bla().a("https://kanonapp.com").a(blh.a());
        bcb bgu = new bgu();
        bgu.a(bgv.d);
        this.c = a.a(new bcj().b(5, TimeUnit.SECONDS).a(5, TimeUnit.SECONDS).a(-$$Lambda$ati$8ZwT4FVv9DMQ73pXc9Wwh6SsVSM.INSTANCE).a(bgu).a()).a();
    }

    public static ati a() {
        if (b == null) {
            b = new ati();
        }
        return b;
    }

    private static /* synthetic */ bcs a(bcc bcc) {
        return bcc.a(bcc.a().e().b("APIKey", "EUPP4UQDFJ435B5A900K").b("Content-Type", "application/json").b("UserToken", (String) Objects.requireNonNull(anq.a() ? aux.b("KEY_KANONAPP_TOKEN", null) : BuildConfig.FLAVOR)).a());
    }

    public static ath b() {
        return (ath) ati.a().c.a(ath.class);
    }
}
