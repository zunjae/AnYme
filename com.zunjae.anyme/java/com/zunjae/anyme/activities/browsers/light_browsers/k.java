package com.zunjae.anyme.activities.browsers.light_browsers;

import android.app.Activity;
import com.afollestad.materialdialogs.j;
import com.afollestad.materialdialogs.o;
import com.zunjae.zasync.c;
import defpackage.ajf;
import defpackage.ajs;

final class k extends c<String> {
    final /* synthetic */ LightKissBrowser a;
    private j b;
    private final String c;

    k(LightKissBrowser lightKissBrowser, Activity activity, String str) {
        this.a = lightKissBrowser;
        super(activity);
        this.c = str;
    }

    protected final void a() {
        super.a();
        this.b = new o(this.a).a((CharSequence) "Searching").b((CharSequence) "Searching for the .MP4 url~").g().l();
    }

    protected final /* synthetic */ void a(Object obj) {
        obj = (String) obj;
        super.a(obj);
        j jVar = this.b;
        if (jVar != null) {
            jVar.dismiss();
        }
        if (obj == null || !ajf.a(obj)) {
            this.a.runOnUiThread(new l(this));
            return;
        }
        LightKissBrowser lightKissBrowser = this.a;
        lightKissBrowser.a((String) obj, lightKissBrowser.n);
    }

    public final /* synthetic */ Object b() {
        return ajs.b(this.c, this.a.o);
    }
}
