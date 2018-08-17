package defpackage;

import android.os.Process;

final class axk extends axs<Params, Result> {
    final /* synthetic */ axi a;

    axk(axi axi) {
        this.a = axi;
        super();
    }

    public final Result call() {
        this.a.n.set(true);
        Process.setThreadPriority(10);
        axi axi = this.a;
        return axi.b(axi.e());
    }
}
