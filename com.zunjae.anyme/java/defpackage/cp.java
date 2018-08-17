package defpackage;

import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.view.View;

final class cp extends ViewPropertyAnimatorListenerAdapter {
    final /* synthetic */ co a;
    private boolean b = false;
    private int c = 0;

    cp(co coVar) {
        this.a = coVar;
    }

    public final void onAnimationEnd(View view) {
        int i = this.c + 1;
        this.c = i;
        if (i == this.a.a.size()) {
            ViewPropertyAnimatorListener viewPropertyAnimatorListener = this.a.b;
            if (viewPropertyAnimatorListener != null) {
                viewPropertyAnimatorListener.onAnimationEnd(null);
            }
            this.c = 0;
            this.b = false;
            this.a.b();
        }
    }

    public final void onAnimationStart(View view) {
        if (!this.b) {
            this.b = true;
            ViewPropertyAnimatorListener viewPropertyAnimatorListener = this.a.b;
            if (viewPropertyAnimatorListener != null) {
                viewPropertyAnimatorListener.onAnimationStart(null);
            }
        }
    }
}
