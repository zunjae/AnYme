package defpackage;

import android.content.Context;
import android.support.v7.view.menu.p;
import android.support.v7.view.menu.q;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

public final class ci extends ce implements q {
    private Context a;
    private ActionBarContextView b;
    private cf c;
    private WeakReference<View> d;
    private boolean e;
    private boolean f;
    private p g;

    public ci(Context context, ActionBarContextView actionBarContextView, cf cfVar, boolean z) {
        this.a = context;
        this.b = actionBarContextView;
        this.c = cfVar;
        this.g = new p(actionBarContextView.getContext()).setDefaultShowAsAction(1);
        this.g.setCallback(this);
        this.f = z;
    }

    public final MenuInflater a() {
        return new cl(this.b.getContext());
    }

    public final void a(int i) {
        b(this.a.getString(i));
    }

    public final void a(View view) {
        this.b.setCustomView(view);
        this.d = view != null ? new WeakReference(view) : null;
    }

    public final void a(CharSequence charSequence) {
        this.b.setSubtitle(charSequence);
    }

    public final void a(boolean z) {
        super.a(z);
        this.b.setTitleOptional(z);
    }

    public final Menu b() {
        return this.g;
    }

    public final void b(int i) {
        a(this.a.getString(i));
    }

    public final void b(CharSequence charSequence) {
        this.b.setTitle(charSequence);
    }

    public final void c() {
        if (!this.e) {
            this.e = true;
            this.b.sendAccessibilityEvent(32);
            this.c.a(this);
        }
    }

    public final void d() {
        this.c.b(this, this.g);
    }

    public final CharSequence f() {
        return this.b.getTitle();
    }

    public final CharSequence g() {
        return this.b.getSubtitle();
    }

    public final boolean h() {
        return this.b.isTitleOptional();
    }

    public final View i() {
        WeakReference weakReference = this.d;
        return weakReference != null ? (View) weakReference.get() : null;
    }

    public final boolean onMenuItemSelected(p pVar, MenuItem menuItem) {
        return this.c.a((ce) this, menuItem);
    }

    public final void onMenuModeChange(p pVar) {
        d();
        this.b.showOverflowMenu();
    }
}
