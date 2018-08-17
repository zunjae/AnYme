package com.zunjae.anyme.activities.explore;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import defpackage.ct;

final class w implements OnCheckedChangeListener {
    final /* synthetic */ SeasonalAnimeActivity a;
    final /* synthetic */ SeasonalAnimeActivity_ViewBinding b;

    w(SeasonalAnimeActivity_ViewBinding seasonalAnimeActivity_ViewBinding, SeasonalAnimeActivity seasonalAnimeActivity) {
        this.b = seasonalAnimeActivity_ViewBinding;
        this.a = seasonalAnimeActivity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.setShouldHideAlreadyAdded((CheckBox) ct.a((Object) compoundButton, "onCheckedChanged", "setShouldHideAlreadyAdded", CheckBox.class));
    }
}
