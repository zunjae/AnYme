package defpackage;

import android.os.Bundle;
import com.zunjae.anyme.R;

public final class akg extends ajv {
    private final String c = "preference_key_app_fullscreen";
    private final String d = "preference_key_change_toolbar_image";
    private final String e = "preference_menu_image_height";
    private final String f = "preferences_appearance";
    private final String g = akg.class.getSimpleName();

    final String a() {
        return "Appearance";
    }

    final void b() {
        getActivity().setResult(5);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.settings_appearance);
        ajx ajx = new ajx(this, "preference_menu_image_height", new akh(this));
    }
}
