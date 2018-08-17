package com.mikepenz.materialdrawer;

import android.view.View;
import defpackage.afi;

final class aa implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ int b;
    final /* synthetic */ afi c;
    final /* synthetic */ z d;

    aa(z zVar, View view, int i, afi afi) {
        this.d = zVar;
        this.a = view;
        this.b = i;
        this.c = afi;
    }

    public final void run() {
        this.d.a.aj.onItemClick(this.a, this.b, this.c);
    }
}
