package defpackage;

import android.content.Context;
import android.text.TextUtils;

public final class awv {
    public static boolean a(Context context) {
        if (awj.a(context, "com.crashlytics.useFirebaseAppId", false)) {
            return true;
        }
        Object obj;
        Object obj2 = awj.a(context, "google_app_id", "string") != 0 ? 1 : null;
        awh awh = new awh();
        if (TextUtils.isEmpty(awh.b(context))) {
            awh = new awh();
            if (TextUtils.isEmpty(awh.c(context))) {
                obj = null;
                return obj2 == null && obj == null;
            }
        }
        obj = 1;
        if (obj2 == null) {
        }
    }
}
