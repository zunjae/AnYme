package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.support.v4.view.ActionProvider;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.appcompat.R;
import android.support.v7.view.menu.t;
import android.support.v7.view.menu.v;
import android.support.v7.widget.DrawableUtils;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

final class cn {
    private String A;
    private String B;
    private CharSequence C;
    private CharSequence D;
    private ColorStateList E = null;
    private Mode F = null;
    ActionProvider a;
    final /* synthetic */ cl b;
    private Menu c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private CharSequence m;
    private CharSequence n;
    private int o;
    private char p;
    private int q;
    private char r;
    private int s;
    private int t;
    private boolean u;
    private boolean v;
    private boolean w;
    private int x;
    private int y;
    private String z;

    public cn(cl clVar, Menu menu) {
        this.b = clVar;
        this.c = menu;
        a();
    }

    private static char a(String str) {
        return str == null ? '\u0000' : str.charAt(0);
    }

    private <T> T a(java.lang.String r2, java.lang.Class<?>[] r3, java.lang.Object[] r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.attributes.IAttribute jadx.core.dex.attributes.AttrNode.get(jadx.core.dex.attributes.AType)' on a null object reference
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r1 = this;
        r0 = r1.b;	 Catch:{ Exception -> 0x0019 }
        r0 = r0.e;	 Catch:{ Exception -> 0x0019 }
        r0 = r0.getClassLoader();	 Catch:{ Exception -> 0x0019 }
        r2 = r0.loadClass(r2);	 Catch:{ Exception -> 0x0019 }
        r2 = r2.getConstructor(r3);	 Catch:{ Exception -> 0x0019 }
        r3 = 1;	 Catch:{ Exception -> 0x0019 }
        r2.setAccessible(r3);	 Catch:{ Exception -> 0x0019 }
        r2 = r2.newInstance(r4);	 Catch:{ Exception -> 0x0019 }
        return r2;
    L_0x0019:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.a(java.lang.String, java.lang.Class[], java.lang.Object[]):T");
    }

    private void a(MenuItem menuItem) {
        Object obj = null;
        menuItem.setChecked(this.u).setVisible(this.v).setEnabled(this.w).setCheckable(this.t > 0).setTitleCondensed(this.n).setIcon(this.o);
        int i = this.x;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.B != null) {
            if (this.b.e.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            menuItem.setOnMenuItemClickListener(new cm(this.b.a(), this.B));
        }
        if (this.t >= 2) {
            if (menuItem instanceof t) {
                ((t) menuItem).a(true);
            } else if (menuItem instanceof v) {
                ((v) menuItem).b();
            }
        }
        String str = this.z;
        if (str != null) {
            menuItem.setActionView((View) a(str, cl.a, this.b.c));
            obj = 1;
        }
        i = this.y;
        if (i > 0 && r2 == null) {
            menuItem.setActionView(i);
        }
        ActionProvider actionProvider = this.a;
        if (actionProvider != null) {
            MenuItemCompat.setActionProvider(menuItem, actionProvider);
        }
        MenuItemCompat.setContentDescription(menuItem, this.C);
        MenuItemCompat.setTooltipText(menuItem, this.D);
        MenuItemCompat.setAlphabeticShortcut(menuItem, this.p, this.q);
        MenuItemCompat.setNumericShortcut(menuItem, this.r, this.s);
        Mode mode = this.F;
        if (mode != null) {
            MenuItemCompat.setIconTintMode(menuItem, mode);
        }
        ColorStateList colorStateList = this.E;
        if (colorStateList != null) {
            MenuItemCompat.setIconTintList(menuItem, colorStateList);
        }
    }

    public final void a() {
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = true;
        this.i = true;
    }

    public final void a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = this.b.e.obtainStyledAttributes(attributeSet, R.styleable.MenuGroup);
        this.d = obtainStyledAttributes.getResourceId(R.styleable.MenuGroup_android_id, 0);
        this.e = obtainStyledAttributes.getInt(R.styleable.MenuGroup_android_menuCategory, 0);
        this.f = obtainStyledAttributes.getInt(R.styleable.MenuGroup_android_orderInCategory, 0);
        this.g = obtainStyledAttributes.getInt(R.styleable.MenuGroup_android_checkableBehavior, 0);
        this.h = obtainStyledAttributes.getBoolean(R.styleable.MenuGroup_android_visible, true);
        this.i = obtainStyledAttributes.getBoolean(R.styleable.MenuGroup_android_enabled, true);
        obtainStyledAttributes.recycle();
    }

    public final void b() {
        this.j = true;
        a(this.c.add(this.d, this.k, this.l, this.m));
    }

    public final void b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = this.b.e.obtainStyledAttributes(attributeSet, R.styleable.MenuItem);
        this.k = obtainStyledAttributes.getResourceId(R.styleable.MenuItem_android_id, 0);
        this.l = (obtainStyledAttributes.getInt(R.styleable.MenuItem_android_menuCategory, this.e) & -65536) | (obtainStyledAttributes.getInt(R.styleable.MenuItem_android_orderInCategory, this.f) & 65535);
        this.m = obtainStyledAttributes.getText(R.styleable.MenuItem_android_title);
        this.n = obtainStyledAttributes.getText(R.styleable.MenuItem_android_titleCondensed);
        this.o = obtainStyledAttributes.getResourceId(R.styleable.MenuItem_android_icon, 0);
        this.p = cn.a(obtainStyledAttributes.getString(R.styleable.MenuItem_android_alphabeticShortcut));
        this.q = obtainStyledAttributes.getInt(R.styleable.MenuItem_alphabeticModifiers, 4096);
        this.r = cn.a(obtainStyledAttributes.getString(R.styleable.MenuItem_android_numericShortcut));
        this.s = obtainStyledAttributes.getInt(R.styleable.MenuItem_numericModifiers, 4096);
        this.t = obtainStyledAttributes.hasValue(R.styleable.MenuItem_android_checkable) ? obtainStyledAttributes.getBoolean(R.styleable.MenuItem_android_checkable, false) : this.g;
        this.u = obtainStyledAttributes.getBoolean(R.styleable.MenuItem_android_checked, false);
        this.v = obtainStyledAttributes.getBoolean(R.styleable.MenuItem_android_visible, this.h);
        this.w = obtainStyledAttributes.getBoolean(R.styleable.MenuItem_android_enabled, this.i);
        this.x = obtainStyledAttributes.getInt(R.styleable.MenuItem_showAsAction, -1);
        this.B = obtainStyledAttributes.getString(R.styleable.MenuItem_android_onClick);
        this.y = obtainStyledAttributes.getResourceId(R.styleable.MenuItem_actionLayout, 0);
        this.z = obtainStyledAttributes.getString(R.styleable.MenuItem_actionViewClass);
        this.A = obtainStyledAttributes.getString(R.styleable.MenuItem_actionProviderClass);
        if ((this.A != null ? 1 : null) != null && this.y == 0 && this.z == null) {
            this.a = (ActionProvider) a(this.A, cl.b, this.b.d);
        } else {
            this.a = null;
        }
        this.C = obtainStyledAttributes.getText(R.styleable.MenuItem_contentDescription);
        this.D = obtainStyledAttributes.getText(R.styleable.MenuItem_tooltipText);
        if (obtainStyledAttributes.hasValue(R.styleable.MenuItem_iconTintMode)) {
            this.F = DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(R.styleable.MenuItem_iconTintMode, -1), this.F);
        } else {
            this.F = null;
        }
        if (obtainStyledAttributes.hasValue(R.styleable.MenuItem_iconTint)) {
            this.E = obtainStyledAttributes.getColorStateList(R.styleable.MenuItem_iconTint);
        } else {
            this.E = null;
        }
        obtainStyledAttributes.recycle();
        this.j = false;
    }

    public final SubMenu c() {
        this.j = true;
        SubMenu addSubMenu = this.c.addSubMenu(this.d, this.k, this.l, this.m);
        a(addSubMenu.getItem());
        return addSubMenu;
    }

    public final boolean d() {
        return this.j;
    }
}
