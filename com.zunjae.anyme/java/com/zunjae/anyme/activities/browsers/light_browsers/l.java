package com.zunjae.anyme.activities.browsers.light_browsers;

import android.widget.Toast;

final class l implements Runnable {
    final /* synthetic */ k a;

    l(k kVar) {
        this.a = kVar;
    }

    public final void run() {
        Toast.makeText(this.a.a.b, "Could not find the mp4 url for this video", 1).show();
    }
}
