package com.afollestad.materialdialogs.internal;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.webkit.WebView;

final class b implements OnPreDrawListener {
    final /* synthetic */ View a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ MDRootLayout d;

    b(MDRootLayout mDRootLayout, View view, boolean z, boolean z2) {
        this.d = mDRootLayout;
        this.a = view;
        this.b = z;
        this.c = z2;
    }

    public final boolean onPreDraw() {
        if (this.a.getMeasuredHeight() != 0) {
            if (MDRootLayout.a((WebView) this.a)) {
                this.d.a((ViewGroup) this.a, this.b, this.c);
            } else {
                if (this.b) {
                    this.d.e = false;
                }
                if (this.c) {
                    this.d.f = false;
                }
            }
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        return true;
    }
}
