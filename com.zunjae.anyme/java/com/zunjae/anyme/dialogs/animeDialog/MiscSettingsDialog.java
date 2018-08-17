package com.zunjae.anyme.dialogs.animeDialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.zunjae.anyme.R;
import com.zunjae.anyme.dialogs.b;
import defpackage.alc;
import defpackage.arn;
import defpackage.bit;
import mehdi.sakout.fancybuttons.FancyButton;

public class MiscSettingsDialog extends b {
    private final String b = "MoreInfoUpdateDialog";
    private final int c = 0;
    private final int d = 30000;
    private final int e = 60000;
    private final int f = 90000;
    private int g = 0;
    private arn h;
    @BindView
    FancyButton saveAndUpdateButton;
    @BindView
    RadioButton skipIntro0;
    @BindView
    RadioButton skipIntro30;
    @BindView
    RadioButton skipIntro60;
    @BindView
    RadioButton skipIntro90;
    @BindView
    EditText userInputAnimeSync;

    public static MiscSettingsDialog a(arn arn) {
        MiscSettingsDialog miscSettingsDialog = new MiscSettingsDialog();
        Bundle bundle = new Bundle();
        bundle.putParcelable("anime", arn);
        miscSettingsDialog.setArguments(bundle);
        return miscSettingsDialog;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.h = (arn) getArguments().getParcelable("anime");
        arn arn = this.h;
        if (arn != null) {
            RadioButton radioButton;
            int a = alc.a((int) arn.a());
            if (a > 0) {
                this.userInputAnimeSync.setText(String.valueOf(a));
            } else {
                alc.a((int) this.h.a(), 0);
            }
            this.g = alc.b((int) this.h.a());
            a = this.g;
            if (a == 0) {
                radioButton = this.skipIntro0;
            } else if (a == 30000) {
                radioButton = this.skipIntro30;
            } else if (a == 60000) {
                radioButton = this.skipIntro60;
            } else if (a == 90000) {
                radioButton = this.skipIntro90;
            } else {
                StringBuilder stringBuilder = new StringBuilder("No switch case found for ");
                stringBuilder.append(this.g);
                stringBuilder.append(" ms");
                throw new RuntimeException(stringBuilder.toString());
            }
            radioButton.setChecked(true);
            return;
        }
        throw new NullPointerException("Forgot to properly set the Anime argument");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.dialog_misc_settings, viewGroup, false);
        ButterKnife.a(this, inflate);
        return inflate;
    }

    @OnClick
    public void onRadioButtonClicked(RadioButton radioButton) {
        int i;
        switch (radioButton.getId()) {
            case R.id.skipIntro0 /*2131296733*/:
                i = 0;
                break;
            case R.id.skipIntro30 /*2131296734*/:
                i = 30000;
                break;
            case R.id.skipIntro60 /*2131296735*/:
                i = 60000;
                break;
            case R.id.skipIntro90 /*2131296736*/:
                i = 90000;
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder("No switch case found for id ");
                stringBuilder.append(radioButton.getId());
                throw new RuntimeException(stringBuilder.toString());
        }
        this.g = i;
    }

    @OnClick
    public void onSaveButtonClick() {
        alc.b((int) this.h.a(), this.g);
        String obj = this.userInputAnimeSync.getText().toString();
        if (!bit.b(obj)) {
            try {
                alc.a((int) this.h.a(), Integer.parseInt(obj));
            } catch (Exception e) {
                StringBuilder stringBuilder = new StringBuilder("Can not parse counter. Given input was ");
                stringBuilder.append(obj);
                stringBuilder.append("\n\n");
                stringBuilder.append(e);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        dismiss();
    }

    public void onStart() {
        super.onStart();
        b();
    }
}
