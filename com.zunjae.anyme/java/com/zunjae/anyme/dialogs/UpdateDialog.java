package com.zunjae.anyme.dialogs;

import android.app.NotificationManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.zapplib.a;
import defpackage.anl;
import defpackage.aug;
import defpackage.aux;
import defpackage.bit;

public final class UpdateDialog extends b {
    @BindView
    TextView shortDescriptionText;
    @BindView
    TextView versionDifference;

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.versionDifference.setText(String.format("Current Version: %s | New Version: %.2f", new Object[]{a.a(this.a), Double.valueOf(anl.a())}));
        CharSequence b = aux.b("KEY_SHORT_DESCRIPTION", null);
        if (b != null) {
            this.shortDescriptionText.setText(b);
        }
        Object b2 = aux.b("KEY_APP_UPDATE_ENDPOINT", "https://github.com/zunjae/anyme_download/releases/download/DownloadLink/anYme.apk");
        if (bit.c(b2)) {
            aug.a(this.a, b2);
            Toast.makeText(this.a, ".APK url copied to your clipboard", 0).show();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.dialog_update, viewGroup, false);
        ButterKnife.a(this, inflate);
        return inflate;
    }

    @OnClick
    public final void onReadChangelogButtonClicked() {
        String b = aux.b("KEY_CHANGELOG_URL", null);
        if (b != null) {
            ((AbstractActivity) getActivity()).a(b);
        }
    }

    public final void onStart() {
        super.onStart();
        b();
        setCancelable(aux.b("KEY_SHOULD_UPDATE", false) ^ 1);
    }

    @OnClick
    public final void onUpdateButtonClicked() {
        ((AbstractActivity) getActivity()).a(aux.b("KEY_APP_UPDATE_ENDPOINT", "https://github.com/zunjae/anyme_download/releases/download/DownloadLink/anYme.apk"));
        NotificationManager notificationManager = (NotificationManager) this.a.getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancel(333);
        }
    }
}
