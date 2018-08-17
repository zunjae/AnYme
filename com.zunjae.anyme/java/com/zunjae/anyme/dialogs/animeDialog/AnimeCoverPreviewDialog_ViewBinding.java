package com.zunjae.anyme.dialogs.animeDialog;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public class AnimeCoverPreviewDialog_ViewBinding implements Unbinder {
    private AnimeCoverPreviewDialog b;

    public AnimeCoverPreviewDialog_ViewBinding(AnimeCoverPreviewDialog animeCoverPreviewDialog, View view) {
        this.b = animeCoverPreviewDialog;
        animeCoverPreviewDialog.coverImage = (ImageView) ct.a(view, (int) R.id.animeCoverImage, "field 'coverImage'", ImageView.class);
        animeCoverPreviewDialog.title = (TextView) ct.a(view, (int) R.id.dialogTitle, "field 'title'", TextView.class);
        animeCoverPreviewDialog.progressBar = (ProgressBar) ct.a(view, (int) R.id.progressBar, "field 'progressBar'", ProgressBar.class);
    }

    public final void a() {
        AnimeCoverPreviewDialog animeCoverPreviewDialog = this.b;
        if (animeCoverPreviewDialog != null) {
            this.b = null;
            animeCoverPreviewDialog.coverImage = null;
            animeCoverPreviewDialog.title = null;
            animeCoverPreviewDialog.progressBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
