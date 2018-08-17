package defpackage;

import java.io.File;
import java.util.Map;

final class tm implements tv {
    private final File a;

    public tm(File file) {
        this.a = file;
    }

    public final String a() {
        return null;
    }

    public final String b() {
        return this.a.getName();
    }

    public final File c() {
        return null;
    }

    public final File[] d() {
        return this.a.listFiles();
    }

    public final Map<String, String> e() {
        return null;
    }

    public final void f() {
        for (File file : this.a.listFiles()) {
            avf.c();
            new StringBuilder("Removing native report file at ").append(file.getPath());
            file.delete();
        }
        avf.c();
        new StringBuilder("Removing native report directory at ").append(this.a);
        this.a.delete();
    }

    public final int g() {
        return tw.b;
    }
}
