package defpackage;

import android.preference.Preference;
import android.widget.Toast;

final class ala implements ajz {
    final /* synthetic */ aky a;

    ala(aky aky) {
        this.a = aky;
    }

    public final void a(Preference preference) {
        CharSequence format;
        if (aux.b("KEY_QUALITY_SELECTOR_PREFERRED", null) != null) {
            format = String.format("Current Quality: %s", new Object[]{aux.b("KEY_QUALITY_SELECTOR_PREFERRED", null)});
        } else {
            format = "No Default Quality Set";
        }
        preference.setSummary(format);
    }

    public final void b(Preference preference) {
        aux.b("KEY_QUALITY_SELECTOR_PREFERRED");
        preference.setSummary("No Default Quality Set");
        Toast.makeText(this.a.getActivity(), "Default quality cleared", 0).show();
    }
}
