package com.zunjae.zrecyclerview;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.StaggeredGridLayoutManager;
import defpackage.tw;

public final class b {
    private final Context a;
    private final RecyclerView b;
    private final Adapter c;
    private int d = 1;
    private int e = -1;
    private int f = a.a;
    private LayoutManager g;

    public b(Context context, RecyclerView recyclerView, Adapter adapter) {
        this.a = context;
        this.b = recyclerView;
        this.c = adapter;
    }

    public final b a() {
        if (this.f != a.a && this.e < 0) {
            this.e = this.d;
        }
        int i = (this.a.getResources().getConfiguration().orientation == 1 ? 1 : null) != null ? this.d : this.e;
        switch (c.a[this.f - 1]) {
            case tw.a /*1*/:
                this.g = new LinearLayoutManager(this.a);
                break;
            case tw.b /*2*/:
                this.g = new GridLayoutManager(this.a, i);
                break;
            case f.c /*3*/:
                this.g = new StaggeredGridLayoutManager(i, 0);
                break;
            default:
                throw new IllegalArgumentException("incorrect enum set");
        }
        this.b.setLayoutManager(this.g);
        this.b.setAdapter(this.c);
        return this;
    }

    public final b a(int i) {
        this.d = i;
        return this;
    }

    public final b a(int i, int i2) {
        this.e = i2;
        this.d = i;
        return this;
    }

    public final b b(int i) {
        this.f = i;
        return this;
    }
}
