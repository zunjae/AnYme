package defpackage;

import android.view.View;

public final class mv<R> implements mq<R> {
    private final mw a;

    mv(mw mwVar) {
        this.a = mwVar;
    }

    public final boolean a(R r, mr mrVar) {
        View a = mrVar.a();
        if (a != null) {
            a.clearAnimation();
            a.startAnimation(this.a.a());
        }
        return false;
    }
}
