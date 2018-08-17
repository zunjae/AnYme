package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

final class nh extends ConstantState {
    private final ConstantState a;
    private final int b;

    nh(ConstantState constantState, int i) {
        this.a = constantState;
        this.b = i;
    }

    nh(nh nhVar) {
        this(nhVar.a, nhVar.b);
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    public final Drawable newDrawable(Resources resources) {
        return new ng(this, null, resources);
    }
}
