package com.miguelcatalan.materialsearchview;

import android.view.View;
import android.view.View.OnFocusChangeListener;

final class c implements OnFocusChangeListener {
    final /* synthetic */ MaterialSearchView a;

    c(MaterialSearchView materialSearchView) {
        this.a = materialSearchView;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            MaterialSearchView.a(this.a.h);
            this.a.a();
        }
    }
}
