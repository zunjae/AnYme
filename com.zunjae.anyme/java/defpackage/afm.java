package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;

public final class afm {
    private adt a;

    public afm(adt adt) {
        this.a = adt;
    }

    public final StateListDrawable a(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable = (GradientDrawable) bv.b(context, this.a.a());
        GradientDrawable gradientDrawable2 = (GradientDrawable) gradientDrawable.getConstantState().newDrawable().mutate();
        afu.a(this.a.b(), context, gradientDrawable);
        afu.a(this.a.c() == null ? this.a.b() : this.a.c(), context, gradientDrawable2);
        if (this.a.d() != null) {
            gradientDrawable.setCornerRadius((float) this.a.d().a(context));
            gradientDrawable2.setCornerRadius((float) this.a.d().a(context));
        }
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable);
        return stateListDrawable;
    }
}
