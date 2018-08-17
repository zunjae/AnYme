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
import com.zunjae.anyme.rewrite.adapters.AnimeCharactersAdapterR2;
import com.zunjae.anyme.rewrite.viewmodels.CharactersViewModel;
import com.zunjae.anyme.rewrite.viewmodels.KanonViewModel;
import com.zunjae.zrecyclerview.a;
import com.zunjae.zrecyclerview.b;
import defpackage.arh;
import defpackage.atn;
import java.util.ArrayList;
import java.util.List;

public final class CharactersActivityR2 extends AbstractActivity {
    @BindView
    RecyclerView recyclerView;
    @BindView
    Toolbar toolbar;

    public static Intent a(Context context, int i, String str, ArrayList<Integer> arrayList) {
        Intent intent = new Intent(context, CharactersActivityR2.class);
        intent.putExtra("animeId", i);
        intent.putExtra("seriesTitle", str);
        intent.putExtra("characterIdsInFavorite", arrayList);
        return intent;
    }

    private /* synthetic */ void a(ArrayList arrayList, AnimeCharactersAdapterR2 animeCharactersAdapterR2, List list) {
        if (list != null) {
            for (arh arh : list) {
                arh.a(arrayList.contains(Integer.valueOf(arh.f())));
            }
            int a = animeCharactersAdapterR2.a() ^ 1;
            animeCharactersAdapterR2.a(list);
            if (a != 0) {
                atn.a(this.b, this.recyclerView);
            }
        }
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_anime_characters);
        ButterKnife.a(this);
        int intExtra = getIntent().getIntExtra("animeId", -1);
        ArrayList integerArrayListExtra = getIntent().getIntegerArrayListExtra("characterIdsInFavorite");
        String stringExtra = getIntent().getStringExtra("seriesTitle");
        if (intExtra <= 0 || stringExtra == null || integerArrayListExtra == null) {
            throw new IllegalArgumentException("Incorrect arguments given");
        }
        a(this.toolbar, "Characters", stringExtra, true);
        CharactersViewModel charactersViewModel = (CharactersViewModel) as.a(this).a(CharactersViewModel.class);
        AnimeCharactersAdapterR2 animeCharactersAdapterR2 = new AnimeCharactersAdapterR2(this, new ArrayList(), intExtra, (KanonViewModel) as.a(this).a(KanonViewModel.class), stringExtra, 1);
        new b(this.b, this.recyclerView, animeCharactersAdapterR2).a(4, 6).b(a.b).a();
        charactersViewModel.c((long) intExtra).observe(this, new -$$Lambda$CharactersActivityR2$xq6b99Xqo5qRTAg_ZbYQnoWqN3E(this, integerArrayListExtra, animeCharactersAdapterR2));
    }
}
