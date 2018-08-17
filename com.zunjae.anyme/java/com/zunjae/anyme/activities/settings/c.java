package com.zunjae.anyme.activities.settings;

import android.view.View;
import defpackage.cr;

final class c extends cr {
    final /* synthetic */ CustomizeActivity b;
    final /* synthetic */ CustomizeActivity_ViewBinding c;

    c(CustomizeActivity_ViewBinding customizeActivity_ViewBinding, CustomizeActivity customizeActivity) {
        this.c = customizeActivity_ViewBinding;
        this.b = customizeActivity;
    }

    public final void a(View view) {
        this.b.onResetButtonClicked();
    }
}
