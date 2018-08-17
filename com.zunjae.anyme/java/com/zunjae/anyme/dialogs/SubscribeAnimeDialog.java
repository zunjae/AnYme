package com.zunjae.anyme.dialogs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.zunjae.anyme.R;
import defpackage.are;
import defpackage.auf;
import java.util.ArrayList;
import java.util.List;
import mehdi.sakout.fancybuttons.FancyButton;

public final class SubscribeAnimeDialog extends b {
    private are b;
    private String c;
    @BindView
    FancyButton notifyButton;
    @BindView
    Spinner numberPicker;

    private void a() {
        if (this.b.o() >= 26) {
            Toast.makeText(this.a, "This Anime is not eligible to get notifications for", 0).show();
            dismiss();
        }
        List arrayList = new ArrayList();
        int o = this.b.o();
        while (true) {
            o++;
            if (o > 26) {
                break;
            }
            arrayList.add(Integer.valueOf(o));
        }
        SpinnerAdapter arrayAdapter = new ArrayAdapter(getActivity(), 17367048, arrayList);
        arrayAdapter.setDropDownViewResource(17367049);
        this.numberPicker.setAdapter(arrayAdapter);
        if (this.b.o() < 12) {
            int o2 = (12 - this.b.o()) - 1;
            Spinner spinner = this.numberPicker;
            if (o2 <= 0) {
                o2 = 0;
            }
            spinner.setSelection(o2);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.b = (are) getArguments().getParcelable("anime");
        this.c = getArguments().getString("day");
        if (this.b == null || this.c == null) {
            throw new NullPointerException("Incorrectly set the argument");
        }
        a();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.dialog_subscribe, viewGroup, false);
        ButterKnife.a(this, inflate);
        return inflate;
    }

    @OnClick
    public final void onNotifyButtonClicked() {
        this.b.b(((Integer) this.numberPicker.getSelectedItem()).intValue());
        try {
            auf.a(this.a, this.b, this.c);
        } catch (Exception e) {
            Toast.makeText(this.a, e.getMessage(), 1).show();
        }
        dismiss();
    }

    public final void onStart() {
        super.onStart();
        b();
    }
}
