package com.mikepenz.fastadapter;

import javax.annotation.Nullable;

public abstract class a<Item extends u> implements h<Item> {
    protected b<Item> a;
    protected int b = -1;

    public a<Item> a(b<Item> bVar) {
        this.a = bVar;
        return this;
    }

    public final void a(int i) {
        this.b = i;
    }

    public final void a(@Nullable Iterable<Item> iterable) {
        if (iterable != null && this.a != null) {
            for (Item a : iterable) {
                this.a.a((u) a);
            }
        }
    }

    public final int b() {
        return this.b;
    }

    public /* synthetic */ h b(b bVar) {
        return a(bVar);
    }

    public final b<Item> b_() {
        return this.a;
    }
}
