package com.zunjae.anyme.activities.browsers.light_browsers;

import android.view.View;
import com.afollestad.materialdialogs.u;
import defpackage.alc;
import defpackage.ali;
import java.util.ArrayList;

final class j implements u {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ f b;

    j(f fVar, ArrayList arrayList) {
        this.b = fVar;
        this.a = arrayList;
    }

    public final boolean onSelection(com.afollestad.materialdialogs.j jVar, View view, int i, CharSequence charSequence) {
        ali ali = (ali) this.a.get(i);
        if (jVar.e()) {
            alc.a(ali.a());
        }
        LightKissBrowser lightKissBrowser = this.b.a;
        new k(lightKissBrowser, lightKissBrowser, ali.b()).f();
        return true;
    }
}
