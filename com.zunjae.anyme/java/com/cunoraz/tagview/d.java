package com.cunoraz.tagview;

import android.view.View;
import android.view.View.OnClickListener;

final class d implements OnClickListener {
    final /* synthetic */ b a;
    final /* synthetic */ int b;
    final /* synthetic */ TagView c;

    d(TagView tagView, b bVar, int i) {
        this.c = tagView;
        this.a = bVar;
        this.b = i;
    }

    public final void onClick(View view) {
        if (this.c.d != null) {
            this.c.d.onTagClick(this.a, this.b);
        }
    }
}
