package defpackage;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.ViewGroup;
import com.mikepenz.fastadapter.b;
import com.mikepenz.fastadapter.u;

public interface ach<Item extends u> {
    ViewHolder a(b<Item> bVar, ViewHolder viewHolder);

    ViewHolder a(b<Item> bVar, ViewGroup viewGroup, int i);
}
