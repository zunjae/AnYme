package com.zunjae.anyme.activities.explore;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.miguelcatalan.materialsearchview.MaterialSearchView;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class FastAnimeSearchActivity_ViewBinding implements Unbinder {
    private FastAnimeSearchActivity b;
    private View c;
    private View d;

    public FastAnimeSearchActivity_ViewBinding(FastAnimeSearchActivity fastAnimeSearchActivity, View view) {
        this.b = fastAnimeSearchActivity;
        fastAnimeSearchActivity.searchView = (MaterialSearchView) ct.a(view, (int) R.id.search_view, "field 'searchView'", MaterialSearchView.class);
        fastAnimeSearchActivity.toolbar = (Toolbar) ct.a(view, (int) R.id.toolbar, "field 'toolbar'", Toolbar.class);
        fastAnimeSearchActivity.recyclerView = (RecyclerView) ct.a(view, (int) R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
        fastAnimeSearchActivity.userInfo = (TextView) ct.a(view, (int) R.id.information, "field 'userInfo'", TextView.class);
        View a = ct.a(view, R.id.hideAlreadyAddedCheckBox, "field 'hideAlreadyAdded' and method 'setShouldHideAlreadyAdded'");
        fastAnimeSearchActivity.hideAlreadyAdded = (CheckBox) ct.b(a, R.id.hideAlreadyAddedCheckBox, "field 'hideAlreadyAdded'", CheckBox.class);
        this.c = a;
        ((CompoundButton) a).setOnCheckedChangeListener(new m(this, fastAnimeSearchActivity));
        a = ct.a(view, R.id.numberOfRemovedShows, "field 'removedShowsTextView' and method 'showDialogFilteredResults'");
        fastAnimeSearchActivity.removedShowsTextView = (TextView) ct.b(a, R.id.numberOfRemovedShows, "field 'removedShowsTextView'", TextView.class);
        this.d = a;
        a.setOnClickListener(new n(this, fastAnimeSearchActivity));
        fastAnimeSearchActivity.swipeRefreshLayout = (SwipeRefreshLayout) ct.a(view, (int) R.id.swipeRefreshLayout, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
        fastAnimeSearchActivity.frameLayoutGenres = (FrameLayout) ct.a(view, (int) R.id.fragmentContainerFrameLayout, "field 'frameLayoutGenres'", FrameLayout.class);
    }

    public final void a() {
        FastAnimeSearchActivity fastAnimeSearchActivity = this.b;
        if (fastAnimeSearchActivity != null) {
            this.b = null;
            fastAnimeSearchActivity.searchView = null;
            fastAnimeSearchActivity.toolbar = null;
            fastAnimeSearchActivity.recyclerView = null;
            fastAnimeSearchActivity.userInfo = null;
            fastAnimeSearchActivity.hideAlreadyAdded = null;
            fastAnimeSearchActivity.removedShowsTextView = null;
            fastAnimeSearchActivity.swipeRefreshLayout = null;
            fastAnimeSearchActivity.frameLayoutGenres = null;
            ((CompoundButton) this.c).setOnCheckedChangeListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
