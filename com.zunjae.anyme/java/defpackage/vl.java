package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class vl<K, V> extends ur<K, V> {
    transient int a;

    private vl() {
        super(new HashMap());
        this.a = 10;
    }

    private vl(int i, int i2) {
        super(vs.a(i));
        uq.a(i2 >= 0);
        this.a = i2;
    }

    public static <K, V> vl<K, V> a(int i, int i2) {
        return new vl(i, i2);
    }

    final List<V> a() {
        return new ArrayList(this.a);
    }

    public final /* bridge */ /* synthetic */ List a(Object obj) {
        return super.a(obj);
    }

    final /* synthetic */ Collection b() {
        return a();
    }

    public final /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ boolean c(Object obj) {
        return super.c(obj);
    }

    public final /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    public final /* bridge */ /* synthetic */ Set e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* bridge */ /* synthetic */ Collection f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ Map g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
