package defpackage;

import android.os.Build.VERSION;
import android.view.View;
import java.util.concurrent.atomic.AtomicInteger;

public final class aij {
    private static final AtomicInteger a = new AtomicInteger(1);

    public static int a() {
        if (VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        int i;
        int i2;
        do {
            i = a.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!a.compareAndSet(i, i2));
        return i;
    }
}
