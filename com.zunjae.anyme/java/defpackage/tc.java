package defpackage;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class tc implements tv {
    private final File[] a;
    private final Map<String, String> b = new HashMap(tx.a);
    private final String c;

    public tc(String str, File[] fileArr) {
        this.a = fileArr;
        this.c = str;
    }

    public final String a() {
        return this.a[0].getName();
    }

    public final String b() {
        return this.c;
    }

    public final File c() {
        return this.a[0];
    }

    public final File[] d() {
        return this.a;
    }

    public final Map<String, String> e() {
        return Collections.unmodifiableMap(this.b);
    }

    public final void f() {
        for (File file : this.a) {
            avf.c();
            new StringBuilder("Removing invalid report file at ").append(file.getPath());
            file.delete();
        }
    }

    public final int g() {
        return tw.a;
    }
}
