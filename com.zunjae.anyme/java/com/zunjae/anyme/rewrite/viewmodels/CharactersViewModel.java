package com.zunjae.anyme.rewrite.viewmodels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import defpackage.arh;
import defpackage.asz;
import java.util.List;

public final class CharactersViewModel extends AndroidViewModel {
    private static final String a = "com.zunjae.anyme.rewrite.viewmodels.CharactersViewModel";
    private final asz b;

    public CharactersViewModel(Application application) {
        super(application);
        this.b = new asz(application);
    }

    public final void a(List<arh> list, long j) {
        this.b.a(list, j);
    }

    public final boolean a(long j) {
        return this.b.a(j);
    }

    public final List<arh> b(long j) {
        return this.b.b(j);
    }

    public final LiveData<List<arh>> c(long j) {
        return this.b.c(j);
    }
}
