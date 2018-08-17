package defpackage;

import android.annotation.SuppressLint;

@SuppressLint({"CommitPrefEdits"})
final class to {
    private final azq a;
    private final se b;

    public to(azq azq, se seVar) {
        this.a = azq;
        this.b = seVar;
    }

    final void a() {
        azq azq = this.a;
        azq.a(azq.b().putBoolean("always_send_reports_opt_in", true));
    }

    final boolean b() {
        if (!this.a.a().contains("preferences_migration_complete")) {
            azq azr = new azr(this.b);
            Object obj = (this.a.a().contains("always_send_reports_opt_in") || !azr.a().contains("always_send_reports_opt_in")) ? null : 1;
            if (obj != null) {
                boolean z = azr.a().getBoolean("always_send_reports_opt_in", false);
                azq azq = this.a;
                azq.a(azq.b().putBoolean("always_send_reports_opt_in", z));
            }
            azr = this.a;
            azr.a(azr.b().putBoolean("preferences_migration_complete", true));
        }
        return this.a.a().getBoolean("always_send_reports_opt_in", false);
    }
}
