package com.zunjae.anyme.fragments.anime;

import android.app.Activity;
import android.widget.TextView;
import com.zunjae.zasync.c;
import defpackage.ajp;
import defpackage.ame;
import java.util.ArrayList;

final class j extends c<ArrayList<ame>> {
    final /* synthetic */ FragmentAnimeNews a;

    j(FragmentAnimeNews fragmentAnimeNews, Activity activity) {
        this.a = fragmentAnimeNews;
        super(activity);
    }

    protected final void a() {
        super.a();
        this.a.swipeRefreshLayout.setRefreshing(true);
    }

    protected final /* synthetic */ void a(Object obj) {
        obj = (ArrayList) obj;
        super.a(obj);
        this.a.swipeRefreshLayout.setRefreshing(false);
        if (obj == null) {
            if (this.a.e == null || !this.a.e.a()) {
                this.a.errorMessage.setVisibility(0);
                this.a.errorMessage.setText("Can not connect to MAL. Swipe down to retry");
            }
        } else if (obj.size() != 0) {
            this.a.swipeRefreshLayout.setEnabled(false);
            this.a.errorMessage.setVisibility(8);
            this.a.d = obj;
            this.a.a((ArrayList) obj);
        } else if (this.a.e == null || !this.a.e.a()) {
            TextView textView = this.a.errorMessage;
            StringBuilder stringBuilder = new StringBuilder("No news articles found for ");
            stringBuilder.append(this.a.b.g());
            textView.setText(stringBuilder.toString());
            this.a.errorMessage.setVisibility(0);
        }
    }

    public final /* synthetic */ Object b() {
        return ajp.a(this.a.b);
    }
}
