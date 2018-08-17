package com.afollestad.materialdialogs;

import android.text.Editable;
import android.text.TextWatcher;

final class m implements TextWatcher {
    final /* synthetic */ j a;

    m(j jVar) {
        this.a = jVar;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        i = charSequence.toString().length();
        boolean z = false;
        if (!this.a.b.ao) {
            if (i == 0) {
                z = true;
            }
            this.a.a(e.POSITIVE).setEnabled(z ^ 1);
        }
        this.a.a(i, z);
        j jVar = this.a;
        o oVar = jVar.b;
        if (oVar.aq) {
            oVar.an.onInput(jVar, charSequence);
        }
    }
}
