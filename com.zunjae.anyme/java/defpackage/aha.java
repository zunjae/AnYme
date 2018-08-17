package defpackage;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;

public final class aha extends agy {
    public aha(age age) {
        super(age);
    }

    protected final PropertyValuesHolder b(boolean z) {
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
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i2, i});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }
}
