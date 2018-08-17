package defpackage;

import android.support.v4.view.ViewPropertyAnimatorListener;
import android.view.View;

final class abt implements ViewPropertyAnimatorListener {
    final /* synthetic */ abv a;

    abt(abv abv) {
        this.a = abv;
    }

    public final void onAnimationCancel(View view) {
    }

    public final void onAnimationEnd(View view) {
        this.a.a();
        view.setDrawingCacheEnabled(false);
    }

    public final void onAnimationStart(View view) {
        view.setDrawingCacheEnabled(true);
    }
}
