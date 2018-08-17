package com.zunjae.anyme.rewrite.ui.bls;

import android.app.Activity;
import com.zunjae.anyme.R;
import com.zunjae.zasync.c;
import defpackage.asc;
import defpackage.atm;

final class m extends c<asc> {
    final /* synthetic */ FragmentAnimeInfoExtendedBL a;
    private final long b;

    m(FragmentAnimeInfoExtendedBL fragmentAnimeInfoExtendedBL, Activity activity, long j) {
        this.a = fragmentAnimeInfoExtendedBL;
        super(activity);
        this.b = j;
    }

    protected final void a() {
        super.a();
        this.a.b.findViewById(R.id.progressBarAdditionalInfo).setVisibility(0);
        this.a.b.findViewById(R.id.progressBar).setVisibility(0);
    }

    protected final /* synthetic */ void a(java.lang.Object r2) {
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
        r2 = (defpackage.asc) r2;
        super.a(r2);
        r0 = r1.a;	 Catch:{ Exception -> 0x000f }
        com.zunjae.anyme.rewrite.ui.bls.FragmentAnimeInfoExtendedBL.a(r0, r2);	 Catch:{ Exception -> 0x000f }
        r0 = r1.a;	 Catch:{ Exception -> 0x000f }
        com.zunjae.anyme.rewrite.ui.bls.FragmentAnimeInfoExtendedBL.b(r0, r2);	 Catch:{ Exception -> 0x000f }
    L_0x000f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.rewrite.ui.bls.m.a(java.lang.Object):void");
    }

    public final /* synthetic */ Object b() {
        asc a = atm.a(this.b);
        this.a.d.a(a);
        return a;
    }

    protected final boolean c() {
        return this.a.d.d(this.b);
    }

    protected final /* synthetic */ Object d() {
        return this.a.d.e(this.b);
    }
}
