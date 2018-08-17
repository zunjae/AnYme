package com.zunjae.anyme.adapters;

import android.view.View;
import android.view.View.OnClickListener;
import defpackage.alk;

final class f implements OnClickListener {
    final /* synthetic */ alk a;
    final /* synthetic */ ThemePickerAdapter b;

    f(ThemePickerAdapter themePickerAdapter, alk alk) {
        this.b = themePickerAdapter;
        this.a = alk;
    }

    public final void onClick(View view) {
        this.b.a.OnThemeClicker(this.a);
    }
}
