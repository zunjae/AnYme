package com.zunjae.anyme.activities;

import android.app.Activity;
import com.afollestad.materialdialogs.j;
import com.afollestad.materialdialogs.o;
import com.zunjae.zasync.c;
import defpackage.ajr;
import defpackage.alg;
import defpackage.aln;

final class a extends c<alg> {
    final /* synthetic */ LoginActivity a;
    private j b;
    private final aln c;

    a(LoginActivity loginActivity, Activity activity, aln aln) {
        this.a = loginActivity;
        super(activity);
        this.c = aln;
    }

    protected final void a() {
        super.a();
        this.b = new o(this.a).a((CharSequence) "Loading").b((CharSequence) "Please wait").g().l();
        this.b.setCanceledOnTouchOutside(false);
    }

    protected final /* synthetic */ void a(Object obj) {
        obj = (alg) obj;
        super.a(obj);
        j jVar = this.b;
        if (jVar != null) {
            jVar.dismiss();
        }
        if (obj == null) {
            new o(this.a).a((CharSequence) "Error").b((CharSequence) "Could not connect to MyAnimeList. Please check your mobile data. MyAnimeList could also be down.").c((CharSequence) "Ok").l();
            return;
        }
        switch (obj.a()) {
            case 200:
            case 201:
                this.a.a(this.c);
                return;
            default:
                new o(this.a).a((CharSequence) String.format("Error (%d)", new Object[]{Integer.valueOf(obj.a())})).b((CharSequence) String.format("%s\n\nContact /u/zunjae on Reddit if you need help", new Object[]{obj.b()})).c((CharSequence) "Ok").l();
                return;
        }
    }

    public final /* synthetic */ Object b() {
        return ajr.a(this.c);
    }
}
