package defpackage;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

public class agq extends agp<ValueAnimator> {
    int d;
    int e;
    private agg f = new agg();

    public agq(age age) {
        super(age);
    }

    static /* synthetic */ void a(agq agq, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        agq.f.a(intValue);
        agq.f.b(intValue2);
        age age = agq.b;
        if (age != null) {
            age.a(agq.f);
        }
    }

    public final /* synthetic */ agp a(float f) {
        Animator animator = this.c;
        if (animator != null) {
            long j = (long) (f * ((float) this.a));
            if (((ValueAnimator) animator).getValues() != null && ((ValueAnimator) this.c).getValues().length > 0) {
                ((ValueAnimator) this.c).setCurrentPlayTime(j);
            }
        }
        return this;
    }

    public final agq a(int i, int i2) {
        if (this.c != null) {
            Object obj;
            PropertyValuesHolder a;
            PropertyValuesHolder a2;
            if (this.d == i) {
                if (this.e == i2) {
                    obj = null;
                    if (obj != null) {
                        this.d = i;
                        this.e = i2;
                        a = a(false);
                        a2 = a(true);
                        ((ValueAnimator) this.c).setValues(new PropertyValuesHolder[]{a, a2});
                    }
                }
            }
            obj = 1;
            if (obj != null) {
                this.d = i;
                this.e = i2;
                a = a(false);
                a2 = a(true);
                ((ValueAnimator) this.c).setValues(new PropertyValuesHolder[]{a, a2});
            }
        }
        return this;
    }

    public /* synthetic */ Animator a() {
        return d();
    }

    final PropertyValuesHolder a(boolean z) {
        String str;
        int i;
        int i2;
        if (z) {
            str = "ANIMATION_COLOR_REVERSE";
            i = this.e;
            i2 = this.d;
        } else {
            str = "ANIMATION_COLOR";
            i = this.d;
            i2 = this.e;
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i, i2});
        ofInt.setEvaluator(new ArgbEvaluator());
        return ofInt;
    }

    public ValueAnimator d() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new agr(this));
        return valueAnimator;
    }
}
