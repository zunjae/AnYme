package com.zunjae.anyme.activities.browsers.abtracts;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.view.Menu;
import android.webkit.WebView;
import android.widget.Toast;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.anyme.dialogs.CastDialog;
import com.zunjae.zapplib.a;
import defpackage.aud;
import defpackage.aul;
import defpackage.aun;
import defpackage.auq;
import defpackage.aux;
import defpackage.bit;

public abstract class AbstractBrowser extends AbstractActivity {
    protected WebView c;
    protected String d;
    protected String e;
    protected boolean f = false;
    protected boolean g = false;
    protected final int h = 0;
    private final String i = "com.dv.adm";
    private final String j = "com.dv.adm.pay";
    private final String k = "org.videolan.vlc";
    private final String l = "com.mxtech.videoplayer.ad";
    private final String m = "com.mxtech.videoplayer.pro";
    private boolean n = false;
    private CastDialog o;
    private boolean p;
    private boolean q = true;
    private boolean r = false;
    private auq s;

    private String c() {
        return a.b(this.b, "com.dv.adm.pay", "com.dv.adm");
    }

    private void d() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r3 = this;
        r0 = new com.zunjae.anyme.activities.browsers.abtracts.-$$Lambda$AbstractBrowser$lm3gFKoAYHICTP3_EGaYEo8-Bac;
        r0.<init>(r3);
        r3.runOnUiThread(r0);
        r0 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r1 = "android.intent.action.VIEW";	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r2 = "market://details?id=com.dv.adm";	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r2 = android.net.Uri.parse(r2);	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r0.<init>(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r3.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x0019 }
        return;
    L_0x0019:
        r0 = new android.content.Intent;
        r1 = "android.intent.action.VIEW";
        r2 = "https://play.google.com/store/apps/details?id=com.dv.adm";
        r2 = android.net.Uri.parse(r2);
        r0.<init>(r1, r2);
        r3.startActivity(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.activities.browsers.abtracts.AbstractBrowser.d():void");
    }

    private /* synthetic */ void e() {
        Toast.makeText(this.b, "Please install ADM if you want to download files!", 1).show();
    }

    private /* synthetic */ void f() {
        this.q = false;
        new Handler().postDelayed(new -$$Lambda$AbstractBrowser$ZbuMPoHI2HfwMagwMZPzVYVEVwU(this), 2000);
    }

    private /* synthetic */ void g() {
        this.q = true;
    }

    private /* synthetic */ void h() {
        Toast.makeText(this.b, "Download will start in a moment", 0).show();
    }

    private /* synthetic */ void i() {
        Toast.makeText(this.b, "Download will start in a moment", 0).show();
    }

    private /* synthetic */ void j() {
        this.g = true;
    }

    protected final void a(String str, String str2) {
        if (this.p) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(" AnYmeApp.com");
            str2 = stringBuilder.toString();
            String c;
            if (this.f) {
                if (this.q) {
                    c = c();
                    if (c != null) {
                        str2 = str2.concat(".mp4");
                        Intent intent = new Intent();
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(c);
                        stringBuilder2.append(".AEditor");
                        intent.setClassName(c, stringBuilder2.toString());
                        intent.putExtra("android.intent.extra.TEXT", str);
                        intent.putExtra("com.android.extra.filename", str2);
                        if (a.a(this.b, intent)) {
                            runOnUiThread(new -$$Lambda$AbstractBrowser$iM44rVtvZSIZXkIr1S_lr5WxiKo(this));
                            startActivity(intent);
                            runOnUiThread(new -$$Lambda$AbstractBrowser$HhBCIdimL3tUW0zQflUcyc3su-I(this));
                        }
                    }
                    d();
                }
                str = "Download";
            } else if (this.n) {
                CastDialog castDialog = this.o;
                if (castDialog == null || !castDialog.isVisible()) {
                    this.o = CastDialog.a(str, str2);
                    this.o.show(getSupportFragmentManager(), "CastDialog");
                }
                str = "Cast";
            } else {
                if (aux.b(this.b.getResources().getString(R.string.preference_key_force_mx_player), false)) {
                    c = a.b(this.b, "com.mxtech.videoplayer.pro", "com.mxtech.videoplayer.ad", "org.videolan.vlc");
                    if (c != null) {
                        Intent intent2 = new Intent("android.intent.action.VIEW");
                        intent2.setDataAndType(Uri.parse(str), "video/*");
                        intent2.setPackage(c);
                        intent2.putExtra("position", 0);
                        intent2.putExtra("title", str2);
                        if (a.a(this.b, intent2)) {
                            startActivity(intent2);
                        } else {
                            Toast.makeText(this.b, "Unable to open MX Player or VLC... Do you have it installed?", 1).show();
                        }
                        str = "Stream";
                    }
                } else {
                    Intent intent3 = new Intent("android.intent.action.VIEW");
                    intent3.setDataAndType(Uri.parse(str), "video/*");
                    intent3.putExtra("title", str2);
                    intent3.putExtra("position", 0);
                    if (intent3.resolveActivity(getPackageManager()) != null) {
                        startActivity(intent3);
                        str = "Stream";
                    }
                }
                aud.b(this.b);
                str = "Stream";
            }
            aun.a(str);
        }
    }

    protected final void a(String str, String... strArr) {
        String c = c();
        if (c == null) {
            d();
            return;
        }
        String str2 = "%s/AnYme_photos/%s";
        Object[] objArr = new Object[2];
        objArr[0] = Environment.getExternalStorageDirectory().getAbsolutePath();
        if (str == null) {
            str = "AnimePics";
        }
        objArr[1] = str;
        str = String.format(str2, objArr);
        String a = bit.a((Object[]) strArr, "<line>");
        Intent intent = new Intent();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c);
        stringBuilder.append(".AEditor");
        intent.setClassName(c, stringBuilder.toString());
        intent.putExtra("com.dv.get.ACTION_LIST_ADD", a);
        intent.putExtra("com.dv.get.ACTION_LIST_PATH", str);
        intent.putExtra("com.dv.get.ACTION_LIST_OPEN", false);
        if (a.a(this.b, intent)) {
            runOnUiThread(new -$$Lambda$AbstractBrowser$hW_Vg8Kh5xj1KVgyIlyUslzJ9C0(this));
            startActivity(intent);
            return;
        }
        d();
    }

    public void onBackPressed() {
        if (this.c.canGoBack()) {
            this.c.goBack();
        } else {
            super.onBackPressed();
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d = this.b.getString(R.string.mobile_useragent);
        this.e = this.b.getString(R.string.google_video_url);
        this.r = aux.b("preference_key_toolbar_back_button", false);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_abstractbrowser, menu);
        new aul(this).a(menu, this.f, this.n);
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy() {
        super.onDestroy();
        WebView webView = this.c;
        if (webView != null) {
            webView.stopLoading();
            this.c.loadUrl("about:blank");
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onOptionsItemSelected(android.view.MenuItem r6) {
        /*
        r5 = this;
        r0 = r6.getItemId();
        r1 = 16908332; // 0x102002c float:2.3877352E-38 double:8.353826E-317;
        r2 = 1;
        if (r0 == r1) goto L_0x006e;
    L_0x000a:
        r1 = 0;
        switch(r0) {
            case 2131296337: goto L_0x0048;
            case 2131296338: goto L_0x0018;
            case 2131296339: goto L_0x0010;
            default: goto L_0x000e;
        };
    L_0x000e:
        goto L_0x0080;
    L_0x0010:
        r0 = r5.s;
        if (r0 == 0) goto L_0x0080;
    L_0x0014:
        r0.a();
        goto L_0x0080;
    L_0x0018:
        r0 = r5.b;
        r3 = "com.dv.adm.pay";
        r4 = "com.dv.adm";
        r3 = new java.lang.String[]{r3, r4};
        r0 = com.zunjae.zapplib.a.a(r0, r3);
        if (r0 != 0) goto L_0x002c;
    L_0x0028:
        r5.d();
        goto L_0x0080;
    L_0x002c:
        r0 = r5.f;
        r0 = r0 ^ r2;
        r5.f = r0;
        r0 = r5.f;
        if (r0 == 0) goto L_0x0043;
    L_0x0035:
        r0 = r5.b;
        r2 = "Downloader Mode Enabled!";
        r0 = android.widget.Toast.makeText(r0, r2, r1);
        r0.show();
        r5.n = r1;
        goto L_0x006a;
    L_0x0043:
        r0 = r5.b;
        r2 = "Downloader Mode Disabled!";
        goto L_0x0063;
    L_0x0048:
        r0 = r5.n;
        r0 = r0 ^ r2;
        r5.n = r0;
        r0 = r5.n;
        if (r0 == 0) goto L_0x005f;
    L_0x0051:
        r0 = r5.b;
        r2 = "Cast Mode Enabled!";
        r0 = android.widget.Toast.makeText(r0, r2, r1);
        r0.show();
        r5.f = r1;
        goto L_0x006a;
    L_0x005f:
        r0 = r5.b;
        r2 = "Cast Mode Disabled!";
    L_0x0063:
        r0 = android.widget.Toast.makeText(r0, r2, r1);
        r0.show();
    L_0x006a:
        r5.supportInvalidateOptionsMenu();
        goto L_0x0080;
    L_0x006e:
        r0 = r5.r;
        if (r0 == 0) goto L_0x0080;
    L_0x0072:
        r0 = r5.c;
        r0 = r0.canGoBack();
        if (r0 == 0) goto L_0x0080;
    L_0x007a:
        r6 = r5.c;
        r6.goBack();
        return r2;
    L_0x0080:
        r6 = super.onOptionsItemSelected(r6);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.activities.browsers.abtracts.AbstractBrowser.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    protected void onPause() {
        super.onPause();
        this.p = false;
        this.g = false;
    }

    protected void onResume() {
        super.onResume();
        this.p = true;
        new Handler().postDelayed(new -$$Lambda$AbstractBrowser$24Zse81Yh0tck_m7mO5Z92mMiOU(this), 2000);
    }

    protected void onStart() {
        super.onStart();
        if (this.s == null) {
            this.s = new auq(this.c, this);
        }
    }
}
