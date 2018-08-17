package defpackage;

import com.mikepenz.fastadapter.j;
import com.mikepenz.fastadapter.u;
import java.util.ArrayList;
import java.util.List;

public final class acv<Item extends u> extends acu<Item> {
    protected List<Item> a;

    public acv() {
        this(new ArrayList());
    }

    private acv(List<Item> list) {
        this.a = list;
    }

    public final int a() {
        return this.a.size();
    }

    public final int a(long j) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (((u) this.a.get(i)).c() == j) {
                return i;
            }
        }
        return -1;
    }

    public final void a(int i) {
        int size = this.a.size();
        this.a.clear();
        if (c() != null) {
            c().b(i, size);
        }
    }

    public final void a(int i, int i2) {
        this.a.remove(i - i2);
        if (c() != null) {
            c().h(i);
        }
    }

    public final void a(int i, int i2, int i3) {
        i2 = Math.min(i2, (this.a.size() - i) + i3);
        for (int i4 = 0; i4 < i2; i4++) {
            this.a.remove(i - i3);
        }
        if (c() != null) {
            c().b(i, i2);
        }
    }

    public final /* synthetic */ void a(int i, Object obj, int i2) {
        this.a.set(i - i2, (u) obj);
        if (c() != null) {
            c().i(i);
        }
    }

    public final void a(int i, List<Item> list, int i2) {
        this.a.addAll(i - i2, list);
        if (c() != null) {
            c().a(i, list.size());
        }
    }

    public final void a(List<Item> list) {
        this.a = new ArrayList(list);
        if (c() != null) {
            c().i();
        }
    }

    public final void a(List<Item> list, int i) {
        int size = this.a.size();
        this.a.addAll(list);
        if (c() != null) {
            c().a(i + size, list.size());
        }
    }

    public final /* synthetic */ Object b(int i) {
        return (u) this.a.get(i);
    }

    public final List<Item> b() {
        return this.a;
    }

    public final void b(List<Item> list, int i) {
        int size = list.size();
        int size2 = this.a.size();
        List<Item> list2 = this.a;
        if (list != list2) {
            if (!list2.isEmpty()) {
                this.a.clear();
            }
            this.a.addAll(list);
        }
        if (c() != null) {
            j.a.a(c(), size, size2, i);
        }
    }
}
