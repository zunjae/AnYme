package com.zunjae.anyme.fragments.anime;

import android.app.Activity;
import com.zunjae.zasync.c;
import defpackage.ajp;
import defpackage.ama;
import java.util.ArrayList;

final class h extends c<ArrayList<ama>> {
    final /* synthetic */ FragmentAnimeGenre a;

    h(FragmentAnimeGenre fragmentAnimeGenre, Activity activity) {
        this.a = fragmentAnimeGenre;
        super(activity);
    }

    protected final void a() {
        super.a();
        this.a.swipeRefreshLayout.setRefreshing(true);
    }

    protected final /* synthetic */ void a(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        super.a((Object) arrayList);
        this.a.swipeRefreshLayout.setRefreshing(false);
        FragmentAnimeGenre.a(this.a, arrayList);
    }

    public final /* synthetic */ Object b() {
        return ajp.a(this.a.a, this.a.b);
    }
}
