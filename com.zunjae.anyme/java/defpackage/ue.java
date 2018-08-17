package defpackage;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class ue implements tv {
    private final File a;
    private final File[] b;
    private final Map<String, String> c;

    public ue(File file) {
        this(file, Collections.emptyMap());
    }

    public ue(File file, Map<String, String> map) {
        this.a = file;
        this.b = new File[]{file};
        this.c = new HashMap(map);
        if (this.a.length() == 0) {
            this.c.putAll(tx.a);
        }
    }

    public final String a() {
        return this.a.getName();
    }

    public final String b() {
        String name = this.a.getName();
        return name.substring(0, name.lastIndexOf(46));
    }

    public final File c() {
        return this.a;
    }

    public final File[] d() {
        return this.b;
    }

    public final Map<String, String> e() {
        return Collections.unmodifiableMap(this.c);
    }

    public final void f() {
        avf.c();
        new StringBuilder("Removing report at ").append(this.a.getPath());
        this.a.delete();
    }

    public final int g() {
        return tw.a;
    }
}
