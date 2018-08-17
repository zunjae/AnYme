package defpackage;

import android.os.Bundle;
import com.zunjae.anyme.R;

public final class akj extends ajv {
    private final String c = "preference_menu_appearance";
    private final String d = "preference_menu_streaming";
    private final String e = "preference_menu_misc";
    private final String f = "preference_menu_about";
    private final String g = "preference_menu_downloading";
    private final String h = "preference_menu_troubleshoot";
    private final String i = "preference_menu_storage";
    private int j;

    final String a() {
        return "Settings";
    }

    final void b() {
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.settings_main);
        this.j = aue.a(getActivity());
        ajx ajx = new ajx(this, "preference_menu_appearance", new akk(this));
        ajx = new ajx(this, "preference_menu_misc", new akl(this));
        ajx = new ajx(this, "preference_menu_storage", new akm(this));
        ajx = new ajx(this, "preference_menu_downloading", new akn(this));
        ajx = new ajx(this, "preference_menu_about", new ako(this));
        ajx = new ajx(this, "preference_menu_streaming", new akp(this));
        ajx = new ajx(this, "preference_menu_troubleshoot", new akq(this));
    }
}
