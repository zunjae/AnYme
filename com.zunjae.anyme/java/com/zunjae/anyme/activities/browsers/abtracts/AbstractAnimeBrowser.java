package com.zunjae.anyme.activities.browsers.abtracts;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.afollestad.materialdialogs.e;
import com.afollestad.materialdialogs.j;
import com.afollestad.materialdialogs.o;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.anyme.dialogs.CastDialog;
import com.zunjae.zapplib.a;
import defpackage.ajg;
import defpackage.alc;
import defpackage.anh;
import defpackage.ant;
import defpackage.are;
import defpackage.aud;
import defpackage.aul;
import defpackage.aun;
import defpackage.auq;
import defpackage.aux;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public abstract class AbstractAnimeBrowser extends AbstractActivity {
    private static final String k = "AbstractAnimeBrowser";
    private boolean A = false;
    protected WebView c;
    protected are d;
    protected Toolbar e;
    protected ProgressBar f;
    protected int g = 0;
    protected int h = -1;
    protected boolean i = false;
    protected boolean j = false;
    private final String l = "org.videolan.vlc";
    private final String m = "com.mxtech.videoplayer.ad";
    private final String n = "com.mxtech.videoplayer.pro";
    private boolean o = false;
    private ArrayList<anh> p = new ArrayList();
    private auq q;
    private CastDialog r;
    private Snackbar s;
    private Activity t;
    private int u = 0;
    private boolean v = false;
    private String w = BuildConfig.FLAVOR;
    private boolean x = false;
    private boolean y;
    private boolean z = false;

    public static Intent a(Context context, are are, Class cls, boolean z, boolean z2) {
        Intent intent = new Intent(context, cls);
        intent.putExtra("anime", are);
        intent.putExtra("castOnStartup", z);
        intent.putExtra("downloadOnStartup", z2);
        return intent;
    }

    private /* synthetic */ void a(Intent intent, j jVar, e eVar) {
        startActivity(intent);
    }

    @SuppressLint({"DefaultLocale"})
    private void a(are are, Toolbar toolbar) {
        String format;
        String str = BuildConfig.FLAVOR;
        if (are.f()) {
            str = "RW: ";
        }
        int i = this.h;
        int i2 = this.g;
        if (i > i2) {
            i -= i2;
        }
        if (this.h > 0) {
            format = String.format("%s(%d/%d) %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(are.j()), are.g()});
        } else {
            format = are.g();
        }
        WebView webView = this.c;
        if (webView != null) {
            webView.post(new a(this, toolbar, format));
        }
    }

    static /* synthetic */ void a(AbstractAnimeBrowser abstractAnimeBrowser, String str) {
        if (aux.b("KEY_ASK_FOR_PLAYBACK", false)) {
            Snackbar snackbar = abstractAnimeBrowser.s;
            if (snackbar != null && snackbar.isShown()) {
                abstractAnimeBrowser.s.dismiss();
            }
            abstractAnimeBrowser.s = Snackbar.make(abstractAnimeBrowser.findViewById(R.id.myCoordinatorLayout), Html.fromHtml("<font color=\"#ffffff\">Open in videoplayer app</font>"), -2).setAction("PLAY", new -$$Lambda$AbstractAnimeBrowser$qIqOeM1C2irhR3JPSHmbOscaX6Y(abstractAnimeBrowser, str)).setActionTextColor(ContextCompat.getColor(abstractAnimeBrowser.b, R.color.md_white_1000));
            abstractAnimeBrowser.s.show();
            return;
        }
        abstractAnimeBrowser.f(str);
    }

    private /* synthetic */ void a(String str, View view) {
        f(str);
    }

    private void b(int i) {
        Intent intent = new Intent();
        intent.putExtra("newEpisodeNumber", i);
        setResult(1, intent);
    }

    private void f(String str) {
        if (this.y) {
            runOnUiThread(new -$$Lambda$AbstractAnimeBrowser$-z7r3g4oTxOISkePaB92yitreIE(this));
            String valueOf;
            if (this.j) {
                if (this.o) {
                    if (this.h <= 0) {
                        valueOf = String.valueOf(new Date().getTime());
                    } else {
                        valueOf = String.format("%03d", new Object[]{Integer.valueOf(this.h)});
                    }
                    valueOf = String.format("%s AnYmeApp.com", new Object[]{valueOf});
                } else {
                    valueOf = h();
                }
                String b = a.b(this.t, "com.dv.adm.pay", "com.dv.adm");
                if (b != null) {
                    Intent intent;
                    valueOf = valueOf.concat(".mp4");
                    StringBuilder stringBuilder;
                    if (this.o) {
                        String format = String.format("%s/AnYme_videos/%s", new Object[]{Environment.getExternalStorageDirectory().getAbsolutePath(), this.d.J()});
                        str = String.format("%s<info>%s", new Object[]{str, valueOf});
                        intent = new Intent();
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(b);
                        stringBuilder.append(".AEditor");
                        intent.setClassName(b, stringBuilder.toString());
                        intent.putExtra("com.dv.get.ACTION_LIST_ADD", str);
                        intent.putExtra("com.dv.get.ACTION_LIST_PATH", format);
                        intent.putExtra("com.dv.get.ACTION_LIST_OPEN", false);
                    } else {
                        Intent intent2 = new Intent();
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(b);
                        stringBuilder.append(".AEditor");
                        intent2.setClassName(b, stringBuilder.toString());
                        intent2.putExtra("android.intent.extra.TEXT", str);
                        intent2.putExtra("com.android.extra.filename", valueOf);
                        intent = intent2;
                    }
                    if (a.a((Context) this, intent)) {
                        if (this.o) {
                            new o(this).a((CharSequence) "Confirmation").b(String.format("Should AnYme start downloading %s episode %d?", new Object[]{this.d.g(), Integer.valueOf(this.h)})).c((CharSequence) "Yes").e("No").a(new -$$Lambda$AbstractAnimeBrowser$LxOPTFAhcJ6tInQAnfFwdCWEHg0(this, intent)).l();
                        } else {
                            runOnUiThread(new -$$Lambda$AbstractAnimeBrowser$wFFyum77Douc7yw4TkSVdMreTSM(this));
                            startActivity(intent);
                        }
                        str = "Download";
                    }
                }
                l();
                str = "Download";
            } else if (this.A) {
                valueOf = h();
                CastDialog castDialog = this.r;
                if (castDialog == null || !castDialog.isVisible()) {
                    this.r = CastDialog.a(str, valueOf);
                    this.r.show(getSupportFragmentManager(), "CastDialog");
                }
                str = "Cast";
            } else {
                valueOf = h();
                if (aux.b(this.b.getResources().getString(R.string.preference_key_force_mx_player), false)) {
                    String b2 = a.b(this, "com.mxtech.videoplayer.pro", "com.mxtech.videoplayer.ad", "org.videolan.vlc");
                    if (b2 != null) {
                        Intent intent3 = new Intent("android.intent.action.VIEW");
                        intent3.setDataAndType(Uri.parse(str), "video/*");
                        intent3.setPackage(b2);
                        intent3.putExtra("position", this.u);
                        intent3.putExtra("title", valueOf);
                        if (a.a((Context) this, intent3)) {
                            startActivity(intent3);
                        } else {
                            Toast.makeText(this, "Unable to open MX Player or VLC... Do you have it installed?", 1).show();
                        }
                        str = "Stream";
                    }
                } else {
                    Intent intent4 = new Intent("android.intent.action.VIEW");
                    intent4.setDataAndType(Uri.parse(str), "video/*");
                    intent4.putExtra("title", valueOf);
                    intent4.putExtra("position", this.u);
                    if (intent4.resolveActivity(getPackageManager()) != null) {
                        startActivity(intent4);
                        str = "Stream";
                    }
                }
                k();
                str = "Stream";
            }
            aun.a(str);
        }
    }

    @SuppressLint({"DefaultLocale"})
    private String h() {
        if (this.h <= 0) {
            return this.d.g();
        }
        return String.format("%s (Episode %d) AnYmeApp.com.mp4", new Object[]{this.d.g(), Integer.valueOf(this.h)});
    }

    private void i() {
        if (aud.a(this.t)) {
            this.j ^= 1;
            if (this.j) {
                Toast.makeText(this.b, "Downloader Mode Enabled!", 0).show();
                this.A = false;
            } else {
                Toast.makeText(this.b, "Downloader Mode Disabled!", 0).show();
            }
            supportInvalidateOptionsMenu();
            return;
        }
        l();
    }

    private void j() {
        this.A ^= 1;
        if (this.A) {
            Toast.makeText(this.b, "Cast Mode Enabled!", 0).show();
            this.j = false;
        } else {
            Toast.makeText(this.b, "Cast Mode Disabled!", 0).show();
        }
        supportInvalidateOptionsMenu();
    }

    private void k() {
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
        r0 = new com.zunjae.anyme.activities.browsers.abtracts.-$$Lambda$AbstractAnimeBrowser$YN2DSh1tIvB9fFvzSrB3vS66ip4;
        r0.<init>(r3);
        r3.runOnUiThread(r0);
        r0 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r1 = "android.intent.action.VIEW";	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r2 = "market://details?id=com.mxtech.videoplayer.ad";	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r2 = android.net.Uri.parse(r2);	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r0.<init>(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r3.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x0019 }
        return;
    L_0x0019:
        r0 = new android.content.Intent;
        r1 = "android.intent.action.VIEW";
        r2 = "https://play.google.com/store/apps/details?id=com.mxtech.videoplayer.ad";
        r2 = android.net.Uri.parse(r2);
        r0.<init>(r1, r2);
        r3.startActivity(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.activities.browsers.abtracts.AbstractAnimeBrowser.k():void");
    }

    private void l() {
        runOnUiThread(new -$$Lambda$AbstractAnimeBrowser$gINeAbuK1p62ORqksKK9mNhPZ8Y(this));
        aud.b(this.t);
    }

    private /* synthetic */ void m() {
        Toast.makeText(this.b, "Please install ADM if you want to download files!", 1).show();
    }

    private /* synthetic */ void n() {
        Toast.makeText(this.b, "Please download MX Player to watch videos!", 1).show();
    }

    private /* synthetic */ void o() {
        this.y = false;
        new Handler().postDelayed(new -$$Lambda$AbstractAnimeBrowser$UAMicxKvvuARbtKpPmgFiAJr9t8(this), 1000);
    }

    private /* synthetic */ void p() {
        this.y = true;
    }

    private /* synthetic */ void q() {
        Toast.makeText(this.b, "Download will start in a moment", 0).show();
    }

    private /* synthetic */ void r() {
        this.i = true;
    }

    protected final void a(int i) {
        if (i > 0) {
            this.h = i;
            a(this.d, this.e);
        }
        if (!this.j) {
            b(i - this.g);
        }
    }

    public abstract void a(WebView webView);

    public abstract void b(WebView webView);

    public abstract ant c();

    protected void c(WebView webView) {
    }

    public abstract boolean c(String str);

    protected ArrayList<anh> d() {
        return new ArrayList();
    }

    protected void d(WebView webView) {
    }

    public abstract boolean d(String str);

    protected String e() {
        return "Mozilla/5.0 (Linux; U; Android 4.4.4; Nexus 5 Build/KTU84P) AppleWebkit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30";
    }

    public abstract void e(String str);

    protected HashMap<String, String> f() {
        return new HashMap();
    }

    protected final void g() {
        this.c.setWebChromeClient(new b(this));
        this.c.setWebViewClient(new c(this));
    }

    public void onBackPressed() {
        WebView webView = this.c;
        if (webView == null || !webView.canGoBack()) {
            super.onBackPressed();
        } else {
            this.c.goBack();
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_abstract_browser);
        this.t = this;
        if (bundle != null) {
            this.h = bundle.getInt("lastEpisodeClickedNumber", -1);
            this.d = (are) bundle.getParcelable("anime");
            this.w = bundle.getString("lastLoadedURL", BuildConfig.FLAVOR);
            this.x = bundle.getBoolean("hasClickedInitialEpisode", false);
            a(this.h);
        } else {
            this.d = (are) getIntent().getParcelableExtra("anime");
            boolean booleanExtra = getIntent().getBooleanExtra("castOnStartup", false);
            boolean booleanExtra2 = getIntent().getBooleanExtra("downloadOnStartup", false);
            if (booleanExtra) {
                if (booleanExtra2) {
                    throw new IllegalStateException("Cast and download can't be both turned on");
                }
            }
            if (booleanExtra) {
                j();
            } else if (booleanExtra2) {
                i();
            }
        }
        this.e = (Toolbar) findViewById(R.id.toolbar);
        this.f = (ProgressBar) findViewById(R.id.browserProgressBar);
        this.c = (WebView) findViewById(R.id.webView);
        this.u = alc.b(this.d.d());
        this.g = alc.a(this.d.d());
        this.z = aux.b("preference_key_toolbar_back_button", false);
        this.v = aux.b("KEY_SHOULD_INTERCEPT_RAPID_VIDEO", false);
        this.o = aux.b("preference_key_alternative_downloader2", false);
        this.p = d();
        WebSettings settings = this.c.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(e());
        b(this.c);
        if (this.w.equals(BuildConfig.FLAVOR)) {
            this.c.loadUrl(c().a(this.d.d(), this.d.g()), ajg.a());
        } else {
            this.c.loadUrl(this.w);
        }
        a(this.e, this.d.g());
        a(this.d, this.e);
        a(this.d.y());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_abstractbrowser, menu);
        new aul(this).a(menu, this.j, this.A);
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

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != 16908332) {
            switch (itemId) {
                case R.id.browser_cast /*2131296337*/:
                    j();
                    break;
                case R.id.browser_downloader /*2131296338*/:
                    i();
                    break;
                case R.id.browser_open_drawer /*2131296339*/:
                    auq auq = this.q;
                    if (auq != null) {
                        auq.a();
                        break;
                    }
                    break;
                default:
                    break;
            }
        } else if (this.z && this.c.canGoBack()) {
            this.c.goBack();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    protected void onPause() {
        super.onPause();
        this.y = false;
        this.i = false;
    }

    protected void onResume() {
        super.onResume();
        this.y = true;
        new Handler().postDelayed(new -$$Lambda$AbstractAnimeBrowser$zJFdxzyIAlqvS6fX8q9zOdaEbpk(this), 2000);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("lastEpisodeClickedNumber", this.h);
        bundle.putParcelable("anime", this.d);
        bundle.putString("lastLoadedURL", this.w);
    }

    protected void onStart() {
        super.onStart();
        if (this.q == null) {
            this.q = new auq(this.c, this);
        }
    }
}
