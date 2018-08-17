package defpackage;

import java.io.File;
import java.util.List;

final class pj extends avy implements ayu {
    private final String b;

    public pj(avp avp, String str, String str2, azk azk, String str3) {
        super(avp, str, str2, azk, azb.b);
        this.b = str3;
    }

    public final boolean a(List<File> list) {
        azc a = b().a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", this.a.a()).a("X-CRASHLYTICS-API-KEY", this.b);
        int i = 0;
        for (File file : list) {
            a.a("session_analytics_file_".concat(String.valueOf(i)), file.getName(), "application/vnd.crashlytics.android.events", file);
            i++;
        }
        avf.c();
        StringBuilder stringBuilder = new StringBuilder("Sending ");
        stringBuilder.append(list.size());
        stringBuilder.append(" analytics files to ");
        stringBuilder.append(a());
        int b = a.b();
        avf.c();
        return axf.a(b) == 0;
    }
}
