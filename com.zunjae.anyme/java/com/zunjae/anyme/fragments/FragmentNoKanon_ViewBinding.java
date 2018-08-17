package com.zunjae.anyme.fragments;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import defpackage.ct;
import me.zhanghai.android.materialprogressbar.R;

public final class FragmentNoKanon_ViewBinding implements Unbinder {
    private FragmentNoKanon b;
    private View c;

    public FragmentNoKanon_ViewBinding(FragmentNoKanon fragmentNoKanon, View view) {
        this.b = fragmentNoKanon;
        fragmentNoKanon.message = (TextView) ct.a(view, (int) R.id.message, "field 'message'", TextView.class);
        view = ct.a(view, com.zunjae.anyme.R.id.buttonGetStarted, "method 'onGetStartedButtonClicked'");
        this.c = view;
        view.setOnClickListener(new a(this, fragmentNoKanon));
    }

    public final void a() {
        FragmentNoKanon fragmentNoKanon = this.b;
        if (fragmentNoKanon != null) {
            this.b = null;
            fragmentNoKanon.message = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
