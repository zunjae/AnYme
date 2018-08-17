package com.zunjae.anyme.services;

import android.app.IntentService;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.os.Build.VERSION;
import android.support.v4.app.NotificationCompat.BigTextStyle;
import android.support.v4.app.NotificationCompat.Builder;
import com.zunjae.anyme.R;
import java.util.Timer;

public class UpdaterService extends IntentService {
    private final String a = getClass().getSimpleName();
    private final int b = 10;
    private final int c = 20000;
    private final int d = 5000;
    private String e;
    private Context f;
    private boolean g;
    private boolean h;
    private String i;
    private int j = 0;
    private final String k = "4565";
    private int l = 1500;

    public UpdaterService() {
        super("UpdateService");
    }

    public static Intent a(Context context) {
        Intent intent = new Intent(context, UpdaterService.class);
        intent.putExtra("withAutomaticRetry", false);
        intent.putExtra("verbose", true);
        intent.putExtra("delay", 0);
        return intent;
    }

    private void a() {
        int i = this.j;
        if (i != 10) {
            this.j = i + 1;
            new Timer().schedule(new b(this), 20000);
        }
    }

    static /* synthetic */ void a(UpdaterService updaterService) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) updaterService.f.getSystemService("connectivity")).getActiveNetworkInfo();
        Object obj = (activeNetworkInfo == null || activeNetworkInfo.getState() != State.CONNECTED) ? null : 1;
        if (obj == null) {
            updaterService.a("Not connected to the Internet. Please check your Mobile Data or Wifi");
            if (updaterService.h) {
                updaterService.a();
            }
            return;
        }
        if (!updaterService.b() && updaterService.h) {
            updaterService.a();
        }
    }

    private void a(String str) {
        if (this.g) {
            Builder contentText = new Builder(this, "4565").setSmallIcon(R.mipmap.newappicon).setAutoCancel(true).setContentTitle("AnYme").setStyle(new BigTextStyle().bigText(str)).setContentText(str);
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.notify(333, contentText.build());
            }
        }
    }

    private boolean b() {
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
        r9 = this;
        r0 = 0;
        r1 = r9.e;	 Catch:{ IOException -> 0x0169 }
        r1 = org.jsoup.Jsoup.connect(r1);	 Catch:{ IOException -> 0x0169 }
        r2 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;	 Catch:{ IOException -> 0x0169 }
        r1 = r1.timeout(r2);	 Catch:{ IOException -> 0x0169 }
        r2 = r9.i;	 Catch:{ IOException -> 0x0169 }
        r1 = r1.userAgent(r2);	 Catch:{ IOException -> 0x0169 }
        r1 = r1.get();	 Catch:{ IOException -> 0x0169 }
        r2 = defpackage.ato.a();	 Catch:{ IOException -> 0x0169 }
        r1 = r1.body();	 Catch:{ IOException -> 0x0169 }
        r1 = r1.text();	 Catch:{ IOException -> 0x0169 }
        r3 = defpackage.ale.class;	 Catch:{ IOException -> 0x0169 }
        r1 = r2.a(r1, r3);	 Catch:{ IOException -> 0x0169 }
        r1 = (defpackage.ale) r1;	 Catch:{ IOException -> 0x0169 }
        if (r1 != 0) goto L_0x0033;
    L_0x002d:
        r1 = "Unable to properly retrieve data from the server";
        r9.a(r1);
        return r0;
    L_0x0033:
        r2 = r9.f;
        r2 = com.zunjae.zapplib.a.b(r2);
        r4 = r1.h();
        r4 = r4.doubleValue();
        r6 = 0;
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 <= 0) goto L_0x00a6;
    L_0x0047:
        r4 = r1.h();
        r4 = java.lang.String.valueOf(r4);
        r5 = "KEY_LAST_NEW_VERSION";
        defpackage.aux.a(r5, r4);
        r4 = r1.e();
        r5 = defpackage.bit.c(r4);
        if (r5 == 0) goto L_0x0063;
    L_0x005e:
        r5 = "KEY_CHANGELOG_URL";
        defpackage.aux.a(r5, r4);
    L_0x0063:
        r4 = r1.i();
        r5 = defpackage.bit.c(r4);
        if (r5 == 0) goto L_0x0072;
    L_0x006d:
        r5 = "KEY_SHORT_DESCRIPTION";
        defpackage.aux.a(r5, r4);
    L_0x0072:
        r4 = r1.f();
        r5 = "KEY_APP_UPDATE_ENDPOINT";
        defpackage.aux.a(r5, r4);
        r4 = r1.d();
        r5 = "KEY_SHOULD_UPDATE";
        defpackage.aux.a(r5, r4);
        r4 = r1.b();
        r5 = "KEY_SHOULD_INTERCEPT_RAPID_VIDEO";
        defpackage.aux.a(r5, r4);
        r4 = r1.c();
        defpackage.atm.a(r4);
        r4 = r1.a();
        r5 = "KEY_USE_ALT_API";
        defpackage.aux.a(r5, r4);
        r4 = r1.g();
        r5 = "KEY_LOGIN_SUCCESS_ENDPOINT";
        defpackage.aux.a(r5, r4);
    L_0x00a6:
        r4 = r1.k();
        r5 = "@@AdBlocker_DAO_list_version";
        r5 = defpackage.aux.b(r5, r0);
        if (r4 <= r5) goto L_0x00bf;
    L_0x00b2:
        r5 = r9.getApplication();
        r8 = r9.f;
        r4 = com.zunjae.anyme.services.AdBlockerService.a(r8, r4);
        r5.startService(r4);
    L_0x00bf:
        r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        r5 = 1;
        if (r4 != 0) goto L_0x00ca;
    L_0x00c4:
        r0 = "Local error occurred (AnYme app version is 0 somehow)";
    L_0x00c6:
        r9.a(r0);
        return r5;
    L_0x00ca:
        r4 = r1.h();
        r6 = r4.doubleValue();
        r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r4 != 0) goto L_0x00d9;
    L_0x00d6:
        r0 = "No new version online";
        goto L_0x00c6;
    L_0x00d9:
        r4 = r1.h();
        r6 = r4.doubleValue();
        r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r4 <= 0) goto L_0x0165;
    L_0x00e5:
        r2 = new android.support.v4.app.NotificationCompat$Builder;
        r3 = "4565";
        r2.<init>(r9, r3);
        r3 = 2131558400; // 0x7f0d0000 float:1.8742115E38 double:1.0531297775E-314;
        r2 = r2.setSmallIcon(r3);
        r2 = r2.setAutoCancel(r5);
        r2 = r2.setPriority(r5);
        r2 = r2.setOngoing(r5);
        r3 = new java.lang.StringBuilder;
        r4 = "New Version (";
        r3.<init>(r4);
        r4 = r1.h();
        r3.append(r4);
        r4 = ")";
        r3.append(r4);
        r3 = r3.toString();
        r2 = r2.setContentTitle(r3);
        r3 = new android.support.v4.app.NotificationCompat$BigTextStyle;
        r3.<init>();
        r4 = r1.j();
        r3 = r3.bigText(r4);
        r2 = r2.setStyle(r3);
        r3 = r1.j();
        r2 = r2.setContentText(r3);
        r3 = new android.content.Intent;
        r3.<init>();
        r4 = "android.intent.action.VIEW";
        r4 = r3.setAction(r4);
        r1 = r1.f();
        r1 = android.net.Uri.parse(r1);
        r4.setData(r1);
        r1 = 134217728; // 0x8000000 float:3.85186E-34 double:6.63123685E-316;
        r0 = android.app.PendingIntent.getActivity(r9, r0, r3, r1);
        r2.setContentIntent(r0);
        r0 = "notification";
        r0 = r9.getSystemService(r0);
        r0 = (android.app.NotificationManager) r0;
        if (r0 == 0) goto L_0x0164;
    L_0x015b:
        r1 = 333; // 0x14d float:4.67E-43 double:1.645E-321;
        r2 = r2.build();
        r0.notify(r1, r2);
    L_0x0164:
        return r5;
    L_0x0165:
        r0 = "No new version online\n Please check /r/AnYme for more info!";
        goto L_0x00c6;
    L_0x0169:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.services.UpdaterService.b():boolean");
    }

    protected void onHandleIntent(Intent intent) {
        this.f = getApplication();
        this.e = "https://raw.githubusercontent.com/zunjae/anyme_download/master/downloadR";
        this.i = this.f.getResources().getString(R.string.desktop_useragent);
        CharSequence charSequence = "BEEP";
        if (VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("4565", charSequence, 2);
            notificationChannel.enableLights(false);
            notificationChannel.enableVibration(false);
            NotificationManager notificationManager = (NotificationManager) this.f.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
        if (intent != null) {
            this.g = intent.getBooleanExtra("verbose", false);
            this.l = intent.getIntExtra("delay", this.l);
            this.h = intent.getBooleanExtra("withAutomaticRetry", false);
        }
        new Timer().schedule(new a(this), (long) this.l);
    }
}
