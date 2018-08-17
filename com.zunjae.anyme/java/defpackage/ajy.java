package defpackage;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

final class ajy implements OnPreferenceClickListener {
    final /* synthetic */ aka a;
    final /* synthetic */ ajx b;

    ajy(ajx ajx, aka aka) {
        this.b = ajx;
        this.a = aka;
    }

    public final boolean onPreferenceClick(Preference preference) {
        this.a.b(preference);
        return true;
    }
}
