package com.zunjae.anyme.activities.browsers.light_browsers;

import android.widget.Toast;

final class h implements Runnable {
    final /* synthetic */ f a;

    h(f fVar) {
        this.a = fVar;
    }

    public final void run() {
        Toast.makeText(this.a.a.b, "Could not connect to RapidVideo...", 1).show();
    }
}
