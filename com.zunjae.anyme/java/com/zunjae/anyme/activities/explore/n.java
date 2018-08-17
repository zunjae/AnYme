package com.zunjae.anyme.activities.explore;

import android.view.View;
import defpackage.cr;

final class n extends cr {
    final /* synthetic */ FastAnimeSearchActivity b;
    final /* synthetic */ FastAnimeSearchActivity_ViewBinding c;

    n(FastAnimeSearchActivity_ViewBinding fastAnimeSearchActivity_ViewBinding, FastAnimeSearchActivity fastAnimeSearchActivity) {
        this.c = fastAnimeSearchActivity_ViewBinding;
        this.b = fastAnimeSearchActivity;
    }

    public final void a(View view) {
        this.b.showDialogFilteredResults();
    }
}
