package com.zunjae.anyme.dialogs.animeDialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import defpackage.ct;
import mehdi.sakout.fancybuttons.R;

public final class UpdaterDialog_ViewBinding implements Unbinder {
    private UpdaterDialog b;

    public UpdaterDialog_ViewBinding(UpdaterDialog updaterDialog, View view) {
        this.b = updaterDialog;
        updaterDialog.logo = (TextView) ct.a(view, (int) R.id.top, "field 'logo'", TextView.class);
        updaterDialog.middleText = (TextView) ct.a(view, (int) me.zhanghai.android.materialprogressbar.R.id.middle, "field 'middleText'", TextView.class);
        updaterDialog.bottomText = (TextView) ct.a(view, (int) R.id.bottom, "field 'bottomText'", TextView.class);
    }

    public final void a() {
        UpdaterDialog updaterDialog = this.b;
        if (updaterDialog != null) {
            this.b = null;
            updaterDialog.logo = null;
            updaterDialog.middleText = null;
            updaterDialog.bottomText = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
