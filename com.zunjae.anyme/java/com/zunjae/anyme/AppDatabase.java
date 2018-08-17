package com.zunjae.anyme;

import android.arch.persistence.room.j;
import android.arch.persistence.room.k;
import android.content.Context;
import defpackage.aoh;
import defpackage.aqq;
import defpackage.aqw;

public abstract class AppDatabase extends k {
    private static AppDatabase d;

    public static AppDatabase a(Context context) {
        if (d == null) {
            d = (AppDatabase) j.a(context.getApplicationContext(), AppDatabase.class, "anyme-database").b().a().c();
        }
        return d;
    }

    public abstract aoh l();

    public abstract aqq m();

    public abstract aqw n();
}
