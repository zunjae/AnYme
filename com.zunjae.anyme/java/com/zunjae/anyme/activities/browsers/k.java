package com.zunjae.anyme.activities.browsers;

import android.webkit.JsResult;
import android.webkit.WebView;
import com.zunjae.anyme.activities.browsers.abtracts.b;
import defpackage.anz;
import java.util.Iterator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

final class k extends b {
    final /* synthetic */ KissBrowser a;
    private final String c;

    private k(KissBrowser kissBrowser) {
        this.a = kissBrowser;
        super(kissBrowser);
        this.c = "KissChromeClient";
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        jsResult.confirm();
        if (str2.contains("<AnYme>handle_scroll_to_episode</AnYme>") && !str2.contains("jschl-answer")) {
            int u;
            int v;
            if (this.a.h > 0) {
                u = this.a.h;
                v = this.a.g;
            } else if (this.a.d.f()) {
                u = this.a.d.s();
                v = this.a.g;
            } else {
                u = this.a.d.o();
                v = this.a.g;
            }
            if (anz.b(str2, u + v) != null) {
                String str3;
                if (!this.a.p) {
                    this.a.c.loadUrl(String.format("javascript: document.querySelector('[data-value=\"%s\"]').click()", new Object[]{str3}));
                    this.a.p = true;
                }
                this.a.c.loadUrl(String.format("javascript: document.querySelector('[data-value=\"%s\"]').scrollIntoView()", new Object[]{str3}));
                if (this.a.d.o() >= 5) {
                    WebView q;
                    Object[] objArr;
                    str3 = "javascript: window.scrollBy(0, %d);";
                    if (this.a.getResources().getConfiguration().orientation == 1) {
                        q = this.a.c;
                        objArr = new Object[]{Integer.valueOf(-200)};
                    } else {
                        q = this.a.c;
                        objArr = new Object[]{Integer.valueOf(-100)};
                    }
                    q.loadUrl(String.format(str3, objArr));
                }
            }
        }
        if (str2.contains("<AnYme>handle_episode_number</AnYme>")) {
            this.a.a(anz.b(str2));
        }
        if (str2.contains("<AnYme>handle_episode_download</AnYme>")) {
            Element element;
            String str4;
            Object obj;
            KissBrowser kissBrowser = this.a;
            Iterator it = Jsoup.parse(str2).select("div[class=subEpisode]").iterator();
            do {
                str4 = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                element = (Element) it.next();
            } while (!element.attr("style").contains("block;"));
            obj = element.attr("data-sub");
            if (obj != null) {
                Iterator it2 = Jsoup.parse(str2).select("div[class=episode]").iterator();
                while (it2.hasNext()) {
                    element = (Element) it2.next();
                    if (element.attr("data-value").equals(obj)) {
                        str4 = element.html();
                        break;
                    }
                }
            }
            kissBrowser.o = str4;
            this.a.o;
        }
        return true;
    }
}
