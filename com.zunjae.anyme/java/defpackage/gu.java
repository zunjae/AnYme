package defpackage;

import java.io.File;

public class gu implements go {
    private final int a = 262144000;
    private final gv b;

    public gu(gv gvVar) {
        this.b = gvVar;
    }

    public final gn a() {
        File a = this.b.a();
        return a == null ? null : (a.mkdirs() || (a.exists() && a.isDirectory())) ? gw.a(a, this.a) : null;
    }
}
