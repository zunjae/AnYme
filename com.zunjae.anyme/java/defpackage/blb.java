package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

final class blb<R, T> {
    static final Pattern a = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
    static final Pattern b = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
    private final baz c;
    private final bjo<R, T> d;
    private final bbz e;
    private final bjq<bcu, R> f;
    private final String g;
    private final String h;
    private final bbx i;
    private final bcd j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final bkb<?>[] n;

    blb(blc<R, T> blc_R__T) {
        bky bky = blc_R__T.a;
        this.c = bky.a;
        this.d = blc_R__T.w;
        this.e = bky.b;
        this.f = blc_R__T.v;
        this.g = blc_R__T.m;
        this.h = blc_R__T.q;
        this.i = blc_R__T.r;
        this.j = blc_R__T.s;
        this.k = blc_R__T.n;
        this.l = blc_R__T.o;
        this.m = blc_R__T.p;
        this.n = blc_R__T.u;
    }

    static Class<?> a(Class<?> cls) {
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        if (Short.TYPE == cls) {
            cls = Short.class;
        }
        return cls;
    }

    static Set<String> a(String str) {
        Matcher matcher = a.matcher(str);
        Set<String> linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    final bay a(@Nullable Object... objArr) {
        bkv bkv = new bkv(this.g, this.e, this.h, this.i, this.j, this.k, this.l, this.m);
        bkb[] bkbArr = this.n;
        int length = objArr != null ? objArr.length : 0;
        if (length == bkbArr.length) {
            for (int i = 0; i < length; i++) {
                bkbArr[i].a(bkv, objArr[i]);
            }
            return this.c.a(bkv.a());
        }
        StringBuilder stringBuilder = new StringBuilder("Argument count (");
        stringBuilder.append(length);
        stringBuilder.append(") doesn't match expected count (");
        stringBuilder.append(bkbArr.length);
        stringBuilder.append(")");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    final R a(bcu bcu) {
        return this.f.a(bcu);
    }

    final T a(bjn<R> bjn_R) {
        return this.d.a(bjn_R);
    }
}
