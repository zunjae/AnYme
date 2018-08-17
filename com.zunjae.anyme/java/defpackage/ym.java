package defpackage;

import java.util.Map.Entry;

final class ym<K, V> implements Entry<K, V> {
    ym<K, V> a;
    ym<K, V> b;
    ym<K, V> c;
    ym<K, V> d;
    ym<K, V> e;
    final K f;
    V g;
    int h;

    ym() {
        this.f = null;
        this.e = this;
        this.d = this;
    }

    ym(ym<K, V> ymVar, K k, ym<K, V> ymVar2, ym<K, V> ymVar3) {
        this.a = ymVar;
        this.f = k;
        this.h = 1;
        this.d = ymVar2;
        this.e = ymVar3;
        ymVar3.d = this;
        ymVar2.e = this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
        r3 = this;
        r0 = r4 instanceof java.util.Map.Entry;
        r1 = 0;
        if (r0 == 0) goto L_0x0033;
    L_0x0005:
        r4 = (java.util.Map.Entry) r4;
        r0 = r3.f;
        if (r0 != 0) goto L_0x0012;
    L_0x000b:
        r0 = r4.getKey();
        if (r0 != 0) goto L_0x0033;
    L_0x0011:
        goto L_0x001c;
    L_0x0012:
        r2 = r4.getKey();
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0033;
    L_0x001c:
        r0 = r3.g;
        if (r0 != 0) goto L_0x0027;
    L_0x0020:
        r4 = r4.getValue();
        if (r4 != 0) goto L_0x0033;
    L_0x0026:
        goto L_0x0031;
    L_0x0027:
        r4 = r4.getValue();
        r4 = r0.equals(r4);
        if (r4 == 0) goto L_0x0033;
    L_0x0031:
        r4 = 1;
        return r4;
    L_0x0033:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: ym.equals(java.lang.Object):boolean");
    }

    public final K getKey() {
        return this.f;
    }

    public final V getValue() {
        return this.g;
    }

    public final int hashCode() {
        Object obj = this.f;
        int i = 0;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.g;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    public final V setValue(V v) {
        V v2 = this.g;
        this.g = v;
        return v2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f);
        stringBuilder.append("=");
        stringBuilder.append(this.g);
        return stringBuilder.toString();
    }
}
