package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class aww {
    private static final Pattern e = Pattern.compile("[^\\p{Alnum}]");
    private static final String f = Pattern.quote("/");
    awa a;
    avz b;
    boolean c;
    awv d;
    private final ReentrantLock g = new ReentrantLock();
    private final awy h;
    private final boolean i;
    private final boolean j;
    private final Context k;
    private final String l;
    private final String m;
    private final Collection<avp> n;

    public aww(Context context, String str, String str2, Collection<avp> collection) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        } else if (collection != null) {
            this.k = context;
            this.l = str;
            this.m = str2;
            this.n = collection;
            this.h = new awy();
            this.a = new awa(context);
            this.d = new awv();
            this.i = awj.a(context, "com.crashlytics.CollectDeviceIdentifiers", true);
            if (!this.i) {
                avf.c();
                new StringBuilder("Device ID collection disabled for ").append(context.getPackageName());
            }
            this.j = awj.a(context, "com.crashlytics.CollectUserIdentifiers", true);
            if (!this.j) {
                avf.c();
                new StringBuilder("User information collection disabled for ").append(context.getPackageName());
            }
        } else {
            throw new IllegalArgumentException("kits must not be null");
        }
    }

    @SuppressLint({"CommitPrefEdits"})
    private String a(SharedPreferences sharedPreferences) {
        this.g.lock();
        try {
            String str = null;
            String string = sharedPreferences.getString("crashlytics.installation.id", null);
            if (string == null) {
                CharSequence uuid = UUID.randomUUID().toString();
                if (uuid != null) {
                    str = e.matcher(uuid).replaceAll(BuildConfig.FLAVOR).toLowerCase(Locale.US);
                }
                string = str;
                sharedPreferences.edit().putString("crashlytics.installation.id", string).commit();
            }
            this.g.unlock();
            return string;
        } catch (Throwable th) {
            this.g.unlock();
        }
    }

    private static String a(String str) {
        return str.replaceAll(f, BuildConfig.FLAVOR);
    }

    public static String d() {
        return aww.a(VERSION.RELEASE);
    }

    public static String e() {
        return aww.a(VERSION.INCREMENTAL);
    }

    public static String f() {
        return String.format(Locale.US, "%s/%s", new Object[]{aww.a(Build.MANUFACTURER), aww.a(Build.MODEL)});
    }

    private synchronized avz j() {
        if (!this.c) {
            this.b = this.a.a();
            this.c = true;
        }
        return this.b;
    }

    public final boolean a() {
        return this.j;
    }

    public final String b() {
        String str = this.m;
        if (str != null) {
            return str;
        }
        String str2;
        SharedPreferences a = awj.a(this.k);
        avz j = j();
        if (j != null) {
            str2 = j.a;
            this.g.lock();
            try {
                if (!TextUtils.isEmpty(str2)) {
                    Editor putString;
                    Object string = a.getString("crashlytics.advertising.id", null);
                    if (TextUtils.isEmpty(string)) {
                        putString = a.edit().putString("crashlytics.advertising.id", str2);
                    } else if (!string.equals(str2)) {
                        putString = a.edit().remove("crashlytics.installation.id").putString("crashlytics.advertising.id", str2);
                    }
                    putString.commit();
                }
                this.g.unlock();
            } catch (Throwable th) {
                this.g.unlock();
            }
        }
        str2 = a.getString("crashlytics.installation.id", null);
        return str2 == null ? a(a) : str2;
    }

    public final String c() {
        return this.l;
    }

    public final Map<awx, String> g() {
        Map hashMap = new HashMap();
        for (avp avp : this.n) {
            if (avp instanceof awq) {
                for (Entry entry : ((awq) avp).c().entrySet()) {
                    awx awx = (awx) entry.getKey();
                    String str = (String) entry.getValue();
                    if (str != null) {
                        hashMap.put(awx, str);
                    }
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public final String h() {
        return this.h.a(this.k);
    }

    public final Boolean i() {
        Object obj = (!this.i || awv.a(this.k)) ? null : 1;
        if (obj == null) {
            return null;
        }
        avz j = j();
        return j != null ? Boolean.valueOf(j.b) : null;
    }
}
