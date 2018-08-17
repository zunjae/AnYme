package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.ImageView;
import com.mikepenz.materialdrawer.R;
import com.mikepenz.materialdrawer.p;
import java.util.List;

public final class aeq extends aei<aeq, aes> {
    private p A;
    private p B = new aer(this);
    protected adu a;
    protected int b = 0;
    protected int z = 180;

    public final /* synthetic */ ViewHolder a(View view) {
        return new aes(view);
    }

    public final /* synthetic */ void a(ViewHolder viewHolder, List list) {
        ImageView imageView;
        int i;
        aes aes = (aes) viewHolder;
        super.a((ViewHolder) aes, list);
        Context context = aes.itemView.getContext();
        a(aes);
        if (aes.e.getDrawable() instanceof adf) {
            adf adf = (adf) aes.e.getDrawable();
            adu adu = this.a;
            adf.a(adu != null ? adu.a(context) : d(context));
        }
        aes.e.clearAnimation();
        if (a()) {
            imageView = aes.e;
            i = this.z;
        } else {
            imageView = aes.e;
            i = this.b;
        }
        imageView.setRotation((float) i);
    }

    public final int g() {
        return R.id.material_drawer_item_expandable;
    }

    public final int i() {
        return R.layout.material_drawer_item_expandable;
    }

    public final p m() {
        return this.B;
    }
}
