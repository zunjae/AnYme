package com.zunjae.anyme.activities.explore;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class SeasonalAnimeActivity_ViewBinding implements Unbinder {
    private SeasonalAnimeActivity b;
    private View c;

    public SeasonalAnimeActivity_ViewBinding(SeasonalAnimeActivity seasonalAnimeActivity, View view) {
        this.b = seasonalAnimeActivity;
        seasonalAnimeActivity.toolbar = (Toolbar) ct.a(view, (int) R.id.toolbar, "field 'toolbar'", Toolbar.class);
        seasonalAnimeActivity.recyclerView = (RecyclerView) ct.a(view, (int) R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
        seasonalAnimeActivity.swipeRefreshLayout = (SwipeRefreshLayout) ct.a(view, (int) R.id.swipeRefreshLayout, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
        seasonalAnimeActivity.errorMessage = (TextView) ct.a(view, (int) R.id.errorMessage, "field 'errorMessage'", TextView.class);
        View a = ct.a(view, R.id.hideAlreadyAddedCheckBox, "field 'hideAlreadyAdded' and method 'setShouldHideAlreadyAdded'");
        seasonalAnimeActivity.hideAlreadyAdded = (CheckBox) ct.b(a, R.id.hideAlreadyAddedCheckBox, "field 'hideAlreadyAdded'", CheckBox.class);
        this.c = a;
        ((CompoundButton) a).setOnCheckedChangeListener(new w(this, seasonalAnimeActivity));
        seasonalAnimeActivity.spinner = (Spinner) ct.a(view, (int) R.id.spinner, "field 'spinner'", Spinner.class);
    }

    public final void a() {
        SeasonalAnimeActivity seasonalAnimeActivity = this.b;
        if (seasonalAnimeActivity != null) {
            this.b = null;
            seasonalAnimeActivity.toolbar = null;
            seasonalAnimeActivity.recyclerView = null;
            seasonalAnimeActivity.swipeRefreshLayout = null;
            seasonalAnimeActivity.errorMessage = null;
            seasonalAnimeActivity.hideAlreadyAdded = null;
            seasonalAnimeActivity.spinner = null;
            ((CompoundButton) this.c).setOnCheckedChangeListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
