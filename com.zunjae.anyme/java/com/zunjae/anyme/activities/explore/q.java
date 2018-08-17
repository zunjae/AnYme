package com.zunjae.anyme.activities.explore;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

final class q implements OnCheckedChangeListener {
    final /* synthetic */ LocalAnimeSearchActivity a;
    final /* synthetic */ LocalAnimeSearchActivity_ViewBinding b;

    q(LocalAnimeSearchActivity_ViewBinding localAnimeSearchActivity_ViewBinding, LocalAnimeSearchActivity localAnimeSearchActivity) {
        this.b = localAnimeSearchActivity_ViewBinding;
        this.a = localAnimeSearchActivity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.onFilterChanged();
    }
}
