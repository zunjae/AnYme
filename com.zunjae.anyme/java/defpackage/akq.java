package defpackage;

import android.content.Intent;
import android.preference.Preference;
import com.joanzapata.iconify.IconDrawable;
import com.joanzapata.iconify.fonts.FontAwesomeIcons;
import com.zunjae.anyme.activities.misc.TroubleshootActivity;

final class akq implements ajz {
    final /* synthetic */ akj a;

    akq(akj akj) {
        this.a = akj;
    }

    public final void a(Preference preference) {
        preference.setIcon(new IconDrawable(this.a.getActivity(), FontAwesomeIcons.fa_question_circle).color(this.a.j).actionBarSize());
    }

    public final void b(Preference preference) {
        this.a.getActivity().startActivity(new Intent(this.a.getActivity(), TroubleshootActivity.class));
    }
}
