package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Set;

final class td {
    private static final tf a = new tf();
    private final Context b;
    private final te c;
    private tb d;

    td(Context context, te teVar) {
        this(context, teVar, null);
    }

    td(Context context, te teVar, String str) {
        this.b = context;
        this.c = teVar;
        this.d = a;
        a(str);
    }

    private void a(File file) {
        this.d = new tr(file);
    }

    private File b(String str) {
        StringBuilder stringBuilder = new StringBuilder("crashlytics-userlog-");
        stringBuilder.append(str);
        stringBuilder.append(".temp");
        return new File(this.c.a(), stringBuilder.toString());
    }

    final py a() {
        return this.d.a();
    }

    final void a(long j, String str) {
        this.d.a(j, str);
    }

    final void a(String str) {
        this.d.c();
        this.d = a;
        if (str != null) {
            if (awj.a(this.b, "com.crashlytics.CollectCustomLogs", true)) {
                a(b(str));
            } else {
                avf.c();
            }
        }
    }

    final void a(Set<String> set) {
        File[] listFiles = this.c.a().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                Object name = file.getName();
                int lastIndexOf = name.lastIndexOf(".temp");
                if (lastIndexOf != -1) {
                    name = name.substring(20, lastIndexOf);
                }
                if (!set.contains(name)) {
                    file.delete();
                }
            }
        }
    }

    final byte[] b() {
        return this.d.b();
    }

    final void c() {
        this.d.d();
    }
}
