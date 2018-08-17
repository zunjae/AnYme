package defpackage;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public abstract class ce {
    private Object a;
    private boolean b;

    public abstract MenuInflater a();

    public abstract void a(int i);

    public abstract void a(View view);

    public abstract void a(CharSequence charSequence);

    public final void a(Object obj) {
        this.a = obj;
    }

    public void a(boolean z) {
        this.b = z;
    }

    public abstract Menu b();

    public abstract void b(int i);

    public abstract void b(CharSequence charSequence);

    public abstract void c();

    public abstract void d();

    public abstract CharSequence f();

    public abstract CharSequence g();

    public boolean h() {
        return false;
    }

    public abstract View i();

    public final Object j() {
        return this.a;
    }

    public final boolean k() {
        return this.b;
    }
}
