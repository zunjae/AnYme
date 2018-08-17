package com.zunjae.anyme.adapters.animes;

import android.view.View;
import android.view.View.OnClickListener;
import com.zunjae.anyme.rewrite.activities.AnimeInfoActivityR2;
import defpackage.ama;
import defpackage.arn;

final class c implements OnClickListener {
    final /* synthetic */ ama a;
    final /* synthetic */ AnimeGenreAdapter b;

    c(AnimeGenreAdapter animeGenreAdapter, ama ama) {
        this.b = animeGenreAdapter;
        this.a = ama;
    }

    public final void onClick(View view) {
        this.b.a.startActivity(AnimeInfoActivityR2.a(this.b.a, new arn((long) this.a.c(), this.a.e(), this.a.f())));
    }
}
