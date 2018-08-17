package com.zunjae.anyme.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.widget.Toast;
import com.zunjae.zasync.c;
import defpackage.alg;
import defpackage.amx;
import defpackage.asp;
import defpackage.ata;
import defpackage.aui;

final class b extends c<alg> {
    final /* synthetic */ AllWaifusAdapter a;
    private final asp b;
    private final int c;

    b(AllWaifusAdapter allWaifusAdapter, Activity activity, asp asp, int i) {
        this.a = allWaifusAdapter;
        super(activity);
        this.b = asp;
        this.c = i;
    }

    @SuppressLint({"DefaultLocale"})
    protected final /* synthetic */ void a(Object obj) {
        obj = (alg) obj;
        super.a(obj);
        if (obj == null) {
            Toast.makeText(this.a.b, "Could not connect to Kanon", 1).show();
        } else if (obj.d()) {
            Toast.makeText(this.a.b, String.format("(%d) Could not delete %s, reason: %s", new Object[]{Integer.valueOf(obj.a()), this.b.d(), obj.b()}), 1).show();
        } else {
            Toast.makeText(this.a.b, String.format("Removed %s from your favorites", new Object[]{this.b.d()}), 0).show();
            this.a.c.remove(this.c);
            this.a.notifyItemRemoved(this.c);
            AllWaifusAdapter allWaifusAdapter = this.a;
            allWaifusAdapter.notifyItemRangeChanged(this.c, allWaifusAdapter.getItemCount());
            this.a.e.a(this.b);
            aui.a().c(new amx(this.a.c.size()));
        }
    }

    public final /* bridge */ /* synthetic */ Object b() {
        this.a.e;
        return ata.b(this.b.b());
    }
}
