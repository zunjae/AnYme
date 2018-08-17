package com.zunjae.anyme.activities.browsers;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class ZeroChanBrowser_ViewBinding implements Unbinder {
    private ZeroChanBrowser b;

    public ZeroChanBrowser_ViewBinding(ZeroChanBrowser zeroChanBrowser, View view) {
        this.b = zeroChanBrowser;
        zeroChanBrowser.toolbar = (Toolbar) ct.a(view, (int) R.id.toolbar, "field 'toolbar'", Toolbar.class);
        zeroChanBrowser.progressBar = (ProgressBar) ct.a(view, (int) R.id.browserProgressBar, "field 'progressBar'", ProgressBar.class);
    }

    public final void a() {
        ZeroChanBrowser zeroChanBrowser = this.b;
        if (zeroChanBrowser != null) {
            this.b = null;
            zeroChanBrowser.toolbar = null;
            zeroChanBrowser.progressBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
