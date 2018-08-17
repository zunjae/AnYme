package com.zunjae.anyme.rewrite.ui.dialogs;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.zunjae.anyme.R;
import com.zunjae.anyme.adapters.pickers.BetterStatusPickerAdapter;
import com.zunjae.anyme.dialogs.b;
import com.zunjae.zrecyclerview.a;
import defpackage.arz;
import defpackage.aui;

public final class StatusPickerDialogR2 extends b {
    private final String b = getClass().getSimpleName();
    private int c;
    @BindView
    RecyclerView recyclerView;

    private /* synthetic */ void a(int i) {
        aui.a().c(new arz(i));
        dismiss();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.c = getArguments().getInt("currentStatus", -10);
        int i = this.c;
        if (i != -10) {
            new com.zunjae.zrecyclerview.b(this.a, this.recyclerView, new BetterStatusPickerAdapter(this.a, i, new -$$Lambda$StatusPickerDialogR2$GPaq_CfYAOcSfCL7neHgKAxZdpY(this))).a(1, 2).b(a.b).a();
            return;
        }
        throw new NullPointerException("Incorrectly set the arguments");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.dialog_statuspicker, viewGroup, false);
        ButterKnife.a(this, inflate);
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        b();
    }
}
