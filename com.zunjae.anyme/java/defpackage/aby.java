package defpackage;

import com.mikepenz.fastadapter.a;
import com.mikepenz.fastadapter.b;
import com.mikepenz.fastadapter.g;
import com.mikepenz.fastadapter.h;
import com.mikepenz.fastadapter.i;
import com.mikepenz.fastadapter.n;
import com.mikepenz.fastadapter.p;
import com.mikepenz.fastadapter.q;
import com.mikepenz.fastadapter.s;
import com.mikepenz.fastadapter.u;
import com.mikepenz.fastadapter.v;
import com.mikepenz.fastadapter.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public class aby<Model, Item extends u> extends a<Item> implements v<Model, Item> {
    private final x<Item> c;
    private s<Model, Item> d;
    private p<Item> e;
    private boolean f;
    private abx<Model, Item> g;

    public aby(s<Model, Item> sVar) {
        this(new acv(), sVar);
    }

    private aby(x<Item> xVar, s<Model, Item> sVar) {
        this.f = true;
        this.g = new abx(this);
        this.d = sVar;
        this.c = xVar;
    }

    @Nullable
    private Item a(Model model) {
        return (u) this.d.a(model);
    }

    private List<Item> c(List<Model> list) {
        List<Item> arrayList = new ArrayList(list.size());
        for (Model a : list) {
            u a2 = a((Object) a);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    private p<Item> e() {
        p<Item> pVar = this.e;
        return pVar == null ? p.a : pVar;
    }

    public final int a(long j) {
        return this.c.a(j);
    }

    public final aby<Model, Item> a(p<Item> pVar) {
        this.e = pVar;
        return this;
    }

    public final a<Item> a(b<Item> bVar) {
        x xVar = this.c;
        if (xVar instanceof acu) {
            ((acu) xVar).a(bVar);
        }
        return super.a((b) bVar);
    }

    public final /* synthetic */ v a() {
        this.c.a(b_().e(b()));
        return this;
    }

    public final /* synthetic */ v a(int i, int i2) {
        this.c.a(i, i2, b_().f(i));
        return this;
    }

    public final /* synthetic */ v a(int i, Object obj) {
        return b(i, obj);
    }

    public final /* synthetic */ v a(int i, List list) {
        if (this.f) {
            e().a(list);
        }
        if (list.size() > 0) {
            this.c.a(i, list, b_().e(b()));
            a((Iterable) list);
        }
        return this;
    }

    public final /* synthetic */ v a(List list) {
        list = c(list);
        if (this.f) {
            e().a(list);
        }
        if (this.g.a() != null) {
            this.g.performFiltering(null);
        }
        a((Iterable) list);
        this.c.a(list);
        return this;
    }

    @SafeVarargs
    public final /* synthetic */ v a(Object[] objArr) {
        List c = c(Arrays.asList(objArr));
        if (this.f) {
            e().a(c);
        }
        b b_ = b_();
        if (b_ != null) {
            this.c.a(c, b_.e(b()));
        } else {
            this.c.a(c, 0);
        }
        a((Iterable) c);
        return this;
    }

    public final aby<Model, Item> b(int i, Model model) {
        u a = a((Object) model);
        if (a == null) {
            return this;
        }
        if (this.f) {
            e().a((q) a);
        }
        this.c.a(i, (Object) a, b_().f(i));
        this.a.a(a);
        return this;
    }

    public final aby<Model, Item> b(long j) {
        acr abz = new abz(this, j);
        int e = b_().e(b());
        for (int i = 0; i < c(); i++) {
            int i2 = i + e;
            g c = b_().c(i2);
            u uVar = c.b;
            abz.a(uVar, i2);
            if (uVar instanceof n) {
                ((Boolean) b.a(c.a, i2, (n) uVar, abz, false).a).booleanValue();
            }
        }
        adb adb = new adb(Boolean.FALSE, null, null);
        return this;
    }

    public final aby<Model, Item> b(List<Item> list) {
        if (this.f) {
            e().a((List) list);
        }
        for (i a : b_().a()) {
            a.a();
        }
        a((Iterable) list);
        this.c.b(list, b_().e(b()));
        return this;
    }

    public final /* synthetic */ h b(b bVar) {
        return a(bVar);
    }

    public final Item b(int i) {
        return (u) this.c.b(i);
    }

    public final int c() {
        return this.c.a();
    }

    public final int c(int i) {
        return i + b_().e(b());
    }

    public final aby<Model, Item> d(int i) {
        this.c.a(i, b_().f(i));
        return this;
    }

    public final List<Item> d() {
        return this.c.b();
    }
}
