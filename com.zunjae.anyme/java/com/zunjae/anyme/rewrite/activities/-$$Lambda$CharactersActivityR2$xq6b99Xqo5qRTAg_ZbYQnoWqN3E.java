package com.zunjae.anyme.rewrite.activities;

import android.arch.lifecycle.ad;
import com.zunjae.anyme.rewrite.adapters.AnimeCharactersAdapterR2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$CharactersActivityR2$xq6b99Xqo5qRTAg_ZbYQnoWqN3E implements ad {
    private final /* synthetic */ CharactersActivityR2 f$0;
    private final /* synthetic */ ArrayList f$1;
    private final /* synthetic */ AnimeCharactersAdapterR2 f$2;

    public /* synthetic */ -$$Lambda$CharactersActivityR2$xq6b99Xqo5qRTAg_ZbYQnoWqN3E(CharactersActivityR2 charactersActivityR2, ArrayList arrayList, AnimeCharactersAdapterR2 animeCharactersAdapterR2) {
        this.f$0 = charactersActivityR2;
        this.f$1 = arrayList;
        this.f$2 = animeCharactersAdapterR2;
    }

    public final void onChanged(Object obj) {
        this.f$0.a(this.f$1, this.f$2, (List) obj);
    }
}
