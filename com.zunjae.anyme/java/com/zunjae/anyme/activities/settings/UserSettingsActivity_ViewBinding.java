package com.zunjae.anyme.activities.settings;

import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class UserSettingsActivity_ViewBinding implements Unbinder {
    private UserSettingsActivity b;

    public UserSettingsActivity_ViewBinding(UserSettingsActivity userSettingsActivity, View view) {
        this.b = userSettingsActivity;
        userSettingsActivity.toolbar = (Toolbar) ct.a(view, (int) R.id.preferencesActivityToolbar, "field 'toolbar'", Toolbar.class);
    }

    public final void a() {
        UserSettingsActivity userSettingsActivity = this.b;
        if (userSettingsActivity != null) {
            this.b = null;
            userSettingsActivity.toolbar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
