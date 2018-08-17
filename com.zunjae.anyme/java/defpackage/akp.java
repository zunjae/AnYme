package defpackage;

import android.preference.Preference;
import com.joanzapata.iconify.IconDrawable;
import com.joanzapata.iconify.fonts.FontAwesomeIcons;
import com.zunjae.anyme.activities.settings.UserSettingsActivity;

final class akp implements ajz {
    final /* synthetic */ akj a;

    akp(akj akj) {
        this.a = akj;
    }

    public final void a(Preference preference) {
        preference.setIcon(new IconDrawable(this.a.getActivity(), FontAwesomeIcons.fa_video_camera).color(this.a.j).actionBarSize());
    }

    public final void b(Preference preference) {
        ((UserSettingsActivity) this.a.getActivity()).a(new aky());
    }
}
