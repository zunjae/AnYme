package defpackage;

import android.app.Activity;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.preference.PreferenceFragment;
import com.zunjae.anyme.activities.settings.UserSettingsActivity;

public abstract class ajv extends PreferenceFragment {
    final String a = getClass().getSimpleName();
    Activity b;
    private final OnSharedPreferenceChangeListener c = new ajw(this);

    abstract String a();

    abstract void b();

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.b = activity;
    }

    public void onPause() {
        super.onPause();
        getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this.c);
    }

    public void onResume() {
        super.onResume();
        ((UserSettingsActivity) getActivity()).c(a());
        getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this.c);
    }
}
