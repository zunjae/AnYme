package com.zunjae.anyme.rewrite.activities;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class CharactersActivityR2_ViewBinding implements Unbinder {
    private CharactersActivityR2 b;

    public CharactersActivityR2_ViewBinding(CharactersActivityR2 charactersActivityR2, View view) {
        this.b = charactersActivityR2;
        charactersActivityR2.toolbar = (Toolbar) ct.a(view, (int) R.id.toolbar, "field 'toolbar'", Toolbar.class);
        charactersActivityR2.recyclerView = (RecyclerView) ct.a(view, (int) R.id.recyclerViewCharacters, "field 'recyclerView'", RecyclerView.class);
    }

    public final void a() {
        CharactersActivityR2 charactersActivityR2 = this.b;
        if (charactersActivityR2 != null) {
            this.b = null;
            charactersActivityR2.toolbar = null;
            charactersActivityR2.recyclerView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
