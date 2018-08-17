package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public final class hs {
    private static final ii c = new ht();
    private final Map<Class, Map<Class, ij>> a = new HashMap();
    private final Map<Class, Map<Class, ii>> b = new HashMap();
    private final Context d;

    public hs(Context context) {
        this.d = context.getApplicationContext();
    }

    private <T, Y> void a(Class<T> cls, Class<Y> cls2, ii<T, Y> iiVar) {
        Map map = (Map) this.b.get(cls);
        if (map == null) {
            map = new HashMap();
            this.b.put(cls, map);
        }
        map.put(cls2, iiVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized <T, Y> defpackage.ii<T, Y> a(java.lang.Class<T> r6, java.lang.Class<Y> r7) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.b;	 Catch:{ all -> 0x0076 }
        r0 = r0.get(r6);	 Catch:{ all -> 0x0076 }
        r0 = (java.util.Map) r0;	 Catch:{ all -> 0x0076 }
        r1 = 0;
        if (r0 == 0) goto L_0x0013;
    L_0x000c:
        r0 = r0.get(r7);	 Catch:{ all -> 0x0076 }
        r0 = (defpackage.ii) r0;	 Catch:{ all -> 0x0076 }
        goto L_0x0014;
    L_0x0013:
        r0 = r1;
    L_0x0014:
        if (r0 == 0) goto L_0x0022;
    L_0x0016:
        r6 = c;	 Catch:{ all -> 0x0076 }
        r6 = r6.equals(r0);	 Catch:{ all -> 0x0076 }
        if (r6 == 0) goto L_0x0020;
    L_0x001e:
        monitor-exit(r5);
        return r1;
    L_0x0020:
        monitor-exit(r5);
        return r0;
    L_0x0022:
        r2 = r5.a;	 Catch:{ all -> 0x0076 }
        r2 = r2.get(r6);	 Catch:{ all -> 0x0076 }
        r2 = (java.util.Map) r2;	 Catch:{ all -> 0x0076 }
        if (r2 == 0) goto L_0x0032;
    L_0x002c:
        r1 = r2.get(r7);	 Catch:{ all -> 0x0076 }
        r1 = (defpackage.ij) r1;	 Catch:{ all -> 0x0076 }
    L_0x0032:
        if (r1 != 0) goto L_0x0063;
    L_0x0034:
        r2 = r5.a;	 Catch:{ all -> 0x0076 }
        r2 = r2.keySet();	 Catch:{ all -> 0x0076 }
        r2 = r2.iterator();	 Catch:{ all -> 0x0076 }
    L_0x003e:
        r3 = r2.hasNext();	 Catch:{ all -> 0x0076 }
        if (r3 == 0) goto L_0x0063;
    L_0x0044:
        r3 = r2.next();	 Catch:{ all -> 0x0076 }
        r3 = (java.lang.Class) r3;	 Catch:{ all -> 0x0076 }
        r4 = r3.isAssignableFrom(r6);	 Catch:{ all -> 0x0076 }
        if (r4 == 0) goto L_0x003e;
    L_0x0050:
        r4 = r5.a;	 Catch:{ all -> 0x0076 }
        r3 = r4.get(r3);	 Catch:{ all -> 0x0076 }
        r3 = (java.util.Map) r3;	 Catch:{ all -> 0x0076 }
        if (r3 == 0) goto L_0x003e;
    L_0x005a:
        r1 = r3.get(r7);	 Catch:{ all -> 0x0076 }
        r1 = (defpackage.ij) r1;	 Catch:{ all -> 0x0076 }
        if (r1 != 0) goto L_0x0063;
    L_0x0062:
        goto L_0x003e;
    L_0x0063:
        if (r1 == 0) goto L_0x006f;
    L_0x0065:
        r0 = r5.d;	 Catch:{ all -> 0x0076 }
        r0 = r1.a(r0, r5);	 Catch:{ all -> 0x0076 }
        r5.a(r6, r7, r0);	 Catch:{ all -> 0x0076 }
        goto L_0x0074;
    L_0x006f:
        r1 = c;	 Catch:{ all -> 0x0076 }
        r5.a(r6, r7, r1);	 Catch:{ all -> 0x0076 }
    L_0x0074:
        monitor-exit(r5);
        return r0;
    L_0x0076:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: hs.a(java.lang.Class, java.lang.Class):ii<T, Y>");
    }

    public final synchronized <T, Y> ij<T, Y> a(Class<T> cls, Class<Y> cls2, ij<T, Y> ijVar) {
        ij<T, Y> ijVar2;
        this.b.clear();
        Map map = (Map) this.a.get(cls);
        if (map == null) {
            map = new HashMap();
            this.a.put(cls, map);
        }
        ijVar2 = (ij) map.put(cls2, ijVar);
        if (ijVar2 != null) {
            for (Map containsValue : this.a.values()) {
                if (containsValue.containsValue(ijVar2)) {
                    ijVar2 = null;
                    break;
                }
            }
        }
        return ijVar2;
    }
}
