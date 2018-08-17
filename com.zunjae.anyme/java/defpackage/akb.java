package defpackage;

import android.os.Bundle;
import android.preference.Preference;
import com.zunjae.anyme.R;
import com.zunjae.zapplib.a;

public final class akb extends ajv {
    private final String c = "preference_key_versionName";
    private final String d = "preference_key_author";
    private final String e = "preference_key_reddit";
    private final String f = "preference_key_recommend";
    private final String g = "preference_key_discord";
    private final String h = "https://github.com/zunjae/AnYme";
    private final String i = "https://www.reddit.com/r/AnYme/";
    private final String j = "https://discord.gg/8XtWsfX";

    final String a() {
        return "About";
    }

    final void b() {
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.settings_about);
        Preference findPreference = findPreference("preference_key_versionName");
        StringBuilder stringBuilder = new StringBuilder("Version: ");
        stringBuilder.append(a.a(getActivity()));
        findPreference.setTitle(stringBuilder.toString());
        findPreference.setSummary("Public Build");
        ajx ajx = new ajx(this, "preference_key_versionName", new akc(this));
        ajx = new ajx(this, "preference_key_author", new akd(this));
        ajx = new ajx(this, "preference_key_reddit", new ake(this));
        ajx = new ajx(this, "preference_key_discord", new akf(this));
    }
}
