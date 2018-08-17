package com.greenfrvr.hashtagview;

import java.util.Collections;
import java.util.Iterator;

final class j implements e {
    final /* synthetic */ HashtagView a;

    private j(HashtagView hashtagView) {
        this.a = hashtagView;
    }

    public final void a() {
        Collections.sort(this.a.i);
        Collections.sort(this.a.h, Collections.reverseOrder());
    }

    public final void a(int i, int i2, int[] iArr, boolean z) {
        while (!this.a.i.isEmpty()) {
            if (!z || HashtagView.m(this.a)) {
                int i3 = i;
                while (i3 < i2) {
                    Iterator it = this.a.i.iterator();
                    while (it.hasNext()) {
                        l lVar = (l) it.next();
                        if (this.a.B > 0 || ((float) iArr[i3]) + lVar.c <= ((float) this.a.getViewWidth())) {
                            iArr[i3] = (int) (((float) iArr[i3]) + lVar.c);
                            this.a.j.a(Integer.valueOf(i3), lVar);
                            it.remove();
                            if (z) {
                                break;
                            }
                        }
                    }
                    i3++;
                }
            } else {
                return;
            }
        }
    }

    public final void b() {
        int ceil = (int) Math.ceil((double) (this.a.K / ((float) this.a.getViewWidth())));
        int[] iArr = new int[ceil];
        int size = this.a.h.size() + ceil;
        this.a.k.a(ceil, false, 0);
        int i = 0;
        while (!this.a.h.isEmpty()) {
            int i2 = i;
            for (i = 0; i < ceil; i++) {
                if (i2 > size) {
                    this.a.k.a(ceil, true, this.a.h.size());
                    this.a.h.clear();
                    return;
                }
                i2++;
                for (Float f : this.a.h) {
                    if (((float) iArr[i]) + f.floatValue() <= ((float) this.a.getViewWidth())) {
                        iArr[i] = (int) (((float) iArr[i]) + f.floatValue());
                        this.a.h.remove(f);
                        break;
                    }
                }
            }
            i = i2;
        }
    }
}
