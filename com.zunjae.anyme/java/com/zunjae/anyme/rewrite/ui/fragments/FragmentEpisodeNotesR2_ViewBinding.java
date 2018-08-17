package com.zunjae.anyme.rewrite.ui.fragments;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class FragmentEpisodeNotesR2_ViewBinding implements Unbinder {
    private FragmentEpisodeNotesR2 b;

    public FragmentEpisodeNotesR2_ViewBinding(FragmentEpisodeNotesR2 fragmentEpisodeNotesR2, View view) {
        this.b = fragmentEpisodeNotesR2;
        fragmentEpisodeNotesR2.recyclerView = (RecyclerView) ct.a(view, (int) R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
        fragmentEpisodeNotesR2.swipeRefreshLayout = (SwipeRefreshLayout) ct.a(view, (int) R.id.swipeRefreshLayout, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
        fragmentEpisodeNotesR2.errorMessage = (TextView) ct.a(view, (int) R.id.errorMessage, "field 'errorMessage'", TextView.class);
    }

    public final void a() {
        FragmentEpisodeNotesR2 fragmentEpisodeNotesR2 = this.b;
        if (fragmentEpisodeNotesR2 != null) {
            this.b = null;
            fragmentEpisodeNotesR2.recyclerView = null;
            fragmentEpisodeNotesR2.swipeRefreshLayout = null;
            fragmentEpisodeNotesR2.errorMessage = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
