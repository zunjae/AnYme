package com.zunjae.anyme.activities.settings;

import android.view.View;
import defpackage.cr;

final class f extends cr {
    final /* synthetic */ DebugActivity b;
    final /* synthetic */ DebugActivity_ViewBinding c;

    f(DebugActivity_ViewBinding debugActivity_ViewBinding, DebugActivity debugActivity) {
        this.c = debugActivity_ViewBinding;
        this.b = debugActivity;
    }

    public final void a(View view) {
        this.b.onForceRefreshActivityClicked();
    }
}
