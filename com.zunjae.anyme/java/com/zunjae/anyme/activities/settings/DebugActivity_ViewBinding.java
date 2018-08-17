package com.zunjae.anyme.activities.settings;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class DebugActivity_ViewBinding implements Unbinder {
    private DebugActivity b;
    private View c;
    private View d;

    public DebugActivity_ViewBinding(DebugActivity debugActivity, View view) {
        this.b = debugActivity;
        debugActivity.adBlockVersion = (TextView) ct.a(view, (int) R.id.adBlockVersion, "field 'adBlockVersion'", TextView.class);
        debugActivity.nsfwFilterVersion = (TextView) ct.a(view, (int) R.id.nsfwFilterVersion, "field 'nsfwFilterVersion'", TextView.class);
        debugActivity.browserConfigVersion = (TextView) ct.a(view, (int) R.id.browserConfigVersion, "field 'browserConfigVersion'", TextView.class);
        View a = ct.a(view, R.id.forceUpdateButton, "field 'forceUpdateButton' and method 'onForceUpdateButtonClicked'");
        debugActivity.forceUpdateButton = (Button) ct.b(a, R.id.forceUpdateButton, "field 'forceUpdateButton'", Button.class);
        this.c = a;
        a.setOnClickListener(new e(this, debugActivity));
        view = ct.a(view, R.id.forceRefreshActivity, "field 'forceRefreshActivity' and method 'onForceRefreshActivityClicked'");
        debugActivity.forceRefreshActivity = (Button) ct.b(view, R.id.forceRefreshActivity, "field 'forceRefreshActivity'", Button.class);
        this.d = view;
        view.setOnClickListener(new f(this, debugActivity));
    }

    public final void a() {
        DebugActivity debugActivity = this.b;
        if (debugActivity != null) {
            this.b = null;
            debugActivity.adBlockVersion = null;
            debugActivity.nsfwFilterVersion = null;
            debugActivity.browserConfigVersion = null;
            debugActivity.forceUpdateButton = null;
            debugActivity.forceRefreshActivity = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
