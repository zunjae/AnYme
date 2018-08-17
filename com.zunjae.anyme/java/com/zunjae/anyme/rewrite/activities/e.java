package com.zunjae.anyme.rewrite.activities;

import android.arch.lifecycle.ad;
import defpackage.adx;
import defpackage.atq;

final class e implements ad<Integer> {
    final /* synthetic */ MainActivityR2 a;

    e(MainActivityR2 mainActivityR2) {
        this.a = mainActivityR2;
    }

    public final /* synthetic */ void onChanged(Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            atq a = this.a.i;
            a.a().a(3, new adx(String.valueOf(num)));
        }
    }
}
