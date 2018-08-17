package com.zunjae.anyme.activities.explore;

import android.app.Activity;
import com.zunjae.zasync.c;
import defpackage.anj;
import defpackage.asg;

final class v extends c<anj> {
    final /* synthetic */ SeasonalAnimeActivity a;
    private final asg b;

    v(SeasonalAnimeActivity seasonalAnimeActivity, Activity activity, asg asg) {
        this.a = seasonalAnimeActivity;
        super(activity);
        this.b = asg;
    }

    private defpackage.anj g() {
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
        r3 = this;
        r0 = r3.b;	 Catch:{ Exception -> 0x0052 }
        if (r0 != 0) goto L_0x001b;	 Catch:{ Exception -> 0x0052 }
    L_0x0004:
        r0 = defpackage.atg.a();	 Catch:{ Exception -> 0x0052 }
        r0 = r0.b();	 Catch:{ Exception -> 0x0052 }
        r0 = r0.a();	 Catch:{ Exception -> 0x0052 }
        r0 = r0.a();	 Catch:{ Exception -> 0x0052 }
    L_0x0014:
        r0 = r0.b();	 Catch:{ Exception -> 0x0052 }
        r0 = (defpackage.asl) r0;	 Catch:{ Exception -> 0x0052 }
        goto L_0x003c;	 Catch:{ Exception -> 0x0052 }
    L_0x001b:
        r0 = defpackage.atg.a();	 Catch:{ Exception -> 0x0052 }
        r0 = r0.b();	 Catch:{ Exception -> 0x0052 }
        r1 = r3.b;	 Catch:{ Exception -> 0x0052 }
        r1 = r1.a();	 Catch:{ Exception -> 0x0052 }
        r2 = r3.b;	 Catch:{ Exception -> 0x0052 }
        r2 = r2.b();	 Catch:{ Exception -> 0x0052 }
        r2 = r2.toLowerCase();	 Catch:{ Exception -> 0x0052 }
        r0 = r0.a(r1, r2);	 Catch:{ Exception -> 0x0052 }
        r0 = r0.a();	 Catch:{ Exception -> 0x0052 }
        goto L_0x0014;	 Catch:{ Exception -> 0x0052 }
    L_0x003c:
        r1 = r3.a;	 Catch:{ Exception -> 0x0052 }
        r1 = r1.f;	 Catch:{ Exception -> 0x0052 }
        r1 = r1.a();	 Catch:{ Exception -> 0x0052 }
        r1 = r1.r();	 Catch:{ Exception -> 0x0052 }
        r2 = new anj;	 Catch:{ Exception -> 0x0052 }
        r0 = r0.a;	 Catch:{ Exception -> 0x0052 }
        r2.<init>(r0, r1);	 Catch:{ Exception -> 0x0052 }
        return r2;
    L_0x0052:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.activities.explore.v.g():anj");
    }

    protected final void a() {
        super.a();
        this.a.swipeRefreshLayout.setRefreshing(true);
    }

    protected final /* synthetic */ void a(Object obj) {
        anj anj = (anj) obj;
        super.a((Object) anj);
        this.a.swipeRefreshLayout.setRefreshing(false);
        SeasonalAnimeActivity.a(this.a, anj);
    }

    public final /* synthetic */ Object b() {
        return g();
    }
}
