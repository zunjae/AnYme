package com.zunjae.anyme.activities.explore;

import android.support.v7.widget.Toolbar;
import com.miguelcatalan.materialsearchview.k;
import defpackage.bit;

final class o implements k {
    final /* synthetic */ LocalAnimeSearchActivity a;

    o(LocalAnimeSearchActivity localAnimeSearchActivity) {
        this.a = localAnimeSearchActivity;
    }

    public final void a() {
        this.a.d();
        LocalAnimeSearchActivity localAnimeSearchActivity = this.a;
        localAnimeSearchActivity.searchView.a(localAnimeSearchActivity.d, false);
    }

    public final void b() {
        LocalAnimeSearchActivity localAnimeSearchActivity = this.a;
        if (localAnimeSearchActivity.toolbar != null) {
            if (bit.b(localAnimeSearchActivity.d)) {
                this.a.toolbar.setSubtitle(null);
                return;
            }
            Toolbar toolbar = this.a.toolbar;
            StringBuilder stringBuilder = new StringBuilder("Searching for \"");
            stringBuilder.append(this.a.d);
            stringBuilder.append("\"");
            toolbar.setSubtitle(stringBuilder.toString());
        }
    }
}
