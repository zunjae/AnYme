package com.zunjae.anyme.adapters.pickers;

import android.view.View;
import android.view.View.OnClickListener;

final class e implements OnClickListener {
    final /* synthetic */ Integer a;
    final /* synthetic */ NumberPickerAdapter b;

    e(NumberPickerAdapter numberPickerAdapter, Integer num) {
        this.b = numberPickerAdapter;
        this.a = num;
    }

    public final void onClick(View view) {
        this.b.b.clickedEpisode(this.a.intValue());
    }
}
