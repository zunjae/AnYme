package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.afollestad.materialdialogs.e;
import com.afollestad.materialdialogs.j;
import com.afollestad.materialdialogs.o;
import com.zunjae.anyme.AnymeActivity;

public class aub {
    private static final String a = "aub";

    public static void a(Activity activity, alg alg) {
        switch (alg.a()) {
            case -4:
                aub.a(activity, "Could not authorize your account. Please re-login");
                return;
            case -3:
                aub.a(activity, "It took AnYme too long to connect to MyAnimeList. Please try again later (socket timeout)");
                return;
            case 400:
                aub.a(activity, "Can not update this Anime, try again later (Anime already added, or you are adding Anime too frequently)\n\nYou can attempt to fix this yourself by refreshing your profile on the home screen");
                return;
            case 401:
                new o(activity).a((CharSequence) "Oops").b((CharSequence) "Incorrect Login/Password. If you keep seeing this message, then it might be because your account is locked. Try logging in on MyAnimeList.net on your phone").c((CharSequence) "Re-login").a(new -$$Lambda$aub$jb6m1XmgikkGjknHaP-gdOdOnmk(activity)).l();
                return;
            case 503:
                aub.a(activity, "MyAnimeList seems to be undergoing maintenance. Please try again later.");
                return;
            case 666:
                aub.a(activity, "Check your WiFi or Mobile data please. If you do have a valid internet connection then you might need to relogin on MAL");
                return;
            default:
                StringBuilder stringBuilder = new StringBuilder("Unknown error, status code = ");
                stringBuilder.append(alg.a());
                aub.a(activity, stringBuilder.toString());
                return;
        }
    }

    private static /* synthetic */ void a(Activity activity, j jVar, e eVar) {
        anq.a((Context) activity);
        Intent intent = new Intent(activity, AnymeActivity.class);
        intent.addFlags(268468224);
        activity.startActivity(intent);
    }

    private static void a(android.app.Activity r1, java.lang.String r2) {
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
        r0 = new com.afollestad.materialdialogs.o;	 Catch:{ Exception -> 0x0018 }
        r0.<init>(r1);	 Catch:{ Exception -> 0x0018 }
        r1 = "Oops";	 Catch:{ Exception -> 0x0018 }
        r1 = r0.a(r1);	 Catch:{ Exception -> 0x0018 }
        r1 = r1.b(r2);	 Catch:{ Exception -> 0x0018 }
        r2 = "Cancel";	 Catch:{ Exception -> 0x0018 }
        r1 = r1.e(r2);	 Catch:{ Exception -> 0x0018 }
        r1.l();	 Catch:{ Exception -> 0x0018 }
    L_0x0018:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: aub.a(android.app.Activity, java.lang.String):void");
    }
}
