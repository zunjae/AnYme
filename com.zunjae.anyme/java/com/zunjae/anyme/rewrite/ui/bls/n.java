package com.zunjae.anyme.rewrite.ui.bls;

import android.app.Activity;
import com.zunjae.zasync.c;
import defpackage.arh;
import defpackage.atk;
import java.util.List;

final class n extends c<List<arh>> {
    final /* synthetic */ FragmentAnimeInfoExtendedBL a;
    private final long b;

    n(FragmentAnimeInfoExtendedBL fragmentAnimeInfoExtendedBL, Activity activity, long j) {
        this.a = fragmentAnimeInfoExtendedBL;
        super(activity);
        this.b = j;
    }

    protected final /* synthetic */ void a(Object obj) {
        List list = (List) obj;
        super.a((Object) list);
        FragmentAnimeInfoExtendedBL.b(this.a, list);
    }

    public final /* synthetic */ Object b() {
        List b = atk.b(this.b);
        this.a.e.a(b, this.b);
        return b;
    }

    protected final boolean c() {
        return this.a.e.a(this.b);
    }

    protected final /* synthetic */ Object d() {
        return this.a.e.b(this.b);
    }
}
