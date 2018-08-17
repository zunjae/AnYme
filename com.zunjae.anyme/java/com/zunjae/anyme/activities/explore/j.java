package com.zunjae.anyme.activities.explore;

import android.widget.Toast;
import com.miguelcatalan.materialsearchview.h;
import defpackage.aun;

final class j implements h {
    final /* synthetic */ FastAnimeSearchActivity a;

    j(FastAnimeSearchActivity fastAnimeSearchActivity) {
        this.a = fastAnimeSearchActivity;
    }

    public final boolean a(String str) {
        if (str.isEmpty()) {
            Toast.makeText(this.a.b, "Please enter something...", 0).show();
        } else {
            FastAnimeSearchActivity fastAnimeSearchActivity = this.a;
            new l(fastAnimeSearchActivity, fastAnimeSearchActivity.i, str).f();
            this.a.toolbar.setSubtitle("Search results for ".concat(String.valueOf(str)));
            aun.b(str);
        }
        return false;
    }

    public final boolean b(String str) {
        return false;
    }
}
