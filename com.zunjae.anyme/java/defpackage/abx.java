package defpackage;

import android.widget.Filter;
import android.widget.Filter.FilterResults;
import com.mikepenz.fastadapter.i;
import com.mikepenz.fastadapter.u;
import com.mikepenz.fastadapter.w;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public final class abx<Model, Item extends u> extends Filter {
    protected acc<Item> a;
    private List<Item> b;
    private CharSequence c;
    private aby<?, Item> d;
    private w<Item> e;

    public abx(aby<?, Item> aby___Item) {
        this.d = aby___Item;
    }

    public final CharSequence a() {
        return this.c;
    }

    public final FilterResults performFiltering(@Nullable CharSequence charSequence) {
        FilterResults filterResults = new FilterResults();
        if (this.b == null && (charSequence == null || charSequence.length() == 0)) {
            return filterResults;
        }
        List arrayList;
        for (i b : this.d.b_().a()) {
            b.b();
        }
        this.c = charSequence;
        if (this.b == null) {
            this.b = new ArrayList(this.d.d());
        }
        if (charSequence != null) {
            if (charSequence.length() != 0) {
                arrayList = new ArrayList();
                if (this.e != null) {
                    for (u uVar : this.b) {
                        if (this.e.a()) {
                            arrayList.add(uVar);
                        }
                    }
                } else {
                    arrayList = this.d.d();
                }
                filterResults.values = arrayList;
                filterResults.count = arrayList.size();
                return filterResults;
            }
        }
        arrayList = this.b;
        filterResults.values = arrayList;
        filterResults.count = arrayList.size();
        this.b = null;
        acc acc = this.a;
        return filterResults;
    }

    protected final void publishResults(@Nullable CharSequence charSequence, FilterResults filterResults) {
        Object obj = filterResults.values;
        if (obj != null) {
            this.d.b((List) obj);
        }
        if (this.a != null && this.b != null) {
            obj = filterResults.values;
        }
    }
}
