package com.zunjae.anyme.activities.browsers;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class UserLoginBrowser_ViewBinding implements Unbinder {
    private UserLoginBrowser b;

    public UserLoginBrowser_ViewBinding(UserLoginBrowser userLoginBrowser, View view) {
        this.b = userLoginBrowser;
        userLoginBrowser.toolbar = (Toolbar) ct.a(view, (int) R.id.toolbar, "field 'toolbar'", Toolbar.class);
        userLoginBrowser.progressBar = (ProgressBar) ct.a(view, (int) R.id.browserProgressBar, "field 'progressBar'", ProgressBar.class);
    }

    public final void a() {
        UserLoginBrowser userLoginBrowser = this.b;
        if (userLoginBrowser != null) {
            this.b = null;
            userLoginBrowser.toolbar = null;
            userLoginBrowser.progressBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
