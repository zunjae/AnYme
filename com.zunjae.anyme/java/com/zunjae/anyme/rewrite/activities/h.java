package com.zunjae.anyme.rewrite.activities;

import android.app.Activity;
import android.support.design.widget.Snackbar;
import android.text.Html;
import com.zunjae.anyme.R;
import com.zunjae.zasync.c;
import defpackage.anq;
import defpackage.are;
import defpackage.atj;
import java.util.ArrayList;

final class h extends c<ArrayList<are>> {
    final /* synthetic */ MainActivityR2 a;

    h(MainActivityR2 mainActivityR2, Activity activity) {
        this.a = mainActivityR2;
        super(activity);
    }

    protected final void a() {
        super.a();
        if (!(this.a.d == null || this.a.d.isShown())) {
            this.a.d.dismiss();
        }
        MainActivityR2 mainActivityR2 = this.a;
        mainActivityR2.d = Snackbar.make(mainActivityR2.findViewById(R.id.myCoordinator), Html.fromHtml("<font color=\"#ffffff\">Refreshing your profile ~</font>"), -2);
        this.a.d.show();
    }

    protected final /* synthetic */ void a(Object obj) {
        obj = (ArrayList) obj;
        super.a(obj);
        if (this.a.d != null) {
            this.a.d.dismiss();
        }
        if (obj != null) {
            this.a.f.b().a(this.a.e);
        }
    }

    public final /* synthetic */ Object b() {
        ArrayList a = atj.a(anq.c().a());
        this.a.e.a(a);
        return a;
    }
}
