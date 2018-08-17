package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

public abstract class cr implements OnClickListener {
    static boolean a = true;
    private static final Runnable b = new cs();

    public abstract void a(View view);

    public final void onClick(View view) {
        if (a) {
            a = false;
            view.post(b);
            a(view);
        }
    }
}
