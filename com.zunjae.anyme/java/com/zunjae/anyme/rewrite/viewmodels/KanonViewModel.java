package com.zunjae.anyme.rewrite.viewmodels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import defpackage.asp;
import defpackage.ata;
import java.util.List;

public final class KanonViewModel extends AndroidViewModel {
    private final ata a;

    public KanonViewModel(Application application) {
        super(application);
        this.a = new ata(application);
    }

    public final LiveData<List<asp>> a() {
        return this.a.b();
    }

    public final void a(asp asp) {
        this.a.a(asp);
    }

    public final ata b() {
        return this.a;
    }

    public final void b(asp asp) {
        this.a.b(asp);
    }

    public final void c() {
        this.a.a();
    }
}
