package defpackage;

import android.preference.Preference;
import com.joanzapata.iconify.IconDrawable;
import com.joanzapata.iconify.fonts.FontAwesomeIcons;
import com.zunjae.anyme.activities.settings.UserSettingsActivity;

final class akm implements ajz {
    final /* synthetic */ akj a;

    akm(akj akj) {
        this.a = akj;
    }

    public final void a(Preference preference) {
        preference.setIcon(new IconDrawable(this.a.getActivity(), FontAwesomeIcons.fa_database).color(this.a.j).actionBarSize());
    }

    public final void b(Preference preference) {
        ((UserSettingsActivity) this.a.getActivity()).a(new aks());
    }
}
