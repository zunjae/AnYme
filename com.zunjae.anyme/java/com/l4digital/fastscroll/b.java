package com.l4digital.fastscroll;

final class b implements Runnable {
    final /* synthetic */ FastScroller a;

    b(FastScroller fastScroller) {
        this.a = fastScroller;
    }

    public final void run() {
        this.a.i = this.a.o.animate().translationX((float) this.a.getResources().getDimensionPixelSize(R.dimen.fastscroll_scrollbar_padding_end)).alpha(0.0f).setDuration(300).setListener(new h(this.a));
    }
}
