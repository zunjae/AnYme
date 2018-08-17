package com.zunjae.anyme.activities.explore;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import defpackage.ct;

final class m implements OnCheckedChangeListener {
    final /* synthetic */ FastAnimeSearchActivity a;
    final /* synthetic */ FastAnimeSearchActivity_ViewBinding b;

    m(FastAnimeSearchActivity_ViewBinding fastAnimeSearchActivity_ViewBinding, FastAnimeSearchActivity fastAnimeSearchActivity) {
        this.b = fastAnimeSearchActivity_ViewBinding;
        this.a = fastAnimeSearchActivity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.setShouldHideAlreadyAdded((CheckBox) ct.a((Object) compoundButton, "onCheckedChanged", "setShouldHideAlreadyAdded", CheckBox.class));
    }
}
