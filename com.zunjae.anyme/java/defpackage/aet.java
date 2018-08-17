package defpackage;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import com.mikepenz.materialdrawer.R;
import java.util.List;

public final class aet extends aej<aet, aeu> {
    private boolean A = false;
    protected adv a;
    private adx b;
    private adt z = new adt();

    public aet(aex aex) {
        this.c = aex.c;
        this.d = aex.d;
        this.b = aex.a;
        this.z = aex.b;
        this.e = aex.e;
        this.g = aex.g;
        this.f = aex.f;
        this.l = aex.l;
        this.m = aex.m;
        this.o = aex.o;
        this.p = aex.p;
        this.t = aex.t;
        this.u = aex.u;
        this.v = aex.v;
    }

    public aet(afc afc) {
        this.c = afc.c;
        this.d = afc.d;
        this.b = afc.a;
        this.z = afc.b;
        this.e = afc.e;
        this.g = afc.g;
        this.f = afc.f;
        this.l = afc.l;
        this.m = afc.m;
        this.o = afc.o;
        this.p = afc.p;
        this.t = afc.t;
        this.u = afc.u;
        this.v = afc.v;
    }

    public final /* synthetic */ ViewHolder a(View view) {
        return new aeu(view);
    }

    public final /* synthetic */ void a(ViewHolder viewHolder, List list) {
        aeu aeu = (aeu) viewHolder;
        super.a((ViewHolder) aeu, list);
        Context context = aeu.itemView.getContext();
        if (this.a != null) {
            LayoutParams layoutParams = (LayoutParams) aeu.itemView.getLayoutParams();
            layoutParams.height = this.a.a(context);
            aeu.itemView.setLayoutParams(layoutParams);
        }
        aeu.itemView.setId(hashCode());
        aeu.itemView.setEnabled(d());
        aeu.itemView.setSelected(e());
        aeu.itemView.setTag(this);
        int d = d(context);
        int e = e(context);
        if (this.A) {
            ViewCompat.setBackground(aeu.a, afz.a(context, a(context), l()));
        }
        if (afx.b(this.b, aeu.c)) {
            this.z.a(aeu.c);
        }
        afw.a(adw.a(t(), context, d, s(), 1), d, adw.a(u(), context, e, s(), 1), e, s(), aeu.b);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_drawer_padding);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.material_mini_drawer_item_padding);
        aeu.itemView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
    }

    public final aet d(boolean z) {
        this.A = z;
        return this;
    }

    public final int g() {
        return R.id.material_drawer_item_mini;
    }

    public final int i() {
        return R.layout.material_drawer_item_mini;
    }
}
