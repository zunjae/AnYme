package com.zunjae.anyme.activities.misc;

import android.os.Bundle;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import defpackage.aup;
import mehdi.sakout.fancybuttons.FancyButton;

public final class KanonExplanation extends AbstractActivity {
    @BindView
    FancyButton loginButton;

    public final void onBackPressed() {
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_kanonapp_explanation);
        ButterKnife.a(this);
        this.loginButton.setAnimation(aup.a(0.7d, 250));
    }

    @OnClick
    public final void onJoinButtonClicked() {
        a("https://kanonapp.com/account/register");
        finish();
    }
}
