package defpackage;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.View.OnLongClickListener;
import com.mikepenz.fastadapter.R;
import com.mikepenz.fastadapter.b;
import com.mikepenz.fastadapter.u;

final class acz implements OnLongClickListener {
    final /* synthetic */ ViewHolder a;
    final /* synthetic */ acb b;

    acz(ViewHolder viewHolder, acb acb) {
        this.a = viewHolder;
        this.b = acb;
    }

    public final boolean onLongClick(View view) {
        Object tag = this.a.itemView.getTag(R.id.fastadapter_item_adapter);
        if (tag instanceof b) {
            b bVar = (b) tag;
            int a = b.a(this.a);
            if (a != -1) {
                u b = bVar.b(a);
                if (b != null) {
                    return ((acd) this.b).a(view, a, bVar, b);
                }
            }
        }
        return false;
    }
}
