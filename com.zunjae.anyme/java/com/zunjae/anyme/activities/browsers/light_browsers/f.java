package com.zunjae.anyme.activities.browsers.light_browsers;

import android.app.Activity;
import com.afollestad.materialdialogs.j;
import com.afollestad.materialdialogs.o;
import com.zunjae.zasync.c;
import defpackage.ajs;
import defpackage.ali;
import defpackage.auh;
import defpackage.aux;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

final class f extends c<ArrayList<ali>> {
    final /* synthetic */ LightKissBrowser a;
    private j b;
    private final String c;

    f(LightKissBrowser lightKissBrowser, Activity activity, String str) {
        this.a = lightKissBrowser;
        super(activity);
        this.c = str;
    }

    private void a(ArrayList<ali> arrayList, boolean z) {
        o a = new o(this.a).a((CharSequence) "Pick A Quality").c().i().a((Collection) arrayList).a(new j(this, arrayList));
        if (z) {
            a.f();
            a.b((CharSequence) "You can change this in the settings");
        }
        a.l();
    }

    protected final void a() {
        super.a();
        this.a.runOnUiThread(new g(this));
    }

    protected final /* synthetic */ void a(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        super.a((Object) arrayList);
        j jVar = this.b;
        if (jVar != null) {
            jVar.dismiss();
        }
        if (arrayList == null) {
            this.a.runOnUiThread(new h(this));
        } else if (arrayList.size() == 0) {
            this.a.runOnUiThread(new i(this));
        } else if (auh.a(this.a.b)) {
            a(arrayList, false);
        } else {
            String b = aux.b("KEY_QUALITY_SELECTOR_PREFERRED", null);
            if (b != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ali ali = (ali) it.next();
                    if (ali.a().equalsIgnoreCase(b)) {
                        LightKissBrowser lightKissBrowser = this.a;
                        new k(lightKissBrowser, lightKissBrowser, ali.b()).f();
                        return;
                    }
                }
            }
            a(arrayList, true);
        }
    }

    public final /* synthetic */ Object b() {
        return ajs.a(this.c, this.a.o);
    }
}
