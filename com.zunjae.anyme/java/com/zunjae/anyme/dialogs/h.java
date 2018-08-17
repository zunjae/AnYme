package com.zunjae.anyme.dialogs;

import android.view.View;
import defpackage.cr;

final class h extends cr {
    final /* synthetic */ SubscribeAnimeDialog b;
    final /* synthetic */ SubscribeAnimeDialog_ViewBinding c;

    h(SubscribeAnimeDialog_ViewBinding subscribeAnimeDialog_ViewBinding, SubscribeAnimeDialog subscribeAnimeDialog) {
        this.c = subscribeAnimeDialog_ViewBinding;
        this.b = subscribeAnimeDialog;
    }

    public final void a(View view) {
        this.b.onNotifyButtonClicked();
    }
}
