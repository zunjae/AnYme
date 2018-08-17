package com.zunjae.anyme.adapters.animes;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import defpackage.ama;
import defpackage.aug;

final class b implements OnClickListener {
    final /* synthetic */ ama a;
    final /* synthetic */ AnimeGenreAdapter b;

    b(AnimeGenreAdapter animeGenreAdapter, ama ama) {
        this.b = animeGenreAdapter;
        this.a = ama;
    }

    public final void onClick(View view) {
        aug.a(this.b.a, this.a.e());
        Toast.makeText(this.b.a, "Title copied to your clipboard", 0).show();
    }
}
