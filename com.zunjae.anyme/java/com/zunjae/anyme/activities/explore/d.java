package com.zunjae.anyme.activities.explore;

import android.view.View;
import defpackage.cr;

final class d extends cr {
    final /* synthetic */ BetterAdvancedSearchActivity b;
    final /* synthetic */ BetterAdvancedSearchActivity_ViewBinding c;

    d(BetterAdvancedSearchActivity_ViewBinding betterAdvancedSearchActivity_ViewBinding, BetterAdvancedSearchActivity betterAdvancedSearchActivity) {
        this.c = betterAdvancedSearchActivity_ViewBinding;
        this.b = betterAdvancedSearchActivity;
    }

    public final void a(View view) {
        this.b.onCardViewGenreClicked();
    }
}
