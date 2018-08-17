package com.cunoraz.tagview;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class c implements OnGlobalLayoutListener {
    final /* synthetic */ TagView a;

    c(TagView tagView) {
        this.a = tagView;
    }

    public final void onGlobalLayout() {
        if (!this.a.h) {
            this.a.h = true;
            this.a.b();
        }
    }
}
