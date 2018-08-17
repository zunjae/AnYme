package defpackage;

import android.os.Bundle;
import org.json.JSONObject;

final class su implements pv {
    private final se a;

    private su(se seVar) {
        this.a = seVar;
    }

    private java.lang.Class<?> a(java.lang.String r2) {
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
        r1 = this;
        r0 = r1.a;	 Catch:{ Exception -> 0x000f }
        r0 = r0.m();	 Catch:{ Exception -> 0x000f }
        r0 = r0.getClassLoader();	 Catch:{ Exception -> 0x000f }
        r2 = r0.loadClass(r2);	 Catch:{ Exception -> 0x000f }
        return r2;
    L_0x000f:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: su.a(java.lang.String):java.lang.Class<?>");
    }

    private java.lang.Object a(java.lang.Class<?> r6) {
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
        r5 = this;
        r0 = "getInstance";	 Catch:{ Exception -> 0x001d }
        r1 = 1;	 Catch:{ Exception -> 0x001d }
        r2 = new java.lang.Class[r1];	 Catch:{ Exception -> 0x001d }
        r3 = android.content.Context.class;	 Catch:{ Exception -> 0x001d }
        r4 = 0;	 Catch:{ Exception -> 0x001d }
        r2[r4] = r3;	 Catch:{ Exception -> 0x001d }
        r0 = r6.getDeclaredMethod(r0, r2);	 Catch:{ Exception -> 0x001d }
        r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x001d }
        r2 = r5.a;	 Catch:{ Exception -> 0x001d }
        r2 = r2.m();	 Catch:{ Exception -> 0x001d }
        r1[r4] = r2;	 Catch:{ Exception -> 0x001d }
        r6 = r0.invoke(r6, r1);	 Catch:{ Exception -> 0x001d }
        return r6;
    L_0x001d:
        r6 = 0;
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: su.a(java.lang.Class):java.lang.Object");
    }

    private static String a(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    static pv a(se seVar) {
        return new su(seVar);
    }

    static /* synthetic */ void a(defpackage.se r2, java.lang.String r3, android.os.Bundle r4) {
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
        r0 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0016 }
        r1 = "$A$:";	 Catch:{ JSONException -> 0x0016 }
        r0.<init>(r1);	 Catch:{ JSONException -> 0x0016 }
        r3 = defpackage.su.a(r3, r4);	 Catch:{ JSONException -> 0x0016 }
        r0.append(r3);	 Catch:{ JSONException -> 0x0016 }
        r3 = r0.toString();	 Catch:{ JSONException -> 0x0016 }
        r2.a(r3);	 Catch:{ JSONException -> 0x0016 }
        return;
    L_0x0016:
        defpackage.avf.c();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: su.a(se, java.lang.String, android.os.Bundle):void");
    }

    private boolean a(java.lang.Class<?> r6, java.lang.Object r7, java.lang.String r8) {
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
        r5 = this;
        r0 = "com.google.android.gms.measurement.AppMeasurement$OnEventListener";
        r0 = r5.a(r0);
        r1 = 1;
        r2 = 0;
        r3 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x0037, InvocationTargetException -> 0x0033, IllegalAccessException -> 0x002f }
        r3[r2] = r0;	 Catch:{ NoSuchMethodException -> 0x0037, InvocationTargetException -> 0x0033, IllegalAccessException -> 0x002f }
        r6 = r6.getDeclaredMethod(r8, r3);	 Catch:{ NoSuchMethodException -> 0x0037, InvocationTargetException -> 0x0033, IllegalAccessException -> 0x002f }
        r8 = new java.lang.Object[r1];	 Catch:{ NoSuchMethodException -> 0x0037, InvocationTargetException -> 0x0033, IllegalAccessException -> 0x002f }
        r3 = r5.a;	 Catch:{ NoSuchMethodException -> 0x0037, InvocationTargetException -> 0x0033, IllegalAccessException -> 0x002f }
        r3 = r3.m();	 Catch:{ NoSuchMethodException -> 0x0037, InvocationTargetException -> 0x0033, IllegalAccessException -> 0x002f }
        r3 = r3.getClassLoader();	 Catch:{ NoSuchMethodException -> 0x0037, InvocationTargetException -> 0x0033, IllegalAccessException -> 0x002f }
        r4 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x0037, InvocationTargetException -> 0x0033, IllegalAccessException -> 0x002f }
        r4[r2] = r0;	 Catch:{ NoSuchMethodException -> 0x0037, InvocationTargetException -> 0x0033, IllegalAccessException -> 0x002f }
        r0 = new sv;	 Catch:{ NoSuchMethodException -> 0x0037, InvocationTargetException -> 0x0033, IllegalAccessException -> 0x002f }
        r0.<init>(r5);	 Catch:{ NoSuchMethodException -> 0x0037, InvocationTargetException -> 0x0033, IllegalAccessException -> 0x002f }
        r0 = java.lang.reflect.Proxy.newProxyInstance(r3, r4, r0);	 Catch:{ NoSuchMethodException -> 0x0037, InvocationTargetException -> 0x0033, IllegalAccessException -> 0x002f }
        r8[r2] = r0;	 Catch:{ NoSuchMethodException -> 0x0037, InvocationTargetException -> 0x0033, IllegalAccessException -> 0x002f }
        r6.invoke(r7, r8);	 Catch:{ NoSuchMethodException -> 0x0037, InvocationTargetException -> 0x0033, IllegalAccessException -> 0x002f }
        return r1;
    L_0x002f:
        defpackage.avf.c();
        return r2;
    L_0x0033:
        defpackage.avf.c();
        return r2;
    L_0x0037:
        defpackage.avf.c();
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: su.a(java.lang.Class, java.lang.Object, java.lang.String):boolean");
    }

    public final boolean a() {
        Class a = a("com.google.android.gms.measurement.AppMeasurement");
        if (a == null) {
            avf.c();
            return false;
        }
        Object a2 = a(a);
        if (a2 != null) {
            return a(a, a2, "registerOnMeasurementEventListener");
        }
        avf.c();
        return false;
    }
}
