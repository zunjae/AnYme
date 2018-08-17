package com.zunjae.anyme.fragments.anime;

import android.arch.lifecycle.as;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.explore.DiscoveryListActivity;
import com.zunjae.anyme.adapters.animes.AnimeDiscordSuggestionAdapter;
import com.zunjae.anyme.adapters.animes.AnimeShowcaseAdapter;
import com.zunjae.anyme.rewrite.activities.UserRecommendationsActivity;
import com.zunjae.anyme.rewrite.adapters.AnimeUserRecommendationsAdapter;
import com.zunjae.anyme.rewrite.viewmodels.AnimeViewModel;
import com.zunjae.anyme.rewrite.viewmodels.KanonViewModel;
import defpackage.amz;
import defpackage.anb;
import defpackage.bid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FragmentAnimeDiscover extends Fragment {
    private static final String a = "FragmentAnimeDiscover";
    private Context b;
    private b c;
    @BindView
    CardView cardViewAiring;
    @BindView
    CardView cardViewSuggestions;
    @BindView
    CardView cardViewTop;
    @BindView
    CardView cardViewUpcoming;
    @BindView
    CardView cardViewUserRecommendations;
    private a d;
    private AnimeUserRecommendationsAdapter e;
    @BindView
    TextView errorMessage;
    private AnimeViewModel f;
    private KanonViewModel g;
    private boolean h = false;
    @BindView
    TextView messageUserRecommendation;
    @BindView
    TextView moreInfoRecommended;
    @BindView
    TextView moreInfoTopAiringAnime;
    @BindView
    TextView moreInfoTopAnime;
    @BindView
    TextView moreInfoTopUpcomingAnime;
    @BindView
    RecyclerView recyclerViewDiscordSuggestion;
    @BindView
    RecyclerView recyclerViewRecommendations;
    @BindView
    RecyclerView recyclerViewTopAiring;
    @BindView
    RecyclerView recyclerViewTopAll;
    @BindView
    RecyclerView recyclerViewTopUpcoming;
    @BindView
    RecyclerView recyclerViewTopWaifus;
    @BindView
    SwipeRefreshLayout swipeRefreshLayout;

    private GridLayoutManager a(int i) {
        return new GridLayoutManager(this.b, i, 0, false);
    }

    private void a() {
        a aVar = this.d;
        if (aVar != null) {
            aVar.e();
        }
        this.d = new a(this, getActivity());
        this.d.f();
    }

    private void a(RecyclerView recyclerView, List<anb> list) {
        if (bid.b(list)) {
            Collections.sort(list, anb.d());
            recyclerView.setLayoutManager(a(2));
            recyclerView.setAdapter(new AnimeShowcaseAdapter(getActivity(), list));
            return;
        }
        recyclerView.setVisibility(8);
    }

    static /* synthetic */ void a(FragmentAnimeDiscover fragmentAnimeDiscover, amz amz) {
        if (amz != null) {
            List a = amz.a().a();
            List b = amz.a().b();
            List c = amz.a().c();
            ArrayList d = amz.a().d();
            fragmentAnimeDiscover.a(fragmentAnimeDiscover.recyclerViewTopAll, a);
            fragmentAnimeDiscover.a(fragmentAnimeDiscover.recyclerViewTopAiring, b);
            fragmentAnimeDiscover.a(fragmentAnimeDiscover.recyclerViewTopUpcoming, c);
            RecyclerView recyclerView = fragmentAnimeDiscover.recyclerViewDiscordSuggestion;
            if (bid.b(d)) {
                Collections.shuffle(d);
                recyclerView.setLayoutManager(fragmentAnimeDiscover.a(1));
                recyclerView.setAdapter(new AnimeDiscordSuggestionAdapter(fragmentAnimeDiscover.getActivity(), d));
                return;
            }
            recyclerView.setVisibility(8);
        }
    }

    private /* synthetic */ void a(List list) {
        if (!this.h) {
            if (list != null) {
                if (list.size() != 0) {
                    RecyclerView recyclerView;
                    LayoutManager a;
                    this.messageUserRecommendation.setVisibility(8);
                    this.moreInfoRecommended.setVisibility(0);
                    if (list.size() < 10) {
                        recyclerView = this.recyclerViewRecommendations;
                        a = a(1);
                    } else {
                        recyclerView = this.recyclerViewRecommendations;
                        a = a(2);
                    }
                    recyclerView.setLayoutManager(a);
                    this.recyclerViewRecommendations.setAdapter(this.e);
                    this.e.a(list);
                    this.h = true;
                    return;
                }
            }
            this.messageUserRecommendation.setVisibility(0);
            this.messageUserRecommendation.setText("Recommendations will appear here in a moment, keep exploring and watching shows in AnYme!\n\nNote: recommendations are based on shows you like.");
            this.moreInfoRecommended.setVisibility(8);
        }
    }

    private void a(boolean z) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.e();
        }
        this.c = new b(this, getActivity());
        this.c.a(z);
        this.c.f();
    }

    private /* synthetic */ void b() {
        a(true);
        a();
        this.swipeRefreshLayout.setRefreshing(false);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(false);
        a();
        this.swipeRefreshLayout.setDistanceToTriggerSync(400);
        this.swipeRefreshLayout.setOnRefreshListener(new -$$Lambda$FragmentAnimeDiscover$P67V2s-i5NqDqHZA7Y_b_L-xAIU(this));
        this.e = new AnimeUserRecommendationsAdapter(requireActivity(), new ArrayList());
        this.f.k().observe(this, new -$$Lambda$FragmentAnimeDiscover$9F8N_ej4gLEXyj4mNvT_jPWUDxQ(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_anime_discover, viewGroup, false);
        ButterKnife.a(this, inflate);
        this.b = inflate.getContext();
        this.moreInfoTopAnime.setText(Html.fromHtml("<u>More Info</u>"));
        this.moreInfoTopAiringAnime.setText(Html.fromHtml("<u>More Info</u>"));
        this.moreInfoTopUpcomingAnime.setText(Html.fromHtml("<u>More Info</u>"));
        this.moreInfoRecommended.setText(Html.fromHtml("<u>All</u>"));
        this.f = (AnimeViewModel) as.a(this).a(AnimeViewModel.class);
        this.g = (KanonViewModel) as.a(this).a(KanonViewModel.class);
        return inflate;
    }

    @OnClick
    public void onMoreInfoRecommendedTextClicked() {
        requireActivity().startActivity(new Intent(requireContext(), UserRecommendationsActivity.class));
    }

    @OnClick
    public void onMoreInfoTopAiringAnimeClicked() {
        getActivity().startActivity(DiscoveryListActivity.a(this.b, 1, "Top Airing"));
    }

    @OnClick
    public void onMoreInfoTopAnimeClicked() {
        getActivity().startActivity(DiscoveryListActivity.a(this.b, 0, "All Anime"));
    }

    @OnClick
    public void onMoreInfoTopUpcomingAnimeClicked() {
        getActivity().startActivity(DiscoveryListActivity.a(this.b, 2, "Top Upcoming"));
    }
}
