package com.mikepenz.fastadapter;

import android.os.Bundle;
import android.support.v4.util.ArrayMap;
import android.support.v4.util.Pair;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.SparseArray;
import android.view.ViewGroup;
import defpackage.abw;
import defpackage.aca;
import defpackage.acb;
import defpackage.acd;
import defpackage.ace;
import defpackage.acf;
import defpackage.acg;
import defpackage.ach;
import defpackage.aci;
import defpackage.acj;
import defpackage.ack;
import defpackage.acl;
import defpackage.acm;
import defpackage.acr;
import defpackage.acw;
import defpackage.acx;
import defpackage.adb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class b<Item extends u> extends Adapter<ViewHolder> {
    private final ArrayList<h<Item>> a = new ArrayList();
    private z<Item> b;
    private final SparseArray<h<Item>> c = new SparseArray();
    private int d = 0;
    private List<acb<Item>> e;
    private final Map<Class, i<Item>> f = new ArrayMap();
    private acm<Item> g = new acm();
    private boolean h = false;
    private boolean i = true;
    private boolean j = false;
    private acg<Item> k;
    private acg<Item> l;
    private acj<Item> m;
    private acj<Item> n;
    private ack<Item> o;
    private ach p = new aci();
    private ace q = new acf();
    private aca<Item> r = new c(this);
    private acd<Item> s = new d(this);
    private acl<Item> t = new e(this);

    public b() {
        setHasStableIds(true);
    }

    public static int a(ViewHolder viewHolder) {
        return viewHolder.getAdapterPosition();
    }

    private static int a(SparseArray<?> sparseArray, int i) {
        int indexOfKey = sparseArray.indexOfKey(i);
        return indexOfKey < 0 ? (indexOfKey ^ -1) - 1 : indexOfKey;
    }

    public static <Item extends u> adb<Boolean, Item, Integer> a(h<Item> hVar, int i, n nVar, acr<Item> acr_Item, boolean z) {
        if (!(nVar.a() || nVar.b() == null)) {
            for (int i2 = 0; i2 < nVar.b().size(); i2++) {
                u uVar = (u) nVar.b().get(i2);
                if (acr_Item.a(uVar, -1) && z) {
                    return new adb(Boolean.TRUE, uVar, null);
                }
                if (uVar instanceof n) {
                    adb<Boolean, Item, Integer> a = a(hVar, i, (n) uVar, acr_Item, z);
                    if (((Boolean) a.a).booleanValue()) {
                        return a;
                    }
                }
            }
        }
        return new adb(Boolean.FALSE, null, null);
    }

    private <E extends i<Item>> b<Item> a(E e) {
        if (this.f.containsKey(e.getClass())) {
            throw new IllegalStateException("The given extension was already registered with this FastAdapter instance");
        }
        this.f.put(e.getClass(), e);
        e.a(this);
        return this;
    }

    public static <Item extends u, A extends h> b<Item> a(@Nullable Collection<A> collection, @Nullable Collection<i<Item>> collection2) {
        b bVar = new b();
        if (collection == null) {
            bVar.a.add(new abw());
        } else {
            bVar.a.addAll(collection);
        }
        for (int i = 0; i < bVar.a.size(); i++) {
            ((h) bVar.a.get(i)).b(bVar).a(i);
        }
        bVar.k();
        if (collection2 != null) {
            for (i a : collection2) {
                bVar.a(a);
            }
        }
        return bVar;
    }

    public static <Item extends u> Item a(@Nullable ViewHolder viewHolder, int i) {
        if (viewHolder != null) {
            Object tag = viewHolder.itemView.getTag(R.id.fastadapter_item_adapter);
            if (tag instanceof b) {
                return ((b) tag).b(i);
            }
        }
        return null;
    }

    private void d(int i, int i2) {
        for (i a : this.f.values()) {
            a.a(i, i2);
        }
        notifyItemRangeChanged(i, i2);
    }

    private z<Item> j() {
        if (this.b == null) {
            this.b = new acw();
        }
        return this.b;
    }

    private void k() {
        this.c.clear();
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (hVar.c() > 0) {
                this.c.append(i, hVar);
                i += hVar.c();
            }
        }
        if (i == 0 && this.a.size() > 0) {
            this.c.append(0, this.a.get(0));
        }
        this.d = i;
    }

    public final adb<Boolean, Item, Integer> a(acr<Item> acr_Item, int i, boolean z) {
        while (i < getItemCount()) {
            g c = c(i);
            u uVar = c.b;
            if (acr_Item.a(uVar, i) && z) {
                return new adb(Boolean.TRUE, uVar, Integer.valueOf(i));
            }
            if (uVar instanceof n) {
                adb<Boolean, Item, Integer> a = a(c.a, i, (n) uVar, acr_Item, z);
                if (((Boolean) a.a).booleanValue() && z) {
                    return a;
                }
            }
            i++;
        }
        return new adb(Boolean.FALSE, null, null);
    }

    public final adb<Boolean, Item, Integer> a(acr<Item> acr_Item, boolean z) {
        return a(acr_Item, 0, z);
    }

    public final Pair<Item, Integer> a(long j) {
        if (j == -1) {
            return null;
        }
        adb a = a(new f(this, j), 0, true);
        Object obj = a.b;
        return obj == null ? null : new Pair(obj, a.c);
    }

    public final b<Item> a(acg<Item> acg_Item) {
        this.l = acg_Item;
        return this;
    }

    public final b<Item> a(acj<Item> acj_Item) {
        this.n = acj_Item;
        return this;
    }

    public final b<Item> a(Bundle bundle) {
        return a(bundle, BuildConfig.FLAVOR);
    }

    public final b<Item> a(@Nullable Bundle bundle, String str) {
        for (i a : this.f.values()) {
            a.a(bundle, str);
        }
        return this;
    }

    public final b<Item> a(boolean z) {
        this.g.a(z);
        return this;
    }

    @Nullable
    public final <T extends i<Item>> T a(Class<? super T> cls) {
        return (i) this.f.get(cls);
    }

    public final Item a(int i) {
        return j().a(i);
    }

    public final Collection<i<Item>> a() {
        return this.f.values();
    }

    public final void a(int i, int i2) {
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
        k();
        notifyItemRangeInserted(i, i2);
    }

    public final void a(Item item) {
        if (j().a((u) item) && (item instanceof o)) {
            Collection a = ((o) item).a();
            if (a != null) {
                if (this.e == null) {
                    this.e = new LinkedList();
                }
                this.e.addAll(a);
            }
        }
    }

    public final int b(Item item) {
        if (item.c() == -1) {
            return -1;
        }
        long c = item.c();
        int i = 0;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (hVar.b() >= 0) {
                int a = hVar.a(c);
                if (a != -1) {
                    return i + a;
                }
                i = hVar.c();
            }
        }
        return -1;
    }

    public final Bundle b(@Nullable Bundle bundle) {
        String str = BuildConfig.FLAVOR;
        for (i b : this.f.values()) {
            b.b(bundle, str);
        }
        return bundle;
    }

    public final b<Item> b(boolean z) {
        this.g.b(z);
        return this;
    }

    public final Item b(int i) {
        if (i >= 0) {
            if (i < this.d) {
                int a = a(this.c, i);
                return ((h) this.c.valueAt(a)).b(i - this.c.keyAt(a));
            }
        }
        return null;
    }

    public final List<acb<Item>> b() {
        return this.e;
    }

    public final void b(int i, int i2) {
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
        k();
        notifyItemRangeRemoved(i, i2);
    }

    public final acg<Item> c() {
        return this.l;
    }

    public final g<Item> c(int i) {
        if (i >= 0) {
            if (i < getItemCount()) {
                g<Item> gVar = new g();
                int a = a(this.c, i);
                if (a != -1) {
                    gVar.b = ((h) this.c.valueAt(a)).b(i - this.c.keyAt(a));
                    gVar.a = (h) this.c.valueAt(a);
                    gVar.c = i;
                }
                return gVar;
            }
        }
        return new g();
    }

    public final void c(int i, int i2) {
        d(i, i2);
    }

    public final b<Item> d() {
        this.g.c();
        return this;
    }

    @Nullable
    public final h<Item> d(int i) {
        if (i >= 0) {
            if (i < this.d) {
                SparseArray sparseArray = this.c;
                return (h) sparseArray.valueAt(a(sparseArray, i));
            }
        }
        return null;
    }

    public final int e(int i) {
        int i2 = 0;
        if (this.d == 0) {
            return 0;
        }
        int i3 = 0;
        while (i2 < Math.min(i, this.a.size())) {
            i3 += ((h) this.a.get(i2)).c();
            i2++;
        }
        return i3;
    }

    public final b<Item> e() {
        a(this.g);
        this.g.d();
        return this;
    }

    public final int f(int i) {
        if (this.d == 0) {
            return 0;
        }
        SparseArray sparseArray = this.c;
        return sparseArray.keyAt(a(sparseArray, i));
    }

    @Deprecated
    public final Set<Integer> f() {
        return this.g.e();
    }

    @Deprecated
    public final Set<Item> g() {
        return this.g.f();
    }

    @Deprecated
    public final void g(int i) {
        this.g.b(i);
    }

    public final int getItemCount() {
        return this.d;
    }

    public final long getItemId(int i) {
        return b(i).c();
    }

    public final int getItemViewType(int i) {
        return b(i).g();
    }

    @Deprecated
    public final void h() {
        this.g.g();
    }

    public final void h(int i) {
        b(i, 1);
    }

    public final void i() {
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
        k();
        notifyDataSetChanged();
    }

    public final void i(int i) {
        d(i, 1);
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public final void onBindViewHolder(ViewHolder viewHolder, int i) {
        if (this.h) {
            if (this.j) {
                StringBuilder stringBuilder = new StringBuilder("onBindViewHolderLegacy: ");
                stringBuilder.append(i);
                stringBuilder.append("/");
                stringBuilder.append(viewHolder.getItemViewType());
                stringBuilder.append(" isLegacy: true");
            }
            viewHolder.itemView.setTag(R.id.fastadapter_item_adapter, this);
            this.q.a(viewHolder, i, Collections.EMPTY_LIST);
        }
    }

    public final void onBindViewHolder(ViewHolder viewHolder, int i, List<Object> list) {
        if (!this.h) {
            if (this.j) {
                StringBuilder stringBuilder = new StringBuilder("onBindViewHolder: ");
                stringBuilder.append(i);
                stringBuilder.append("/");
                stringBuilder.append(viewHolder.getItemViewType());
                stringBuilder.append(" isLegacy: false");
            }
            viewHolder.itemView.setTag(R.id.fastadapter_item_adapter, this);
            this.q.a(viewHolder, i, list);
        }
        super.onBindViewHolder(viewHolder, i, list);
    }

    public final ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewHolder a = this.p.a(this, viewGroup, i);
        a.itemView.setTag(R.id.fastadapter_item_adapter, this);
        if (this.i) {
            acx.a(this.r, a, a.itemView);
            acx.a(this.s, a, a.itemView);
            acx.a(this.t, a, a.itemView);
        }
        return this.p.a(this, a);
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
    }

    public final boolean onFailedToRecycleView(ViewHolder viewHolder) {
        if (this.j) {
            new StringBuilder("onFailedToRecycleView: ").append(viewHolder.getItemViewType());
        }
        ace ace = this.q;
        viewHolder.getAdapterPosition();
        ace.b(viewHolder);
        return super.onFailedToRecycleView(viewHolder);
    }

    public final void onViewAttachedToWindow(ViewHolder viewHolder) {
        if (this.j) {
            new StringBuilder("onViewAttachedToWindow: ").append(viewHolder.getItemViewType());
        }
        super.onViewAttachedToWindow(viewHolder);
        this.q.a(viewHolder, viewHolder.getAdapterPosition());
    }

    public final void onViewDetachedFromWindow(ViewHolder viewHolder) {
        if (this.j) {
            new StringBuilder("onViewDetachedFromWindow: ").append(viewHolder.getItemViewType());
        }
        super.onViewDetachedFromWindow(viewHolder);
        this.q.b(viewHolder, viewHolder.getAdapterPosition());
    }

    public final void onViewRecycled(ViewHolder viewHolder) {
        if (this.j) {
            new StringBuilder("onViewRecycled: ").append(viewHolder.getItemViewType());
        }
        super.onViewRecycled(viewHolder);
        ace ace = this.q;
        viewHolder.getAdapterPosition();
        ace.a(viewHolder);
    }
}
