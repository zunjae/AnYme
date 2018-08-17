package defpackage;

import java.io.File;

final class tk extends avy implements st {
    public tk(avp avp, String str, String str2, azk azk) {
        super(avp, str, str2, azk, azb.b);
    }

    private static azc a(azc azc, tv tvVar) {
        azc.b("report_id", tvVar.b());
        for (File file : tvVar.d()) {
            String str;
            if (file.getName().equals("minidump")) {
                str = "minidump_file";
            } else if (file.getName().equals("metadata")) {
                str = "crash_meta_file";
            } else if (file.getName().equals("binaryImages")) {
                str = "binary_images_file";
            } else if (file.getName().equals("session")) {
                str = "session_meta_file";
            } else if (file.getName().equals("app")) {
                str = "app_meta_file";
            } else if (file.getName().equals("device")) {
                str = "device_meta_file";
            } else if (file.getName().equals("os")) {
                str = "os_meta_file";
            } else if (file.getName().equals("user")) {
                str = "user_meta_file";
            } else if (file.getName().equals("logs")) {
                str = "logs_file";
            } else if (file.getName().equals("keys")) {
                str = "keys_file";
            } else {
            }
            azc.a(str, file.getName(), "application/octet-stream", file);
        }
        return azc;
    }

    public final boolean a(ss ssVar) {
        azc b = b();
        String str = ssVar.a;
        StringBuilder stringBuilder = new StringBuilder("Crashlytics Android SDK/");
        stringBuilder.append(this.a.a());
        b.a("User-Agent", stringBuilder.toString()).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", this.a.a()).a("X-CRASHLYTICS-API-KEY", str);
        azc a = tk.a(b, ssVar.b);
        avf.c();
        new StringBuilder("Sending report to: ").append(a());
        int b2 = a.b();
        avf.c();
        return axf.a(b2) == 0;
    }
}
