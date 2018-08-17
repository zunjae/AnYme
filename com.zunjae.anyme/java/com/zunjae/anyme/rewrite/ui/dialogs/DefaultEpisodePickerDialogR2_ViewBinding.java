package com.zunjae.anyme.rewrite.ui.dialogs;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class DefaultEpisodePickerDialogR2_ViewBinding implements Unbinder {
    private DefaultEpisodePickerDialogR2 b;

    public DefaultEpisodePickerDialogR2_ViewBinding(DefaultEpisodePickerDialogR2 defaultEpisodePickerDialogR2, View view) {
        this.b = defaultEpisodePickerDialogR2;
        defaultEpisodePickerDialogR2.recyclerView = (RecyclerView) ct.a(view, (int) R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
        defaultEpisodePickerDialogR2.rewatchingAnimeCheckbox = (CheckBox) ct.a(view, (int) R.id.checkboxRewatchingAnime, "field 'rewatchingAnimeCheckbox'", CheckBox.class);
    }

    public final void a() {
        DefaultEpisodePickerDialogR2 defaultEpisodePickerDialogR2 = this.b;
        if (defaultEpisodePickerDialogR2 != null) {
            this.b = null;
            defaultEpisodePickerDialogR2.recyclerView = null;
            defaultEpisodePickerDialogR2.rewatchingAnimeCheckbox = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
