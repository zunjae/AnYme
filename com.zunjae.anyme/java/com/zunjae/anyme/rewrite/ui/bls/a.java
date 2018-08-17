package com.zunjae.anyme.rewrite.ui.bls;

import android.app.Activity;
import com.zunjae.anyme.rewrite.viewmodels.AnimeViewModel;
import com.zunjae.zasync.c;

final class a extends c<Boolean> {
    final /* synthetic */ FragmentAnimeInfoBasicBL a;
    private final AnimeViewModel b;
    private final int c;

    a(FragmentAnimeInfoBasicBL fragmentAnimeInfoBasicBL, Activity activity, AnimeViewModel animeViewModel, int i) {
        this.a = fragmentAnimeInfoBasicBL;
        super(activity);
        this.b = animeViewModel;
        this.c = i;
    }

    protected final /* synthetic */ void a(Object obj) {
        obj = (Boolean) obj;
        super.a(obj);
        if (obj == null) {
            this.a.g = false;
        } else {
            this.a.g = obj.booleanValue();
        }
    }

    public final /* synthetic */ Object b() {
        return Boolean.valueOf(this.b.g(this.c));
    }
}
