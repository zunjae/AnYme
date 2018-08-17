package com.greenfrvr.hashtagview;

import java.util.Iterator;

final class i implements e {
    final /* synthetic */ HashtagView a;

    private i(HashtagView hashtagView) {
        this.a = hashtagView;
    }

    public final void a() {
    }

    public final void a(int i, int i2, int[] iArr, boolean z) {
        if (!this.a.i.isEmpty()) {
            Iterator it = this.a.i.iterator();
            int i3 = i;
            i = 0;
            while (it.hasNext()) {
                l lVar = (l) it.next();
                if (((float) i) + lVar.c > ((float) this.a.getViewWidth())) {
                    i3++;
                    i = 0;
                }
                i = (int) (((float) i) + lVar.c);
                this.a.j.a(Integer.valueOf(i3), lVar);
                it.remove();
            }
        }
    }

    public final void b() {
    }
}
