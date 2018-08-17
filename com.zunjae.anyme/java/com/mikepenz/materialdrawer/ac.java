package com.mikepenz.materialdrawer;

final class ac implements Runnable {
    final /* synthetic */ t a;

    ac(t tVar) {
        this.a = tVar;
    }

    public final void run() {
        this.a.q.closeDrawers();
        t tVar = this.a;
        if (tVar.D) {
            tVar.V.smoothScrollToPosition(0);
        }
    }
}
