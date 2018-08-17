package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.widget.TextView;
import com.mikepenz.materialdrawer.R;

public final class adt {
    private int a = R.drawable.material_drawer_badge;
    private Drawable b;
    private adu c;
    private adu d;
    private adu e;
    private adv f;
    private adv g = adv.a(2);
    private adv h = adv.a(3);
    private adv i = adv.a(20);

    public final int a() {
        return this.a;
    }

    public final void a(TextView textView) {
        a(textView, null);
    }

    public final void a(TextView textView, ColorStateList colorStateList) {
        Context context = textView.getContext();
        Drawable drawable = this.b;
        if (drawable == null) {
            drawable = new afm(this).a(context);
        }
        ViewCompat.setBackground(textView, drawable);
        afu afu = this.e;
        if (afu != null) {
            afu.a(afu, textView, null);
        } else if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        int a = this.h.a(context);
        int a2 = this.g.a(context);
        textView.setPadding(a, a2, a, a2);
        textView.setMinWidth(this.i.a(context));
    }

    public final adu b() {
        return this.c;
    }

    public final adu c() {
        return this.d;
    }

    public final adv d() {
        return this.f;
    }
}
