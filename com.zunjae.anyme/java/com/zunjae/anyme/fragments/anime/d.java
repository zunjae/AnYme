package com.zunjae.anyme.fragments.anime;

import android.view.View;
import defpackage.cr;

final class d extends cr {
    final /* synthetic */ FragmentAnimeDiscover b;
    final /* synthetic */ FragmentAnimeDiscover_ViewBinding c;

    d(FragmentAnimeDiscover_ViewBinding fragmentAnimeDiscover_ViewBinding, FragmentAnimeDiscover fragmentAnimeDiscover) {
        this.c = fragmentAnimeDiscover_ViewBinding;
        this.b = fragmentAnimeDiscover;
    }

    public final void a(View view) {
        this.b.onMoreInfoTopAiringAnimeClicked();
    }
}
