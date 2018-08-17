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
import com.zunjae.anyme.adapters.animes.AnimeRelatedShowsAdapter;
import com.zunjae.anyme.rewrite.viewmodels.AnimeViewModel;
import com.zunjae.zrecyclerview.a;
import com.zunjae.zrecyclerview.b;
import defpackage.atn;
import java.util.List;

public final class RelatedAnimeActivityR2 extends AbstractActivity {
    private AnimeRelatedShowsAdapter c;
    @BindView
    RecyclerView recyclerView;
    @BindView
    Toolbar toolbar;

    public static Intent a(Context context, int i, String str) {
        Intent intent = new Intent(context, RelatedAnimeActivityR2.class);
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
        this.c = new AnimeRelatedShowsAdapter(this, 1);
        new b(this, this.recyclerView, this.c).b(a.b).a(3, 5).a();
        ((AnimeViewModel) as.a(this).a(AnimeViewModel.class)).f(intExtra).observe(this, new -$$Lambda$RelatedAnimeActivityR2$Ptw_ohwwU3ALflnbeptoHt-3GcY(this));
    }
}
