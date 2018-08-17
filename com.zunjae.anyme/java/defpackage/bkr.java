package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

class bkr {
    private static final bkr a = bkr.c();

    bkr() {
    }

    static bkr a() {
        return a;
    }

    private static defpackage.bkr c() {
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
        r0 = "android.os.Build";	 Catch:{ ClassNotFoundException -> 0x000f }
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x000f }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ ClassNotFoundException -> 0x000f }
        if (r0 == 0) goto L_0x000f;	 Catch:{ ClassNotFoundException -> 0x000f }
    L_0x0009:
        r0 = new bks;	 Catch:{ ClassNotFoundException -> 0x000f }
        r0.<init>();	 Catch:{ ClassNotFoundException -> 0x000f }
        return r0;
    L_0x000f:
        r0 = "java.util.Optional";	 Catch:{ ClassNotFoundException -> 0x001a }
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x001a }
        r0 = new bku;	 Catch:{ ClassNotFoundException -> 0x001a }
        r0.<init>();	 Catch:{ ClassNotFoundException -> 0x001a }
        return r0;
    L_0x001a:
        r0 = new bkr;
        r0.<init>();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bkr.c():bkr");
    }

    bjp a(@Nullable Executor executor) {
        return executor != null ? new bju(executor) : bjs.a;
    }

    @Nullable
    Object a(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) {
        throw new UnsupportedOperationException();
    }

    boolean a(Method method) {
        return false;
    }

    @Nullable
    Executor b() {
        return null;
    }
}
