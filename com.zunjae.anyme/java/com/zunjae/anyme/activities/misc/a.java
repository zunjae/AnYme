package com.zunjae.anyme.activities.misc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.afollestad.materialdialogs.e;
import com.afollestad.materialdialogs.j;
import com.afollestad.materialdialogs.x;
import com.zunjae.anyme.rewrite.activities.MainActivityR2;

final class a implements x {
    final /* synthetic */ Activity a;

    a(Activity activity) {
        this.a = activity;
    }

    public final void onClick(j jVar, e eVar) {
        this.a.finish();
        Context context = this.a;
        context.startActivity(new Intent(context, MainActivityR2.class));
    }
}
