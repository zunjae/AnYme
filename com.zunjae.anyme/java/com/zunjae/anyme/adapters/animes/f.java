package com.zunjae.anyme.adapters.animes;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import defpackage.aly;

final class f implements OnClickListener {
    final /* synthetic */ aly a;
    final /* synthetic */ AnimeVideoAdapter b;

    f(AnimeVideoAdapter animeVideoAdapter, aly aly) {
        this.b = animeVideoAdapter;
        this.a = aly;
    }

    public final void onClick(View view) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.a.c()));
        intent.setFlags(268435456);
        this.b.b.startActivity(intent);
    }
}
