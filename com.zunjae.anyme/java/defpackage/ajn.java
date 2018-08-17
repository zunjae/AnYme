package defpackage;

import com.afollestad.materialdialogs.s;
import com.zunjae.anyme.activities.AbstractActivity;
import java.util.ArrayList;

final class ajn implements s {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ AbstractActivity b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;

    ajn(ArrayList arrayList, AbstractActivity abstractActivity, String str, String str2, String str3) {
        this.a = arrayList;
        this.b = abstractActivity;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSelection(com.afollestad.materialdialogs.j r3, android.view.View r4, int r5, java.lang.CharSequence r6) {
        /*
        r2 = this;
        r3 = r2.a;
        r3 = r3.get(r5);
        r3 = (java.lang.String) r3;
        r4 = r3.hashCode();
        r5 = 2;
        r6 = 1;
        r0 = 0;
        switch(r4) {
            case -1768560323: goto L_0x004f;
            case -1631190823: goto L_0x0045;
            case -381756651: goto L_0x003b;
            case -104618298: goto L_0x0031;
            case -45095361: goto L_0x0027;
            case 233818479: goto L_0x001d;
            case 464359121: goto L_0x0013;
            default: goto L_0x0012;
        };
    L_0x0012:
        goto L_0x0059;
    L_0x0013:
        r4 = "Wallpapers";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0059;
    L_0x001b:
        r3 = 4;
        goto L_0x005a;
    L_0x001d:
        r4 = "Google Search";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0059;
    L_0x0025:
        r3 = 1;
        goto L_0x005a;
    L_0x0027:
        r4 = "Google Images";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0059;
    L_0x002f:
        r3 = 2;
        goto L_0x005a;
    L_0x0031:
        r4 = "MyAnimeList";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0059;
    L_0x0039:
        r3 = 0;
        goto L_0x005a;
    L_0x003b:
        r4 = "YouTube Videos";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0059;
    L_0x0043:
        r3 = 5;
        goto L_0x005a;
    L_0x0045:
        r4 = "NHentai";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0059;
    L_0x004d:
        r3 = 6;
        goto L_0x005a;
    L_0x004f:
        r4 = "Cosplay Images";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0059;
    L_0x0057:
        r3 = 3;
        goto L_0x005a;
    L_0x0059:
        r3 = -1;
    L_0x005a:
        switch(r3) {
            case 0: goto L_0x00e1;
            case 1: goto L_0x00cb;
            case 2: goto L_0x00b5;
            case 3: goto L_0x00a3;
            case 4: goto L_0x0091;
            case 5: goto L_0x007b;
            case 6: goto L_0x005f;
            default: goto L_0x005d;
        };
    L_0x005d:
        goto L_0x00ec;
    L_0x005f:
        r3 = new java.lang.StringBuilder;
        r4 = "https://nhentai.net/search/?q=";
        r3.<init>(r4);
        r4 = r2.d;
        r3.append(r4);
        r3 = r3.toString();
        r4 = r2.b;
        r3 = com.zunjae.anyme.activities.browsers.BasicWebViewBrowser.a(r4, r3);
        r4 = r2.b;
        r4.startActivity(r3);
        goto L_0x00ec;
    L_0x007b:
        r3 = r2.b;
        r4 = "https://www.youtube.com/results?search_query=%s+%s";
        r5 = new java.lang.Object[r5];
        r1 = r2.d;
        r5[r0] = r1;
        r0 = r2.e;
        r5[r6] = r0;
        r4 = java.lang.String.format(r4, r5);
        r3.a(r4);
        return;
    L_0x0091:
        r3 = r2.b;
        r4 = "https://www.google.com/search?q=%s+wallpaper&tbm=isch&source=lnt&tbs=isz:lt,islt:2mp";
        r5 = new java.lang.Object[r6];
        r6 = r2.d;
        r5[r0] = r6;
        r4 = java.lang.String.format(r4, r5);
        r3.a(r4);
        return;
    L_0x00a3:
        r3 = r2.b;
        r4 = "https://www.google.com/search?q=%s+cosplay&source=lnms&tbm=isch";
        r5 = new java.lang.Object[r6];
        r6 = r2.d;
        r5[r0] = r6;
        r4 = java.lang.String.format(r4, r5);
        r3.a(r4);
        return;
    L_0x00b5:
        r3 = r2.b;
        r4 = "https://www.google.com/search?q=%s+%s&dcr=0&source=lnms&tbm=isch";
        r5 = new java.lang.Object[r5];
        r1 = r2.d;
        r5[r0] = r1;
        r0 = r2.e;
        r5[r6] = r0;
        r4 = java.lang.String.format(r4, r5);
        r3.a(r4);
        return;
    L_0x00cb:
        r3 = r2.b;
        r4 = "https://www.google.com/search?q=%s+%s";
        r5 = new java.lang.Object[r5];
        r1 = r2.d;
        r5[r0] = r1;
        r0 = r2.e;
        r5[r6] = r0;
        r4 = java.lang.String.format(r4, r5);
        r3.a(r4);
        return;
    L_0x00e1:
        r3 = r2.b;
        r4 = r2.c;
        r4 = com.zunjae.anyme.activities.browsers.BasicWebViewBrowser.a(r3, r4);
        r3.startActivity(r4);
    L_0x00ec:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: ajn.onSelection(com.afollestad.materialdialogs.j, android.view.View, int, java.lang.CharSequence):void");
    }
}
