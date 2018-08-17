package defpackage;

import android.os.Bundle;
import com.zunjae.anyme.R;

public final class aks extends ajv {
    private final String c = "preference_key_clear_cache";
    private final String d = "preference_key_optimize_database";
    private final String e = "preference_key_clear_browser_data";

    final String a() {
        return "Storage";
    }

    final void b() {
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.settings_storage);
        ajx ajx = new ajx(this, "preference_key_clear_cache", new akt(this));
        ajx = new ajx(this, "preference_key_optimize_database", new akw(this));
        ajx = new ajx(this, "preference_key_clear_browser_data", new akx(this));
    }
}
