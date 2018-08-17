package defpackage;

import android.content.Context;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public final class bai {
    private final AtomicReference<bam> a;
    private final CountDownLatch b;
    private bal c;
    private boolean d;

    private bai() {
        this.a = new AtomicReference();
        this.b = new CountDownLatch(1);
        this.d = false;
    }

    public static bai a() {
        return baj.a;
    }

    private void a(bam bam) {
        this.a.set(bam);
        this.b.countDown();
    }

    public final synchronized bai a(avp avp, aww aww, azk azk, String str, String str2, String str3) {
        bai bai = this;
        avp avp2 = avp;
        synchronized (this) {
            if (bai.d) {
                return bai;
            }
            if (bai.c == null) {
                Context m = avp.m();
                String c = aww.c();
                awh awh = new awh();
                String a = awh.a(m);
                String h = aww.h();
                awo axg = new axg();
                bao bac = new bac();
                azy baa = new baa(avp2);
                String k = awj.k(m);
                String str4 = str3;
                baq bad = new bad(avp2, str4, String.format(Locale.US, "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings", new Object[]{c}), azk);
                str4 = aww.f();
                c = aww.e();
                String str5 = c;
                String str6 = str2;
                String str7 = str;
                avp avp3 = avp;
                bai.c = new bab(avp3, new bap(a, str4, str5, aww.d(), aww.b(), awj.a(awj.m(m)), str6, str7, awp.determineFrom(h).getId(), k), axg, bac, baa, bad);
            }
            bai.d = true;
            return bai;
        }
    }

    public final defpackage.bam b() {
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
        r0 = r1.b;	 Catch:{ InterruptedException -> 0x000e }
        r0.await();	 Catch:{ InterruptedException -> 0x000e }
        r0 = r1.a;	 Catch:{ InterruptedException -> 0x000e }
        r0 = r0.get();	 Catch:{ InterruptedException -> 0x000e }
        r0 = (defpackage.bam) r0;	 Catch:{ InterruptedException -> 0x000e }
        return r0;
    L_0x000e:
        defpackage.avf.c();
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bai.b():bam");
    }

    public final synchronized boolean c() {
        bam a;
        a = this.c.a();
        a(a);
        return a != null;
    }

    public final synchronized boolean d() {
        bam a;
        a = this.c.a(bak.SKIP_CACHE_LOOKUP);
        a(a);
        if (a == null) {
            avf.c();
        }
        return a != null;
    }
}
