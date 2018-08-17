package com.zunjae.anyme.activities.explore;

import com.greenfrvr.hashtagview.f;
import defpackage.aml;

final class b implements f<aml> {
    final /* synthetic */ AdvancedAnimeSearch a;

    b(AdvancedAnimeSearch advancedAnimeSearch) {
        this.a = advancedAnimeSearch;
    }

    public final /* synthetic */ boolean a(Object obj) {
        return this.a.e == null ? false : this.a.e.contains(Integer.valueOf(((aml) obj).b()));
    }
}
