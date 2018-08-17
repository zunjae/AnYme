package com.zunjae.anyme.activities.browsers;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;
import mehdi.sakout.fancybuttons.FancyButton;

public class SearchResultsBrowser_ViewBinding implements Unbinder {
    private SearchResultsBrowser b;
    private View c;

    public SearchResultsBrowser_ViewBinding(SearchResultsBrowser searchResultsBrowser, View view) {
        this.b = searchResultsBrowser;
        searchResultsBrowser.toolbar = (Toolbar) ct.a(view, (int) R.id.searchResultsActivityToolbar, "field 'toolbar'", Toolbar.class);
        searchResultsBrowser.progressBar = (ProgressBar) ct.a(view, (int) R.id.browserProgressBar, "field 'progressBar'", ProgressBar.class);
        View a = ct.a(view, R.id.addToPtwButton, "field 'addToPTWButton' and method 'onAddToPTWButtonClicked'");
        searchResultsBrowser.addToPTWButton = (FancyButton) ct.b(a, R.id.addToPtwButton, "field 'addToPTWButton'", FancyButton.class);
        this.c = a;
        a.setOnClickListener(new n(this, searchResultsBrowser));
        searchResultsBrowser.DESKTOP_USERAGENT = view.getContext().getResources().getString(R.string.desktop_useragent);
    }

    public final void a() {
        SearchResultsBrowser searchResultsBrowser = this.b;
        if (searchResultsBrowser != null) {
            this.b = null;
            searchResultsBrowser.toolbar = null;
            searchResultsBrowser.progressBar = null;
            searchResultsBrowser.addToPTWButton = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
