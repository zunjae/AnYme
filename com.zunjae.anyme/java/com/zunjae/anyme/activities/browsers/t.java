package com.zunjae.anyme.activities.browsers;

import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import defpackage.ajg;
import defpackage.ans;
import defpackage.bit;
import java.util.ArrayList;
import java.util.Iterator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

final class t extends WebChromeClient {
    final /* synthetic */ ZeroChanBrowser a;

    private t(ZeroChanBrowser zeroChanBrowser) {
        this.a = zeroChanBrowser;
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        jsResult.cancel();
        if (str2.contains("<AnYme>handle_get_images</AnYme>")) {
            ArrayList a;
            if (!this.a.l) {
                a = ans.a(str2);
            } else if (bit.b(str2)) {
                a = null;
            } else {
                Elements select = Jsoup.parse(str2).select("img[src~=^https:\\/\\/s1\\.zerochan\\..+$]");
                ArrayList arrayList = new ArrayList();
                Iterator it = select.iterator();
                while (it.hasNext()) {
                    Element element = (Element) it.next();
                    String[] split = element.attr("src").split("/");
                    Object obj = split[split.length - 1].split("\\.")[0];
                    String replaceAll = element.attr("alt").replaceAll(" ", "+");
                    arrayList.add(String.format("https://static.zerochan.net/%s.full.%s.jpg", new Object[]{replaceAll, obj}));
                }
                a = arrayList;
            }
            if (a != null) {
                String[] strArr = (String[]) a.toArray(new String[a.size()]);
                if (this.a.m) {
                    ZeroChanBrowser zeroChanBrowser = this.a;
                    zeroChanBrowser.a(zeroChanBrowser.o.J(), strArr);
                } else {
                    this.a.a("Anime Photos", strArr);
                }
            }
        }
        return true;
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        jsResult.cancel();
        return true;
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        jsPromptResult.cancel();
        return true;
    }

    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        ajg.a(i, this.a.progressBar);
    }
}
