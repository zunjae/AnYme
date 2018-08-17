package defpackage;

import android.preference.Preference;
import android.widget.Toast;

final class akz implements ajz {
    final /* synthetic */ aky a;

    akz(aky aky) {
        this.a = aky;
    }

    public final void a(Preference preference) {
        CharSequence charSequence;
        if (ann.a(this.a.getActivity()) == null) {
            charSequence = "No Default Cast App Set";
        } else {
            charSequence = String.format("Currently selected app:\n%s (%s)", new Object[]{ann.a(this.a.getActivity()).b(), ann.a(this.a.getActivity()).c()});
        }
        preference.setSummary(charSequence);
    }

    public final void b(Preference preference) {
        ann.c(0);
        preference.setSummary("No Default Cast App Set");
        Toast.makeText(this.a.getActivity(), "Default casting app cleared", 0).show();
    }
}
