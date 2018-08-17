package com.miguelcatalan.materialsearchview;

import android.view.View;
import android.view.View.OnClickListener;

final class d implements OnClickListener {
    final /* synthetic */ MaterialSearchView a;

    d(MaterialSearchView materialSearchView) {
        this.a = materialSearchView;
    }

    public final void onClick(View view) {
        if (view == this.a.i) {
            this.a.d();
        } else if (view == this.a.j) {
            MaterialSearchView.e(this.a);
        } else if (view == this.a.k) {
            this.a.h.setText(null);
        } else if (view == this.a.h) {
            this.a.a();
        } else {
            if (view == this.a.f) {
                this.a.d();
            }
        }
    }
}
