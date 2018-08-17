package com.zunjae.anyme.fragments;

import android.arch.lifecycle.as;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.anyme.adapters.AllWaifusAdapter;
import com.zunjae.anyme.rewrite.viewmodels.KanonViewModel;
import com.zunjae.zrecyclerview.a;
import com.zunjae.zrecyclerview.b;
import defpackage.asa;
import defpackage.asp;
import defpackage.aui;
import defpackage.aux;
import java.util.ArrayList;
import java.util.List;

public final class FragmentWaifus extends Fragment {
    private Context a;
    private boolean b = false;
    private KanonViewModel c;
    private AllWaifusAdapter d;
    @BindView
    TextView errorMessage;
    @BindView
    RecyclerView recyclerView;
    @BindView
    Spinner sortOrderSpinner;
    @BindView
    SwipeRefreshLayout swipeRefreshLayout;

    public static FragmentWaifus a() {
        return new FragmentWaifus();
    }

    private /* synthetic */ void a(List list) {
        if (list != null) {
            aui a = aui.a();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(list.size());
            a.c(new asa(8, stringBuilder.toString()));
            if (!this.d.b()) {
                asp.a(list, aux.b("KEY_SORT_ORDER_WAIFU", 0));
                this.d.a(list);
            }
        }
    }

    private /* synthetic */ void b() {
        this.c.c();
        this.swipeRefreshLayout.setRefreshing(false);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Object arrayList = new ArrayList();
        arrayList.add("Pick a sort order");
        arrayList.add("Date Added");
        arrayList.add("Name");
        arrayList.add("Show");
        this.sortOrderSpinner.setAdapter(new ArrayAdapter(requireActivity(), 17367049, arrayList));
        this.sortOrderSpinner.setPrompt("Pick your sort order");
        this.sortOrderSpinner.setOnItemSelectedListener(new c(this, arrayList));
        this.c.c();
        this.c.a().observe(this, new -$$Lambda$FragmentWaifus$81JQp-JV9yPQHLPOkREiLOt6BVk(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_anime_waifus, viewGroup, false);
        ButterKnife.a(this, inflate);
        this.a = inflate.getContext();
        this.c = (KanonViewModel) as.a(this).a(KanonViewModel.class);
        this.d = new AllWaifusAdapter((AbstractActivity) getActivity(), new ArrayList(), 0, this.c);
        new b(this.a, this.recyclerView, this.d).a(3, 5).b(a.b).a();
        this.swipeRefreshLayout.setOnRefreshListener(new -$$Lambda$FragmentWaifus$fJ3zGi7lTzI1FqJREir2n9m8jt4(this));
        return inflate;
    }
}
