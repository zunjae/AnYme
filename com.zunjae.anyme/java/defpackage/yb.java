package defpackage;

import java.util.Collections;
import java.util.List;

public final class yb implements Cloneable, xb {
    public static final yb a = new yb();
    private double b = -1.0d;
    private int c = 136;
    private boolean d = true;
    private boolean e;
    private List<vv> f = Collections.emptyList();
    private List<vv> g = Collections.emptyList();

    private yb a() {
        try {
            return (yb) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    private static boolean a(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    private boolean a(xf xfVar) {
        return xfVar == null || xfVar.a() <= this.b;
    }

    private boolean a(xf xfVar, xg xgVar) {
        return a(xfVar) && a(xgVar);
    }

    private boolean a(xg xgVar) {
        return xgVar == null || xgVar.a() > this.b;
    }

    private static boolean b(Class<?> cls) {
        return cls.isMemberClass() && !yb.c(cls);
    }

    private static boolean c(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    public final <T> wz<T> a(we weVar, abm<T> abm_T) {
        Class a = abm_T.a();
        boolean a2 = a(a, true);
        boolean a3 = a(a, false);
        return (a2 || a3) ? new yc(this, a3, a2, weVar, abm_T) : null;
    }

    public final boolean a(Class<?> cls, boolean z) {
        if (this.b != -1.0d && !a((xf) cls.getAnnotation(xf.class), (xg) cls.getAnnotation(xg.class))) {
            return true;
        }
        if ((!this.d && yb.b(cls)) || yb.a((Class) cls)) {
            return true;
        }
        for (vv b : z ? this.f : this.g) {
            if (b.b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.reflect.Field r7, boolean r8) {
        /*
        r6 = this;
        r0 = r6.c;
        r1 = r7.getModifiers();
        r0 = r0 & r1;
        r1 = 1;
        if (r0 == 0) goto L_0x000b;
    L_0x000a:
        return r1;
    L_0x000b:
        r2 = r6.b;
        r4 = -4616189618054758400; // 0xbff0000000000000 float:0.0 double:-1.0;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 == 0) goto L_0x002a;
    L_0x0013:
        r0 = defpackage.xf.class;
        r0 = r7.getAnnotation(r0);
        r0 = (defpackage.xf) r0;
        r2 = defpackage.xg.class;
        r2 = r7.getAnnotation(r2);
        r2 = (defpackage.xg) r2;
        r0 = r6.a(r0, r2);
        if (r0 != 0) goto L_0x002a;
    L_0x0029:
        return r1;
    L_0x002a:
        r0 = r7.isSynthetic();
        if (r0 == 0) goto L_0x0031;
    L_0x0030:
        return r1;
    L_0x0031:
        r0 = r6.e;
        if (r0 == 0) goto L_0x004f;
    L_0x0035:
        r0 = defpackage.xc.class;
        r0 = r7.getAnnotation(r0);
        r0 = (defpackage.xc) r0;
        if (r0 == 0) goto L_0x004e;
    L_0x003f:
        if (r8 == 0) goto L_0x0048;
    L_0x0041:
        r0 = r0.a();
        if (r0 != 0) goto L_0x004f;
    L_0x0047:
        goto L_0x004e;
    L_0x0048:
        r0 = r0.b();
        if (r0 != 0) goto L_0x004f;
    L_0x004e:
        return r1;
    L_0x004f:
        r0 = r6.d;
        if (r0 != 0) goto L_0x005e;
    L_0x0053:
        r0 = r7.getType();
        r0 = defpackage.yb.b(r0);
        if (r0 == 0) goto L_0x005e;
    L_0x005d:
        return r1;
    L_0x005e:
        r0 = r7.getType();
        r0 = defpackage.yb.a(r0);
        if (r0 == 0) goto L_0x0069;
    L_0x0068:
        return r1;
    L_0x0069:
        if (r8 == 0) goto L_0x006e;
    L_0x006b:
        r8 = r6.f;
        goto L_0x0070;
    L_0x006e:
        r8 = r6.g;
    L_0x0070:
        r0 = r8.isEmpty();
        if (r0 != 0) goto L_0x0092;
    L_0x0076:
        r0 = new vw;
        r0.<init>(r7);
        r7 = r8.iterator();
    L_0x007f:
        r8 = r7.hasNext();
        if (r8 == 0) goto L_0x0092;
    L_0x0085:
        r8 = r7.next();
        r8 = (defpackage.vv) r8;
        r8 = r8.a();
        if (r8 == 0) goto L_0x007f;
    L_0x0091:
        return r1;
    L_0x0092:
        r7 = 0;
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: yb.a(java.lang.reflect.Field, boolean):boolean");
    }

    protected final /* synthetic */ Object clone() {
        return a();
    }
}
