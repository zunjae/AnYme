package com.zunjae.anyme.activities.browsers.abtracts;

import android.app.Activity;
import com.afollestad.materialdialogs.j;
import com.afollestad.materialdialogs.o;
import com.zunjae.zasync.c;
import defpackage.ajf;
import defpackage.ajs;

final class e extends c<String> {
    final /* synthetic */ AbstractAnimeBrowser a;
    private j b;
    private final String c;

    e(AbstractAnimeBrowser abstractAnimeBrowser, Activity activity, String str) {
        this.a = abstractAnimeBrowser;
        super(activity);
        this.c = str;
    }

    protected final void a() {
        super.a();
        this.b = new o(this.a).a((CharSequence) "Searching").b((CharSequence) "Searching for the .MP4 url~").g().l();
    }

    protected final /* synthetic */ void a(Object obj) {
        String str = (String) obj;
        super.a((Object) str);
        j jVar = this.b;
        if (jVar != null) {
            jVar.dismiss();
        }
        if (str == null || !ajf.a(str)) {
            this.a.runOnUiThread(new f(this));
        } else {
            AbstractAnimeBrowser.a(this.a, str);
        }
    }

    public final /* synthetic */ Object b() {
        return ajs.b(this.c, this.a.w);
    }
}
