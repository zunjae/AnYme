package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatDrawableManager;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

public final class bv {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal();
    private static final WeakHashMap<Context, SparseArray<bw>> b = new WeakHashMap(0);
    private static final Object c = new Object();

    public static ColorStateList a(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList d = bv.d(context, i);
        if (d != null) {
            return d;
        }
        d = bv.c(context, i);
        if (d == null) {
            return ContextCompat.getColorStateList(context, i);
        }
        synchronized (c) {
            SparseArray sparseArray = (SparseArray) b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                b.put(context, sparseArray);
            }
            sparseArray.append(i, new bw(d, context.getResources().getConfiguration()));
        }
        return d;
    }

    public static Drawable b(Context context, int i) {
        return AppCompatDrawableManager.get().getDrawable(context, i);
    }

    private static android.content.res.ColorStateList c(android.content.Context r3, int r4) {
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
        r0 = r3.getResources();
        r1 = a;
        r1 = r1.get();
        r1 = (android.util.TypedValue) r1;
        if (r1 != 0) goto L_0x0018;
    L_0x000e:
        r1 = new android.util.TypedValue;
        r1.<init>();
        r2 = a;
        r2.set(r1);
    L_0x0018:
        r2 = 1;
        r0.getValue(r4, r1, r2);
        r0 = r1.type;
        r1 = 28;
        if (r0 < r1) goto L_0x0027;
    L_0x0022:
        r1 = 31;
        if (r0 > r1) goto L_0x0027;
    L_0x0026:
        goto L_0x0028;
    L_0x0027:
        r2 = 0;
    L_0x0028:
        r0 = 0;
        if (r2 == 0) goto L_0x002c;
    L_0x002b:
        return r0;
    L_0x002c:
        r1 = r3.getResources();
        r4 = r1.getXml(r4);
        r3 = r3.getTheme();	 Catch:{ Exception -> 0x003d }
        r3 = defpackage.bu.a(r1, r4, r3);	 Catch:{ Exception -> 0x003d }
        return r3;
    L_0x003d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bv.c(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList d(android.content.Context r4, int r5) {
        /*
        r0 = c;
        monitor-enter(r0);
        r1 = b;	 Catch:{ all -> 0x0035 }
        r1 = r1.get(r4);	 Catch:{ all -> 0x0035 }
        r1 = (android.util.SparseArray) r1;	 Catch:{ all -> 0x0035 }
        if (r1 == 0) goto L_0x0032;
    L_0x000d:
        r2 = r1.size();	 Catch:{ all -> 0x0035 }
        if (r2 <= 0) goto L_0x0032;
    L_0x0013:
        r2 = r1.get(r5);	 Catch:{ all -> 0x0035 }
        r2 = (defpackage.bw) r2;	 Catch:{ all -> 0x0035 }
        if (r2 == 0) goto L_0x0032;
    L_0x001b:
        r3 = r2.b;	 Catch:{ all -> 0x0035 }
        r4 = r4.getResources();	 Catch:{ all -> 0x0035 }
        r4 = r4.getConfiguration();	 Catch:{ all -> 0x0035 }
        r4 = r3.equals(r4);	 Catch:{ all -> 0x0035 }
        if (r4 == 0) goto L_0x002f;
    L_0x002b:
        r4 = r2.a;	 Catch:{ all -> 0x0035 }
        monitor-exit(r0);	 Catch:{ all -> 0x0035 }
        return r4;
    L_0x002f:
        r1.remove(r5);	 Catch:{ all -> 0x0035 }
    L_0x0032:
        monitor-exit(r0);	 Catch:{ all -> 0x0035 }
        r4 = 0;
        return r4;
    L_0x0035:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0035 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: bv.d(android.content.Context, int):android.content.res.ColorStateList");
    }
}
