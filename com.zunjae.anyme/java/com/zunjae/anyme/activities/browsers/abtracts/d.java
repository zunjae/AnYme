package com.zunjae.anyme.activities.browsers.abtracts;

import android.app.Activity;
import android.view.View;
import android.widget.Toast;
import com.afollestad.materialdialogs.j;
import com.afollestad.materialdialogs.o;
import com.zunjae.zasync.c;
import defpackage.ajs;
import defpackage.alc;
import defpackage.ali;
import defpackage.auh;
import defpackage.aux;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

final class d extends c<ArrayList<ali>> {
    final /* synthetic */ AbstractAnimeBrowser a;
    private j b;
    private final String c;

    d(AbstractAnimeBrowser abstractAnimeBrowser, Activity activity, String str) {
        this.a = abstractAnimeBrowser;
        super(activity);
        this.c = str;
    }

    private void a(ArrayList<ali> arrayList, boolean z) {
        o a = new o(this.a).a((CharSequence) "Pick A Quality").c().i().a((Collection) arrayList).a(new -$$Lambda$d$hfulhO-J0E0pptoXgH0Ep7wC2iY(this, arrayList));
        if (z) {
            a.f();
            a.b((CharSequence) "You can change this in the settings");
        }
        a.l();
    }

    private /* synthetic */ boolean a(ArrayList arrayList, j jVar, View view, int i, CharSequence charSequence) {
        ali ali = (ali) arrayList.get(i);
        if (jVar.e()) {
            alc.a(ali.a());
        }
        AbstractAnimeBrowser abstractAnimeBrowser = this.a;
        new e(abstractAnimeBrowser, abstractAnimeBrowser.t, ali.b()).f();
        return true;
    }

    private /* synthetic */ void g() {
        Toast.makeText(this.a.b, "No videos found for this anime...", 1).show();
    }

    private /* synthetic */ void h() {
        Toast.makeText(this.a.b, "Could not connect to RapidVideo...", 1).show();
    }

    private /* synthetic */ void i() {
        this.b = new o(this.a).a((CharSequence) "Searching").b((CharSequence) "Searching for all available video qualities~").g().l();
    }

    protected final void a() {
        super.a();
        this.a.runOnUiThread(new -$$Lambda$d$4kPNBrVo-Vptxy0XQAqaYXufN7g(this));
    }

    protected final /* synthetic */ void a(Object obj) {
        obj = (ArrayList) obj;
        super.a(obj);
        j jVar = this.b;
        if (jVar != null) {
            jVar.dismiss();
        }
        if (obj == null) {
            this.a.runOnUiThread(new -$$Lambda$d$Uqhaj15W8ENDvHQ24DtOM9oNc60(this));
        } else if (obj.size() == 0) {
            this.a.runOnUiThread(new -$$Lambda$d$XrgvaF5nefHb56EUi1OJZSzQQkw(this));
        } else if (auh.a(this.a.b)) {
            a(obj, false);
        } else {
            String b = aux.b("KEY_QUALITY_SELECTOR_PREFERRED", null);
            if (b != null) {
                Iterator it = obj.iterator();
                while (it.hasNext()) {
                    ali ali = (ali) it.next();
                    if (ali.a().equalsIgnoreCase(b)) {
                        AbstractAnimeBrowser abstractAnimeBrowser = this.a;
                        new e(abstractAnimeBrowser, abstractAnimeBrowser.t, ali.b()).f();
                        return;
                    }
                }
            }
            a(obj, true);
        }
    }

    public final /* synthetic */ Object b() {
        return ajs.a(this.c, this.a.w);
    }
}
