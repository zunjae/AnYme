package com.zunjae.anyme.dialogs;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.zunjae.anyme.R;
import com.zunjae.anyme.adapters.pickers.StreamHostPickerAdapter;
import com.zunjae.zrecyclerview.a;
import com.zunjae.zrecyclerview.b;
import defpackage.alr;
import defpackage.ann;
import defpackage.aui;

public class StreamingSitePickerDialog extends b {
    private final String b = getClass().getSimpleName();
    private boolean c = false;
    private int d;
    @BindView
    RecyclerView recyclerView;
    @BindView
    CheckBox rememberStreamingApp;

    public static StreamingSitePickerDialog a(int i, boolean z) {
        StreamingSitePickerDialog streamingSitePickerDialog = new StreamingSitePickerDialog();
        Bundle bundle = new Bundle();
        bundle.putInt("animeId", i);
        bundle.putBoolean("withNSFWSites", z);
        streamingSitePickerDialog.setArguments(bundle);
        return streamingSitePickerDialog;
    }

    private /* synthetic */ void a(alr alr) {
        if (this.rememberStreamingApp.isChecked()) {
            ann.a(alr);
            ann.b(this.d);
        } else {
            ann.a(this.d, alr);
        }
        aui.a().c(alr);
        dismiss();
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.d = getArguments().getInt("animeId", -10);
        this.c = getArguments().getBoolean("withNSFWSites", false);
        if (this.c) {
            this.rememberStreamingApp.setVisibility(8);
        }
        int i = this.d;
        if (i >= 0) {
            new b(this.a, this.recyclerView, new StreamHostPickerAdapter(this.a, i, this.c, new -$$Lambda$StreamingSitePickerDialog$0pCbxAfEjqWoll7-_EFe2HCpzIk(this))).a(1, 2).b(a.b).a();
            return;
        }
        throw new IllegalArgumentException("Forgot to properly set the required argument");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.dialog_streaming_site, viewGroup, false);
        ButterKnife.a(this, inflate);
        return inflate;
    }

    public void onStart() {
        super.onStart();
        b();
    }
}
