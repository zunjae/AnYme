package com.zunjae.anyme;

import android.os.AsyncTask;
import com.crashlytics.android.a;
import defpackage.avf;
import defpackage.nz;

final class b extends AsyncTask<Void, Void, Void> {
    private final AnYmeApp a;

    private b(AnYmeApp anYmeApp) {
        this.a = anYmeApp;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        avf.a(this.a, new nz(), new a());
        return null;
    }
}
