package com.afollestad.materialdialogs.internal;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.view.ViewGroup;

final class c extends OnScrollListener {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ MDRootLayout d;

    c(MDRootLayout mDRootLayout, ViewGroup viewGroup, boolean z, boolean z2) {
        this.d = mDRootLayout;
        this.a = viewGroup;
        this.b = z;
        this.c = z2;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        super.onScrolled(recyclerView, i, i2);
        boolean z = false;
        for (MDButton mDButton : this.d.a) {
            if (mDButton != null && mDButton.getVisibility() != 8) {
                z = true;
                break;
            }
        }
        MDRootLayout.a(this.d, this.a, this.b, this.c, z);
        this.d.invalidate();
    }
}
