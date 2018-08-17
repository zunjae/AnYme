package com.afollestad.materialdialogs;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnShowListener;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.view.View;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.zunjae.anyme.R;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public final class o {
    protected x A;
    protected x B;
    protected x C;
    protected s D;
    protected v E;
    protected u F;
    protected t G;
    protected boolean H;
    protected boolean I;
    protected int J;
    protected boolean K;
    protected boolean L;
    protected float M;
    protected int N;
    protected Integer[] O;
    protected Integer[] P;
    protected boolean Q;
    protected Typeface R;
    protected Typeface S;
    protected Drawable T;
    protected boolean U;
    protected int V;
    protected Adapter<?> W;
    protected LayoutManager X;
    protected OnDismissListener Y;
    protected OnCancelListener Z;
    protected final Context a;
    protected boolean aA;
    protected boolean aB;
    protected boolean aC;
    protected boolean aD;
    protected boolean aE;
    protected boolean aF;
    protected boolean aG;
    protected boolean aH;
    protected boolean aI;
    protected int aJ;
    protected int aK;
    protected int aL;
    protected int aM;
    protected int aN;
    protected OnKeyListener aa;
    protected OnShowListener ab;
    protected y ac;
    protected boolean ad;
    protected int ae;
    protected int af;
    protected int ag;
    protected boolean ah;
    protected boolean ai;
    protected int aj;
    protected int ak;
    protected CharSequence al;
    protected CharSequence am;
    protected q an;
    protected boolean ao;
    protected int ap;
    protected boolean aq;
    protected int ar;
    protected int as;
    protected int at;
    protected int[] au;
    protected CharSequence av;
    protected boolean aw;
    protected OnCheckedChangeListener ax;
    protected String ay;
    protected NumberFormat az;
    protected CharSequence b;
    protected h c;
    protected h d;
    protected h e = h.END;
    protected h f;
    protected h g;
    protected int h;
    protected int i;
    protected int j;
    protected CharSequence k;
    protected ArrayList<CharSequence> l;
    protected CharSequence m;
    protected CharSequence n;
    protected CharSequence o;
    protected boolean p;
    protected boolean q;
    protected boolean r;
    protected View s;
    protected int t;
    protected ColorStateList u;
    protected ColorStateList v;
    protected ColorStateList w;
    protected ColorStateList x;
    protected ColorStateList y;
    protected x z;

    public o(android.content.Context r7) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r6 = this;
        r6.<init>();
        r0 = com.afollestad.materialdialogs.h.START;
        r6.c = r0;
        r6.d = r0;
        r0 = com.afollestad.materialdialogs.h.END;
        r6.e = r0;
        r0 = com.afollestad.materialdialogs.h.START;
        r6.f = r0;
        r6.g = r0;
        r0 = 0;
        r6.h = r0;
        r1 = -1;
        r6.i = r1;
        r6.j = r1;
        r6.H = r0;
        r6.I = r0;
        r2 = com.afollestad.materialdialogs.z.a;
        r6.J = r2;
        r2 = 1;
        r6.K = r2;
        r6.L = r2;
        r3 = 1067030938; // 0x3f99999a float:1.2 double:5.271833295E-315;
        r6.M = r3;
        r6.N = r1;
        r3 = 0;
        r6.O = r3;
        r6.P = r3;
        r6.Q = r2;
        r6.V = r1;
        r3 = -2;
        r6.aj = r3;
        r6.ak = r0;
        r6.ap = r1;
        r6.ar = r1;
        r6.as = r1;
        r6.at = r0;
        r6.aB = r0;
        r6.aC = r0;
        r6.aD = r0;
        r6.aE = r0;
        r6.aF = r0;
        r6.aG = r0;
        r6.aH = r0;
        r6.aI = r0;
        r6.a = r7;
        r1 = com.afollestad.materialdialogs.R.color.md_material_blue_600;
        r1 = android.support.v4.content.ContextCompat.getColor(r7, r1);
        r3 = com.afollestad.materialdialogs.R.attr.colorAccent;
        r1 = defpackage.cu.a(r7, r3, r1);
        r6.t = r1;
        r1 = android.os.Build.VERSION.SDK_INT;
        r3 = 21;
        if (r1 < r3) goto L_0x0076;
    L_0x006b:
        r1 = 16843829; // 0x1010435 float:2.3696576E-38 double:8.3219573E-317;
        r4 = r6.t;
        r1 = defpackage.cu.a(r7, r1, r4);
        r6.t = r1;
    L_0x0076:
        r1 = r6.t;
        r1 = defpackage.cu.d(r7, r1);
        r6.v = r1;
        r1 = r6.t;
        r1 = defpackage.cu.d(r7, r1);
        r6.w = r1;
        r1 = r6.t;
        r1 = defpackage.cu.d(r7, r1);
        r6.x = r1;
        r1 = com.afollestad.materialdialogs.R.attr.md_link_color;
        r4 = r6.t;
        r1 = defpackage.cu.a(r7, r1, r4);
        r1 = defpackage.cu.d(r7, r1);
        r6.y = r1;
        r1 = android.os.Build.VERSION.SDK_INT;
        if (r1 < r3) goto L_0x00a8;
    L_0x00a0:
        r1 = 16843820; // 0x101042c float:2.369655E-38 double:8.321953E-317;
        r1 = defpackage.cu.a(r7, r1, r0);
        goto L_0x00a9;
    L_0x00a8:
        r1 = 0;
    L_0x00a9:
        r4 = com.afollestad.materialdialogs.R.attr.md_btn_ripple_color;
        r5 = com.afollestad.materialdialogs.R.attr.colorControlHighlight;
        r1 = defpackage.cu.a(r7, r5, r1);
        r1 = defpackage.cu.a(r7, r4, r1);
        r6.h = r1;
        r1 = java.text.NumberFormat.getPercentInstance();
        r6.az = r1;
        r1 = "%1d/%2d";
        r6.ay = r1;
        r1 = 16842806; // 0x1010036 float:2.369371E-38 double:8.321452E-317;
        r1 = defpackage.cu.a(r7, r1, r0);
        r1 = defpackage.cu.a(r1);
        if (r1 == 0) goto L_0x00d1;
    L_0x00ce:
        r1 = com.afollestad.materialdialogs.z.a;
        goto L_0x00d3;
    L_0x00d1:
        r1 = com.afollestad.materialdialogs.z.b;
    L_0x00d3:
        r6.J = r1;
        r1 = com.afollestad.materialdialogs.internal.g.a(r0);
        if (r1 == 0) goto L_0x015b;
    L_0x00db:
        r1 = com.afollestad.materialdialogs.internal.g.a(r2);
        r4 = r1.a;
        if (r4 == 0) goto L_0x00e7;
    L_0x00e3:
        r4 = com.afollestad.materialdialogs.z.b;
        r6.J = r4;
    L_0x00e7:
        r4 = r1.b;
        if (r4 == 0) goto L_0x00ed;
    L_0x00eb:
        r6.i = r4;
    L_0x00ed:
        r4 = r1.c;
        if (r4 == 0) goto L_0x00f3;
    L_0x00f1:
        r6.j = r4;
    L_0x00f3:
        r4 = r1.d;
        if (r4 == 0) goto L_0x00f9;
    L_0x00f7:
        r6.v = r4;
    L_0x00f9:
        r4 = r1.e;
        if (r4 == 0) goto L_0x00ff;
    L_0x00fd:
        r6.x = r4;
    L_0x00ff:
        r4 = r1.f;
        if (r4 == 0) goto L_0x0105;
    L_0x0103:
        r6.w = r4;
    L_0x0105:
        r4 = r1.h;
        if (r4 == 0) goto L_0x010b;
    L_0x0109:
        r6.ag = r4;
    L_0x010b:
        r4 = r1.i;
        if (r4 == 0) goto L_0x0111;
    L_0x010f:
        r6.T = r4;
    L_0x0111:
        r4 = r1.j;
        if (r4 == 0) goto L_0x0117;
    L_0x0115:
        r6.af = r4;
    L_0x0117:
        r4 = r1.k;
        if (r4 == 0) goto L_0x011d;
    L_0x011b:
        r6.ae = r4;
    L_0x011d:
        r4 = r1.n;
        if (r4 == 0) goto L_0x0123;
    L_0x0121:
        r6.aK = r4;
    L_0x0123:
        r4 = r1.m;
        if (r4 == 0) goto L_0x0129;
    L_0x0127:
        r6.aJ = r4;
    L_0x0129:
        r4 = r1.o;
        if (r4 == 0) goto L_0x012f;
    L_0x012d:
        r6.aL = r4;
    L_0x012f:
        r4 = r1.p;
        if (r4 == 0) goto L_0x0135;
    L_0x0133:
        r6.aM = r4;
    L_0x0135:
        r4 = r1.q;
        if (r4 == 0) goto L_0x013b;
    L_0x0139:
        r6.aN = r4;
    L_0x013b:
        r4 = r1.g;
        if (r4 == 0) goto L_0x0141;
    L_0x013f:
        r6.t = r4;
    L_0x0141:
        r4 = r1.l;
        if (r4 == 0) goto L_0x0147;
    L_0x0145:
        r6.y = r4;
    L_0x0147:
        r4 = r1.r;
        r6.c = r4;
        r4 = r1.s;
        r6.d = r4;
        r4 = r1.t;
        r6.e = r4;
        r4 = r1.u;
        r6.f = r4;
        r1 = r1.v;
        r6.g = r1;
    L_0x015b:
        r1 = com.afollestad.materialdialogs.R.attr.md_title_gravity;
        r4 = r6.c;
        r1 = defpackage.cu.a(r7, r1, r4);
        r6.c = r1;
        r1 = com.afollestad.materialdialogs.R.attr.md_content_gravity;
        r4 = r6.d;
        r1 = defpackage.cu.a(r7, r1, r4);
        r6.d = r1;
        r1 = com.afollestad.materialdialogs.R.attr.md_btnstacked_gravity;
        r4 = r6.e;
        r1 = defpackage.cu.a(r7, r1, r4);
        r6.e = r1;
        r1 = com.afollestad.materialdialogs.R.attr.md_items_gravity;
        r4 = r6.f;
        r1 = defpackage.cu.a(r7, r1, r4);
        r6.f = r1;
        r1 = com.afollestad.materialdialogs.R.attr.md_buttons_gravity;
        r4 = r6.g;
        r1 = defpackage.cu.a(r7, r1, r4);
        r6.g = r1;
        r1 = com.afollestad.materialdialogs.R.attr.md_medium_font;
        r1 = defpackage.cu.a(r7, r1);
        r4 = com.afollestad.materialdialogs.R.attr.md_regular_font;
        r7 = defpackage.cu.a(r7, r4);
        if (r1 == 0) goto L_0x01cb;
    L_0x019b:
        r4 = r1.trim();	 Catch:{ Throwable -> 0x01fd }
        r4 = r4.isEmpty();	 Catch:{ Throwable -> 0x01fd }
        if (r4 != 0) goto L_0x01cb;	 Catch:{ Throwable -> 0x01fd }
    L_0x01a5:
        r4 = r6.a;	 Catch:{ Throwable -> 0x01fd }
        r4 = defpackage.cy.a(r4, r1);	 Catch:{ Throwable -> 0x01fd }
        r6.S = r4;	 Catch:{ Throwable -> 0x01fd }
        r4 = r6.S;	 Catch:{ Throwable -> 0x01fd }
        if (r4 == 0) goto L_0x01b2;	 Catch:{ Throwable -> 0x01fd }
    L_0x01b1:
        goto L_0x01cb;	 Catch:{ Throwable -> 0x01fd }
    L_0x01b2:
        r7 = new java.lang.IllegalArgumentException;	 Catch:{ Throwable -> 0x01fd }
        r4 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x01fd }
        r5 = "No font asset found for \"";	 Catch:{ Throwable -> 0x01fd }
        r4.<init>(r5);	 Catch:{ Throwable -> 0x01fd }
        r4.append(r1);	 Catch:{ Throwable -> 0x01fd }
        r1 = "\"";	 Catch:{ Throwable -> 0x01fd }
        r4.append(r1);	 Catch:{ Throwable -> 0x01fd }
        r1 = r4.toString();	 Catch:{ Throwable -> 0x01fd }
        r7.<init>(r1);	 Catch:{ Throwable -> 0x01fd }
        throw r7;	 Catch:{ Throwable -> 0x01fd }
    L_0x01cb:
        if (r7 == 0) goto L_0x01fd;	 Catch:{ Throwable -> 0x01fd }
    L_0x01cd:
        r1 = r7.trim();	 Catch:{ Throwable -> 0x01fd }
        r1 = r1.isEmpty();	 Catch:{ Throwable -> 0x01fd }
        if (r1 != 0) goto L_0x01fd;	 Catch:{ Throwable -> 0x01fd }
    L_0x01d7:
        r1 = r6.a;	 Catch:{ Throwable -> 0x01fd }
        r1 = defpackage.cy.a(r1, r7);	 Catch:{ Throwable -> 0x01fd }
        r6.R = r1;	 Catch:{ Throwable -> 0x01fd }
        r1 = r6.R;	 Catch:{ Throwable -> 0x01fd }
        if (r1 == 0) goto L_0x01e4;	 Catch:{ Throwable -> 0x01fd }
    L_0x01e3:
        goto L_0x01fd;	 Catch:{ Throwable -> 0x01fd }
    L_0x01e4:
        r1 = new java.lang.IllegalArgumentException;	 Catch:{ Throwable -> 0x01fd }
        r4 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x01fd }
        r5 = "No font asset found for \"";	 Catch:{ Throwable -> 0x01fd }
        r4.<init>(r5);	 Catch:{ Throwable -> 0x01fd }
        r4.append(r7);	 Catch:{ Throwable -> 0x01fd }
        r7 = "\"";	 Catch:{ Throwable -> 0x01fd }
        r4.append(r7);	 Catch:{ Throwable -> 0x01fd }
        r7 = r4.toString();	 Catch:{ Throwable -> 0x01fd }
        r1.<init>(r7);	 Catch:{ Throwable -> 0x01fd }
        throw r1;	 Catch:{ Throwable -> 0x01fd }
    L_0x01fd:
        r7 = r6.S;
        if (r7 != 0) goto L_0x0219;
    L_0x0201:
        r7 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Throwable -> 0x0215 }
        if (r7 < r3) goto L_0x020e;	 Catch:{ Throwable -> 0x0215 }
    L_0x0205:
        r7 = "sans-serif-medium";	 Catch:{ Throwable -> 0x0215 }
        r7 = android.graphics.Typeface.create(r7, r0);	 Catch:{ Throwable -> 0x0215 }
    L_0x020b:
        r6.S = r7;	 Catch:{ Throwable -> 0x0215 }
        goto L_0x0219;	 Catch:{ Throwable -> 0x0215 }
    L_0x020e:
        r7 = "sans-serif";	 Catch:{ Throwable -> 0x0215 }
        r7 = android.graphics.Typeface.create(r7, r2);	 Catch:{ Throwable -> 0x0215 }
        goto L_0x020b;
    L_0x0215:
        r7 = android.graphics.Typeface.DEFAULT_BOLD;
        r6.S = r7;
    L_0x0219:
        r7 = r6.R;
        if (r7 != 0) goto L_0x0232;
    L_0x021d:
        r7 = "sans-serif";	 Catch:{ Throwable -> 0x0226 }
        r7 = android.graphics.Typeface.create(r7, r0);	 Catch:{ Throwable -> 0x0226 }
        r6.R = r7;	 Catch:{ Throwable -> 0x0226 }
        return;
    L_0x0226:
        r7 = android.graphics.Typeface.SANS_SERIF;
        r6.R = r7;
        r7 = r6.R;
        if (r7 != 0) goto L_0x0232;
    L_0x022e:
        r7 = android.graphics.Typeface.DEFAULT;
        r6.R = r7;
    L_0x0232:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.o.<init>(android.content.Context):void");
    }

    public final Context a() {
        return this.a;
    }

    public final o a(int i) {
        return b(this.a.getText(i));
    }

    public final o a(OnCancelListener onCancelListener) {
        this.Z = onCancelListener;
        return this;
    }

    public final o a(s sVar) {
        this.D = sVar;
        this.F = null;
        this.G = null;
        return this;
    }

    public final o a(u uVar) {
        this.N = -1;
        this.D = null;
        this.F = uVar;
        this.G = null;
        return this;
    }

    public final o a(x xVar) {
        this.z = xVar;
        return this;
    }

    public final o a(CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    public final o a(CharSequence charSequence, CharSequence charSequence2, q qVar) {
        if (this.s == null) {
            this.an = qVar;
            this.am = charSequence;
            this.al = charSequence2;
            this.ao = true;
            return this;
        }
        throw new IllegalStateException("You cannot set content() when you're using a custom view.");
    }

    public final o a(Collection collection) {
        if (collection.size() > 0) {
            CharSequence[] charSequenceArr = new CharSequence[collection.size()];
            int i = 0;
            for (Object obj : collection) {
                charSequenceArr[i] = obj.toString();
                i++;
            }
            if (this.s == null) {
                this.l = new ArrayList();
                Collections.addAll(this.l, charSequenceArr);
            } else {
                throw new IllegalStateException("You cannot set items() when you're using a custom view.");
            }
        } else if (collection.size() == 0) {
            this.l = new ArrayList();
        }
        return this;
    }

    public final o a(Integer[] numArr, t tVar) {
        this.O = numArr;
        this.D = null;
        this.F = null;
        this.G = tVar;
        return this;
    }

    public final o b() {
        this.b = this.a.getText(R.string.cantLogin);
        return this;
    }

    public final o b(int i) {
        this.ap = i;
        return this;
    }

    public final o b(x xVar) {
        this.A = xVar;
        return this;
    }

    public final o b(CharSequence charSequence) {
        if (this.s == null) {
            this.k = charSequence;
            return this;
        }
        throw new IllegalStateException("You cannot set content() when you're using a custom view.");
    }

    public final o c() {
        this.T = ResourcesCompat.getDrawable(this.a.getResources(), R.mipmap.newappicon, null);
        return this;
    }

    public final o c(x xVar) {
        this.B = xVar;
        return this;
    }

    public final o c(CharSequence charSequence) {
        this.m = charSequence;
        return this;
    }

    public final o d() {
        this.m = this.a.getText(R.string.agree);
        return this;
    }

    public final o d(CharSequence charSequence) {
        this.n = charSequence;
        return this;
    }

    public final o e() {
        this.o = this.a.getText(R.string.disagree);
        return this;
    }

    public final o e(CharSequence charSequence) {
        this.o = charSequence;
        return this;
    }

    public final o f() {
        this.av = this.a.getResources().getText(R.string.remember);
        this.aw = false;
        this.ax = null;
        return this;
    }

    public final o g() {
        if (this.s == null) {
            this.ah = true;
            this.aj = -2;
            return this;
        }
        throw new IllegalStateException("You cannot set progress() when you're using a custom view.");
    }

    public final o h() {
        this.K = true;
        this.L = true;
        return this;
    }

    public final o i() {
        this.V = 90;
        return this;
    }

    public final o j() {
        this.ar = 0;
        this.as = 512;
        this.at = ContextCompat.getColor(this.a, R.color.md_edittext_error);
        if (this.ar > 0) {
            this.ao = false;
        }
        return this;
    }

    public final j k() {
        return new j(this);
    }

    public final j l() {
        j k = k();
        k.show();
        return k;
    }
}
