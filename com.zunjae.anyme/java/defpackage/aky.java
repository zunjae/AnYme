package defpackage;

import android.os.Bundle;
import com.zunjae.anyme.R;

public final class aky extends ajv {
    private final String c = "preference_key_default_cast_app";
    private final String d = "category_streaming_streaming";
    private final String e = "preference_key_remove_default_quality";

    final String a() {
        return "Streaming";
    }

    final void b() {
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.settings_streaming);
        ajx ajx = new ajx(this, "preference_key_default_cast_app", new akz(this));
        ajx = new ajx(this, "preference_key_remove_default_quality", new ala(this));
    }
}
