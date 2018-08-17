package com.rd;

import android.database.DataSetObserver;

final class c extends DataSetObserver {
    final /* synthetic */ PageIndicatorView a;

    c(PageIndicatorView pageIndicatorView) {
        this.a = pageIndicatorView;
    }

    public final void onChanged() {
        this.a.d();
    }
}
