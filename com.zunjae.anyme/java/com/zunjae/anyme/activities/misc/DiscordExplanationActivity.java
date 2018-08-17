package com.zunjae.anyme.activities.misc;

import android.os.Bundle;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import defpackage.aun;
import defpackage.de;

public final class DiscordExplanationActivity extends AbstractActivity {
    @BindView
    ImageView backgroundImage;

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_discord);
        ButterKnife.a(this);
        de.b(this.b).a(Integer.valueOf(R.drawable.discord)).a(this.backgroundImage);
    }

    @OnClick
    public final void onJoinButtonClicked() {
        aun.c();
        a("https://discord.gg/8XtWsfX");
    }
}
