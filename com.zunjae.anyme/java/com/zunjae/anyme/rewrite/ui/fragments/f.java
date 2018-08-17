package com.zunjae.anyme.rewrite.ui.fragments;

import android.app.Activity;
import com.zunjae.zasync.c;
import defpackage.aso;
import defpackage.ata;
import java.util.ArrayList;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

final class f extends c<ArrayList<aso>> {
    final /* synthetic */ FragmentEpisodeNotesR2 a;

    f(FragmentEpisodeNotesR2 fragmentEpisodeNotesR2, Activity activity) {
        this.a = fragmentEpisodeNotesR2;
        super(activity);
    }

    private static aso a(List<aso> list, int i) {
        if (list == null) {
            return null;
        }
        for (aso aso : list) {
            if (aso.a() == i) {
                return aso;
            }
        }
        return null;
    }

    protected final /* synthetic */ void a(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        super.a((Object) arrayList);
        this.a.swipeRefreshLayout.setRefreshing(false);
        if (arrayList != null) {
            FragmentEpisodeNotesR2.a(this.a, arrayList);
            this.a.errorMessage.setVisibility(8);
            return;
        }
        this.a.errorMessage.setText("Could not connect to Kanon... Swipe down to retry");
        this.a.errorMessage.setVisibility(0);
    }

    public final /* synthetic */ Object b() {
        this.a.e;
        List c = ata.c(this.a.c.d());
        ArrayList arrayList = new ArrayList();
        int j = this.a.c.j() > 0 ? this.a.c.j() : this.a.c.o();
        for (int i = 0; i <= j; i++) {
            Object a = a(c, i);
            if (a == null) {
                a = new aso(this.a.c.d(), i, BuildConfig.FLAVOR);
            }
            arrayList.add(a);
        }
        return arrayList;
    }
}
