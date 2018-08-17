package com.zunjae.anyme.activities.browsers.light_browsers;

import android.annotation.SuppressLint;
import com.zunjae.anyme.activities.browsers.abtracts.AbstractLightBrowser;
import defpackage.aiv;
import defpackage.ajg;
import defpackage.amv;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class LightKissBrowser extends AbstractLightBrowser {
    private final String k = getClass().getName();
    private final String l = "kissanime.ru/";
    private final String m = "<AnYme>handle_save_to_history</AnYme>";
    private String n = BuildConfig.FLAVOR;
    private String o = BuildConfig.FLAVOR;

    public static String e() {
        return "http://kissanime.ru/m/";
    }

    public final String c() {
        return "KissAnimeVideoHistoriesV2";
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    protected final void d() {
        super.d();
        this.c.setWebViewClient(new d());
        this.c.setWebChromeClient(new e());
        this.c.loadUrl("http://kissanime.ru/m/", ajg.a());
    }

    @aiv
    public final void listenToHistoryItemClick(amv amv) {
        String c = amv.a().c();
        this.c.stopLoading();
        this.c.loadUrl(c, ajg.a());
    }
}
