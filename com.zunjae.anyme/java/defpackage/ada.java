package defpackage;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.mikepenz.fastadapter.R;
import com.mikepenz.fastadapter.b;

final class ada implements OnTouchListener {
    final /* synthetic */ ViewHolder a;
    final /* synthetic */ acb b;

    ada(ViewHolder viewHolder, acb acb) {
        this.a = viewHolder;
        this.b = acb;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Object tag = this.a.itemView.getTag(R.id.fastadapter_item_adapter);
        if (tag instanceof b) {
            b bVar = (b) tag;
            int a = b.a(this.a);
            if (!(a == -1 || bVar.b(a) == null)) {
                return ((acl) this.b).a(a, bVar);
            }
        }
        return false;
    }
}
