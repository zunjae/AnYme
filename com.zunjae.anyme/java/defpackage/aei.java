package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.ViewCompat;
import android.view.View;
import com.mikepenz.materialdrawer.R;

public abstract class aei<T, VH extends aek> extends aej<T, VH> {
    private adx a;
    private adu b;

    protected final void a(aek aek) {
        Context context = aek.itemView.getContext();
        aek.itemView.setId(hashCode());
        aek.itemView.setSelected(e());
        aek.itemView.setEnabled(d());
        int a = a(context);
        ColorStateList a2 = a(b(context), c(context));
        int d = d(context);
        int e = e(context);
        ViewCompat.setBackground(aek.a, afz.a(context, a, l()));
        afx.a(v(), aek.c);
        afx.b(this.a, aek.d);
        aek.c.setTextColor(a2);
        afu.a(this.b, aek.d, a2);
        if (w() != null) {
            aek.c.setTypeface(w());
            aek.d.setTypeface(w());
        }
        Drawable a3 = adw.a(t(), context, d, s(), 1);
        if (a3 != null) {
            afw.a(a3, d, adw.a(u(), context, e, s(), 1), e, s(), aek.b);
        } else {
            adw.a(t(), aek.b, d, s(), 1);
        }
        View view = aek.a;
        int i = this.y;
        a = view.getContext().getResources().getDimensionPixelSize(R.dimen.material_drawer_vertical_padding);
        if (VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i * a, 0, a, 0);
        } else {
            view.setPadding(i * a, 0, a, 0);
        }
    }

    public final T b(String str) {
        this.a = new adx(str);
        return this;
    }

    public final T o() {
        adu adu = new adu();
        adu.a();
        this.b = adu;
        return this;
    }
}
