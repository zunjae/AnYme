package com.zunjae.anyme.activities.explore;

import android.view.View;
import defpackage.cr;

final class c extends cr {
    final /* synthetic */ AdvancedAnimeSearch b;
    final /* synthetic */ AdvancedAnimeSearch_ViewBinding c;

    c(AdvancedAnimeSearch_ViewBinding advancedAnimeSearch_ViewBinding, AdvancedAnimeSearch advancedAnimeSearch) {
        this.c = advancedAnimeSearch_ViewBinding;
        this.b = advancedAnimeSearch;
    }

    public final void a(View view) {
        this.b.onSearchButtonClick();
    }
}
