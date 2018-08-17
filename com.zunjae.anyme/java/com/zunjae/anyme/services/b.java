package com.zunjae.anyme.services;

import java.util.TimerTask;

final class b extends TimerTask {
    final /* synthetic */ UpdaterService a;

    b(UpdaterService updaterService) {
        this.a = updaterService;
    }

    public final void run() {
        UpdaterService.a(this.a);
    }
}
