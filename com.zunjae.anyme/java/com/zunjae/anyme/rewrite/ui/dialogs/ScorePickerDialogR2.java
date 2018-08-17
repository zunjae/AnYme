package com.zunjae.anyme.rewrite.ui.dialogs;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.zunjae.anyme.R;
import com.zunjae.anyme.adapters.pickers.BetterScorePickerAdapter;
import com.zunjae.anyme.dialogs.b;
import com.zunjae.zrecyclerview.a;
import defpackage.arx;
import defpackage.aui;

public final class ScorePickerDialogR2 extends b {
    private final String b = getClass().getSimpleName();
    private int c;
    @BindView
    RecyclerView recyclerView;

    private /* synthetic */ void a(int i) {
        aui.a().c(new arx(i));
        dismiss();
    }

    public final void onActivityCreated(Bundle bundle) {
        getDialog().requestWindowFeature(1);
        super.onActivityCreated(bundle);
        this.c = getArguments().getInt("currentScore", -10);
        int i = this.c;
        if (i >= 0) {
            new com.zunjae.zrecyclerview.b(this.a, this.recyclerView, new BetterScorePickerAdapter(this.a, i, new -$$Lambda$ScorePickerDialogR2$MceYVnBm7AilWqTVr5nxZTH8IJk(this))).a(2, 3).b(a.b).a();
            return;
        }
        throw new NullPointerException("no valid required argument given");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.dialog_scorepicker, viewGroup, false);
        ButterKnife.a(this, inflate);
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        b();
    }
}
