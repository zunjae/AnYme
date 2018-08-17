package com.zunjae.anyme.adapters.animes;

import android.view.View;
import android.view.View.OnClickListener;
import com.zunjae.anyme.activities.explore.GenreSearchActivity;
import defpackage.aml;

final class d implements OnClickListener {
    final /* synthetic */ aml a;
    final /* synthetic */ AnimeGenreTitlesAdapter b;

    d(AnimeGenreTitlesAdapter animeGenreTitlesAdapter, aml aml) {
        this.b = animeGenreTitlesAdapter;
        this.a = aml;
    }

    public final void onClick(View view) {
        this.b.a.startActivity(GenreSearchActivity.a(this.b.a, this.a));
    }
}
