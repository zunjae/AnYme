package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.preference.Preference;

final class akd implements aka {
    final /* synthetic */ akb a;

    akd(akb akb) {
        this.a = akb;
    }

    public final void b(Preference preference) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/zunjae/AnYme"));
        intent.setFlags(268435456);
        this.a.b.startActivity(intent);
    }
}
