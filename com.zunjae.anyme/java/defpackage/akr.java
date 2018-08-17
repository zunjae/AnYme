package defpackage;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import com.zunjae.anyme.R;

public final class akr extends ajv {
    private final String c = "preference_category_misc";
    private final String d = "preference_category_browser";
    private final String e = "preference_key_hide_discord_item";

    final String a() {
        return "Miscellaneous";
    }

    final void b() {
        getActivity().setResult(1);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.settings_misc);
        if (!anl.a(getActivity())) {
            PreferenceCategory preferenceCategory = (PreferenceCategory) findPreference("preference_category_browser");
            Preference findPreference = findPreference("preference_key_use_advanced_adblocker");
            if (findPreference != null) {
                if (preferenceCategory != null) {
                    preferenceCategory.removePreference(findPreference);
                    return;
                }
                getPreferenceScreen().removePreference(findPreference);
            }
        }
    }
}
