package com.zunjae.anyme.activities.browsers;

import android.os.Bundle;
import android.webkit.WebView;
import com.zunjae.anyme.activities.browsers.abtracts.AbstractAnimeBrowser;
import defpackage.anh;
import defpackage.ant;
import defpackage.anz;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class KissBrowser extends AbstractAnimeBrowser {
    private anz k = new anz();
    private final String l = "javascript: document.querySelector('[class=\"underline\"]').scrollIntoView()";
    private final String m = "javascript: document.querySelector('[data-value=\"%s\"]').click()";
    private final String n = "javascript: document.querySelector('[data-value=\"%s\"]').scrollIntoView()";
    private String o = BuildConfig.FLAVOR;
    private boolean p = false;

    public final void a(WebView webView) {
    }

    public final void b(WebView webView) {
        webView.setWebViewClient(new h());
        webView.setWebChromeClient(new k());
    }

    public final ant c() {
        return this.k;
    }

    public final boolean c(String str) {
        return str.contains("/m/anime/");
    }

    protected final ArrayList<anh> d() {
        ArrayList<anh> arrayList = new ArrayList();
        arrayList.add(new anh(null, anh.b("[id=\"btnClose\"]")));
        arrayList.add(new anh(null, anh.a("footer")));
        arrayList.add(new anh("&sort=search", "javascript: document.querySelector('[class=\"underline\"]').scrollIntoView()"));
        return arrayList;
    }

    public final boolean d(String str) {
        return str.contains("/m/anime/");
    }

    public final void e(String str) {
    }

    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("hasClickedOnEpisodeUponStartup", this.p);
        bundle.putInt("lastEpisodeClickedNumber", this.h);
    }
}
