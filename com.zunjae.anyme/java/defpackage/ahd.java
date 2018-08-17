package defpackage;

import android.animation.Animator;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

public final class ahd extends agp<ValueAnimator> {
    private int d = -1;
    private int e = -1;
    private agl f = new agl();

    public ahd(age age) {
        super(age);
    }

    private static PropertyValuesHolder a(String str, int i, int i2) {
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i, i2});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    static /* synthetic */ void a(ahd ahd, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE_REVERSE")).intValue();
        ahd.f.a(intValue);
        ahd.f.b(intValue2);
        age age = ahd.b;
        if (age != null) {
            age.a(ahd.f);
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

    public final ahd a(int i, int i2) {
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
                        a = ahd.a("ANIMATION_COORDINATE", i, i2);
                        a2 = ahd.a("ANIMATION_COORDINATE_REVERSE", i2, i);
                        ((ValueAnimator) this.c).setValues(new PropertyValuesHolder[]{a, a2});
                    }
                }
            }
            obj = 1;
            if (obj != null) {
                this.d = i;
                this.e = i2;
                a = ahd.a("ANIMATION_COORDINATE", i, i2);
                a2 = ahd.a("ANIMATION_COORDINATE_REVERSE", i2, i);
                ((ValueAnimator) this.c).setValues(new PropertyValuesHolder[]{a, a2});
            }
        }
        return this;
    }

    public final /* synthetic */ Animator a() {
        Animator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ahe(this));
        return valueAnimator;
    }
}
