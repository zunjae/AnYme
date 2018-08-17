package defpackage;

import android.content.Intent;
import android.preference.Preference;
import com.zunjae.anyme.activities.settings.OptimizeActivity;

final class akw implements aka {
    final /* synthetic */ aks a;

    akw(aks aks) {
        this.a = aks;
    }

    public final void b(Preference preference) {
        aks aks = this.a;
        aks.startActivity(new Intent(aks.getActivity(), OptimizeActivity.class));
    }
}
