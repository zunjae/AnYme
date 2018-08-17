package defpackage;

import android.preference.Preference;
import android.preference.PreferenceFragment;

final class ajx {
    ajx(PreferenceFragment preferenceFragment, String str, aka aka) {
        Preference findPreference = preferenceFragment.findPreference(str);
        if (aka instanceof ajz) {
            ((ajz) aka).a(findPreference);
        }
        findPreference.setOnPreferenceClickListener(new ajy(this, aka));
    }
}
