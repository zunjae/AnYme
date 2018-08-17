package com.zunjae.anyme.activities.misc;

import android.view.View;
import defpackage.cr;

final class e extends cr {
    final /* synthetic */ DiscordExplanationActivity b;
    final /* synthetic */ DiscordExplanationActivity_ViewBinding c;

    e(DiscordExplanationActivity_ViewBinding discordExplanationActivity_ViewBinding, DiscordExplanationActivity discordExplanationActivity) {
        this.c = discordExplanationActivity_ViewBinding;
        this.b = discordExplanationActivity;
    }

    public final void a(View view) {
        this.b.onJoinButtonClicked();
    }
}
