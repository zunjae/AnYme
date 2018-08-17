package defpackage;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;

final class nk {
    private final View a;
    private final List<nf> b = new ArrayList();
    private nl c;
    private Point d;

    public nk(View view) {
        this.a = view;
    }

    private int a() {
        LayoutParams layoutParams = this.a.getLayoutParams();
        return nk.a(this.a.getHeight()) ? this.a.getHeight() : layoutParams != null ? a(layoutParams.height, true) : 0;
    }

    private int a(int i, boolean z) {
        if (i == -2) {
            Point c = c();
            if (z) {
                return c.y;
            }
            i = c.x;
        }
        return i;
    }

    static /* synthetic */ void a(nk nkVar) {
        if (!nkVar.b.isEmpty()) {
            int b = nkVar.b();
            int a = nkVar.a();
            if (!nk.a(b)) {
                return;
            }
            if (nk.a(a)) {
                for (nf a2 : nkVar.b) {
                    a2.a(b, a);
                }
                nkVar.b.clear();
                ViewTreeObserver viewTreeObserver = nkVar.a.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(nkVar.c);
                }
                nkVar.c = null;
            }
        }
    }

    private static boolean a(int i) {
        if (i <= 0) {
            if (i != -2) {
                return false;
            }
        }
        return true;
    }

    private int b() {
        LayoutParams layoutParams = this.a.getLayoutParams();
        return nk.a(this.a.getWidth()) ? this.a.getWidth() : layoutParams != null ? a(layoutParams.width, false) : 0;
    }

    @TargetApi(13)
    private Point c() {
        Point point = this.d;
        if (point != null) {
            return point;
        }
        Display defaultDisplay = ((WindowManager) this.a.getContext().getSystemService("window")).getDefaultDisplay();
        if (VERSION.SDK_INT >= 13) {
            this.d = new Point();
            defaultDisplay.getSize(this.d);
        } else {
            this.d = new Point(defaultDisplay.getWidth(), defaultDisplay.getHeight());
        }
        return this.d;
    }

    public final void a(nf nfVar) {
        int b = b();
        int a = a();
        if (nk.a(b) && nk.a(a)) {
            nfVar.a(b, a);
            return;
        }
        if (!this.b.contains(nfVar)) {
            this.b.add(nfVar);
        }
        if (this.c == null) {
            ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
            this.c = new nl(this);
            viewTreeObserver.addOnPreDrawListener(this.c);
        }
    }
}
