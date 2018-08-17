package com.zunjae.anyme.activities.explore;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import butterknife.Unbinder;
import com.greenfrvr.hashtagview.HashtagView;
import com.zunjae.anyme.R;
import defpackage.ct;
import mehdi.sakout.fancybuttons.FancyButton;

public final class AdvancedAnimeSearch_ViewBinding implements Unbinder {
    private AdvancedAnimeSearch b;
    private View c;

    public AdvancedAnimeSearch_ViewBinding(AdvancedAnimeSearch advancedAnimeSearch, View view) {
        this.b = advancedAnimeSearch;
        advancedAnimeSearch.scoreSpinner = (Spinner) ct.a(view, (int) R.id.searchAnimeMinimumScoreSpinner, "field 'scoreSpinner'", Spinner.class);
        advancedAnimeSearch.statusSpinner = (Spinner) ct.a(view, (int) R.id.searchAnimeStatusSpinner, "field 'statusSpinner'", Spinner.class);
        advancedAnimeSearch.hashtagView = (HashtagView) ct.a(view, (int) R.id.searchAnimeHashtags, "field 'hashtagView'", HashtagView.class);
        advancedAnimeSearch.toolbar = (Toolbar) ct.a(view, (int) R.id.searchAnimeToolbar, "field 'toolbar'", Toolbar.class);
        View a = ct.a(view, R.id.searchAnimeButton, "field 'searchButton' and method 'onSearchButtonClick'");
        advancedAnimeSearch.searchButton = (FancyButton) ct.b(a, R.id.searchAnimeButton, "field 'searchButton'", FancyButton.class);
        this.c = a;
        a.setOnClickListener(new c(this, advancedAnimeSearch));
        advancedAnimeSearch.inputName = (EditText) ct.a(view, (int) R.id.searchAnimeInputName, "field 'inputName'", EditText.class);
    }

    public final void a() {
        AdvancedAnimeSearch advancedAnimeSearch = this.b;
        if (advancedAnimeSearch != null) {
            this.b = null;
            advancedAnimeSearch.scoreSpinner = null;
            advancedAnimeSearch.statusSpinner = null;
            advancedAnimeSearch.hashtagView = null;
            advancedAnimeSearch.toolbar = null;
            advancedAnimeSearch.searchButton = null;
            advancedAnimeSearch.inputName = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
