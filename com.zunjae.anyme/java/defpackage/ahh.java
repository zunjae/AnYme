package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.Iterator;

public class ahh extends agp<AnimatorSet> {
    int d;
    int e;
    int f;
    boolean g;
    int h;
    int i;
    private agn j = new agn();

    public ahh(age age) {
        super(age);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void a(defpackage.ahh r1, defpackage.agn r2, android.animation.ValueAnimator r3, boolean r4) {
        /*
        r3 = r3.getAnimatedValue();
        r3 = (java.lang.Integer) r3;
        r3 = r3.intValue();
        r0 = r1.g;
        if (r0 == 0) goto L_0x0014;
    L_0x000e:
        if (r4 == 0) goto L_0x0017;
    L_0x0010:
        r2.b(r3);
        goto L_0x001a;
    L_0x0014:
        if (r4 != 0) goto L_0x0017;
    L_0x0016:
        goto L_0x0010;
    L_0x0017:
        r2.c(r3);
    L_0x001a:
        r1 = r1.b;
        if (r1 == 0) goto L_0x0021;
    L_0x001e:
        r1.a(r2);
    L_0x0021:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: ahh.a(ahh, agn, android.animation.ValueAnimator, boolean):void");
    }

    public static AnimatorSet d() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    public /* synthetic */ agp a(float f) {
        return b(f);
    }

    public /* synthetic */ agp a(long j) {
        return b(j);
    }

    public ahh a(int i, int i2, int i3, boolean z) {
        if (b(i, i2, i3, z)) {
            this.c = ahh.d();
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = z;
            this.h = i - i3;
            this.i = i + i3;
            this.j.b(this.h);
            this.j.c(this.i);
            ahj a = a(z);
            long j = this.a / 2;
            ValueAnimator a2 = a(a.a, a.b, j, false, this.j);
            ValueAnimator a3 = a(a.c, a.d, j, true, this.j);
            ((AnimatorSet) this.c).playSequentially(new Animator[]{a2, a3});
        }
        return this;
    }

    final ahj a(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (z) {
            i = this.d;
            i5 = this.f;
            i2 = i + i5;
            i3 = this.e;
            i4 = i3 + i5;
            i -= i5;
            i3 -= i5;
        } else {
            i = this.d;
            i5 = this.f;
            i2 = i - i5;
            i3 = this.e;
            i4 = i3 - i5;
            i += i5;
            i3 += i5;
        }
        return new ahj(this, i2, i4, i, i3);
    }

    public final /* synthetic */ Animator a() {
        return ahh.d();
    }

    final ValueAnimator a(int i, int i2, long j, boolean z, agn agn) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new ahi(this, agn, z));
        return ofInt;
    }

    public ahh b(float f) {
        Animator animator = this.c;
        if (animator == null) {
            return this;
        }
        long j = (long) (f * ((float) this.a));
        Iterator it = ((AnimatorSet) animator).getChildAnimations().iterator();
        while (it.hasNext()) {
            ValueAnimator valueAnimator = (ValueAnimator) ((Animator) it.next());
            long duration = valueAnimator.getDuration();
            if (j <= duration) {
                duration = j;
            }
            valueAnimator.setCurrentPlayTime(duration);
            j -= duration;
        }
        return this;
    }

    public ahh b(long j) {
        super.a(j);
        return this;
    }

    final boolean b(int i, int i2, int i3, boolean z) {
        return (this.d == i && this.e == i2 && this.f == i3 && this.g == z) ? false : true;
    }
}
