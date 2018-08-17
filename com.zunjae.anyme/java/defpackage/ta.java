package defpackage;

import android.content.Context;

final class ta {
    private final Context a;
    private final bag b;

    public ta(Context context, bag bag) {
        this.a = context;
        this.b = bag;
    }

    private String a(String str, String str2) {
        return ta.b(awj.b(this.a, str), str2);
    }

    private static boolean a(String str) {
        if (str != null) {
            if (str.length() != 0) {
                return false;
            }
        }
        return true;
    }

    private static String b(String str, String str2) {
        return ta.a(str) ? str2 : str;
    }

    public final String a() {
        return a("com.crashlytics.CrashSubmissionPromptTitle", this.b.a);
    }

    public final String b() {
        return a("com.crashlytics.CrashSubmissionPromptMessage", this.b.b);
    }

    public final String c() {
        return a("com.crashlytics.CrashSubmissionSendTitle", this.b.c);
    }

    public final String d() {
        return a("com.crashlytics.CrashSubmissionAlwaysSendTitle", this.b.g);
    }

    public final String e() {
        return a("com.crashlytics.CrashSubmissionCancelTitle", this.b.e);
    }
}
