package com.zunjae.anyme.dialogs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.zunjae.anyme.R;
import defpackage.aux;
import mehdi.sakout.fancybuttons.FancyButton;

public final class ADMWarningDialog extends b {
    private final String b = getClass().getSimpleName();
    @BindView
    FancyButton saveAndUpdateButton;

    public static boolean a() {
        return aux.b("KEY_SHOW_WARNING_VIBRATION_ZEROCHAN", true);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.dialog_warning_adm, viewGroup, false);
        ButterKnife.a(this, inflate);
        return inflate;
    }

    @OnClick
    public final void onSaveAndUpdateButtonClicked() {
        aux.a("KEY_SHOW_WARNING_VIBRATION_ZEROCHAN", false);
        dismiss();
    }
}
