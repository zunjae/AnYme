package com.zunjae.anyme.fragments.anime;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public class FragmentAnimeDiscover_ViewBinding implements Unbinder {
    private FragmentAnimeDiscover b;
    private View c;
    private View d;
    private View e;
    private View f;

    public FragmentAnimeDiscover_ViewBinding(FragmentAnimeDiscover fragmentAnimeDiscover, View view) {
        this.b = fragmentAnimeDiscover;
        fragmentAnimeDiscover.recyclerViewDiscordSuggestion = (RecyclerView) ct.a(view, (int) R.id.recyclerViewDiscordSuggestion, "field 'recyclerViewDiscordSuggestion'", RecyclerView.class);
        fragmentAnimeDiscover.recyclerViewTopAll = (RecyclerView) ct.a(view, (int) R.id.recyclerViewTopAll, "field 'recyclerViewTopAll'", RecyclerView.class);
        fragmentAnimeDiscover.recyclerViewTopAiring = (RecyclerView) ct.a(view, (int) R.id.recyclerViewTopAiring, "field 'recyclerViewTopAiring'", RecyclerView.class);
        fragmentAnimeDiscover.recyclerViewTopUpcoming = (RecyclerView) ct.a(view, (int) R.id.recyclerViewTopUpcoming, "field 'recyclerViewTopUpcoming'", RecyclerView.class);
        fragmentAnimeDiscover.recyclerViewTopWaifus = (RecyclerView) ct.a(view, (int) R.id.recyclerViewTopWaifus, "field 'recyclerViewTopWaifus'", RecyclerView.class);
        fragmentAnimeDiscover.recyclerViewRecommendations = (RecyclerView) ct.a(view, (int) R.id.recyclerViewRecommendations, "field 'recyclerViewRecommendations'", RecyclerView.class);
        fragmentAnimeDiscover.cardViewAiring = (CardView) ct.a(view, (int) R.id.cardViewContainerAiring, "field 'cardViewAiring'", CardView.class);
        fragmentAnimeDiscover.cardViewTop = (CardView) ct.a(view, (int) R.id.cardViewContainerTop, "field 'cardViewTop'", CardView.class);
        fragmentAnimeDiscover.cardViewSuggestions = (CardView) ct.a(view, (int) R.id.cardViewContainerSuggestions, "field 'cardViewSuggestions'", CardView.class);
        fragmentAnimeDiscover.cardViewUpcoming = (CardView) ct.a(view, (int) R.id.cardViewContainerUpcoming, "field 'cardViewUpcoming'", CardView.class);
        fragmentAnimeDiscover.cardViewUserRecommendations = (CardView) ct.a(view, (int) R.id.cardViewContainerUserRecommendations, "field 'cardViewUserRecommendations'", CardView.class);
        fragmentAnimeDiscover.swipeRefreshLayout = (SwipeRefreshLayout) ct.a(view, (int) R.id.swipeRefreshLayout, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
        fragmentAnimeDiscover.errorMessage = (TextView) ct.a(view, (int) R.id.errorMessage, "field 'errorMessage'", TextView.class);
        fragmentAnimeDiscover.messageUserRecommendation = (TextView) ct.a(view, (int) R.id.messageUserRecommendations, "field 'messageUserRecommendation'", TextView.class);
        View a = ct.a(view, R.id.moreInfoTopAnime, "field 'moreInfoTopAnime' and method 'onMoreInfoTopAnimeClicked'");
        fragmentAnimeDiscover.moreInfoTopAnime = (TextView) ct.b(a, R.id.moreInfoTopAnime, "field 'moreInfoTopAnime'", TextView.class);
        this.c = a;
        a.setOnClickListener(new c(this, fragmentAnimeDiscover));
        a = ct.a(view, R.id.moreInfoTopAiringAnime, "field 'moreInfoTopAiringAnime' and method 'onMoreInfoTopAiringAnimeClicked'");
        fragmentAnimeDiscover.moreInfoTopAiringAnime = (TextView) ct.b(a, R.id.moreInfoTopAiringAnime, "field 'moreInfoTopAiringAnime'", TextView.class);
        this.d = a;
        a.setOnClickListener(new d(this, fragmentAnimeDiscover));
        a = ct.a(view, R.id.moreInfoTopUpcomingAnime, "field 'moreInfoTopUpcomingAnime' and method 'onMoreInfoTopUpcomingAnimeClicked'");
        fragmentAnimeDiscover.moreInfoTopUpcomingAnime = (TextView) ct.b(a, R.id.moreInfoTopUpcomingAnime, "field 'moreInfoTopUpcomingAnime'", TextView.class);
        this.e = a;
        a.setOnClickListener(new e(this, fragmentAnimeDiscover));
        view = ct.a(view, R.id.moreInfoRecommended, "field 'moreInfoRecommended' and method 'onMoreInfoRecommendedTextClicked'");
        fragmentAnimeDiscover.moreInfoRecommended = (TextView) ct.b(view, R.id.moreInfoRecommended, "field 'moreInfoRecommended'", TextView.class);
        this.f = view;
        view.setOnClickListener(new f(this, fragmentAnimeDiscover));
    }

    public final void a() {
        FragmentAnimeDiscover fragmentAnimeDiscover = this.b;
        if (fragmentAnimeDiscover != null) {
            this.b = null;
            fragmentAnimeDiscover.recyclerViewDiscordSuggestion = null;
            fragmentAnimeDiscover.recyclerViewTopAll = null;
            fragmentAnimeDiscover.recyclerViewTopAiring = null;
            fragmentAnimeDiscover.recyclerViewTopUpcoming = null;
            fragmentAnimeDiscover.recyclerViewTopWaifus = null;
            fragmentAnimeDiscover.recyclerViewRecommendations = null;
            fragmentAnimeDiscover.cardViewAiring = null;
            fragmentAnimeDiscover.cardViewTop = null;
            fragmentAnimeDiscover.cardViewSuggestions = null;
            fragmentAnimeDiscover.cardViewUpcoming = null;
            fragmentAnimeDiscover.cardViewUserRecommendations = null;
            fragmentAnimeDiscover.swipeRefreshLayout = null;
            fragmentAnimeDiscover.errorMessage = null;
            fragmentAnimeDiscover.messageUserRecommendation = null;
            fragmentAnimeDiscover.moreInfoTopAnime = null;
            fragmentAnimeDiscover.moreInfoTopAiringAnime = null;
            fragmentAnimeDiscover.moreInfoTopUpcomingAnime = null;
            fragmentAnimeDiscover.moreInfoRecommended = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.f.setOnClickListener(null);
            this.f = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
