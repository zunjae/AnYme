package com.zunjae.anyme.adapters.animes;

import android.view.View;
import android.view.View.OnClickListener;
import com.zunjae.anyme.activities.browsers.BasicWebViewBrowser;
import defpackage.ame;

final class e implements OnClickListener {
    final /* synthetic */ ame a;
    final /* synthetic */ AnimeNewsArticleAdapter b;

    e(AnimeNewsArticleAdapter animeNewsArticleAdapter, ame ame) {
        this.b = animeNewsArticleAdapter;
        this.a = ame;
    }

    public final void onClick(View view) {
        this.b.b.startActivity(BasicWebViewBrowser.a(this.b.b, this.a.e()));
    }
}
