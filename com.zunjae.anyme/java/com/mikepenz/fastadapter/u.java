package com.mikepenz.fastadapter;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.ViewGroup;
import java.util.List;

public interface u<T, VH extends ViewHolder> extends q<T> {
    VH a(ViewGroup viewGroup);

    void a(VH vh, List<Object> list);

    T b(boolean z);

    boolean d();

    boolean e();

    boolean f();

    int g();
}
