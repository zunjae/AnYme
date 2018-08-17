package com.zunjae.anyme.activities.explore;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import defpackage.asg;

final class u implements OnItemSelectedListener {
    final /* synthetic */ SeasonalAnimeActivity a;

    u(SeasonalAnimeActivity seasonalAnimeActivity) {
        this.a = seasonalAnimeActivity;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i > 0) {
            SeasonalAnimeActivity seasonalAnimeActivity = this.a;
            seasonalAnimeActivity.a((asg) seasonalAnimeActivity.c.get(i));
        }
    }

    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
