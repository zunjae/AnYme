package defpackage;

import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public final class co {
    final ArrayList<ViewPropertyAnimatorCompat> a = new ArrayList();
    ViewPropertyAnimatorListener b;
    private long c = -1;
    private Interpolator d;
    private boolean e;
    private final ViewPropertyAnimatorListenerAdapter f = new cp(this);

    public final co a(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat) {
        if (!this.e) {
            this.a.add(viewPropertyAnimatorCompat);
        }
        return this;
    }

    public final co a(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2) {
        this.a.add(viewPropertyAnimatorCompat);
        viewPropertyAnimatorCompat2.setStartDelay(viewPropertyAnimatorCompat.getDuration());
        this.a.add(viewPropertyAnimatorCompat2);
        return this;
    }

    public final co a(ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (!this.e) {
            this.b = viewPropertyAnimatorListener;
        }
        return this;
    }

    public final co a(Interpolator interpolator) {
        if (!this.e) {
            this.d = interpolator;
        }
        return this;
    }

    public final void a() {
        if (!this.e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = (ViewPropertyAnimatorCompat) it.next();
                long j = this.c;
                if (j >= 0) {
                    viewPropertyAnimatorCompat.setDuration(j);
                }
                Interpolator interpolator = this.d;
                if (interpolator != null) {
                    viewPropertyAnimatorCompat.setInterpolator(interpolator);
                }
                if (this.b != null) {
                    viewPropertyAnimatorCompat.setListener(this.f);
                }
                viewPropertyAnimatorCompat.start();
            }
            this.e = true;
        }
    }

    final void b() {
        this.e = false;
    }

    public final void c() {
        if (this.e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((ViewPropertyAnimatorCompat) it.next()).cancel();
            }
            this.e = false;
        }
    }

    public final co d() {
        if (!this.e) {
            this.c = 250;
        }
        return this;
    }
}
