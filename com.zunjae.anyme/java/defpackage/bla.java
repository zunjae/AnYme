package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class bla {
    private final bkr a;
    @Nullable
    private baz b;
    private bbz c;
    private final List<bjr> d;
    private final List<bjp> e;
    @Nullable
    private Executor f;
    private boolean g;

    public bla() {
        this(bkr.a());
    }

    private bla(bkr bkr) {
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.a = bkr;
    }

    public final bky a() {
        if (this.c != null) {
            baz baz = this.b;
            if (baz == null) {
                baz = new bch();
            }
            baz baz2 = baz;
            Executor executor = this.f;
            if (executor == null) {
                executor = this.a.b();
            }
            Executor executor2 = executor;
            List arrayList = new ArrayList(this.e);
            arrayList.add(this.a.a(executor2));
            List arrayList2 = new ArrayList(this.d.size() + 1);
            arrayList2.add(new bjh());
            arrayList2.addAll(this.d);
            return new bky(baz2, this.c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.g);
        }
        throw new IllegalStateException("Base URL required.");
    }

    public final bla a(bch bch) {
        this.b = (baz) bld.a((baz) bld.a((Object) bch, "client == null"), "factory == null");
        return this;
    }

    public final bla a(bjr bjr) {
        this.d.add(bld.a((Object) bjr, "factory == null"));
        return this;
    }

    public final bla a(String str) {
        bld.a((Object) str, "baseUrl == null");
        Object e = bbz.e(str);
        if (e != null) {
            bld.a(e, "baseUrl == null");
            List j = e.j();
            if (BuildConfig.FLAVOR.equals(j.get(j.size() - 1))) {
                this.c = e;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: ".concat(String.valueOf(e)));
        }
        throw new IllegalArgumentException("Illegal URL: ".concat(String.valueOf(str)));
    }
}
