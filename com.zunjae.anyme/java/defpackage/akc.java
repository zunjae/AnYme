package defpackage;

import android.content.Context;
import android.content.Intent;
import android.preference.Preference;
import com.zunjae.anyme.activities.settings.DebugActivity;

final class akc implements aka {
    final /* synthetic */ akb a;

    akc(akb akb) {
        this.a = akb;
    }

    public final void b(Preference preference) {
        Context context = this.a.b;
        context.startActivity(new Intent(context, DebugActivity.class));
    }
}
