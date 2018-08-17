package com.miguelcatalan.materialsearchview;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class e implements OnItemClickListener {
    final /* synthetic */ l a;
    final /* synthetic */ MaterialSearchView b;

    e(MaterialSearchView materialSearchView, l lVar) {
        this.b = materialSearchView;
        this.a = lVar;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.b.a((String) this.a.getItem(i), this.b.s);
    }
}
