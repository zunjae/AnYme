package com.l4digital.fastscroll;

final class d implements Runnable {
    final /* synthetic */ FastScroller a;

    d(FastScroller fastScroller) {
        this.a = fastScroller;
    }

    public final void run() {
        FastScroller fastScroller = this.a;
        fastScroller.setViewPositions(FastScroller.a(fastScroller, fastScroller.k));
    }
}
