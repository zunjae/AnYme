package com.zunjae.anyme.fragments.anime;

import android.app.Activity;
import com.zunjae.zasync.c;
import defpackage.ajp;
import defpackage.amz;
import defpackage.anp;

final class b extends c<amz> {
    final /* synthetic */ FragmentAnimeDiscover a;

    b(FragmentAnimeDiscover fragmentAnimeDiscover, Activity activity) {
        this.a = fragmentAnimeDiscover;
        super(activity);
    }

    private defpackage.amz a(defpackage.amz r8) {
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
        r7 = this;
        if (r8 != 0) goto L_0x0004;
    L_0x0002:
        r8 = 0;
        return r8;
    L_0x0004:
        r0 = r7.a;	 Catch:{ Exception -> 0x0048 }
        r0 = r0.f;	 Catch:{ Exception -> 0x0048 }
        r0 = r0.i();	 Catch:{ Exception -> 0x0048 }
        r1 = r8.a();	 Catch:{ Exception -> 0x0048 }
        r1 = r1.d();	 Catch:{ Exception -> 0x0048 }
        r1 = r1.iterator();	 Catch:{ Exception -> 0x0048 }
    L_0x001a:
        r2 = r1.hasNext();	 Catch:{ Exception -> 0x0048 }
        if (r2 == 0) goto L_0x0048;	 Catch:{ Exception -> 0x0048 }
    L_0x0020:
        r2 = r1.next();	 Catch:{ Exception -> 0x0048 }
        r2 = (defpackage.ana) r2;	 Catch:{ Exception -> 0x0048 }
        r3 = r0.iterator();	 Catch:{ Exception -> 0x0048 }
    L_0x002a:
        r4 = r3.hasNext();	 Catch:{ Exception -> 0x0048 }
        if (r4 == 0) goto L_0x001a;	 Catch:{ Exception -> 0x0048 }
    L_0x0030:
        r4 = r3.next();	 Catch:{ Exception -> 0x0048 }
        r4 = (defpackage.are) r4;	 Catch:{ Exception -> 0x0048 }
        r5 = r4.d();	 Catch:{ Exception -> 0x0048 }
        r6 = r2.d();	 Catch:{ Exception -> 0x0048 }
        if (r5 != r6) goto L_0x002a;	 Catch:{ Exception -> 0x0048 }
    L_0x0040:
        r4 = r4.D();	 Catch:{ Exception -> 0x0048 }
        r2.a(r4);	 Catch:{ Exception -> 0x0048 }
        goto L_0x002a;
    L_0x0048:
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.fragments.anime.b.a(amz):amz");
    }

    protected final void a() {
        super.a();
        this.a.swipeRefreshLayout.setRefreshing(true);
    }

    protected final /* synthetic */ void a(Object obj) {
        amz amz = (amz) obj;
        super.a((Object) amz);
        this.a.swipeRefreshLayout.setRefreshing(false);
        if (amz == null || !amz.c()) {
            this.a.cardViewSuggestions.setVisibility(8);
            this.a.cardViewTop.setVisibility(8);
            this.a.cardViewAiring.setVisibility(8);
            this.a.cardViewUpcoming.setVisibility(8);
            this.a.errorMessage.setVisibility(0);
            return;
        }
        this.a.cardViewSuggestions.setVisibility(0);
        this.a.cardViewTop.setVisibility(0);
        this.a.cardViewAiring.setVisibility(0);
        this.a.cardViewUpcoming.setVisibility(0);
        this.a.errorMessage.setVisibility(8);
        FragmentAnimeDiscover.a(this.a, amz);
    }

    public final /* synthetic */ Object b() {
        amz b = ajp.b();
        if (b != null && b.c()) {
            anp.a(b);
        }
        return a(b);
    }

    protected final boolean c() {
        return anp.a();
    }

    protected final /* synthetic */ Object d() {
        return a(anp.b());
    }
}
