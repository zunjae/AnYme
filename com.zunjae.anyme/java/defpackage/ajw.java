package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;

final class ajw implements OnSharedPreferenceChangeListener {
    final /* synthetic */ ajv a;

    ajw(ajv ajv) {
        this.a = ajv;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.a.b();
    }
}
