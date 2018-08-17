package com.l4digital.fastscroll;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import defpackage.tw;
import mehdi.sakout.fancybuttons.R;

final class c extends OnScrollListener {
    final /* synthetic */ FastScroller a;

    c(FastScroller fastScroller) {
        this.a = fastScroller;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        if (this.a.isEnabled()) {
            switch (i) {
                case R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                    if (this.a.f && !this.a.m.isSelected()) {
                        this.a.getHandler().postDelayed(this.a.t, 1000);
                        break;
                    }
                case tw.a /*1*/:
                    this.a.getHandler().removeCallbacks(this.a.t);
                    FastScroller.b(this.a.i);
                    if (!FastScroller.b(this.a.o)) {
                        this.a.b();
                        return;
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (!this.a.m.isSelected() && this.a.isEnabled()) {
            FastScroller fastScroller = this.a;
            fastScroller.setViewPositions(FastScroller.a(fastScroller, recyclerView));
        }
    }
}
