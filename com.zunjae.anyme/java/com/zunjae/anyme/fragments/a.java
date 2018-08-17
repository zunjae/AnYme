package com.zunjae.anyme.fragments;

import android.view.View;
import defpackage.cr;

final class a extends cr {
    final /* synthetic */ FragmentNoKanon b;
    final /* synthetic */ FragmentNoKanon_ViewBinding c;

    a(FragmentNoKanon_ViewBinding fragmentNoKanon_ViewBinding, FragmentNoKanon fragmentNoKanon) {
        this.c = fragmentNoKanon_ViewBinding;
        this.b = fragmentNoKanon;
    }

    public final void a(View view) {
        this.b.onGetStartedButtonClicked();
    }
}
