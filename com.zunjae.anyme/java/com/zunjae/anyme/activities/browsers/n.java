package com.zunjae.anyme.activities.browsers;

import android.view.View;
import defpackage.cr;

final class n extends cr {
    final /* synthetic */ SearchResultsBrowser b;
    final /* synthetic */ SearchResultsBrowser_ViewBinding c;

    n(SearchResultsBrowser_ViewBinding searchResultsBrowser_ViewBinding, SearchResultsBrowser searchResultsBrowser) {
        this.c = searchResultsBrowser_ViewBinding;
        this.b = searchResultsBrowser;
    }

    public final void a(View view) {
        this.b.onAddToPTWButtonClicked();
    }
}
