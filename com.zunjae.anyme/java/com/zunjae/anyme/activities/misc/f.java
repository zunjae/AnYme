package com.zunjae.anyme.activities.misc;

import android.view.View;
import defpackage.cr;

final class f extends cr {
    final /* synthetic */ KanonExplanation b;
    final /* synthetic */ KanonExplanation_ViewBinding c;

    f(KanonExplanation_ViewBinding kanonExplanation_ViewBinding, KanonExplanation kanonExplanation) {
        this.c = kanonExplanation_ViewBinding;
        this.b = kanonExplanation;
    }

    public final void a(View view) {
        this.b.onJoinButtonClicked();
    }
}
