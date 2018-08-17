package com.zunjae.anyme.activities.browsers;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class BasicWebViewBrowser_ViewBinding implements Unbinder {
    private BasicWebViewBrowser b;

    public BasicWebViewBrowser_ViewBinding(BasicWebViewBrowser basicWebViewBrowser, View view) {
        this.b = basicWebViewBrowser;
        basicWebViewBrowser.toolbar = (Toolbar) ct.a(view, (int) R.id.toolbar, "field 'toolbar'", Toolbar.class);
        basicWebViewBrowser.progressBar = (ProgressBar) ct.a(view, (int) R.id.browserProgressBar, "field 'progressBar'", ProgressBar.class);
    }

    public final void a() {
        BasicWebViewBrowser basicWebViewBrowser = this.b;
        if (basicWebViewBrowser != null) {
            this.b = null;
            basicWebViewBrowser.toolbar = null;
            basicWebViewBrowser.progressBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
