package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;

public final class oo implements ox {
    private final Method a;
    private final Object b;

    private oo(Object obj, Method method) {
        this.b = obj;
        this.a = method;
    }

    private static java.lang.Object a(android.content.Context r5, java.lang.Class r6) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r0 = "getInstance";	 Catch:{ Exception -> 0x0017 }
        r1 = 1;	 Catch:{ Exception -> 0x0017 }
        r2 = new java.lang.Class[r1];	 Catch:{ Exception -> 0x0017 }
        r3 = android.content.Context.class;	 Catch:{ Exception -> 0x0017 }
        r4 = 0;	 Catch:{ Exception -> 0x0017 }
        r2[r4] = r3;	 Catch:{ Exception -> 0x0017 }
        r0 = r6.getDeclaredMethod(r0, r2);	 Catch:{ Exception -> 0x0017 }
        r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x0017 }
        r1[r4] = r5;	 Catch:{ Exception -> 0x0017 }
        r5 = r0.invoke(r6, r1);	 Catch:{ Exception -> 0x0017 }
        return r5;
    L_0x0017:
        r5 = 0;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: oo.a(android.content.Context, java.lang.Class):java.lang.Object");
    }

    private static java.lang.reflect.Method a(java.lang.Class r4) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r0 = "logEventInternal";	 Catch:{ Exception -> 0x0019 }
        r1 = 3;	 Catch:{ Exception -> 0x0019 }
        r1 = new java.lang.Class[r1];	 Catch:{ Exception -> 0x0019 }
        r2 = 0;	 Catch:{ Exception -> 0x0019 }
        r3 = java.lang.String.class;	 Catch:{ Exception -> 0x0019 }
        r1[r2] = r3;	 Catch:{ Exception -> 0x0019 }
        r2 = 1;	 Catch:{ Exception -> 0x0019 }
        r3 = java.lang.String.class;	 Catch:{ Exception -> 0x0019 }
        r1[r2] = r3;	 Catch:{ Exception -> 0x0019 }
        r2 = 2;	 Catch:{ Exception -> 0x0019 }
        r3 = android.os.Bundle.class;	 Catch:{ Exception -> 0x0019 }
        r1[r2] = r3;	 Catch:{ Exception -> 0x0019 }
        r4 = r4.getDeclaredMethod(r0, r1);	 Catch:{ Exception -> 0x0019 }
        return r4;
    L_0x0019:
        r4 = 0;
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: oo.a(java.lang.Class):java.lang.reflect.Method");
    }

    public static ox a(Context context) {
        Class b = oo.b(context);
        if (b == null) {
            return null;
        }
        Object a = oo.a(context, b);
        if (a == null) {
            return null;
        }
        Method a2 = oo.a(b);
        return a2 == null ? null : new oo(a, a2);
    }

    private static java.lang.Class b(android.content.Context r1) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r1 = r1.getClassLoader();	 Catch:{ Exception -> 0x000b }
        r0 = "com.google.android.gms.measurement.AppMeasurement";	 Catch:{ Exception -> 0x000b }
        r1 = r1.loadClass(r0);	 Catch:{ Exception -> 0x000b }
        return r1;
    L_0x000b:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: oo.b(android.content.Context):java.lang.Class");
    }

    public final void a(String str, Bundle bundle) {
        a("fab", str, bundle);
    }

    public final void a(java.lang.String r5, java.lang.String r6, android.os.Bundle r7) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r4 = this;
        r0 = r4.a;	 Catch:{ Exception -> 0x0013 }
        r1 = r4.b;	 Catch:{ Exception -> 0x0013 }
        r2 = 3;	 Catch:{ Exception -> 0x0013 }
        r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0013 }
        r3 = 0;	 Catch:{ Exception -> 0x0013 }
        r2[r3] = r5;	 Catch:{ Exception -> 0x0013 }
        r5 = 1;	 Catch:{ Exception -> 0x0013 }
        r2[r5] = r6;	 Catch:{ Exception -> 0x0013 }
        r5 = 2;	 Catch:{ Exception -> 0x0013 }
        r2[r5] = r7;	 Catch:{ Exception -> 0x0013 }
        r0.invoke(r1, r2);	 Catch:{ Exception -> 0x0013 }
    L_0x0013:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: oo.a(java.lang.String, java.lang.String, android.os.Bundle):void");
    }
}
