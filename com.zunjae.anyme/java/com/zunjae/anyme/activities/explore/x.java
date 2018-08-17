package com.zunjae.anyme.activities.explore;

import android.app.Activity;
import com.zunjae.zasync.c;
import defpackage.ajp;
import defpackage.aly;
import defpackage.are;
import defpackage.bin;
import java.util.ArrayList;

final class x extends c<ArrayList<aly>> {
    final /* synthetic */ VideosActivity a;
    private final are b;

    x(VideosActivity videosActivity, Activity activity, are are) {
        this.a = videosActivity;
        super(activity);
        this.b = are;
    }

    protected final void a() {
        super.a();
        this.a.swipeRefreshLayout.setRefreshing(true);
    }

    protected final /* synthetic */ void a(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        super.a((Object) arrayList);
        this.a.swipeRefreshLayout.setRefreshing(false);
        this.a.a(arrayList);
    }

    public final /* bridge */ /* synthetic */ Object b() {
        return ajp.b(this.b);
    }

    protected final boolean c() {
        return false;
    }

    protected final /* synthetic */ Object d() {
        throw new bin("Implement this");
    }
}
