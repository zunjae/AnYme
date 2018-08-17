package defpackage;

import java.lang.reflect.Array;
import javax.annotation.Nullable;

final class bkd extends bkb<Object> {
    final /* synthetic */ bkb a;

    bkd(bkb bkb) {
        this.a = bkb;
    }

    final void a(bkv bkv, @Nullable Object obj) {
        if (obj != null) {
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                this.a.a(bkv, Array.get(obj, i));
            }
        }
    }
}
