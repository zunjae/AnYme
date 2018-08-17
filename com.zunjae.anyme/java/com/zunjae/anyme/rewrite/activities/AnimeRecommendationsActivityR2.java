package com.zunjae.anyme.rewrite.activities;

import android.arch.lifecycle.as;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.anyme.rewrite.adapters.AnimeRecommendationsAdapter;
import com.zunjae.anyme.rewrite.viewmodels.AnimeViewModel;
import com.zunjae.zrecyclerview.a;
import com.zunjae.zrecyclerview.b;
import defpackage.atn;
import java.util.ArrayList;
import java.util.List;

public final class AnimeRecommendationsActivityR2 extends AbstractActivity {
    private AnimeRecommendationsAdapter c;
    @BindView
    RecyclerView recyclerView;
    @BindView
    Toolbar toolbar;

    public static Intent a(Context context, int i, String str) {
        Intent intent = new Intent(context, AnimeRecommendationsActivityR2.class);
        intent.putExtra("animeId", i);
        intent.putExtra("seriesTitle", str);
        return intent;
    }

    private /* synthetic */ void a(List list) {
        if (list != null) {
            this.c.a(list);
            atn.a(this.b, this.recyclerView);
        }
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_anime_characters);
        ButterKnife.a(this);
        int intExtra = getIntent().getIntExtra("animeId", -1);
        String stringExtra = getIntent().getStringExtra("seriesTitle");
        if (intExtra <= 0 || stringExtra == null) {
            throw new IllegalArgumentException("Incorrect arguments given");
        }
        a(this.toolbar, "Related Anime", stringExtra, true);
        AnimeViewModel animeViewModel = (AnimeViewModel) as.a(this).a(AnimeViewModel.class);
        this.c = new AnimeRecommendationsAdapter(this, new ArrayList(), 1);
        new b(this, this.recyclerView, this.c).b(a.b).a(3, 5).a();
        animeViewModel.a().h((long) intExtra).observe(this, new -$$Lambda$AnimeRecommendationsActivityR2$c0Rqc02kSs075o--udijb5_yIAs(this));
    }
}
