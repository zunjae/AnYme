package com.zunjae.anyme.activities.explore;

import com.miguelcatalan.materialsearchview.h;

final class p implements h {
    final /* synthetic */ LocalAnimeSearchActivity a;

    p(LocalAnimeSearchActivity localAnimeSearchActivity) {
        this.a = localAnimeSearchActivity;
    }

    public final boolean a(String str) {
        this.a.searchView.setOnQueryTextListener(null);
        if (!(this.a.c == null || this.a.c.a() || str.length() < 3)) {
            this.a.c.onSearchForTextClicked();
        }
        return false;
    }

    public final boolean b(String str) {
        if (this.a.searchView.b() && this.a.c != null) {
            this.a.d = str;
            this.a.c.a(this.a.d, this.a.filterTV.isChecked(), this.a.filterMovies.isChecked(), this.a.filterOther.isChecked());
        }
        return false;
    }
}
