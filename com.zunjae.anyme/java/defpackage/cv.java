package defpackage;

import android.view.inputmethod.InputMethodManager;
import com.afollestad.materialdialogs.j;
import com.afollestad.materialdialogs.o;

final class cv implements Runnable {
    final /* synthetic */ j a;
    final /* synthetic */ o b;

    cv(j jVar, o oVar) {
        this.a = jVar;
        this.b = oVar;
    }

    public final void run() {
        this.a.f().requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) this.b.a().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.a.f(), 1);
        }
    }
}
