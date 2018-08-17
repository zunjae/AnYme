package com.zunjae.anyme.activities.misc;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class DiscordExplanationActivity_ViewBinding implements Unbinder {
    private DiscordExplanationActivity b;
    private View c;

    public DiscordExplanationActivity_ViewBinding(DiscordExplanationActivity discordExplanationActivity, View view) {
        this.b = discordExplanationActivity;
        discordExplanationActivity.backgroundImage = (ImageView) ct.a(view, (int) R.id.backgroundImage, "field 'backgroundImage'", ImageView.class);
        view = ct.a(view, R.id.joinButton, "method 'onJoinButtonClicked'");
        this.c = view;
        view.setOnClickListener(new e(this, discordExplanationActivity));
    }

    public final void a() {
        DiscordExplanationActivity discordExplanationActivity = this.b;
        if (discordExplanationActivity != null) {
            this.b = null;
            discordExplanationActivity.backgroundImage = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
