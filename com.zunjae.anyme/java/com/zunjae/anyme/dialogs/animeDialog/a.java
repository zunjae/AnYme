package com.zunjae.anyme.dialogs.animeDialog;

import android.widget.Toast;
import defpackage.js;
import defpackage.mk;

final class a implements mk<String, js> {
    final /* synthetic */ AnimeCoverPreviewDialog a;

    a(AnimeCoverPreviewDialog animeCoverPreviewDialog) {
        this.a = animeCoverPreviewDialog;
    }

    public final /* synthetic */ boolean a() {
        Toast.makeText(this.a.a, "Can't preview image... (no internet?)", 0).show();
        this.a.dismiss();
        return false;
    }

    public final /* synthetic */ boolean b() {
        this.a.progressBar.setVisibility(8);
        return false;
    }
}
