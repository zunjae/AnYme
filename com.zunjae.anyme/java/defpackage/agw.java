package defpackage;

import android.animation.Animator;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

public final class agw extends agq {
    private agi f = new agi();
    private int g;
    private int h;

    public agw(age age) {
        super(age);
    }

    static /* synthetic */ void a(agw agw, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        int intValue3 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_RADIUS")).intValue();
        int intValue4 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_RADIUS_REVERSE")).intValue();
        int intValue5 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_STROKE")).intValue();
        int intValue6 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_STROKE_REVERSE")).intValue();
        agw.f.a(intValue);
        agw.f.b(intValue2);
        agw.f.c(intValue3);
        agw.f.d(intValue4);
        agw.f.e(intValue5);
        agw.f.f(intValue6);
        age age = agw.b;
        if (age != null) {
            age.a(agw.f);
        }
    }

    private PropertyValuesHolder b(boolean z) {
        String str;
        int i;
        int i2;
        if (z) {
            str = "ANIMATION_RADIUS_REVERSE";
            i = this.g;
            i2 = i / 2;
        } else {
            str = "ANIMATION_RADIUS";
            i2 = this.g;
            i = i2 / 2;
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i2, i});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    private PropertyValuesHolder c(boolean z) {
        String str;
        int i;
        int i2;
        if (z) {
            str = "ANIMATION_STROKE_REVERSE";
            i = this.g;
            i2 = 0;
        } else {
            str = "ANIMATION_STROKE";
            i2 = this.g;
            i = 0;
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i, i2});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    public final agw a(int i, int i2, int i3, int i4) {
        if (this.c != null) {
            Object obj;
            PropertyValuesHolder a;
            PropertyValuesHolder a2;
            PropertyValuesHolder b;
            PropertyValuesHolder b2;
            PropertyValuesHolder c;
            PropertyValuesHolder c2;
            if (this.d == i) {
                if (this.e == i2) {
                    if (this.g == i3) {
                        if (this.h == i4) {
                            obj = null;
                            if (obj != null) {
                                this.d = i;
                                this.e = i2;
                                this.g = i3;
                                this.h = i4;
                                a = a(false);
                                a2 = a(true);
                                b = b(false);
                                b2 = b(true);
                                c = c(false);
                                c2 = c(true);
                                ((ValueAnimator) this.c).setValues(new PropertyValuesHolder[]{a, a2, b, b2, c, c2});
                            }
                        }
                    }
                }
            }
            obj = 1;
            if (obj != null) {
                this.d = i;
                this.e = i2;
                this.g = i3;
                this.h = i4;
                a = a(false);
                a2 = a(true);
                b = b(false);
                b2 = b(true);
                c = c(false);
                c2 = c(true);
                ((ValueAnimator) this.c).setValues(new PropertyValuesHolder[]{a, a2, b, b2, c, c2});
            }
        }
        return this;
    }

    public final /* synthetic */ Animator a() {
        return d();
    }

    public final ValueAnimator d() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new agx(this));
        return valueAnimator;
    }
}
