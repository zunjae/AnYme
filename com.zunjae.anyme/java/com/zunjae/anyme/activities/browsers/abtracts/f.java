package com.zunjae.anyme.activities.browsers.abtracts;

import android.widget.Toast;

final class f implements Runnable {
    final /* synthetic */ e a;

    f(e eVar) {
        this.a = eVar;
    }

    public final void run() {
        Toast.makeText(this.a.a.b, "Could not find the mp4 url for this video", 1).show();
    }
}
