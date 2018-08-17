package com.greenfrvr.hashtagview;

import android.view.ViewTreeObserver.OnPreDrawListener;

final class c implements OnPreDrawListener {
    final /* synthetic */ HashtagView a;

    c(HashtagView hashtagView) {
        this.a = hashtagView;
    }

    public final boolean onPreDraw() {
        if (HashtagView.a(this.a)) {
            HashtagView.b(this.a);
            HashtagView.c(this.a);
            HashtagView.d(this.a);
            this.a.getViewTreeObserver().removeOnPreDrawListener(this.a.S);
        }
        return true;
    }
}
