package com.miguelcatalan.materialsearchview;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

final class a implements OnEditorActionListener {
    final /* synthetic */ MaterialSearchView a;

    a(MaterialSearchView materialSearchView) {
        this.a = materialSearchView;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.a.e();
        return true;
    }
}
