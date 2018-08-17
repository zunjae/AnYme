package com.miguelcatalan.materialsearchview;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class f implements OnMenuItemClickListener {
    final /* synthetic */ MaterialSearchView a;

    f(MaterialSearchView materialSearchView) {
        this.a = materialSearchView;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.a.c();
        return true;
    }
}
