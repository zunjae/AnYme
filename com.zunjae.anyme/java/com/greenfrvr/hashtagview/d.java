package com.greenfrvr.hashtagview;

import android.view.View;
import android.view.View.OnClickListener;

final class d implements OnClickListener {
    final /* synthetic */ l a;
    final /* synthetic */ HashtagView b;

    d(HashtagView hashtagView, l lVar) {
        this.b = hashtagView;
        this.a = lVar;
    }

    public final void onClick(View view) {
        if (this.b.N) {
            HashtagView.a(this.b, this.a);
        } else {
            HashtagView.g(this.b);
        }
    }
}
