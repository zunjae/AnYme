package com.zunjae.anyme.rewrite.ui.fragments;

import android.view.View;
import defpackage.cr;

final class e extends cr {
    final /* synthetic */ FragmentAnimeListR2 b;
    final /* synthetic */ FragmentAnimeListR2_ViewBinding c;

    e(FragmentAnimeListR2_ViewBinding fragmentAnimeListR2_ViewBinding, FragmentAnimeListR2 fragmentAnimeListR2) {
        this.c = fragmentAnimeListR2_ViewBinding;
        this.b = fragmentAnimeListR2;
    }

    public final void a(View view) {
        this.b.onFindSeasonalAnimeClicked();
    }
}
