package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import me.zhanghai.android.materialprogressbar.BuildConfig;

final class awa {
    private final Context a;
    private final azq b;

    public awa(Context context) {
        this.a = context.getApplicationContext();
        this.b = new azr(context, "TwitterAdvertisingInfoPreferences");
    }

    @SuppressLint({"CommitPrefEdits"})
    private void a(avz avz) {
        if (awa.b(avz)) {
            azq azq = this.b;
            azq.a(azq.b().putString("advertising_id", avz.a).putBoolean("limit_ad_tracking_enabled", avz.b));
            return;
        }
        azq azq2 = this.b;
        azq2.a(azq2.b().remove("advertising_id").remove("limit_ad_tracking_enabled"));
    }

    private awg b() {
        return new awc(this.a);
    }

    private static boolean b(avz avz) {
        return (avz == null || TextUtils.isEmpty(avz.a)) ? false : true;
    }

    private awg c() {
        return new awd(this.a);
    }

    private avz d() {
        avz a = b().a();
        if (!awa.b(a)) {
            a = c().a();
            boolean b = awa.b(a);
        }
        avf.c();
        return a;
    }

    public final avz a() {
        avz avz = new avz(this.b.a().getString("advertising_id", BuildConfig.FLAVOR), this.b.a().getBoolean("limit_ad_tracking_enabled", false));
        if (awa.b(avz)) {
            avf.c();
            new Thread(new awb(this, avz)).start();
            return avz;
        }
        avz d = d();
        a(d);
        return d;
    }
}
