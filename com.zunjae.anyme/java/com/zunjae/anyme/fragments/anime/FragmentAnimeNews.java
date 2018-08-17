package com.zunjae.anyme.fragments.anime;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.zunjae.anyme.R;
import com.zunjae.anyme.adapters.animes.AnimeNewsArticleAdapter;
import com.zunjae.zrecyclerview.a;
import com.zunjae.zrecyclerview.b;
import defpackage.ame;
import defpackage.are;
import java.util.ArrayList;

public final class FragmentAnimeNews extends Fragment {
    private Context a;
    private are b;
    private j c;
    private ArrayList<ame> d;
    private AnimeNewsArticleAdapter e;
    @BindView
    TextView errorMessage;
    @BindView
    RecyclerView recyclerView;
    @BindView
    SwipeRefreshLayout swipeRefreshLayout;

    public static FragmentAnimeNews a(are are) {
        FragmentAnimeNews fragmentAnimeNews = new FragmentAnimeNews();
        Bundle bundle = new Bundle();
        bundle.putParcelable("anime", are);
        fragmentAnimeNews.setArguments(bundle);
        return fragmentAnimeNews;
    }

    private void a() {
        this.c = new j(this, getActivity());
        this.c.f();
    }

    private void a(ArrayList<ame> arrayList) {
        this.e = new AnimeNewsArticleAdapter(this.a, arrayList);
        new b(this.a, this.recyclerView, this.e).b(a.b).a(1, 2).a();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.b = (are) getArguments().getParcelable("anime");
        if (bundle != null) {
            this.d = bundle.getParcelableArrayList("newsArticles");
            ArrayList arrayList = this.d;
            if (arrayList != null) {
                a(arrayList);
                this.swipeRefreshLayout.setDistanceToTriggerSync(400);
                this.swipeRefreshLayout.setOnRefreshListener(new i(this));
            }
        }
        a();
        this.swipeRefreshLayout.setDistanceToTriggerSync(400);
        this.swipeRefreshLayout.setOnRefreshListener(new i(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_anime_news, viewGroup, false);
        ButterKnife.a(this, inflate);
        this.a = inflate.getContext();
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ArrayList arrayList = this.d;
        if (arrayList != null) {
            bundle.putParcelableArrayList("newsArticles", arrayList);
        }
    }
}
