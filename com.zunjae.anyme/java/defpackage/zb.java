package defpackage;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public final class zb extends wz<Date> {
    public static final xb a = new zc();
    private final DateFormat b = DateFormat.getDateTimeInstance(2, 2, Locale.US);
    private final DateFormat c = DateFormat.getDateTimeInstance(2, 2);

    private synchronized java.util.Date a(java.lang.String r3) {
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
        r2 = this;
        monitor-enter(r2);
        r0 = r2.c;	 Catch:{ ParseException -> 0x000b }
        r0 = r0.parse(r3);	 Catch:{ ParseException -> 0x000b }
        monitor-exit(r2);
        return r0;
    L_0x0009:
        r3 = move-exception;
        goto L_0x0026;
    L_0x000b:
        r0 = r2.b;	 Catch:{ ParseException -> 0x0013 }
        r0 = r0.parse(r3);	 Catch:{ ParseException -> 0x0013 }
        monitor-exit(r2);
        return r0;
    L_0x0013:
        r0 = new java.text.ParsePosition;	 Catch:{ ParseException -> 0x001f }
        r1 = 0;	 Catch:{ ParseException -> 0x001f }
        r0.<init>(r1);	 Catch:{ ParseException -> 0x001f }
        r0 = defpackage.abl.a(r3, r0);	 Catch:{ ParseException -> 0x001f }
        monitor-exit(r2);
        return r0;
    L_0x001f:
        r0 = move-exception;
        r1 = new wv;	 Catch:{ all -> 0x0009 }
        r1.<init>(r3, r0);	 Catch:{ all -> 0x0009 }
        throw r1;	 Catch:{ all -> 0x0009 }
    L_0x0026:
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: zb.a(java.lang.String):java.util.Date");
    }

    private synchronized void a(abq abq, Date date) {
        if (date == null) {
            abq.f();
        } else {
            abq.b(this.b.format(date));
        }
    }

    public final /* synthetic */ Object a(abn abn) {
        if (abn.f() != abp.NULL) {
            return a(abn.h());
        }
        abn.j();
        return null;
    }
}
