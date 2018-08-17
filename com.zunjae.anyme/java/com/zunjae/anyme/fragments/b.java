package com.zunjae.anyme.fragments;

import android.app.Activity;
import android.content.Context;
import com.zunjae.anyme.adapters.Rule34Adapter;
import com.zunjae.zasync.c;
import com.zunjae.zrecyclerview.a;
import defpackage.ajt;
import defpackage.alj;
import java.util.ArrayList;

final class b extends c<ArrayList<alj>> {
    final /* synthetic */ FragmentRule34 a;

    public b(FragmentRule34 fragmentRule34, Activity activity) {
        this.a = fragmentRule34;
        super(activity);
    }

    protected final /* synthetic */ void a(Object obj) {
        obj = (ArrayList) obj;
        super.a(obj);
        if (obj != null) {
            Context a = this.a.a;
            FragmentRule34 fragmentRule34 = this.a;
            new com.zunjae.zrecyclerview.b(a, fragmentRule34.recyclerView, new Rule34Adapter(fragmentRule34.a, obj)).a(3, 5).b(a.b).a();
        }
    }

    public final /* synthetic */ Object b() {
        return ajt.a("NTR");
    }
}
