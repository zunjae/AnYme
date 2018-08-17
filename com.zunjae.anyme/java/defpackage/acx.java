package defpackage;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import com.mikepenz.fastadapter.u;

public final class acx {
    public static <Item extends u> void a(acb<Item> acb_Item, ViewHolder viewHolder, View view) {
        if (acb_Item instanceof aca) {
            view.setOnClickListener(new acy(viewHolder, acb_Item));
        } else if (acb_Item instanceof acd) {
            view.setOnLongClickListener(new acz(viewHolder, acb_Item));
        } else {
            if (acb_Item instanceof acl) {
                view.setOnTouchListener(new ada(viewHolder, acb_Item));
            }
        }
    }
}
