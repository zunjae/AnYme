package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.Iterator;

public final class ags extends agp<AnimatorSet> {
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private agh i = new agh();

    public ags(age age) {
        super(age);
    }

    private ValueAnimator a(int i, int i2, long j, int i3) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new agt(this, i3));
        return ofInt;
    }

    static /* synthetic */ void a(ags ags, ValueAnimator valueAnimator, int i) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        switch (agu.a[i - 1]) {
            case tw.a /*1*/:
                ags.i.a(intValue);
                break;
            case tw.b /*2*/:
                ags.i.b(intValue);
                break;
            case f.c /*3*/:
                ags.i.c(intValue);
                break;
            default:
                break;
        }
        age age = ags.b;
        if (age != null) {
            age.a(ags.i);
        }
    }

    private static AnimatorSet d() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    public final /* synthetic */ agp a(float f) {
        Animator animator = this.c;
        if (animator != null) {
            long j = (long) (f * ((float) this.a));
            Object obj = null;
            Iterator it = ((AnimatorSet) animator).getChildAnimations().iterator();
            while (it.hasNext()) {
                ValueAnimator valueAnimator = (ValueAnimator) ((Animator) it.next());
                long duration = valueAnimator.getDuration();
                long j2 = obj != null ? j - duration : j;
                if (j2 >= 0) {
                    if (j2 >= duration) {
                        j2 = duration;
                    }
                    if (valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                        valueAnimator.setCurrentPlayTime(j2);
                    }
                    if (obj == null && duration >= this.a) {
                        obj = 1;
                    }
                }
            }
        }
        return this;
    }

    public final ags a(int i, int i2, int i3, int i4, int i5) {
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        int i10 = i5;
        Object obj = 1;
        if (this.d == i6) {
            if (r6.e == i7) {
                if (r6.f == i8) {
                    if (r6.g == i9) {
                        if (r6.h == i10) {
                            obj = null;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            r6.c = ags.d();
            r6.d = i6;
            r6.e = i7;
            r6.f = i8;
            r6.g = i9;
            r6.h = i10;
            double d = (double) i10;
            Double.isNaN(d);
            int i11 = (int) (d / 1.5d);
            long j = r6.a;
            long j2 = j / 2;
            Animator a = a(i, i2, j, agv.a);
            j = j2;
            Animator a2 = a(i3, i4, j, agv.b);
            Animator a3 = a(i5, i11, j, agv.c);
            Animator a4 = a(i4, i3, j, agv.b);
            ((AnimatorSet) r6.c).play(a2).with(a3).with(a).before(a4).before(a(i11, i5, j, agv.c));
        }
        return r6;
    }

    public final /* synthetic */ Animator a() {
        return ags.d();
    }

    public final ags b(long j) {
        super.a(j);
        return this;
    }
}
