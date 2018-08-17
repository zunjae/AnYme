package com.miguelcatalan.materialsearchview;

import android.text.Editable;
import android.text.TextWatcher;

final class b implements TextWatcher {
    final /* synthetic */ MaterialSearchView a;

    b(MaterialSearchView materialSearchView) {
        this.a = materialSearchView;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.n = charSequence;
        this.a.a(charSequence);
        MaterialSearchView.c(this.a, charSequence);
    }
}
