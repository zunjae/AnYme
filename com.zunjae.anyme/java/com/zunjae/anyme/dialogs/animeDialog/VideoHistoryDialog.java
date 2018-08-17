package com.zunjae.anyme.dialogs.animeDialog;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.zunjae.anyme.R;
import com.zunjae.anyme.adapters.VideoHistoryAdapter;
import com.zunjae.anyme.dialogs.b;
import com.zunjae.zrecyclerview.a;

public final class VideoHistoryDialog extends b {
    @BindView
    RecyclerView recyclerView;

    public static VideoHistoryDialog a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("key", str);
        VideoHistoryDialog videoHistoryDialog = new VideoHistoryDialog();
        videoHistoryDialog.setArguments(bundle);
        return videoHistoryDialog;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        String string = getArguments().getString("key");
        if (string != null) {
            new com.zunjae.zrecyclerview.b(this.a, this.recyclerView, new VideoHistoryAdapter(string, getDialog())).b(a.a).a();
            return;
        }
        throw new NullPointerException("Incorrectly set the arguments");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.dialog_video_history, viewGroup, false);
        ButterKnife.a(this, inflate);
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        b();
    }
}
