package com.zunjae.anyme.activities.explore;

import android.app.Activity;
import com.zunjae.anyme.adapters.animes.AnimeCategoryItemAdapter;
import com.zunjae.zasync.c;
import com.zunjae.zrecyclerview.a;
import com.zunjae.zrecyclerview.b;
import defpackage.ajp;
import defpackage.amk;
import defpackage.are;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class i extends c<ArrayList<amk>> {
    final /* synthetic */ CategoryItemsActivity a;

    i(CategoryItemsActivity categoryItemsActivity, Activity activity) {
        this.a = categoryItemsActivity;
        super(activity);
    }

    protected final void a() {
        super.a();
        this.a.swipeRefreshLayout.setRefreshing(true);
    }

    protected final /* synthetic */ void a(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        super.a((Object) arrayList);
        this.a.swipeRefreshLayout.setRefreshing(false);
        if (arrayList != null) {
            if (arrayList.size() != 0) {
                this.a.errorMessage.setVisibility(8);
                new b(this.a.b, this.a.recyclerView, new AnimeCategoryItemAdapter(this.a, arrayList, this.a.d)).a(1, 2).b(a.b).a();
                return;
            }
        }
        this.a.errorMessage.setText("Could not connect to the server. Refresh to try again");
        this.a.errorMessage.setVisibility(0);
    }

    public final /* synthetic */ Object b() {
        ArrayList a = ajp.a(this.a.c.c());
        List<are> i = this.a.d.i();
        if (a != null) {
            Iterator it = a.iterator();
            while (it.hasNext()) {
                amk amk = (amk) it.next();
                for (are d : i) {
                    if (d.d() == amk.c()) {
                        amk.b();
                    }
                }
            }
        }
        return a;
    }
}
