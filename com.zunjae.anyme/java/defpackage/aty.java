package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import com.afollestad.materialdialogs.j;
import com.zunjae.anyme.rewrite.viewmodels.AnimeViewModel;
import com.zunjae.zasync.c;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class aty extends c<alg> {
    private static final String a = "aty";
    private final Activity b;
    private final AnimeViewModel c;
    private final are d;
    private final auc e;
    private j f;

    public aty(Activity activity, are are, AnimeViewModel animeViewModel, auc auc) {
        super(activity);
        this.b = activity;
        this.d = are;
        this.c = animeViewModel;
        this.e = auc;
    }

    private /* synthetic */ void a(DialogInterface dialogInterface) {
        e();
    }

    protected final void a() {
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
        r5 = this;
        super.a();
        r0 = new com.afollestad.materialdialogs.o;	 Catch:{ Exception -> 0x0048 }
        r1 = r5.b;	 Catch:{ Exception -> 0x0048 }
        r0.<init>(r1);	 Catch:{ Exception -> 0x0048 }
        r1 = "Loading";	 Catch:{ Exception -> 0x0048 }
        r0 = r0.a(r1);	 Catch:{ Exception -> 0x0048 }
        r1 = "Adding %s to your profile, please wait";	 Catch:{ Exception -> 0x0048 }
        r2 = 1;	 Catch:{ Exception -> 0x0048 }
        r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0048 }
        r3 = r5.d;	 Catch:{ Exception -> 0x0048 }
        r3 = r3.g();	 Catch:{ Exception -> 0x0048 }
        r4 = 0;	 Catch:{ Exception -> 0x0048 }
        r2[r4] = r3;	 Catch:{ Exception -> 0x0048 }
        r1 = java.lang.String.format(r1, r2);	 Catch:{ Exception -> 0x0048 }
        r0 = r0.b(r1);	 Catch:{ Exception -> 0x0048 }
        r0 = r0.g();	 Catch:{ Exception -> 0x0048 }
        r0 = r0.h();	 Catch:{ Exception -> 0x0048 }
        r1 = new -$$Lambda$aty$EGgi02Q8kLdVhiVmlAcSFA3lAsY;	 Catch:{ Exception -> 0x0048 }
        r1.<init>(r5);	 Catch:{ Exception -> 0x0048 }
        r0 = r0.a(r1);	 Catch:{ Exception -> 0x0048 }
        r1 = "Cancel";	 Catch:{ Exception -> 0x0048 }
        r0 = r0.e(r1);	 Catch:{ Exception -> 0x0048 }
        r0 = r0.l();	 Catch:{ Exception -> 0x0048 }
        r5.f = r0;	 Catch:{ Exception -> 0x0048 }
        r0 = r5.f;	 Catch:{ Exception -> 0x0048 }
        r0.setCanceledOnTouchOutside(r4);	 Catch:{ Exception -> 0x0048 }
    L_0x0048:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: aty.a():void");
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
        r2 = (defpackage.alg) r2;
        super.a(r2);
        r0 = r1.f;	 Catch:{ Exception -> 0x0016 }
        if (r0 == 0) goto L_0x0016;	 Catch:{ Exception -> 0x0016 }
    L_0x0009:
        r0 = r1.f;	 Catch:{ Exception -> 0x0016 }
        r0 = r0.isShowing();	 Catch:{ Exception -> 0x0016 }
        if (r0 == 0) goto L_0x0016;	 Catch:{ Exception -> 0x0016 }
    L_0x0011:
        r0 = r1.f;	 Catch:{ Exception -> 0x0016 }
        r0.hide();	 Catch:{ Exception -> 0x0016 }
    L_0x0016:
        r0 = r1.e;
        r0.onComplete(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: aty.a(java.lang.Object):void");
    }

    public final /* synthetic */ Object b() {
        int a;
        if (aux.b("KEY_USE_ALT_API", true)) {
            a = atj.a(this.d.d());
        } else {
            a = ajo.a(String.format("https://myanimelist.net/api/animelist/add/%d.xml", new Object[]{Integer.valueOf(this.d.d())}), String.format("<entry><status>%d</status><tags>AnYme</tags></entry>", new Object[]{Integer.valueOf(6)}));
        }
        alg alg = new alg(a, BuildConfig.FLAVOR);
        if (alg.c()) {
            this.c.b(this.d);
        }
        return alg;
    }
}
