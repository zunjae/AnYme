package com.zunjae.anyme.rewrite.activities;

import android.arch.lifecycle.as;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.anyme.adapters.animes.AnimeRecommendationAdapter;
import com.zunjae.anyme.rewrite.viewmodels.AnimeViewModel;
import com.zunjae.zrecyclerview.a;
import com.zunjae.zrecyclerview.b;
import defpackage.anq;
import defpackage.arg;
import defpackage.bid;
import java.util.ArrayList;
import java.util.List;

public final class UserRecommendationsActivity extends AbstractActivity {
    private final String c = "VideosActivity";
    private AnimeRecommendationAdapter d;
    @BindView
    TextView errorMessage;
    @BindView
    RecyclerView recyclerView;
    @BindView
    SwipeRefreshLayout swipeRefreshLayout;
    @BindView
    Toolbar toolbar;

    private void a(List<arg> list) {
        if (bid.a(list)) {
            this.errorMessage.setVisibility(0);
            this.errorMessage.setText("Recommendations will appear here in a moment, keep exploring and watching shows in AnYme!\n\nNote: recommendations are based on shows you like.");
            return;
        }
        this.errorMessage.setVisibility(8);
        if (!this.d.a()) {
            this.d.a(list);
        }
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.abstract_activity_basic_recyclerview_with_error);
        ButterKnife.a(this);
        StringBuilder stringBuilder = new StringBuilder("for ");
        stringBuilder.append(anq.c().a());
        a(this.toolbar, "Recommendations", stringBuilder.toString(), true);
        this.swipeRefreshLayout.setEnabled(false);
        AnimeViewModel animeViewModel = (AnimeViewModel) as.a(this).a(AnimeViewModel.class);
        this.d = new AnimeRecommendationAdapter(this, new ArrayList(), animeViewModel);
        new b(this.b, this.recyclerView, this.d).a(1, 2).b(a.b).a();
        animeViewModel.k().observe(this, new -$$Lambda$UserRecommendationsActivity$TwHjZ0AjtcqFBQb2jGs17CugXeU(this));
    }
}
