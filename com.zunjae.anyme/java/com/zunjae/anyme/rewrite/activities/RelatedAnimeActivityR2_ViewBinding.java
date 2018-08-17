package com.zunjae.anyme.rewrite.activities;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class RelatedAnimeActivityR2_ViewBinding implements Unbinder {
    private RelatedAnimeActivityR2 b;

    public RelatedAnimeActivityR2_ViewBinding(RelatedAnimeActivityR2 relatedAnimeActivityR2, View view) {
        this.b = relatedAnimeActivityR2;
        relatedAnimeActivityR2.toolbar = (Toolbar) ct.a(view, (int) R.id.toolbar, "field 'toolbar'", Toolbar.class);
        relatedAnimeActivityR2.recyclerView = (RecyclerView) ct.a(view, (int) R.id.recyclerViewCharacters, "field 'recyclerView'", RecyclerView.class);
    }

    public final void a() {
        RelatedAnimeActivityR2 relatedAnimeActivityR2 = this.b;
        if (relatedAnimeActivityR2 != null) {
            this.b = null;
            relatedAnimeActivityR2.toolbar = null;
            relatedAnimeActivityR2.recyclerView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
