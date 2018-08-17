package com.zunjae.anyme.rewrite.ui.dialogs;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.zunjae.anyme.R;
import com.zunjae.anyme.adapters.pickers.NumberPickerAdapter;
import com.zunjae.anyme.dialogs.b;
import defpackage.arj;
import defpackage.arv;
import defpackage.aui;

public final class DefaultEpisodePickerDialogR2 extends b {
    private arj b;
    @BindView
    RecyclerView recyclerView;
    @BindView
    CheckBox rewatchingAnimeCheckbox;

    private void a() {
        int i = getResources().getConfiguration().orientation == 2 ? 3 : 1;
        int i2 = this.b.b;
        i = i2 < 20 ? i + 2 : i2 < 40 ? i + 3 : i + 4;
        this.recyclerView.setLayoutManager(new GridLayoutManager(this.a, i));
        this.recyclerView.setAdapter(new NumberPickerAdapter(i2, this.b.c, this.a, new -$$Lambda$DefaultEpisodePickerDialogR2$VdnBFqoFNv8AkWASDC81KqiEsaA(this)));
        this.recyclerView.scrollToPosition(this.b.b);
    }

    private /* synthetic */ void a(int i) {
        aui.a().c(new arv(this.rewatchingAnimeCheckbox.isChecked(), i));
        dismiss();
    }

    private /* synthetic */ void a(CompoundButton compoundButton, boolean z) {
        this.b.a = z;
        a();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.b = (arj) getArguments().getParcelable("defaultEpisodePickerDialog");
        arj arj = this.b;
        if (arj != null) {
            this.rewatchingAnimeCheckbox.setChecked(arj.a);
            this.rewatchingAnimeCheckbox.setOnCheckedChangeListener(new -$$Lambda$DefaultEpisodePickerDialogR2$Bxv8fj4Nvf-oKgWVI_u-MKMlhKU(this));
            a();
            return;
        }
        throw new NullPointerException("Forgot to set Anime argument");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.dialog_episode_selector, viewGroup, false);
        ButterKnife.a(this, inflate);
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        b();
    }
}
