package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

public final class xm {
    private final Map<Type, wl<?>> a;

    public xm(Map<Type, wl<?>> map) {
        this.a = map;
    }

    private <T> defpackage.yn<T> a(java.lang.Class<? super T> r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.attributes.IAttribute jadx.core.dex.attributes.AttrNode.get(jadx.core.dex.attributes.AType)' on a null object reference
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r1 = this;
        r0 = 0;
        r0 = new java.lang.Class[r0];	 Catch:{ NoSuchMethodException -> 0x0017 }
        r2 = r2.getDeclaredConstructor(r0);	 Catch:{ NoSuchMethodException -> 0x0017 }
        r0 = r2.isAccessible();	 Catch:{ NoSuchMethodException -> 0x0017 }
        if (r0 != 0) goto L_0x0011;	 Catch:{ NoSuchMethodException -> 0x0017 }
    L_0x000d:
        r0 = 1;	 Catch:{ NoSuchMethodException -> 0x0017 }
        r2.setAccessible(r0);	 Catch:{ NoSuchMethodException -> 0x0017 }
    L_0x0011:
        r0 = new xu;	 Catch:{ NoSuchMethodException -> 0x0017 }
        r0.<init>(r1, r2);	 Catch:{ NoSuchMethodException -> 0x0017 }
        return r0;
    L_0x0017:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.a(java.lang.Class):yn<T>");
    }

    public final <T> yn<T> a(abm<T> abm_T) {
        Type b = abm_T.b();
        Class a = abm_T.a();
        wl wlVar = (wl) this.a.get(b);
        if (wlVar != null) {
            return new xn(this, wlVar, b);
        }
        wlVar = (wl) this.a.get(a);
        if (wlVar != null) {
            return new xt(this, wlVar, b);
        }
        yn<T> a2 = a(a);
        if (a2 != null) {
            return a2;
        }
        a2 = Collection.class.isAssignableFrom(a) ? SortedSet.class.isAssignableFrom(a) ? new xv(this) : EnumSet.class.isAssignableFrom(a) ? new xw(this, b) : Set.class.isAssignableFrom(a) ? new xx(this) : Queue.class.isAssignableFrom(a) ? new xy(this) : new xz(this) : Map.class.isAssignableFrom(a) ? ConcurrentNavigableMap.class.isAssignableFrom(a) ? new ya(this) : ConcurrentMap.class.isAssignableFrom(a) ? new xo(this) : SortedMap.class.isAssignableFrom(a) ? new xp(this) : (!(b instanceof ParameterizedType) || String.class.isAssignableFrom(abm.a(((ParameterizedType) b).getActualTypeArguments()[0]).a())) ? new xr(this) : new xq(this) : null;
        return a2 != null ? a2 : new xs(this, a, b);
    }

    public final String toString() {
        return this.a.toString();
    }
}
