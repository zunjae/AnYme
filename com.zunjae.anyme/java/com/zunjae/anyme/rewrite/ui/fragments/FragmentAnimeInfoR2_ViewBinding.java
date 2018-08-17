package com.zunjae.anyme.rewrite.ui.fragments;

import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class FragmentAnimeInfoR2_ViewBinding implements Unbinder {
    private FragmentAnimeInfoR2 b;

    public FragmentAnimeInfoR2_ViewBinding(FragmentAnimeInfoR2 fragmentAnimeInfoR2, View view) {
        this.b = fragmentAnimeInfoR2;
        fragmentAnimeInfoR2.swipeRefreshLayout = (SwipeRefreshLayout) ct.a(view, (int) R.id.swipeRefreshLayout, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
        fragmentAnimeInfoR2.statusContainer = (LinearLayout) ct.a(view, (int) R.id.statusContainer, "field 'statusContainer'", LinearLayout.class);
        fragmentAnimeInfoR2.progressContainer = (LinearLayout) ct.a(view, (int) R.id.progressContainer, "field 'progressContainer'", LinearLayout.class);
        fragmentAnimeInfoR2.scoreContainer = (LinearLayout) ct.a(view, (int) R.id.scoreContainer, "field 'scoreContainer'", LinearLayout.class);
    }

    public final void a() {
        FragmentAnimeInfoR2 fragmentAnimeInfoR2 = this.b;
        if (fragmentAnimeInfoR2 != null) {
            this.b = null;
            fragmentAnimeInfoR2.swipeRefreshLayout = null;
            fragmentAnimeInfoR2.statusContainer = null;
            fragmentAnimeInfoR2.progressContainer = null;
            fragmentAnimeInfoR2.scoreContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
