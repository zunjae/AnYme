package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.ViewGroup;
import com.mikepenz.fastadapter.n;
import com.mikepenz.fastadapter.u;
import com.mikepenz.fastadapter.y;

public interface afi<T, VH extends ViewHolder> extends n<T, afi>, u<T, VH>, y<afi, afi> {
    View a(Context context, ViewGroup viewGroup);

    T b(boolean z);

    boolean d();

    boolean e();

    boolean f();

    int i();
}
