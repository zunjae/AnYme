package com.afollestad.materialdialogs.internal;

import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.WebView;

final class d implements OnScrollChangedListener {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ MDRootLayout d;

    d(MDRootLayout mDRootLayout, ViewGroup viewGroup, boolean z, boolean z2) {
        this.d = mDRootLayout;
        this.a = viewGroup;
        this.b = z;
        this.c = z2;
    }

    public final void onScrollChanged() {
        boolean z = false;
        for (MDButton mDButton : this.d.a) {
            if (mDButton != null && mDButton.getVisibility() != 8) {
                z = true;
                break;
            }
        }
        ViewGroup viewGroup = this.a;
        if (viewGroup instanceof WebView) {
            MDRootLayout.a(this.d, (WebView) viewGroup, this.b, this.c, z);
        } else {
            MDRootLayout.a(this.d, viewGroup, this.b, this.c, z);
        }
        this.d.invalidate();
    }
}
