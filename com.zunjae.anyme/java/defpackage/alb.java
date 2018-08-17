package defpackage;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;

public final class alb {
    public static void a(Context context) {
        CookieSyncManager.createInstance(context);
        CookieManager.getInstance().removeAllCookie();
    }
}
