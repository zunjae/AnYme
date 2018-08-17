package com.zunjae.anyme.dialogs.animeDialog;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class VideoHistoryDialog_ViewBinding implements Unbinder {
    private VideoHistoryDialog b;

    public VideoHistoryDialog_ViewBinding(VideoHistoryDialog videoHistoryDialog, View view) {
        this.b = videoHistoryDialog;
        videoHistoryDialog.recyclerView = (RecyclerView) ct.a(view, (int) R.id.historyRecyclerView, "field 'recyclerView'", RecyclerView.class);
    }

    public final void a() {
        VideoHistoryDialog videoHistoryDialog = this.b;
        if (videoHistoryDialog != null) {
            this.b = null;
            videoHistoryDialog.recyclerView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
