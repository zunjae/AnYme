package com.zunjae.anyme.rewrite.ui.bls;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import com.cunoraz.tagview.TagView;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class FragmentAnimeInfoExtendedBL_ViewBinding implements Unbinder {
    private FragmentAnimeInfoExtendedBL b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;

    public FragmentAnimeInfoExtendedBL_ViewBinding(FragmentAnimeInfoExtendedBL fragmentAnimeInfoExtendedBL, View view) {
        this.b = fragmentAnimeInfoExtendedBL;
        fragmentAnimeInfoExtendedBL.charactersRecyclerView = (RecyclerView) ct.a(view, (int) R.id.charactersRecyclerView, "field 'charactersRecyclerView'", RecyclerView.class);
        fragmentAnimeInfoExtendedBL.charactersErrorMessage = (TextView) ct.a(view, (int) R.id.charactersErrorMessage, "field 'charactersErrorMessage'", TextView.class);
        fragmentAnimeInfoExtendedBL.progressBarAdditionalInfo = (ProgressBar) ct.a(view, (int) R.id.progressBarAdditionalInfo, "field 'progressBarAdditionalInfo'", ProgressBar.class);
        fragmentAnimeInfoExtendedBL.progressBarSynopsis = (ProgressBar) ct.a(view, (int) R.id.progressBar, "field 'progressBarSynopsis'", ProgressBar.class);
        fragmentAnimeInfoExtendedBL.errorMessageAdditionalInfo = (TextView) ct.a(view, (int) R.id.additionalInfoErrorMessage, "field 'errorMessageAdditionalInfo'", TextView.class);
        fragmentAnimeInfoExtendedBL.errorMessageSynopsis = (TextView) ct.a(view, (int) R.id.synopsisErrorMessage, "field 'errorMessageSynopsis'", TextView.class);
        fragmentAnimeInfoExtendedBL.genreTagsErrorMessage = (TextView) ct.a(view, (int) R.id.genresErrorMessage, "field 'genreTagsErrorMessage'", TextView.class);
        fragmentAnimeInfoExtendedBL.genreTagsView = (TagView) ct.a(view, (int) R.id.genresTagView, "field 'genreTagsView'", TagView.class);
        fragmentAnimeInfoExtendedBL.recyclerViewRelatedAnime = (RecyclerView) ct.a(view, (int) R.id.recyclerViewRelatedShows, "field 'recyclerViewRelatedAnime'", RecyclerView.class);
        fragmentAnimeInfoExtendedBL.relatedAnimeErrorMessage = (TextView) ct.a(view, (int) R.id.relatedAnimeErrorMessage, "field 'relatedAnimeErrorMessage'", TextView.class);
        fragmentAnimeInfoExtendedBL.additionalInfoRecyclerView = (RecyclerView) ct.a(view, (int) R.id.recyclerView, "field 'additionalInfoRecyclerView'", RecyclerView.class);
        fragmentAnimeInfoExtendedBL.synopsisAnime = (TextView) ct.a(view, (int) R.id.animeSynopsisMessage, "field 'synopsisAnime'", TextView.class);
        View a = ct.a(view, R.id.readMoreSummary, "field 'readMoreText' and method 'onReadMoreSummaryClicked'");
        fragmentAnimeInfoExtendedBL.readMoreText = (TextView) ct.b(a, R.id.readMoreSummary, "field 'readMoreText'", TextView.class);
        this.c = a;
        a.setOnClickListener(new r(this, fragmentAnimeInfoExtendedBL));
        fragmentAnimeInfoExtendedBL.recyclerViewRecommendations = (RecyclerView) ct.a(view, (int) R.id.recyclerViewRecommendations, "field 'recyclerViewRecommendations'", RecyclerView.class);
        fragmentAnimeInfoExtendedBL.recommendationsErrorMessage = (TextView) ct.a(view, (int) R.id.recommendationsAnimeErrorMessage, "field 'recommendationsErrorMessage'", TextView.class);
        a = ct.a(view, R.id.viewAllCharacters, "field 'viewAllCharacters' and method 'onViewAllCharactersClicked'");
        fragmentAnimeInfoExtendedBL.viewAllCharacters = (TextView) ct.b(a, R.id.viewAllCharacters, "field 'viewAllCharacters'", TextView.class);
        this.d = a;
        a.setOnClickListener(new s(this, fragmentAnimeInfoExtendedBL));
        a = ct.a(view, R.id.viewAllRecommendations, "field 'viewAllRecommendations' and method 'onViewAllRecommendationsClicked'");
        fragmentAnimeInfoExtendedBL.viewAllRecommendations = (TextView) ct.b(a, R.id.viewAllRecommendations, "field 'viewAllRecommendations'", TextView.class);
        this.e = a;
        a.setOnClickListener(new t(this, fragmentAnimeInfoExtendedBL));
        a = ct.a(view, R.id.viewAllRelated, "field 'viewAllRelated' and method 'onViewAllRelatedClicked'");
        fragmentAnimeInfoExtendedBL.viewAllRelated = (TextView) ct.b(a, R.id.viewAllRelated, "field 'viewAllRelated'", TextView.class);
        this.f = a;
        a.setOnClickListener(new u(this, fragmentAnimeInfoExtendedBL));
        view = ct.a(view, R.id.buttonOpenMyAnimeList, "method 'onOpenMalButtonClicked'");
        this.g = view;
        view.setOnClickListener(new v(this, fragmentAnimeInfoExtendedBL));
    }

    public final void a() {
        FragmentAnimeInfoExtendedBL fragmentAnimeInfoExtendedBL = this.b;
        if (fragmentAnimeInfoExtendedBL != null) {
            this.b = null;
            fragmentAnimeInfoExtendedBL.charactersRecyclerView = null;
            fragmentAnimeInfoExtendedBL.charactersErrorMessage = null;
            fragmentAnimeInfoExtendedBL.progressBarAdditionalInfo = null;
            fragmentAnimeInfoExtendedBL.progressBarSynopsis = null;
            fragmentAnimeInfoExtendedBL.errorMessageAdditionalInfo = null;
            fragmentAnimeInfoExtendedBL.errorMessageSynopsis = null;
            fragmentAnimeInfoExtendedBL.genreTagsErrorMessage = null;
            fragmentAnimeInfoExtendedBL.genreTagsView = null;
            fragmentAnimeInfoExtendedBL.recyclerViewRelatedAnime = null;
            fragmentAnimeInfoExtendedBL.relatedAnimeErrorMessage = null;
            fragmentAnimeInfoExtendedBL.additionalInfoRecyclerView = null;
            fragmentAnimeInfoExtendedBL.synopsisAnime = null;
            fragmentAnimeInfoExtendedBL.readMoreText = null;
            fragmentAnimeInfoExtendedBL.recyclerViewRecommendations = null;
            fragmentAnimeInfoExtendedBL.recommendationsErrorMessage = null;
            fragmentAnimeInfoExtendedBL.viewAllCharacters = null;
            fragmentAnimeInfoExtendedBL.viewAllRecommendations = null;
            fragmentAnimeInfoExtendedBL.viewAllRelated = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.g.setOnClickListener(null);
            this.g = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
