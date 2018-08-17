package com.zunjae.anyme.rewrite.activities;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class AnimeRecommendationsActivityR2_ViewBinding implements Unbinder {
    private AnimeRecommendationsActivityR2 b;

    public AnimeRecommendationsActivityR2_ViewBinding(AnimeRecommendationsActivityR2 animeRecommendationsActivityR2, View view) {
        this.b = animeRecommendationsActivityR2;
        animeRecommendationsActivityR2.toolbar = (Toolbar) ct.a(view, (int) R.id.toolbar, "field 'toolbar'", Toolbar.class);
        animeRecommendationsActivityR2.recyclerView = (RecyclerView) ct.a(view, (int) R.id.recyclerViewCharacters, "field 'recyclerView'", RecyclerView.class);
    }

    public final void a() {
        AnimeRecommendationsActivityR2 animeRecommendationsActivityR2 = this.b;
        if (animeRecommendationsActivityR2 != null) {
            this.b = null;
            animeRecommendationsActivityR2.toolbar = null;
            animeRecommendationsActivityR2.recyclerView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
