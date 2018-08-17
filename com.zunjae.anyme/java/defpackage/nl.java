package defpackage;

import android.util.Log;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.ref.WeakReference;

final class nl implements OnPreDrawListener {
    private final WeakReference<nk> a;

    public nl(nk nkVar) {
        this.a = new WeakReference(nkVar);
    }

    public final boolean onPreDraw() {
        if (Log.isLoggable("ViewTarget", 2)) {
            new StringBuilder("OnGlobalLayoutListener called listener=").append(this);
        }
        nk nkVar = (nk) this.a.get();
        if (nkVar != null) {
            nk.a(nkVar);
        }
        return true;
    }
}
