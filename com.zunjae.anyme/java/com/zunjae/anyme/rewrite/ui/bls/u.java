package com.zunjae.anyme.rewrite.ui.bls;

import android.view.View;
import defpackage.cr;

final class u extends cr {
    final /* synthetic */ FragmentAnimeInfoExtendedBL b;
    final /* synthetic */ FragmentAnimeInfoExtendedBL_ViewBinding c;

    u(FragmentAnimeInfoExtendedBL_ViewBinding fragmentAnimeInfoExtendedBL_ViewBinding, FragmentAnimeInfoExtendedBL fragmentAnimeInfoExtendedBL) {
        this.c = fragmentAnimeInfoExtendedBL_ViewBinding;
        this.b = fragmentAnimeInfoExtendedBL;
    }

    public final void a(View view) {
        this.b.onViewAllRelatedClicked();
    }
}
