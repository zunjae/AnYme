package defpackage;

import android.support.v7.widget.RecyclerView.ViewHolder;
import com.mikepenz.fastadapter.R;
import com.mikepenz.fastadapter.b;
import com.mikepenz.fastadapter.u;
import java.util.List;

public final class acf implements ace {
    public final void a(ViewHolder viewHolder) {
        if (((u) viewHolder.itemView.getTag(R.id.fastadapter_item)) != null) {
            viewHolder.itemView.setTag(R.id.fastadapter_item, null);
            viewHolder.itemView.setTag(R.id.fastadapter_item_adapter, null);
        }
    }

    public final void a(ViewHolder viewHolder, int i) {
        if (b.a(viewHolder, i) == null) {
        }
    }

    public final void a(ViewHolder viewHolder, int i, List<Object> list) {
        Object tag = viewHolder.itemView.getTag(R.id.fastadapter_item_adapter);
        if (tag instanceof b) {
            u b = ((b) tag).b(i);
            if (b != null) {
                b.a(viewHolder, list);
                viewHolder.itemView.setTag(R.id.fastadapter_item, b);
            }
        }
    }

    public final void b(ViewHolder viewHolder, int i) {
        b.a(viewHolder, i);
    }

    public final boolean b(ViewHolder viewHolder) {
        return ((u) viewHolder.itemView.getTag(R.id.fastadapter_item)) != null ? false : false;
    }
}
