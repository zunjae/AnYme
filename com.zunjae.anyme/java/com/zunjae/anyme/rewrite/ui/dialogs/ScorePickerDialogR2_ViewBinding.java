package com.zunjae.anyme.rewrite.ui.dialogs;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class ScorePickerDialogR2_ViewBinding implements Unbinder {
    private ScorePickerDialogR2 b;

    public ScorePickerDialogR2_ViewBinding(ScorePickerDialogR2 scorePickerDialogR2, View view) {
        this.b = scorePickerDialogR2;
        scorePickerDialogR2.recyclerView = (RecyclerView) ct.a(view, (int) R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
    }

    public final void a() {
        ScorePickerDialogR2 scorePickerDialogR2 = this.b;
        if (scorePickerDialogR2 != null) {
            this.b = null;
            scorePickerDialogR2.recyclerView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
