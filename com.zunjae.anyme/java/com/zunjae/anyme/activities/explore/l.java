package com.zunjae.anyme.activities.explore;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import com.zunjae.zasync.c;
import defpackage.ajp;
import defpackage.ass;

final class l extends c<ass> {
    final /* synthetic */ FastAnimeSearchActivity a;
    private final String b;

    l(FastAnimeSearchActivity fastAnimeSearchActivity, Activity activity, String str) {
        this.a = fastAnimeSearchActivity;
        super(activity);
        this.b = str;
    }

    protected final void a() {
        super.a();
        this.a.swipeRefreshLayout.setRefreshing(true);
    }

    protected final /* synthetic */ void a(Object obj) {
        obj = (ass) obj;
        super.a(obj);
        this.a.swipeRefreshLayout.setRefreshing(false);
        if (obj != null) {
            Context d;
            CharSequence charSequence;
            if (obj.a() == null) {
                d = this.a.b;
                charSequence = "Could not connect to MAL. Try again later";
            } else if (obj.a().size() == 0) {
                d = this.a.b;
                StringBuilder stringBuilder = new StringBuilder("No search results found for ");
                stringBuilder.append(this.b);
                charSequence = stringBuilder.toString();
            } else {
                this.a.frameLayoutGenres.setVisibility(8);
                this.a.userInfo.setVisibility(8);
                this.a.a(obj.a(), obj.b());
            }
            Toast.makeText(d, charSequence, 1).show();
        }
    }

    public final /* synthetic */ Object b() {
        return new ass(ajp.b(this.b), this.a.j.m());
    }
}
