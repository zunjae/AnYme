package defpackage;

import android.content.Context;
import android.support.v4.internal.view.SupportMenu;
import android.support.v7.view.menu.aj;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public final class cj extends ActionMode {
    final Context a;
    final ce b;

    public cj(Context context, ce ceVar) {
        this.a = context;
        this.b = ceVar;
    }

    public final void finish() {
        this.b.c();
    }

    public final View getCustomView() {
        return this.b.i();
    }

    public final Menu getMenu() {
        return aj.a(this.a, (SupportMenu) this.b.b());
    }

    public final MenuInflater getMenuInflater() {
        return this.b.a();
    }

    public final CharSequence getSubtitle() {
        return this.b.g();
    }

    public final Object getTag() {
        return this.b.j();
    }

    public final CharSequence getTitle() {
        return this.b.f();
    }

    public final boolean getTitleOptionalHint() {
        return this.b.k();
    }

    public final void invalidate() {
        this.b.d();
    }

    public final boolean isTitleOptional() {
        return this.b.h();
    }

    public final void setCustomView(View view) {
        this.b.a(view);
    }

    public final void setSubtitle(int i) {
        this.b.b(i);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.b.a(charSequence);
    }

    public final void setTag(Object obj) {
        this.b.a(obj);
    }

    public final void setTitle(int i) {
        this.b.a(i);
    }

    public final void setTitle(CharSequence charSequence) {
        this.b.b(charSequence);
    }

    public final void setTitleOptionalHint(boolean z) {
        this.b.a(z);
    }
}
