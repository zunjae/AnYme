package defpackage;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.ViewGroup;
import com.mikepenz.fastadapter.b;
import com.mikepenz.fastadapter.u;
import java.util.Iterator;
import java.util.List;

public final class aci<Item extends u> implements ach<Item> {
    public final ViewHolder a(b<Item> bVar, ViewHolder viewHolder) {
        List b = bVar.b();
        if (b != null) {
            Iterator it = b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        return viewHolder;
    }

    public final ViewHolder a(b<Item> bVar, ViewGroup viewGroup, int i) {
        return bVar.a(i).a(viewGroup);
    }
}
