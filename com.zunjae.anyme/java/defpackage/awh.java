package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

public final class awh {
    public static String a(Context context) {
        Object b = awh.b(context);
        if (TextUtils.isEmpty(b)) {
            b = awh.c(context);
        }
        if (TextUtils.isEmpty(b)) {
            awv awv = new awv();
            int a = awj.a(context, "google_app_id", "string");
            if (a != 0) {
                avf.c();
                b = awj.b(context.getResources().getString(a)).substring(0, 40);
            } else {
                b = null;
            }
        }
        if (TextUtils.isEmpty(b)) {
            if (avf.d() || awj.j(context)) {
                throw new IllegalArgumentException("Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>");
            }
            avf.c();
        }
        return b;
    }

    protected static String b(Context context) {
        Object e;
        String str = null;
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString("io.fabric.ApiKey");
            try {
                if ("@string/twitter_consumer_secret".equals(string)) {
                    avf.c();
                } else {
                    str = string;
                }
                if (str != null) {
                    return str;
                }
                avf.c();
                return bundle.getString("com.crashlytics.ApiKey");
            } catch (Exception e2) {
                e = e2;
                str = string;
                avf.c();
                new StringBuilder("Caught non-fatal exception while retrieving apiKey: ").append(e);
                return str;
            }
        } catch (Exception e3) {
            e = e3;
            avf.c();
            new StringBuilder("Caught non-fatal exception while retrieving apiKey: ").append(e);
            return str;
        }
    }

    protected static String c(Context context) {
        int a = awj.a(context, "io.fabric.ApiKey", "string");
        if (a == 0) {
            avf.c();
            a = awj.a(context, "com.crashlytics.ApiKey", "string");
        }
        return a != 0 ? context.getResources().getString(a) : null;
    }
}
