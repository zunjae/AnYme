package defpackage;

import android.os.Bundle;
import android.support.v4.util.ArraySet;
import android.view.View;
import com.mikepenz.fastadapter.b;
import com.mikepenz.fastadapter.i;
import com.mikepenz.fastadapter.u;
import java.util.Set;
import javax.annotation.Nullable;

public class acm<Item extends u> implements i<Item> {
    private b<Item> a;
    private boolean b = false;
    private boolean c = false;
    private boolean d = false;
    private boolean e = true;
    private boolean f = false;

    private void a(@Nullable View view, Item item, int i) {
        if (!item.f()) {
            return;
        }
        if (!item.e() || this.e) {
            boolean e = item.e();
            if (!this.b) {
                if (view != null) {
                    if (!this.c) {
                        Set f = f();
                        f.remove(item);
                        a(f);
                    }
                    item.b(e ^ 1);
                    view.setSelected(e ^ 1);
                    return;
                }
            }
            if (!this.c) {
                g();
            }
            if (e) {
                c(i);
            } else {
                b(i);
            }
        }
    }

    private void a(Set<Item> set) {
        this.a.a(new acq(this, set), false);
    }

    private void c(int i) {
        u b = this.a.b(i);
        if (b != null) {
            a(b, i);
        }
    }

    public final acm<Item> a(boolean z) {
        this.c = z;
        return this;
    }

    public final i<Item> a(b<Item> bVar) {
        this.a = bVar;
        return null;
    }

    public final void a() {
    }

    public final void a(int i) {
        b(i);
    }

    public final void a(int i, int i2) {
    }

    public final void a(long j) {
        this.a.a(new aco(this, j), true);
    }

    public final void a(@Nullable Bundle bundle, String str) {
        if (bundle != null) {
            long[] longArray = bundle.getLongArray("bundle_selections".concat(String.valueOf(str)));
            if (longArray != null) {
                for (long a : longArray) {
                    a(a);
                }
            }
        }
    }

    public final void a(Item item) {
        a((u) item, -1);
    }

    public final void a(Item item, int i) {
        item.b(false);
        if (i >= 0) {
            this.a.notifyItemChanged(i);
        }
    }

    public final void a(Item item, int i, boolean z, boolean z2) {
        if (!z2 || item.f()) {
            item.b(true);
            this.a.notifyItemChanged(i);
            if (this.a.c() != null && z) {
                this.a.c().a(null, item, i);
            }
        }
    }

    public final boolean a(View view, int i, Item item) {
        if (!this.d && this.f) {
            a(view, (u) item, i);
        }
        return false;
    }

    public final acm<Item> b(boolean z) {
        this.e = z;
        return this;
    }

    public final void b() {
    }

    public final void b(int i) {
        u uVar = this.a.c(i).b;
        if (uVar != null) {
            a(uVar, i, false, false);
        }
    }

    public final void b(@Nullable Bundle bundle, String str) {
        if (bundle != null) {
            Set<u> g = this.a.g();
            long[] jArr = new long[g.size()];
            int i = 0;
            for (u c : g) {
                jArr[i] = c.c();
                i++;
            }
            bundle.putLongArray("bundle_selections".concat(String.valueOf(str)), jArr);
        }
    }

    public final boolean b(View view, int i, Item item) {
        if (this.d && this.f) {
            a(view, (u) item, i);
        }
        return false;
    }

    public final acm<Item> c() {
        this.d = false;
        return this;
    }

    public final acm<Item> d() {
        this.f = true;
        return this;
    }

    public final Set<Integer> e() {
        ArraySet arraySet = new ArraySet();
        int itemCount = this.a.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            if (this.a.b(i).e()) {
                arraySet.add(Integer.valueOf(i));
            }
        }
        return arraySet;
    }

    public final Set<Item> f() {
        ArraySet arraySet = new ArraySet();
        this.a.a(new acn(this, arraySet), false);
        return arraySet;
    }

    public final void g() {
        this.a.a(new acp(this), false);
        this.a.notifyDataSetChanged();
    }
}
