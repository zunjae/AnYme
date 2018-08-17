package com.zunjae.anyme.dialogs.animeDialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.zunjae.anyme.R;
import com.zunjae.anyme.dialogs.b;
import defpackage.anm;
import defpackage.aum;

public final class UpdaterDialog extends b {
    @BindView
    TextView bottomText;
    @BindView
    TextView logo;
    @BindView
    TextView middleText;

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.middleText.setText(String.format("\n%s", new Object[]{aum.a(this.a.getResources().getString(R.string.emoji_body))}));
        this.bottomText.setText(String.format("%s: %s", new Object[]{this.a.getResources().getString(R.string.why), anm.a(this.a)}));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.dialog_synopsis_, viewGroup, false);
        ButterKnife.a(this, inflate);
        return inflate;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        getActivity().finish();
        System.exit(0);
        throw new RuntimeException(this.a.getResources().getString(com.zunjae.zrecyclerview.R.string.app_name));
    }

    public final void onStart() {
        super.onStart();
        b();
    }
}
