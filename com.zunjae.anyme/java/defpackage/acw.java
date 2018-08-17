package defpackage;

import android.util.SparseArray;
import com.mikepenz.fastadapter.u;
import com.mikepenz.fastadapter.z;

public final class acw<Item extends u> implements z<Item> {
    private final SparseArray<Item> a = new SparseArray();

    public final Item a(int i) {
        return (u) this.a.get(i);
    }

    public final boolean a(Item item) {
        if (this.a.indexOfKey(item.g()) >= 0) {
            return false;
        }
        this.a.put(item.g(), item);
        return true;
    }
}
