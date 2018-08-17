package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import com.afollestad.materialdialogs.j;
import com.zunjae.anyme.rewrite.viewmodels.AnimeViewModel;
import com.zunjae.zasync.c;
import java.text.SimpleDateFormat;
import java.util.Date;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class aua extends c<alg> {
    private static final String a = "aua";
    private final Activity b;
    private final AnimeViewModel c;
    private final are d;
    private final auc e;
    private j f;

    public aua(Activity activity, are are, AnimeViewModel animeViewModel, auc auc) {
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
        r2 = this;
        super.a();
        r0 = new com.afollestad.materialdialogs.o;	 Catch:{ Exception -> 0x0039 }
        r1 = r2.b;	 Catch:{ Exception -> 0x0039 }
        r0.<init>(r1);	 Catch:{ Exception -> 0x0039 }
        r1 = "Loading";	 Catch:{ Exception -> 0x0039 }
        r0 = r0.a(r1);	 Catch:{ Exception -> 0x0039 }
        r1 = "Updating your MyAnimeList profile, please wait";	 Catch:{ Exception -> 0x0039 }
        r0 = r0.b(r1);	 Catch:{ Exception -> 0x0039 }
        r0 = r0.g();	 Catch:{ Exception -> 0x0039 }
        r0 = r0.h();	 Catch:{ Exception -> 0x0039 }
        r1 = new -$$Lambda$aua$w3DJ_MTsVz_MccUBV1n4nIG_ld4;	 Catch:{ Exception -> 0x0039 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0039 }
        r0 = r0.a(r1);	 Catch:{ Exception -> 0x0039 }
        r1 = "Cancel";	 Catch:{ Exception -> 0x0039 }
        r0 = r0.e(r1);	 Catch:{ Exception -> 0x0039 }
        r0 = r0.l();	 Catch:{ Exception -> 0x0039 }
        r2.f = r0;	 Catch:{ Exception -> 0x0039 }
        r0 = r2.f;	 Catch:{ Exception -> 0x0039 }
        r1 = 0;	 Catch:{ Exception -> 0x0039 }
        r0.setCanceledOnTouchOutside(r1);	 Catch:{ Exception -> 0x0039 }
    L_0x0039:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: aua.a():void");
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
        throw new UnsupportedOperationException("Method not decompiled: aua.a(java.lang.Object):void");
    }

    public final /* synthetic */ Object b() {
        int a;
        if (aux.b("KEY_USE_ALT_API", true)) {
            a = atj.a(this.d);
        } else {
            StringBuilder stringBuilder;
            are are = this.d;
            long c = are.c();
            int o = are.o();
            int v = are.v();
            int r = are.r();
            String u = are.u();
            String format = new SimpleDateFormat("MMddyyyy").format(new Date());
            String str = BuildConfig.FLAVOR;
            if (are.A()) {
                str = String.format("<date_start>%s</date_start>", new Object[]{format});
                are.f(format);
            }
            String str2 = BuildConfig.FLAVOR;
            Object obj = ((are.k() == 2 ? 1 : null) == null || (are.v() == 2 ? 1 : null) == null) ? null : 1;
            if (obj != null && are.B()) {
                str2 = String.format("<date_finish>%s</date_finish>", new Object[]{format});
                are.g(format);
            }
            if (!are.u().toLowerCase().contains("anyme")) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(are.u());
                stringBuilder.append(", AnYmeApp.com");
                are.h(stringBuilder.toString());
            }
            stringBuilder = new StringBuilder("<entry>");
            stringBuilder.append(String.format("<episode>%d</episode>", new Object[]{Integer.valueOf(o)}));
            stringBuilder.append(String.format("<status>%d</status>", new Object[]{Integer.valueOf(v)}));
            stringBuilder.append(String.format("<score>%d</score>", new Object[]{Integer.valueOf(r)}));
            stringBuilder.append(String.format("<tags>%s</tags>", new Object[]{u}));
            stringBuilder.append(String.format("<enable_rewatching>%d</enable_rewatching>", new Object[]{Integer.valueOf(are.e())}));
            stringBuilder.append(String.format("<rewatch_episode>%d</rewatch_episode>", new Object[]{Integer.valueOf(are.s())}));
            stringBuilder.append(str2);
            stringBuilder.append(str);
            stringBuilder.append("</entry>");
            a = ajo.b(String.format("https://myanimelist.net/api/animelist/update/%d.xml", new Object[]{Long.valueOf(c)}), stringBuilder.toString());
        }
        alg alg = new alg(a, BuildConfig.FLAVOR);
        if (alg.c()) {
            this.d.b((long) ((int) (new Date().getTime() / 1000)));
            this.c.a(this.d);
        }
        return alg;
    }
}
