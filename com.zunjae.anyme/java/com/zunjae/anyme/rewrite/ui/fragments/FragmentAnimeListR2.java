package com.zunjae.anyme.rewrite.ui.fragments;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.as;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.l4digital.fastscroll.FastScroller;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.explore.DiscoveryActivity;
import com.zunjae.anyme.activities.explore.FastAnimeSearchActivity;
import com.zunjae.anyme.rewrite.adapters.c;
import com.zunjae.anyme.rewrite.viewmodels.AnimeViewModel;
import com.zunjae.zrecyclerview.a;
import com.zunjae.zrecyclerview.b;
import defpackage.aiv;
import defpackage.amu;
import defpackage.amw;
import defpackage.are;
import defpackage.ary;
import defpackage.asa;
import defpackage.atn;
import defpackage.aui;
import defpackage.auo;
import defpackage.aux;
import defpackage.de;
import defpackage.mh;
import defpackage.tw;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class FragmentAnimeListR2 extends Fragment {
    static final /* synthetic */ boolean a = true;
    private final String b = FragmentAnimeListR2.class.getName();
    private b c;
    private AnimeViewModel d;
    private c e;
    private int f;
    @BindView
    FastScroller fastScroller;
    private String g = BuildConfig.FLAVOR;
    private boolean h = false;
    private int i;
    @BindView
    RecyclerView recyclerView;
    @BindView
    SwipeRefreshLayout swipeRefreshLayout;
    @BindView
    TextView textSearchForAnime;
    @BindView
    ViewGroup viewGroupNoAnime;

    public static FragmentAnimeListR2 a(int i) {
        FragmentAnimeListR2 fragmentAnimeListR2 = new FragmentAnimeListR2();
        Bundle bundle = new Bundle();
        bundle.putInt("contentType", i);
        fragmentAnimeListR2.setArguments(bundle);
        return fragmentAnimeListR2;
    }

    private void a(List<are> list) {
        boolean z = false;
        if (list.size() == 0) {
            this.viewGroupNoAnime.setVisibility(0);
            this.recyclerView.setVisibility(8);
        } else {
            this.viewGroupNoAnime.setVisibility(8);
            this.recyclerView.setVisibility(0);
        }
        this.e.a((List) list, this.f);
        if (this.e.a()) {
            atn.a(requireContext(), this.recyclerView);
        }
        FastScroller fastScroller = this.fastScroller;
        if (list.size() > 10) {
            z = a;
        }
        fastScroller.setEnabled(z);
        aui a = aui.a();
        int i = this.f;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(list.size());
        a.c(new asa(i, stringBuilder.toString()));
        if (this.i < list.size()) {
            this.recyclerView.scrollToPosition(this.i);
        } else {
            this.recyclerView.scrollToPosition(list.size());
        }
        b bVar = this.c;
        if (bVar != null) {
            bVar.isDoneWithInit();
        }
    }

    private void b() {
        int b;
        int i;
        if ((aux.b("preference_key_use_listviewV4", false) ^ 1) != 1) {
            b = aux.b("@@KEY_Custom_Column_Count", 3);
            i = b + 2;
        } else {
            b = requireContext().getResources().getInteger(R.integer.span_optimized_layout);
            i = b + 1;
        }
        new b(requireContext(), this.recyclerView, this.e).b(a.b).a(b, i).a();
        this.recyclerView.addOnScrollListener(new a(this));
        b = this.f;
        switch (b) {
            case mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                c(0);
                return;
            case tw.a /*1*/:
                c(1);
                return;
            case tw.b /*2*/:
                b = 6;
                break;
            case f.c /*3*/:
                c(3);
                return;
            case mh.d /*4*/:
                b = 2;
                break;
            case mh.e /*5*/:
                b = 4;
                break;
            default:
                b(b);
                return;
        }
        c(b);
    }

    private void b(int i) {
        LiveData c;
        -$$Lambda$FragmentAnimeListR2$qSZWqNu200_D_Iw7CFZtiD-sTBE com_zunjae_anyme_rewrite_ui_fragments_-__Lambda_FragmentAnimeListR2_qSZWqNu200_D_Iw7CFZtiD-sTBE = new -$$Lambda$FragmentAnimeListR2$qSZWqNu200_D_Iw7CFZtiD-sTBE(this);
        switch (i) {
            case mh.f /*6*/:
                c = this.d.c();
                break;
            case mh.g /*7*/:
                c = this.d.b();
                break;
            default:
                throw new IllegalArgumentException("No switch case for ".concat(String.valueOf(i)));
        }
        c.observe(this, com_zunjae_anyme_rewrite_ui_fragments_-__Lambda_FragmentAnimeListR2_qSZWqNu200_D_Iw7CFZtiD-sTBE);
    }

    private /* synthetic */ void b(List list) {
        if (list != null) {
            auo auo = new auo("Sorting");
            are.a(list);
            auo.a();
            a(list);
        }
    }

    private /* synthetic */ void c() {
        aui.a().c(new amu());
        this.swipeRefreshLayout.setRefreshing(false);
    }

    private void c(int i) {
        this.d.a(i).observe(this, new -$$Lambda$FragmentAnimeListR2$wnh6P0KT8G13vrLkWrAoPmcQm5U(this));
    }

    private /* synthetic */ void c(List list) {
        if (list != null) {
            a(list);
        }
    }

    public final void a(b bVar) {
        this.c = bVar;
    }

    public final void a(String str, boolean z, boolean z2, boolean z3) {
        this.g = str;
        c cVar = this.e;
        if (cVar != null) {
            cVar.a(str, z, z2, z3);
            if (str.length() > 0) {
                this.textSearchForAnime.setVisibility(0);
                this.textSearchForAnime.setText(Html.fromHtml(String.format("<u>Click here to search for '%s' on MyAnimeList</u>", new Object[]{str})));
                return;
            }
            this.textSearchForAnime.setVisibility(8);
        }
    }

    public final boolean a() {
        c cVar = this.e;
        return (cVar == null || cVar.getItemCount() <= 0) ? false : a;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_anime_list_r2, viewGroup, false);
        ButterKnife.a(this, inflate);
        if (!a) {
            if (getArguments() == null) {
                throw new AssertionError();
            }
        }
        this.f = getArguments().getInt("contentType");
        this.d = (AnimeViewModel) as.a(this).a(AnimeViewModel.class);
        this.swipeRefreshLayout.setOnRefreshListener(new -$$Lambda$FragmentAnimeListR2$bEvT7N6PIwMflJCcsv7xd4iVDRo(this));
        this.e = new c(getActivity(), aux.b("preference_key_use_listviewV4", false) ^ 1, this.d, de.a((Fragment) this));
        this.fastScroller.setSectionIndexer(this.e);
        this.fastScroller.a(this.recyclerView);
        b();
        return inflate;
    }

    public final void onDestroy() {
        this.fastScroller.a();
        super.onDestroy();
    }

    @OnClick
    public final void onFindNewAnimeButtonClicked() {
        requireActivity().startActivity(new Intent(requireContext(), DiscoveryActivity.class));
    }

    @OnClick
    public final void onFindSeasonalAnimeClicked() {
        requireActivity().startActivity(new Intent(requireContext(), FastAnimeSearchActivity.class));
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("recyclerViewPosition", this.i);
    }

    @aiv
    public final void onScrollToTopBus(amw amw) {
        if (this.h) {
            RecyclerView recyclerView = this.recyclerView;
            if (recyclerView != null && this.e != null) {
                recyclerView.smoothScrollToPosition(0);
            }
        }
    }

    @OnClick
    public final void onSearchForTextClicked() {
        requireActivity().startActivity(FastAnimeSearchActivity.a(requireContext(), this.g));
    }

    @aiv
    public final void onSoftRefreshList(ary ary) {
        b();
    }

    public final void onStart() {
        super.onStart();
        aui.a().a((Object) this);
    }

    public final void onStop() {
        super.onStop();
        aui.a().b((Object) this);
    }

    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            this.i = bundle.getInt("recyclerViewPosition", 0);
        } else {
            this.i = 0;
        }
    }

    public final void setMenuVisibility(boolean z) {
        super.setMenuVisibility(z);
        this.h = z;
    }
}
