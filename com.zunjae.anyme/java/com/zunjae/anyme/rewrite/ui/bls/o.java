package com.zunjae.anyme.rewrite.ui.bls;

import android.app.Activity;
import com.zunjae.anyme.rewrite.viewmodels.AnimeViewModel;
import com.zunjae.zasync.c;
import defpackage.asm;
import defpackage.atk;
import java.util.List;

final class o extends c<List<asm>> {
    final /* synthetic */ FragmentAnimeInfoExtendedBL a;
    private final long b;
    private final AnimeViewModel c;

    o(FragmentAnimeInfoExtendedBL fragmentAnimeInfoExtendedBL, Activity activity, long j, AnimeViewModel animeViewModel) {
        this.a = fragmentAnimeInfoExtendedBL;
        super(activity);
        this.b = j;
        this.c = animeViewModel;
    }

    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        List list = (List) obj;
        super.a((Object) list);
        FragmentAnimeInfoExtendedBL.a(this.a, list);
    }

    public final /* synthetic */ Object b() {
        this.c.a().b(atk.a(this.a.c.c()));
        return this.c.a().g(this.b);
    }

    protected final boolean c() {
        return this.c.c(this.b);
    }

    protected final /* synthetic */ Object d() {
        return this.c.a().g(this.b);
    }
}
