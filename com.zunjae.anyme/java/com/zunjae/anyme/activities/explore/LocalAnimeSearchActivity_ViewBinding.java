package com.zunjae.anyme.activities.explore;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import butterknife.Unbinder;
import com.miguelcatalan.materialsearchview.MaterialSearchView;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class LocalAnimeSearchActivity_ViewBinding implements Unbinder {
    private LocalAnimeSearchActivity b;
    private View c;
    private View d;
    private View e;

    public LocalAnimeSearchActivity_ViewBinding(LocalAnimeSearchActivity localAnimeSearchActivity, View view) {
        this.b = localAnimeSearchActivity;
        localAnimeSearchActivity.searchView = (MaterialSearchView) ct.a(view, (int) R.id.search_view, "field 'searchView'", MaterialSearchView.class);
        localAnimeSearchActivity.toolbar = (Toolbar) ct.a(view, (int) R.id.fastAnimeSearchToolbar, "field 'toolbar'", Toolbar.class);
        View a = ct.a(view, R.id.filterTV, "field 'filterTV' and method 'onFilterChanged'");
        localAnimeSearchActivity.filterTV = (CheckBox) ct.b(a, R.id.filterTV, "field 'filterTV'", CheckBox.class);
        this.c = a;
        ((CompoundButton) a).setOnCheckedChangeListener(new q(this, localAnimeSearchActivity));
        a = ct.a(view, R.id.filterMovies, "field 'filterMovies' and method 'onFilterChanged'");
        localAnimeSearchActivity.filterMovies = (CheckBox) ct.b(a, R.id.filterMovies, "field 'filterMovies'", CheckBox.class);
        this.d = a;
        ((CompoundButton) a).setOnCheckedChangeListener(new r(this, localAnimeSearchActivity));
        view = ct.a(view, R.id.filterOther, "field 'filterOther' and method 'onFilterChanged'");
        localAnimeSearchActivity.filterOther = (CheckBox) ct.b(view, R.id.filterOther, "field 'filterOther'", CheckBox.class);
        this.e = view;
        ((CompoundButton) view).setOnCheckedChangeListener(new s(this, localAnimeSearchActivity));
    }

    public final void a() {
        LocalAnimeSearchActivity localAnimeSearchActivity = this.b;
        if (localAnimeSearchActivity != null) {
            this.b = null;
            localAnimeSearchActivity.searchView = null;
            localAnimeSearchActivity.toolbar = null;
            localAnimeSearchActivity.filterTV = null;
            localAnimeSearchActivity.filterMovies = null;
            localAnimeSearchActivity.filterOther = null;
            ((CompoundButton) this.c).setOnCheckedChangeListener(null);
            this.c = null;
            ((CompoundButton) this.d).setOnCheckedChangeListener(null);
            this.d = null;
            ((CompoundButton) this.e).setOnCheckedChangeListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
