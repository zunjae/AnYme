package defpackage;

import java.io.File;
import java.util.Map.Entry;

final class sw extends avy implements st {
    public sw(avp avp, String str, String str2, azk azk) {
        super(avp, str, str2, azk, azb.b);
    }

    public final boolean a(ss ssVar) {
        azc a = b().a("X-CRASHLYTICS-API-KEY", ssVar.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", this.a.a());
        for (Entry entry : ssVar.b.e().entrySet()) {
            a = a.a((String) entry.getKey(), (String) entry.getValue());
        }
        tv tvVar = ssVar.b;
        a.b("report[identifier]", tvVar.b());
        if (tvVar.d().length == 1) {
            avf.c();
            StringBuilder stringBuilder = new StringBuilder("Adding single file ");
            stringBuilder.append(tvVar.a());
            stringBuilder.append(" to report ");
            stringBuilder.append(tvVar.b());
            a = a.a("report[file]", tvVar.a(), "application/octet-stream", tvVar.c());
        } else {
            int i = 0;
            for (File file : tvVar.d()) {
                avf.c();
                StringBuilder stringBuilder2 = new StringBuilder("Adding file ");
                stringBuilder2.append(file.getName());
                stringBuilder2.append(" to report ");
                stringBuilder2.append(tvVar.b());
                stringBuilder2 = new StringBuilder("report[file");
                stringBuilder2.append(i);
                stringBuilder2.append("]");
                a.a(stringBuilder2.toString(), file.getName(), "application/octet-stream", file);
                i++;
            }
        }
        avf.c();
        new StringBuilder("Sending report to: ").append(a());
        int b = a.b();
        avf.c();
        new StringBuilder("Create report request ID: ").append(a.a("X-REQUEST-ID"));
        avf.c();
        return axf.a(b) == 0;
    }
}
