package com.cunoraz.tagview;

import android.view.View;
import android.view.View.OnLongClickListener;

final class e implements OnLongClickListener {
    final /* synthetic */ b a;
    final /* synthetic */ int b;
    final /* synthetic */ TagView c;

    e(TagView tagView, b bVar, int i) {
        this.c = tagView;
        this.a = bVar;
        this.b = i;
    }

    public final boolean onLongClick(View view) {
        if (this.c.f != null) {
            this.c.f;
        }
        return true;
    }
}
