package com.zunjae.anyme.activities.browsers.light_browsers;

import android.widget.Toast;

final class i implements Runnable {
    final /* synthetic */ f a;

    i(f fVar) {
        this.a = fVar;
    }

    public final void run() {
        Toast.makeText(this.a.a.b, "No videos found for this anime...", 1).show();
    }
}
