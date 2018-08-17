package com.mikepenz.materialdrawer;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.b;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.mikepenz.fastadapter.expandable.a;
import com.mikepenz.fastadapter.i;
import com.mikepenz.fastadapter.v;
import com.mikepenz.materialize.view.ScrimInsetsRelativeLayout;
import defpackage.abw;
import defpackage.aby;
import defpackage.acs;
import defpackage.act;
import defpackage.adv;
import defpackage.afi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class t {
    protected boolean A = false;
    protected boolean B = true;
    protected b C;
    protected boolean D = false;
    protected View E;
    protected boolean F = true;
    protected boolean G = true;
    protected adv H = null;
    protected View I;
    protected boolean J = true;
    protected View K;
    protected boolean L = true;
    protected boolean M = false;
    protected ViewGroup N;
    protected boolean O = false;
    protected View P;
    protected boolean Q = true;
    protected boolean R = false;
    protected boolean S = false;
    protected int T = 0;
    protected long U = 0;
    protected RecyclerView V;
    protected boolean W = false;
    protected com.mikepenz.fastadapter.b<afi> X;
    protected aby<afi, afi> Y = new abw().a(this.h);
    protected aby<afi, afi> Z = new abw().a(this.h);
    protected boolean a = false;
    protected aby<afi, afi> aa = new abw().a(this.h);
    protected a<afi> ab = new a();
    protected Adapter ac;
    protected ItemAnimator ad = new DefaultItemAnimator();
    protected boolean ae = false;
    protected List<afi> af = new ArrayList();
    protected boolean ag = true;
    protected int ah = 50;
    protected int ai = 0;
    protected p aj;
    protected q ak;
    protected s al;
    protected boolean am = false;
    protected boolean an = false;
    protected boolean ao = false;
    protected ae ap = null;
    protected Bundle aq;
    protected SharedPreferences ar;
    private boolean as = false;
    protected int b = -1;
    protected boolean c = false;
    protected Activity d;
    protected LayoutManager e;
    protected ViewGroup f;
    protected com.mikepenz.materialize.a g;
    public final acs h = new act();
    protected boolean i = true;
    protected Boolean j;
    protected Toolbar k;
    protected boolean l = false;
    protected boolean m = false;
    protected boolean n = false;
    protected boolean o = false;
    protected View p;
    protected DrawerLayout q;
    protected ScrimInsetsRelativeLayout r;
    protected int s = 0;
    protected int t = -1;
    protected Drawable u = null;
    protected int v = -1;
    protected int w = -1;
    protected Integer x = Integer.valueOf(8388611);
    protected a y;
    protected boolean z = false;

    public t() {
        c();
    }

    protected final afi a(int i) {
        return (afi) c().b(i);
    }

    public final t a() {
        this.i = false;
        return this;
    }

    public final t a(Activity activity) {
        this.f = (ViewGroup) activity.findViewById(16908290);
        this.d = activity;
        this.e = new LinearLayoutManager(this.d);
        return this;
    }

    public final t a(Toolbar toolbar) {
        this.k = toolbar;
        return this;
    }

    public final t a(a aVar) {
        this.y = aVar;
        this.z = false;
        return this;
    }

    public final t a(p pVar) {
        this.aj = pVar;
        return this;
    }

    public final t a(afi... afiArr) {
        this.Z.a((Object[]) afiArr);
        return this;
    }

    public final t b() {
        this.x = Integer.valueOf(8388613);
        return this;
    }

    public final t b(afi... afiArr) {
        if (this.af == null) {
            this.af = new ArrayList();
        }
        Collections.addAll(this.af, afiArr);
        return this;
    }

    protected final boolean b(int i) {
        return c().b(i) != null;
    }

    protected final com.mikepenz.fastadapter.b<afi> c() {
        if (this.X == null) {
            this.X = com.mikepenz.fastadapter.b.a(Arrays.asList(new aby[]{this.Y, this.Z, this.aa}), Arrays.asList(new i[]{this.ab}));
            this.X.e();
            this.X.a(false);
            this.X.b(false);
            this.X.setHasStableIds(this.W);
        }
        return this.X;
    }

    protected final v<afi, afi> d() {
        return this.Z;
    }

    protected final v<afi, afi> e() {
        return this.Y;
    }

    protected final v<afi, afi> f() {
        return this.aa;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.mikepenz.materialdrawer.o g() {
        /*
        r12 = this;
        r0 = r12.a;
        if (r0 != 0) goto L_0x03d5;
    L_0x0004:
        r0 = r12.d;
        if (r0 == 0) goto L_0x03cd;
    L_0x0008:
        r1 = 1;
        r12.a = r1;
        r2 = r12.q;
        r3 = 21;
        r4 = 0;
        if (r2 != 0) goto L_0x0038;
    L_0x0012:
        if (r0 == 0) goto L_0x0030;
    L_0x0014:
        r2 = android.os.Build.VERSION.SDK_INT;
        if (r2 >= r3) goto L_0x0029;
    L_0x0018:
        r0 = r0.getLayoutInflater();
        r2 = com.mikepenz.materialdrawer.R.layout.material_drawer_fits_not;
    L_0x001e:
        r5 = r12.f;
        r0 = r0.inflate(r2, r5, r4);
        r0 = (android.support.v4.widget.DrawerLayout) r0;
        r12.q = r0;
        goto L_0x0038;
    L_0x0029:
        r0 = r0.getLayoutInflater();
        r2 = com.mikepenz.materialdrawer.R.layout.material_drawer;
        goto L_0x001e;
    L_0x0030:
        r0 = new java.lang.RuntimeException;
        r1 = "please pass an activity first to use this call";
        r0.<init>(r1);
        throw r0;
    L_0x0038:
        r0 = new com.mikepenz.materialize.b;
        r0.<init>();
        r2 = r12.d;
        r0 = r0.a(r2);
        r2 = r12.f;
        r0 = r0.a(r2);
        r2 = r12.n;
        r0 = r0.c(r2);
        r2 = r12.o;
        r0 = r0.d(r2);
        r0 = r0.a();
        r2 = r12.i;
        r0 = r0.a(r2);
        r2 = r12.m;
        r0 = r0.b(r2);
        r2 = r12.q;
        r0 = r0.b(r2);
        r0 = r0.b();
        r12.g = r0;
        r7 = r12.d;
        r0 = new com.mikepenz.materialdrawer.v;
        r0.<init>(r12);
        r2 = r12.B;
        if (r2 == 0) goto L_0x0098;
    L_0x007c:
        r2 = r12.C;
        if (r2 != 0) goto L_0x0098;
    L_0x0080:
        r9 = r12.k;
        if (r9 == 0) goto L_0x0098;
    L_0x0084:
        r2 = new com.mikepenz.materialdrawer.w;
        r8 = r12.q;
        r10 = com.mikepenz.materialdrawer.R.string.material_drawer_open;
        r11 = com.mikepenz.materialdrawer.R.string.material_drawer_close;
        r5 = r2;
        r6 = r12;
        r5.<init>(r6, r7, r8, r9, r10, r11);
        r12.C = r2;
        r2 = r12.C;
        r2.a();
    L_0x0098:
        r2 = r12.k;
        if (r2 == 0) goto L_0x009f;
    L_0x009c:
        r2.setNavigationOnClickListener(r0);
    L_0x009f:
        r2 = r12.C;
        if (r2 == 0) goto L_0x00ae;
    L_0x00a3:
        r2.a(r0);
        r0 = r12.q;
        r2 = r12.C;
    L_0x00aa:
        r0.addDrawerListener(r2);
        goto L_0x00b6;
    L_0x00ae:
        r0 = r12.q;
        r2 = new com.mikepenz.materialdrawer.x;
        r2.<init>(r12);
        goto L_0x00aa;
    L_0x00b6:
        r0 = r12.d;
        r0 = r0.getLayoutInflater();
        r2 = com.mikepenz.materialdrawer.R.layout.material_drawer_slider;
        r5 = r12.q;
        r0 = r0.inflate(r2, r5, r4);
        r0 = (com.mikepenz.materialize.view.ScrimInsetsRelativeLayout) r0;
        r12.r = r0;
        r0 = r12.r;
        r2 = r12.d;
        r5 = com.mikepenz.materialdrawer.R.attr.material_drawer_background;
        r6 = com.mikepenz.materialdrawer.R.color.material_drawer_background;
        r2 = defpackage.afz.a(r2, r5, r6);
        r0.setBackgroundColor(r2);
        r0 = r12.r;
        r0 = r0.getLayoutParams();
        r0 = (android.support.v4.widget.DrawerLayout.LayoutParams) r0;
        if (r0 == 0) goto L_0x00f2;
    L_0x00e1:
        r2 = r12.x;
        r2 = r2.intValue();
        r0.gravity = r2;
        r0 = com.mikepenz.materialdrawer.ad.a(r12, r0);
        r2 = r12.r;
        r2.setLayoutParams(r0);
    L_0x00f2:
        r0 = r12.p;
        r2 = 0;
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r6 = -1;
        if (r0 == 0) goto L_0x010a;
    L_0x00fa:
        r0 = new android.widget.LinearLayout$LayoutParams;
        r0.<init>(r6, r6);
        r0.weight = r5;
        r3 = r12.r;
        r5 = r12.p;
        r3.addView(r5, r0);
        goto L_0x032e;
    L_0x010a:
        r0 = android.os.Build.VERSION.SDK_INT;
        r7 = 8388611; // 0x800003 float:1.1754948E-38 double:4.1445245E-317;
        if (r0 >= r3) goto L_0x0141;
    L_0x0111:
        r0 = r12.q;
        if (r0 == 0) goto L_0x0141;
    L_0x0115:
        r0 = r12.f;
        r0 = android.support.v4.view.ViewCompat.getLayoutDirection(r0);
        if (r0 != 0) goto L_0x0136;
    L_0x011d:
        r0 = r12.q;
        r8 = r12.x;
        r8 = r8.intValue();
        if (r8 != r7) goto L_0x012a;
    L_0x0127:
        r8 = com.mikepenz.materialdrawer.R.drawable.material_drawer_shadow_right;
        goto L_0x012c;
    L_0x012a:
        r8 = com.mikepenz.materialdrawer.R.drawable.material_drawer_shadow_left;
    L_0x012c:
        r9 = r12.x;
        r9 = r9.intValue();
        r0.setDrawerShadow(r8, r9);
        goto L_0x0141;
    L_0x0136:
        r0 = r12.q;
        r8 = r12.x;
        r8 = r8.intValue();
        if (r8 != r7) goto L_0x0127;
    L_0x0140:
        goto L_0x012a;
    L_0x0141:
        r0 = r12.V;
        if (r0 != 0) goto L_0x01f4;
    L_0x0145:
        r0 = r12.d;
        r0 = android.view.LayoutInflater.from(r0);
        r8 = com.mikepenz.materialdrawer.R.layout.material_drawer_recycler_view;
        r9 = r12.r;
        r0 = r0.inflate(r8, r9, r4);
        r8 = com.mikepenz.materialdrawer.R.id.material_drawer_recycler_view;
        r8 = r0.findViewById(r8);
        r8 = (android.support.v7.widget.RecyclerView) r8;
        r12.V = r8;
        r8 = r12.V;
        r9 = r12.ad;
        r8.setItemAnimator(r9);
        r8 = r12.V;
        r8.setFadingEdgeLength(r4);
        r8 = r12.V;
        r8.setClipToPadding(r4);
        r8 = r12.V;
        r9 = r12.e;
        r8.setLayoutManager(r9);
        r8 = r12.j;
        if (r8 == 0) goto L_0x017f;
    L_0x0179:
        r8 = r8.booleanValue();
        if (r8 == 0) goto L_0x018a;
    L_0x017f:
        r8 = r12.o;
        if (r8 != 0) goto L_0x018a;
    L_0x0183:
        r8 = r12.d;
        r8 = defpackage.afz.a(r8, r4);
        goto L_0x018b;
    L_0x018a:
        r8 = 0;
    L_0x018b:
        r9 = r12.d;
        r9 = r9.getResources();
        r9 = r9.getConfiguration();
        r9 = r9.orientation;
        r10 = r12.l;
        if (r10 != 0) goto L_0x019f;
    L_0x019b:
        r10 = r12.n;
        if (r10 == 0) goto L_0x01ee;
    L_0x019f:
        r10 = android.os.Build.VERSION.SDK_INT;
        if (r10 < r3) goto L_0x01ee;
    L_0x01a3:
        r3 = r12.o;
        if (r3 != 0) goto L_0x01ee;
    L_0x01a7:
        if (r9 == r1) goto L_0x01e7;
    L_0x01a9:
        r3 = 2;
        if (r9 != r3) goto L_0x01ee;
    L_0x01ac:
        r3 = r12.d;
        r9 = "window";
        r9 = r3.getSystemService(r9);
        r9 = (android.view.WindowManager) r9;
        r10 = new android.util.DisplayMetrics;
        r10.<init>();
        r9 = r9.getDefaultDisplay();
        r9.getMetrics(r10);
        r3 = r3.getResources();
        r3 = r3.getConfiguration();
        r9 = r10.widthPixels;
        r11 = r10.heightPixels;
        if (r9 == r11) goto L_0x01d8;
    L_0x01d0:
        r3 = r3.smallestScreenWidthDp;
        r9 = 600; // 0x258 float:8.41E-43 double:2.964E-321;
        if (r3 >= r9) goto L_0x01d8;
    L_0x01d6:
        r3 = 1;
        goto L_0x01d9;
    L_0x01d8:
        r3 = 0;
    L_0x01d9:
        if (r3 == 0) goto L_0x01e4;
    L_0x01db:
        r3 = r10.widthPixels;
        r9 = r10.heightPixels;
        if (r3 >= r9) goto L_0x01e2;
    L_0x01e1:
        goto L_0x01e4;
    L_0x01e2:
        r3 = 0;
        goto L_0x01e5;
    L_0x01e4:
        r3 = 1;
    L_0x01e5:
        if (r3 == 0) goto L_0x01ee;
    L_0x01e7:
        r3 = r12.d;
        r3 = defpackage.afz.a(r3);
        goto L_0x01ef;
    L_0x01ee:
        r3 = 0;
    L_0x01ef:
        r9 = r12.V;
        r9.setPadding(r4, r8, r4, r3);
    L_0x01f4:
        r3 = new android.widget.LinearLayout$LayoutParams;
        r3.<init>(r6, r6);
        r3.weight = r5;
        r5 = r12.r;
        r5.addView(r0, r3);
        r0 = r12.as;
        if (r0 == 0) goto L_0x0223;
    L_0x0204:
        r0 = r12.r;
        r3 = com.mikepenz.materialdrawer.R.id.material_drawer_inner_shadow;
        r0 = r0.findViewById(r3);
        r0.setVisibility(r4);
        r0.bringToFront();
        r3 = r12.x;
        r3 = r3.intValue();
        if (r3 != r7) goto L_0x0220;
    L_0x021a:
        r3 = com.mikepenz.materialdrawer.R.drawable.material_drawer_shadow_left;
    L_0x021c:
        r0.setBackgroundResource(r3);
        goto L_0x0223;
    L_0x0220:
        r3 = com.mikepenz.materialdrawer.R.drawable.material_drawer_shadow_right;
        goto L_0x021c;
    L_0x0223:
        r0 = r12.s;
        if (r0 == 0) goto L_0x022d;
    L_0x0227:
        r3 = r12.r;
    L_0x0229:
        r3.setBackgroundColor(r0);
        goto L_0x0253;
    L_0x022d:
        r0 = r12.t;
        if (r0 == r6) goto L_0x023a;
    L_0x0231:
        r3 = r12.r;
        r5 = r12.d;
        r0 = android.support.v4.content.ContextCompat.getColor(r5, r0);
        goto L_0x0229;
    L_0x023a:
        r0 = r12.u;
        if (r0 == 0) goto L_0x0244;
    L_0x023e:
        r3 = r12.r;
    L_0x0240:
        android.support.v4.view.ViewCompat.setBackground(r3, r0);
        goto L_0x0253;
    L_0x0244:
        r0 = r12.v;
        if (r0 == r6) goto L_0x0253;
    L_0x0248:
        r3 = r12.r;
        r5 = r3.getContext();
        r0 = android.support.v4.content.ContextCompat.getDrawable(r5, r0);
        goto L_0x0240;
    L_0x0253:
        com.mikepenz.materialdrawer.ad.a(r12);
        r0 = new com.mikepenz.materialdrawer.y;
        r0.<init>(r12);
        com.mikepenz.materialdrawer.ad.a(r12, r0);
        r0 = r12.X;
        r3 = r12.S;
        r0.a(r3);
        r0 = r12.S;
        if (r0 == 0) goto L_0x0273;
    L_0x0269:
        r0 = r12.X;
        r0.d();
        r0 = r12.X;
        r0.b(r1);
    L_0x0273:
        r0 = r12.ac;
        if (r0 != 0) goto L_0x027f;
    L_0x0277:
        r0 = r12.V;
        r3 = r12.X;
        r0.setAdapter(r3);
        goto L_0x0284;
    L_0x027f:
        r3 = r12.V;
        r3.setAdapter(r0);
    L_0x0284:
        r0 = r12.T;
        if (r0 != 0) goto L_0x0296;
    L_0x0288:
        r7 = r12.U;
        r9 = 0;
        r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r0 == 0) goto L_0x0296;
    L_0x0290:
        r0 = com.mikepenz.materialdrawer.ad.a(r12, r7);
        r12.T = r0;
    L_0x0296:
        r0 = r12.E;
        if (r0 == 0) goto L_0x02a0;
    L_0x029a:
        r0 = r12.T;
        if (r0 != 0) goto L_0x02a0;
    L_0x029e:
        r12.T = r1;
    L_0x02a0:
        r0 = r12.X;
        r0.h();
        r0 = r12.X;
        r3 = r12.T;
        r0.g(r3);
        r0 = r12.X;
        r3 = new com.mikepenz.materialdrawer.z;
        r3.<init>(r12);
        r0.a(r3);
        r0 = r12.X;
        r3 = new com.mikepenz.materialdrawer.ab;
        r3.<init>(r12);
        r0.a(r3);
        r0 = r12.V;
        if (r0 == 0) goto L_0x02c7;
    L_0x02c4:
        r0.scrollToPosition(r4);
    L_0x02c7:
        r0 = r12.aq;
        if (r0 == 0) goto L_0x02fc;
    L_0x02cb:
        r0 = r12.c;
        if (r0 != 0) goto L_0x02e9;
    L_0x02cf:
        r0 = r12.X;
        r0.h();
        r0 = r12.X;
        r3 = r12.aq;
        r5 = "_selection";
        r0.a(r3, r5);
        r0 = r12.aq;
        r3 = "bundle_sticky_footer_selection";
    L_0x02e1:
        r0 = r0.getInt(r3, r6);
        com.mikepenz.materialdrawer.ad.a(r12, r0);
        goto L_0x02fc;
    L_0x02e9:
        r0 = r12.X;
        r0.h();
        r0 = r12.X;
        r3 = r12.aq;
        r5 = "_selection_appended";
        r0.a(r3, r5);
        r0 = r12.aq;
        r3 = "bundle_sticky_footer_selection_appended";
        goto L_0x02e1;
    L_0x02fc:
        r0 = r12.R;
        if (r0 == 0) goto L_0x032e;
    L_0x0300:
        r0 = r12.aj;
        if (r0 == 0) goto L_0x032e;
    L_0x0304:
        r0 = r12.X;
        r0 = r0.f();
        r0 = r0.size();
        if (r0 != 0) goto L_0x0311;
    L_0x0310:
        goto L_0x0325;
    L_0x0311:
        r0 = r12.X;
        r0 = r0.f();
        r0 = r0.iterator();
        r0 = r0.next();
        r0 = (java.lang.Integer) r0;
        r6 = r0.intValue();
    L_0x0325:
        r0 = r12.aj;
        r3 = r12.a(r6);
        r0.onItemClick(r2, r6, r3);
    L_0x032e:
        r0 = new com.mikepenz.materialdrawer.o;
        r0.<init>(r12);
        r3 = r12.y;
        if (r3 == 0) goto L_0x033a;
    L_0x0337:
        r3.a(r0);
    L_0x033a:
        r3 = r12.aq;
        if (r3 == 0) goto L_0x034b;
    L_0x033e:
        r5 = "bundle_drawer_content_switched";
        r3 = r3.getBoolean(r5, r4);
        if (r3 == 0) goto L_0x034b;
    L_0x0346:
        r3 = r12.y;
        r3.b();
    L_0x034b:
        r3 = r12.d;
        if (r3 == 0) goto L_0x03a3;
    L_0x034f:
        r3 = r12.q;
        if (r3 == 0) goto L_0x03a3;
    L_0x0353:
        r3 = r12.am;
        if (r3 != 0) goto L_0x035b;
    L_0x0357:
        r3 = r12.an;
        if (r3 == 0) goto L_0x03a3;
    L_0x035b:
        r3 = r12.ar;
        if (r3 == 0) goto L_0x0360;
    L_0x035f:
        goto L_0x0366;
    L_0x0360:
        r3 = r12.d;
        r3 = android.preference.PreferenceManager.getDefaultSharedPreferences(r3);
    L_0x0366:
        r5 = r12.am;
        if (r5 == 0) goto L_0x0386;
    L_0x036a:
        r5 = "navigation_drawer_learned";
        r5 = r3.getBoolean(r5, r4);
        if (r5 != 0) goto L_0x0386;
    L_0x0372:
        r4 = r12.q;
        r5 = r12.r;
        r4.openDrawer(r5);
        r3 = r3.edit();
        r4 = "navigation_drawer_learned";
        r3.putBoolean(r4, r1);
        r3.apply();
        goto L_0x03a3;
    L_0x0386:
        r5 = r12.an;
        if (r5 == 0) goto L_0x03a3;
    L_0x038a:
        r5 = "navigation_drawer_dragged_open";
        r4 = r3.getBoolean(r5, r4);
        if (r4 != 0) goto L_0x03a3;
    L_0x0392:
        r4 = r12.q;
        r5 = r12.r;
        r4.openDrawer(r5);
        r4 = r12.q;
        r5 = new com.mikepenz.materialdrawer.u;
        r5.<init>(r12, r3);
        r4.addDrawerListener(r5);
    L_0x03a3:
        r3 = r12.c;
        if (r3 != 0) goto L_0x03bc;
    L_0x03a7:
        r3 = r12.ao;
        if (r3 == 0) goto L_0x03bc;
    L_0x03ab:
        r3 = new com.mikepenz.materialdrawer.ae;
        r3.<init>();
        r3 = r3.a(r0);
        r4 = r12.y;
        r3 = r3.a(r4);
        r12.ap = r3;
    L_0x03bc:
        r12.d = r2;
        r2 = r12.r;
        r3 = com.mikepenz.materialdrawer.R.id.material_drawer_slider_layout;
        r2.setId(r3);
        r2 = r12.q;
        r3 = r12.r;
        r2.addView(r3, r1);
        return r0;
    L_0x03cd:
        r0 = new java.lang.RuntimeException;
        r1 = "please pass an activity";
        r0.<init>(r1);
        throw r0;
    L_0x03d5:
        r0 = new java.lang.RuntimeException;
        r1 = "you must not reuse a DrawerBuilder builder";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mikepenz.materialdrawer.t.g():com.mikepenz.materialdrawer.o");
    }

    protected final void h() {
        if (this.ag) {
            DrawerLayout drawerLayout = this.q;
            if (drawerLayout != null) {
                if (this.ah >= 0) {
                    new Handler().postDelayed(new ac(this), (long) this.ah);
                    return;
                }
                drawerLayout.closeDrawers();
            }
        }
    }

    protected final void i() {
        if (this.N instanceof LinearLayout) {
            for (int i = 0; i < this.N.getChildCount(); i++) {
                this.N.getChildAt(i).setActivated(false);
                this.N.getChildAt(i).setSelected(false);
            }
        }
    }
}
