package com.mikepenz.materialize;

import android.app.Activity;
import android.os.Build.VERSION;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.mikepenz.materialize.view.ScrimInsetsFrameLayout;
import com.mikepenz.materialize.view.a;
import defpackage.afz;

public final class b {
    protected Activity a;
    protected ViewGroup b;
    protected ViewGroup c;
    protected a d;
    protected boolean e = true;
    protected int f = 0;
    protected int g = -1;
    protected boolean h = false;
    protected boolean i = false;
    protected boolean j = false;
    protected boolean k = true;
    protected boolean l = false;
    protected boolean m = false;
    protected boolean n = false;
    protected boolean o = false;
    protected boolean p = false;
    protected boolean q = false;
    protected ViewGroup r = null;
    protected LayoutParams s = null;

    public final b a() {
        this.e = false;
        return this;
    }

    public final b a(Activity activity) {
        this.b = (ViewGroup) activity.findViewById(16908290);
        this.a = activity;
        return this;
    }

    public final b a(ViewGroup viewGroup) {
        this.b = viewGroup;
        return this;
    }

    public final b a(boolean z) {
        this.h = z;
        return this;
    }

    public final a b() {
        Activity activity = this.a;
        if (activity != null) {
            ViewGroup viewGroup;
            View view;
            View childAt;
            if (this.e) {
                this.d = (ScrimInsetsFrameLayout) activity.getLayoutInflater().inflate(R.layout.materialize, this.b, false);
                viewGroup = this.b;
                if (viewGroup == null || viewGroup.getChildCount() == 0) {
                    throw new RuntimeException("You have to set your layout for this activity with setContentView() first. Or you build the drawer on your own with .buildView()");
                }
                int i;
                a aVar;
                childAt = this.b.getChildAt(0);
                boolean z = true;
                Object obj = childAt.getId() == R.id.materialize_root ? 1 : null;
                if (this.f == 0) {
                    i = this.g;
                    if (i != -1) {
                        i = ContextCompat.getColor(this.a, i);
                        this.f = i;
                        this.d.setInsetForeground(this.f);
                        this.d.setTintStatusBar(this.k);
                        this.d.setTintNavigationBar(this.o);
                        aVar = this.d;
                        if (!this.p || this.q) {
                            z = false;
                        }
                        aVar.setSystemUIVisible(z);
                        if (obj != null) {
                            this.b.removeView(childAt);
                        } else {
                            this.b.removeAllViews();
                        }
                        this.d.getView().addView(childAt, new FrameLayout.LayoutParams(-1, -1));
                        this.c = this.d.getView();
                        viewGroup = this.r;
                        if (viewGroup != null) {
                            this.c = viewGroup;
                            this.c.addView(this.d.getView(), new LayoutParams(-1, -1));
                        }
                        this.c.setId(R.id.materialize_root);
                        if (this.s == null) {
                            this.s = new LayoutParams(-1, -1);
                        }
                        viewGroup = this.b;
                        view = this.c;
                    }
                }
                if (this.f == 0) {
                    i = afz.a(this.a, R.attr.colorPrimaryDark, R.color.materialize_primary_dark);
                    this.f = i;
                }
                this.d.setInsetForeground(this.f);
                this.d.setTintStatusBar(this.k);
                this.d.setTintNavigationBar(this.o);
                aVar = this.d;
                if (this.p) {
                }
                z = false;
                aVar.setSystemUIVisible(z);
                if (obj != null) {
                    this.b.removeAllViews();
                } else {
                    this.b.removeView(childAt);
                }
                this.d.getView().addView(childAt, new FrameLayout.LayoutParams(-1, -1));
                this.c = this.d.getView();
                viewGroup = this.r;
                if (viewGroup != null) {
                    this.c = viewGroup;
                    this.c.addView(this.d.getView(), new LayoutParams(-1, -1));
                }
                this.c.setId(R.id.materialize_root);
                if (this.s == null) {
                    this.s = new LayoutParams(-1, -1);
                }
                viewGroup = this.b;
                view = this.c;
            } else if (this.r != null) {
                childAt = this.b.getChildAt(0);
                this.b.removeView(childAt);
                this.r.addView(childAt, new FrameLayout.LayoutParams(-1, -1));
                if (this.s == null) {
                    this.s = new LayoutParams(-1, -1);
                }
                viewGroup = this.b;
                view = this.r;
            } else {
                throw new RuntimeException("please pass a container");
            }
            viewGroup.addView(view, this.s);
            if (this.q && VERSION.SDK_INT >= 16) {
                this.a.getWindow().getDecorView().setSystemUiVisibility(5894);
            }
            if (this.i && VERSION.SDK_INT >= 21) {
                afz.a(this.a);
            }
            if (this.l && VERSION.SDK_INT >= 21) {
                afz.b(this.a);
            }
            if ((this.h || this.m) && VERSION.SDK_INT >= 21) {
                this.a.getWindow().addFlags(Integer.MIN_VALUE);
            }
            if (this.h && VERSION.SDK_INT >= 21) {
                afz.a(this.a);
                this.a.getWindow().setStatusBarColor(0);
            }
            if (this.m && VERSION.SDK_INT >= 21) {
                afz.b(this.a);
                this.a.getWindow().setNavigationBarColor(0);
            }
            int a = (!this.j || VERSION.SDK_INT < 21) ? 0 : afz.a(this.a, false);
            int a2 = (!this.n || VERSION.SDK_INT < 21) ? 0 : afz.a(this.a);
            if (this.j || (this.n && VERSION.SDK_INT >= 21)) {
                this.d.getView().setPadding(0, a, 0, a2);
            }
            this.a = null;
            return new a(this);
        }
        throw new RuntimeException("please pass an activity");
    }

    public final b b(ViewGroup viewGroup) {
        this.r = viewGroup;
        return this;
    }

    public final b b(boolean z) {
        this.l = z;
        return this;
    }

    public final b c(boolean z) {
        this.p = z;
        if (z) {
            this.l = true;
            this.k = false;
            this.o = false;
        }
        return this;
    }

    public final b d(boolean z) {
        this.q = z;
        if (z) {
            c(z);
        }
        return this;
    }
}
