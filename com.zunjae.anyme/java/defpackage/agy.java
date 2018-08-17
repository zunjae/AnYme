package defpackage;

import android.animation.Animator;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

public class agy extends agq {
    int f;
    float g;
    private agj h = new agj();

    public agy(age age) {
        super(age);
    }

    static /* synthetic */ void a(agy agy, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        int intValue3 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_SCALE")).intValue();
        int intValue4 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_SCALE_REVERSE")).intValue();
        agy.h.a(intValue);
        agy.h.b(intValue2);
        agy.h.c(intValue3);
        agy.h.d(intValue4);
        age age = agy.b;
        if (age != null) {
            age.a(agy.h);
        }
    }

    public final agy a(int i, int i2, int i3, float f) {
        if (this.c != null) {
            Object obj;
            PropertyValuesHolder a;
            PropertyValuesHolder a2;
            PropertyValuesHolder b;
            PropertyValuesHolder b2;
            if (this.d == i) {
                if (this.e == i2) {
                    if (this.f == i3) {
                        if (this.g == f) {
                            obj = null;
                            if (obj != null) {
                                this.d = i;
                                this.e = i2;
                                this.f = i3;
                                this.g = f;
                                a = a(false);
                                a2 = a(true);
                                b = b(false);
                                b2 = b(true);
                                ((ValueAnimator) this.c).setValues(new PropertyValuesHolder[]{a, a2, b, b2});
                            }
                        }
                    }
                }
            }
            obj = 1;
            if (obj != null) {
                this.d = i;
                this.e = i2;
                this.f = i3;
                this.g = f;
                a = a(false);
                a2 = a(true);
                b = b(false);
                b2 = b(true);
                ((ValueAnimator) this.c).setValues(new PropertyValuesHolder[]{a, a2, b, b2});
            }
        }
        return this;
    }

    public final /* synthetic */ Animator a() {
        return d();
    }

    protected PropertyValuesHolder b(boolean z) {
        String str;
        int i;
        int i2;
        if (z) {
            str = "ANIMATION_SCALE_REVERSE";
            i = this.f;
            i2 = (int) (((float) i) * this.g);
        } else {
            str = "ANIMATION_SCALE";
            i2 = this.f;
            i = (int) (((float) i2) * this.g);
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i, i2});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    public final ValueAnimator d() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new agz(this));
        return valueAnimator;
    }
}
