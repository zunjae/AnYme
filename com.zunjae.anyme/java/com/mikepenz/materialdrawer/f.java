package com.mikepenz.materialdrawer;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.mikepenz.fastadapter.q;
import com.mikepenz.materialdrawer.view.BezelImageView;
import com.zunjae.anyme.R;
import defpackage.adf;
import defpackage.adu;
import defpackage.adv;
import defpackage.adw;
import defpackage.adz;
import defpackage.afi;
import defpackage.afj;
import defpackage.afo;
import defpackage.afr;
import defpackage.afs;
import defpackage.afu;
import defpackage.afw;
import defpackage.afz;
import defpackage.bv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public final class f {
    protected String A;
    protected String B;
    protected boolean C = true;
    protected boolean D = true;
    protected boolean E = true;
    protected adw F;
    protected ScaleType G = null;
    protected boolean H = true;
    protected boolean I = false;
    protected boolean J = false;
    protected Boolean K = null;
    protected boolean L = true;
    protected boolean M = true;
    protected boolean N = false;
    protected boolean O = false;
    protected int P = 100;
    protected d Q;
    protected e R;
    protected boolean S = true;
    protected boolean T = true;
    protected View U;
    protected List<afj> V;
    protected c W;
    protected b X;
    protected o Y;
    protected Bundle Z;
    protected View a;
    private OnClickListener aa = new g(this);
    private OnClickListener ab = new h(this);
    private OnLongClickListener ac = new i(this);
    private OnLongClickListener ad = new j(this);
    private OnClickListener ae = new l(this);
    private p af = new m(this);
    private q ag = new n(this);
    protected ImageView b;
    protected BezelImageView c;
    protected View d;
    protected ImageView e;
    protected TextView f;
    protected TextView g;
    protected BezelImageView h;
    protected BezelImageView i;
    protected BezelImageView j;
    protected afj k;
    protected afj l;
    protected afj m;
    protected afj n;
    protected boolean o = false;
    protected int p = -1;
    protected Activity q;
    protected boolean r = false;
    protected Typeface s;
    protected Typeface t;
    protected Typeface u;
    protected adv v;
    protected adu w;
    protected boolean x = false;
    protected boolean y = true;
    protected boolean z = true;

    private void a(afj afj, boolean z) {
        if (z) {
            if (VERSION.SDK_INT >= 21) {
                View view = this.U;
                ((FrameLayout) view).setForeground(bv.b(view.getContext(), this.p));
                this.U.setOnClickListener(this.ae);
                this.U.setTag(R.id.material_drawer_profile_header, afj);
                return;
            }
            this.d.setBackgroundResource(this.p);
            this.d.setOnClickListener(this.ae);
            this.d.setTag(R.id.material_drawer_profile_header, afj);
        } else if (VERSION.SDK_INT >= 21) {
            ((FrameLayout) this.U).setForeground(null);
            this.U.setOnClickListener(null);
        } else {
            ViewCompat.setBackground(this.d, null);
            this.d.setOnClickListener(null);
        }
    }

    private static void a(ImageView imageView, adw adw) {
        afo.a().a(imageView);
        imageView.setImageDrawable(afo.a().b().a(imageView.getContext(), afr.PROFILE.name()));
        afw.a(adw, imageView, afr.PROFILE.name());
    }

    static /* synthetic */ void a(f fVar, View view, boolean z) {
        view.getTag(R.id.material_drawer_profile_header);
        d dVar = fVar.Q;
        boolean z2 = false;
        if (!(dVar != null ? dVar.a() : false)) {
            afj afj = (afj) view.getTag(R.id.material_drawer_profile_header);
            fVar.a(afj);
            view.getContext();
            fVar.i();
            o oVar = fVar.Y;
            if (!(oVar == null || oVar.a() == null || fVar.Y.a().ap == null)) {
                fVar.Y.a().ap.a();
            }
            c cVar = fVar.W;
            if (cVar != null) {
                z2 = cVar.onProfileChanged(view, afj, z);
            }
            if (!z2) {
                if (fVar.P > 0) {
                    new Handler().postDelayed(new k(fVar), (long) fVar.P);
                    return;
                }
                o oVar2 = fVar.Y;
                if (oVar2 != null) {
                    oVar2.c();
                }
            }
        }
    }

    private void g() {
        if (this.V == null) {
            this.V = new ArrayList();
        }
        int i = 0;
        if (this.k == null) {
            int size = this.V.size();
            int i2 = 0;
            while (i < size) {
                if (this.V.size() > i && ((afj) this.V.get(i)).f()) {
                    if (i2 == 0 && this.k == null) {
                        this.k = (afj) this.V.get(i);
                    } else if (i2 == 1 && this.l == null) {
                        this.l = (afj) this.V.get(i);
                    } else if (i2 == 2 && this.m == null) {
                        this.m = (afj) this.V.get(i);
                    } else if (i2 == 3 && this.n == null) {
                        this.n = (afj) this.V.get(i);
                    }
                    i2++;
                }
                i++;
            }
            return;
        }
        afj[] afjArr = new afj[]{this.k, this.l, this.m, this.n};
        afj[] afjArr2 = new afj[4];
        Stack stack = new Stack();
        for (int i3 = 0; i3 < this.V.size(); i3++) {
            afj afj = (afj) this.V.get(i3);
            if (afj.f()) {
                Object obj;
                for (int i4 = 0; i4 < 4; i4++) {
                    if (afjArr[i4] == afj) {
                        afjArr2[i4] = afj;
                        obj = 1;
                        break;
                    }
                }
                obj = null;
                if (obj == null) {
                    stack.push(afj);
                }
            }
        }
        Stack stack2 = new Stack();
        while (i < 4) {
            Object obj2;
            if (afjArr2[i] != null) {
                obj2 = afjArr2[i];
            } else if (stack.isEmpty()) {
                i++;
            } else {
                obj2 = stack.pop();
            }
            stack2.push(obj2);
            i++;
        }
        Stack stack3 = new Stack();
        while (!stack2.empty()) {
            stack3.push(stack2.pop());
        }
        if (stack3.isEmpty()) {
            this.k = null;
        } else {
            this.k = (afj) stack3.pop();
        }
        if (stack3.isEmpty()) {
            this.l = null;
        } else {
            this.l = (afj) stack3.pop();
        }
        if (stack3.isEmpty()) {
            this.m = null;
        } else {
            this.m = (afj) stack3.pop();
        }
        if (stack3.isEmpty()) {
            this.n = null;
        } else {
            this.n = (afj) stack3.pop();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h() {
        /*
        r7 = this;
        r0 = r7.c;
        r1 = 4;
        r0.setVisibility(r1);
        r0 = r7.d;
        r0.setVisibility(r1);
        r0 = r7.e;
        r1 = 8;
        r0.setVisibility(r1);
        r0 = r7.h;
        r0.setVisibility(r1);
        r0 = r7.h;
        r2 = 0;
        r0.setOnClickListener(r2);
        r0 = r7.i;
        r0.setVisibility(r1);
        r0 = r7.i;
        r0.setOnClickListener(r2);
        r0 = r7.j;
        r0.setVisibility(r1);
        r0 = r7.j;
        r0.setOnClickListener(r2);
        r0 = r7.f;
        r3 = "";
        r0.setText(r3);
        r0 = r7.g;
        r3 = "";
        r0.setText(r3);
        r0 = r7.r;
        r3 = 0;
        if (r0 != 0) goto L_0x0057;
    L_0x0044:
        r0 = r7.d;
        r4 = r0.getContext();
        r4 = r4.getResources();
        r5 = com.mikepenz.materialdrawer.R.dimen.material_drawer_account_header_non_compact_padding;
        r4 = r4.getDimensionPixelSize(r5);
        r0.setPadding(r3, r3, r4, r3);
    L_0x0057:
        r0 = r7.k;
        r4 = 1;
        r7.a(r0, r4);
        r0 = r7.k;
        if (r0 == 0) goto L_0x01ab;
    L_0x0061:
        r0 = r7.H;
        if (r0 != 0) goto L_0x0069;
    L_0x0065:
        r0 = r7.I;
        if (r0 == 0) goto L_0x00a0;
    L_0x0069:
        r0 = r7.J;
        if (r0 != 0) goto L_0x00a0;
    L_0x006d:
        r0 = r7.c;
        r5 = r7.k;
        r5 = r5.p();
        a(r0, r5);
        r0 = r7.M;
        if (r0 == 0) goto L_0x0090;
    L_0x007c:
        r0 = r7.c;
        r5 = r7.aa;
        r0.setOnClickListener(r5);
        r0 = r7.c;
        r5 = r7.ac;
        r0.setOnLongClickListener(r5);
        r0 = r7.c;
        r0.a(r3);
        goto L_0x0095;
    L_0x0090:
        r0 = r7.c;
        r0.a(r4);
    L_0x0095:
        r0 = r7.c;
        r0.setVisibility(r3);
        r0 = r7.c;
        r0.invalidate();
        goto L_0x00a9;
    L_0x00a0:
        r0 = r7.r;
        if (r0 == 0) goto L_0x00a9;
    L_0x00a4:
        r0 = r7.c;
        r0.setVisibility(r1);
    L_0x00a9:
        r0 = r7.d;
        r0.setVisibility(r3);
        r0 = r7.k;
        r7.a(r0, r4);
        r0 = r7.e;
        r0.setVisibility(r3);
        r0 = r7.c;
        r5 = com.mikepenz.materialdrawer.R.id.material_drawer_profile_header;
        r6 = r7.k;
        r0.setTag(r5, r6);
        r0 = r7.k;
        r0 = r0.n();
        r5 = r7.f;
        defpackage.afx.a(r0, r5);
        r0 = r7.k;
        r0 = r0.o();
        r5 = r7.g;
        defpackage.afx.a(r0, r5);
        r0 = r7.l;
        if (r0 == 0) goto L_0x011c;
    L_0x00db:
        r5 = r7.H;
        if (r5 == 0) goto L_0x011c;
    L_0x00df:
        r5 = r7.I;
        if (r5 != 0) goto L_0x011c;
    L_0x00e3:
        r5 = r7.h;
        r0 = r0.p();
        a(r5, r0);
        r0 = r7.h;
        r5 = com.mikepenz.materialdrawer.R.id.material_drawer_profile_header;
        r6 = r7.l;
        r0.setTag(r5, r6);
        r0 = r7.M;
        if (r0 == 0) goto L_0x010d;
    L_0x00f9:
        r0 = r7.h;
        r5 = r7.ab;
        r0.setOnClickListener(r5);
        r0 = r7.h;
        r5 = r7.ad;
        r0.setOnLongClickListener(r5);
        r0 = r7.h;
        r0.a(r3);
        goto L_0x0112;
    L_0x010d:
        r0 = r7.h;
        r0.a(r4);
    L_0x0112:
        r0 = r7.h;
        r0.setVisibility(r3);
        r0 = r7.h;
        r0.invalidate();
    L_0x011c:
        r0 = r7.m;
        if (r0 == 0) goto L_0x0161;
    L_0x0120:
        r5 = r7.H;
        if (r5 == 0) goto L_0x0161;
    L_0x0124:
        r5 = r7.I;
        if (r5 != 0) goto L_0x0161;
    L_0x0128:
        r5 = r7.i;
        r0 = r0.p();
        a(r5, r0);
        r0 = r7.i;
        r5 = com.mikepenz.materialdrawer.R.id.material_drawer_profile_header;
        r6 = r7.m;
        r0.setTag(r5, r6);
        r0 = r7.M;
        if (r0 == 0) goto L_0x0152;
    L_0x013e:
        r0 = r7.i;
        r5 = r7.ab;
        r0.setOnClickListener(r5);
        r0 = r7.i;
        r5 = r7.ad;
        r0.setOnLongClickListener(r5);
        r0 = r7.i;
        r0.a(r3);
        goto L_0x0157;
    L_0x0152:
        r0 = r7.i;
        r0.a(r4);
    L_0x0157:
        r0 = r7.i;
        r0.setVisibility(r3);
        r0 = r7.i;
        r0.invalidate();
    L_0x0161:
        r0 = r7.n;
        if (r0 == 0) goto L_0x01eb;
    L_0x0165:
        r5 = r7.O;
        if (r5 == 0) goto L_0x01eb;
    L_0x0169:
        r5 = r7.H;
        if (r5 == 0) goto L_0x01eb;
    L_0x016d:
        r5 = r7.I;
        if (r5 != 0) goto L_0x01eb;
    L_0x0171:
        r5 = r7.j;
        r0 = r0.p();
        a(r5, r0);
        r0 = r7.j;
        r5 = com.mikepenz.materialdrawer.R.id.material_drawer_profile_header;
        r6 = r7.n;
        r0.setTag(r5, r6);
        r0 = r7.M;
        if (r0 == 0) goto L_0x019b;
    L_0x0187:
        r0 = r7.j;
        r5 = r7.ab;
        r0.setOnClickListener(r5);
        r0 = r7.j;
        r5 = r7.ad;
        r0.setOnLongClickListener(r5);
        r0 = r7.j;
        r0.a(r3);
        goto L_0x01a0;
    L_0x019b:
        r0 = r7.j;
        r0.a(r4);
    L_0x01a0:
        r0 = r7.j;
        r0.setVisibility(r3);
        r0 = r7.j;
        r0.invalidate();
        goto L_0x01eb;
    L_0x01ab:
        r0 = r7.V;
        if (r0 == 0) goto L_0x01eb;
    L_0x01af:
        r0 = r0.size();
        if (r0 <= 0) goto L_0x01eb;
    L_0x01b5:
        r0 = r7.V;
        r0 = r0.get(r3);
        r0 = (defpackage.afj) r0;
        r5 = r7.d;
        r6 = com.mikepenz.materialdrawer.R.id.material_drawer_profile_header;
        r5.setTag(r6, r0);
        r0 = r7.d;
        r0.setVisibility(r3);
        r0 = r7.k;
        r7.a(r0, r4);
        r0 = r7.e;
        r0.setVisibility(r3);
        r0 = r7.k;
        if (r0 == 0) goto L_0x01eb;
    L_0x01d7:
        r0 = r0.n();
        r5 = r7.f;
        defpackage.afx.a(r0, r5);
        r0 = r7.k;
        r0 = r0.o();
        r5 = r7.g;
        defpackage.afx.a(r0, r5);
    L_0x01eb:
        r0 = r7.y;
        if (r0 != 0) goto L_0x01f4;
    L_0x01ef:
        r0 = r7.f;
        r0.setVisibility(r1);
    L_0x01f4:
        r0 = r7.A;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x0208;
    L_0x01fc:
        r0 = r7.f;
        r5 = r7.A;
        r0.setText(r5);
        r0 = r7.d;
        r0.setVisibility(r3);
    L_0x0208:
        r0 = r7.z;
        if (r0 != 0) goto L_0x0211;
    L_0x020c:
        r0 = r7.g;
        r0.setVisibility(r1);
    L_0x0211:
        r0 = r7.B;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x0225;
    L_0x0219:
        r0 = r7.g;
        r5 = r7.B;
        r0.setText(r5);
        r0 = r7.d;
        r0.setVisibility(r3);
    L_0x0225:
        r0 = r7.T;
        if (r0 == 0) goto L_0x023b;
    L_0x0229:
        r0 = r7.S;
        if (r0 != 0) goto L_0x0257;
    L_0x022d:
        r0 = r7.l;
        if (r0 != 0) goto L_0x0257;
    L_0x0231:
        r0 = r7.V;
        if (r0 == 0) goto L_0x023b;
    L_0x0235:
        r0 = r0.size();
        if (r0 != r4) goto L_0x0257;
    L_0x023b:
        r0 = r7.e;
        r0.setVisibility(r1);
        r7.a(r2, r3);
        r0 = r7.r;
        if (r0 != 0) goto L_0x0257;
    L_0x0247:
        r0 = r7.d;
        r1 = 1098907648; // 0x41800000 float:16.0 double:5.42932517E-315;
        r2 = r0.getContext();
        r1 = defpackage.afz.a(r1, r2);
        r1 = (int) r1;
        r0.setPadding(r3, r3, r1, r3);
    L_0x0257:
        r0 = r7.R;
        if (r0 == 0) goto L_0x0260;
    L_0x025b:
        r0 = r7.k;
        r7.a(r0, r4);
    L_0x0260:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mikepenz.materialdrawer.f.h():void");
    }

    private void i() {
        o oVar = this.Y;
        if (oVar != null) {
            oVar.g();
        }
        this.e.clearAnimation();
        ViewCompat.animate(this.e).rotation(0.0f).start();
    }

    public final f a() {
        this.r = true;
        return this;
    }

    public final f a(Activity activity) {
        this.q = activity;
        return this;
    }

    public final f a(c cVar) {
        this.W = cVar;
        return this;
    }

    public final f a(afj... afjArr) {
        if (this.V == null) {
            this.V = new ArrayList();
        }
        o oVar = this.Y;
        if (oVar != null) {
            oVar.a.h.a((q[]) afjArr);
        }
        Collections.addAll(this.V, afjArr);
        return this;
    }

    protected final boolean a(afj afj) {
        if (afj == null) {
            return false;
        }
        if (this.k == afj) {
            return true;
        }
        Object obj = -1;
        afj afj2;
        if (this.N) {
            if (this.l == afj) {
                obj = 1;
            } else if (this.m == afj) {
                obj = 2;
            } else if (this.n == afj) {
                obj = 3;
            }
            afj2 = this.k;
            this.k = afj;
            if (obj == 1) {
                this.l = afj2;
            } else if (obj == 2) {
                this.m = afj2;
            } else if (obj == 3) {
                this.n = afj2;
            }
        } else if (this.V != null) {
            ArrayList arrayList = new ArrayList(Arrays.asList(new afj[]{afj2, this.l, this.m, this.n}));
            if (arrayList.contains(afj)) {
                int i = 0;
                while (i < 4) {
                    if (arrayList.get(i) == afj) {
                        break;
                    }
                    i++;
                }
                i = -1;
                if (i != -1) {
                    arrayList.remove(i);
                    arrayList.add(0, afj);
                    this.k = (afj) arrayList.get(0);
                    this.l = (afj) arrayList.get(1);
                    this.m = (afj) arrayList.get(2);
                    this.n = (afj) arrayList.get(3);
                }
            } else {
                this.n = this.m;
                this.m = this.l;
                this.l = this.k;
                this.k = afj;
            }
        }
        if (this.J) {
            this.n = this.m;
            this.m = this.l;
            this.l = this.k;
        }
        h();
        return false;
    }

    public final f b() {
        this.x = true;
        return this;
    }

    public final f c() {
        this.F = new adw((int) R.drawable.gradient_background);
        return this;
    }

    public final f d() {
        this.I = false;
        return this;
    }

    public final a e() {
        int i;
        int a;
        Bundle bundle;
        List list;
        o oVar;
        if (this.U == null) {
            Activity activity = this.q;
            if (activity != null) {
                LayoutInflater layoutInflater;
                if (this.r) {
                    layoutInflater = activity.getLayoutInflater();
                    i = R.layout.material_drawer_compact_header;
                } else {
                    layoutInflater = activity.getLayoutInflater();
                    i = R.layout.material_drawer_header;
                }
                this.U = layoutInflater.inflate(i, null, false);
            } else {
                throw new RuntimeException("please pass an activity first to use this call");
            }
        }
        this.a = this.U.findViewById(R.id.material_drawer_account_header);
        int dimensionPixelSize = this.q.getResources().getDimensionPixelSize(R.dimen.material_drawer_account_header_height);
        i = afz.a(this.q, true);
        adv adv = this.v;
        if (adv != null) {
            a = adv.a(this.q);
        } else if (this.r) {
            a = this.q.getResources().getDimensionPixelSize(R.dimen.material_drawer_account_header_height_compact);
        } else {
            double a2 = (double) afs.a(this.q);
            Double.isNaN(a2);
            a = (int) (a2 * 0.5625d);
            if (VERSION.SDK_INT < 19) {
                int i2 = a - i;
                if (((float) i2) > ((float) dimensionPixelSize) - afz.a(8.0f, this.q)) {
                    a = i2;
                }
            }
        }
        if (this.E && VERSION.SDK_INT >= 21) {
            View view = this.a;
            view.setPadding(view.getPaddingLeft(), this.a.getPaddingTop() + i, this.a.getPaddingRight(), this.a.getPaddingBottom());
            if (this.r) {
                a += i;
            } else if (a - i <= dimensionPixelSize) {
                a = dimensionPixelSize + i;
            }
        }
        View view2 = this.U;
        if (view2 != null) {
            LayoutParams layoutParams;
            LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = a;
                this.U.setLayoutParams(layoutParams2);
            }
            view2 = this.U.findViewById(R.id.material_drawer_account_header);
            if (view2 != null) {
                layoutParams = view2.getLayoutParams();
                layoutParams.height = a;
                view2.setLayoutParams(layoutParams);
            }
            view2 = this.U.findViewById(R.id.material_drawer_account_header_background);
            if (view2 != null) {
                layoutParams = view2.getLayoutParams();
                layoutParams.height = a;
                view2.setLayoutParams(layoutParams);
            }
        }
        this.b = (ImageView) this.U.findViewById(R.id.material_drawer_account_header_background);
        afw.a(this.F, this.b, afr.ACCOUNT_HEADER.name());
        ScaleType scaleType = this.G;
        if (scaleType != null) {
            this.b.setScaleType(scaleType);
        }
        dimensionPixelSize = afu.a(this.w, this.q, R.attr.material_drawer_header_selection_text, R.color.material_drawer_header_selection_text);
        this.d = this.r ? this.a : this.U.findViewById(R.id.material_drawer_account_header_text_section);
        this.p = afz.c(this.q);
        a(this.k, true);
        this.e = (ImageView) this.U.findViewById(R.id.material_drawer_account_header_text_switcher);
        this.e.setImageDrawable(new adf(this.q, adz.mdf_arrow_drop_down).f(R.dimen.material_drawer_account_header_dropdown).c(R.dimen.material_drawer_account_header_dropdown_padding).a(dimensionPixelSize));
        this.c = (BezelImageView) this.a.findViewById(R.id.material_drawer_account_header_current);
        this.f = (TextView) this.a.findViewById(R.id.material_drawer_account_header_name);
        this.g = (TextView) this.a.findViewById(R.id.material_drawer_account_header_email);
        Typeface typeface = this.t;
        if (typeface == null) {
            typeface = this.s;
            if (typeface != null) {
            }
            typeface = this.u;
            if (typeface == null) {
                typeface = this.s;
                if (typeface != null) {
                }
                this.f.setTextColor(dimensionPixelSize);
                this.g.setTextColor(dimensionPixelSize);
                this.h = (BezelImageView) this.a.findViewById(R.id.material_drawer_account_header_small_first);
                this.i = (BezelImageView) this.a.findViewById(R.id.material_drawer_account_header_small_second);
                this.j = (BezelImageView) this.a.findViewById(R.id.material_drawer_account_header_small_third);
                g();
                h();
                bundle = this.Z;
                if (bundle != null) {
                    dimensionPixelSize = bundle.getInt("bundle_selection_header", -1);
                    if (dimensionPixelSize != -1) {
                        list = this.V;
                        if (list != null && dimensionPixelSize >= 0 && dimensionPixelSize < list.size()) {
                            a((afj) this.V.get(dimensionPixelSize));
                        }
                    }
                }
                oVar = this.Y;
                if (oVar != null) {
                    oVar.a(this.U, this.C, this.D);
                }
                this.q = null;
                return new a(this);
            }
            this.g.setTypeface(typeface);
            this.f.setTextColor(dimensionPixelSize);
            this.g.setTextColor(dimensionPixelSize);
            this.h = (BezelImageView) this.a.findViewById(R.id.material_drawer_account_header_small_first);
            this.i = (BezelImageView) this.a.findViewById(R.id.material_drawer_account_header_small_second);
            this.j = (BezelImageView) this.a.findViewById(R.id.material_drawer_account_header_small_third);
            g();
            h();
            bundle = this.Z;
            if (bundle != null) {
                dimensionPixelSize = bundle.getInt("bundle_selection_header", -1);
                if (dimensionPixelSize != -1) {
                    list = this.V;
                    a((afj) this.V.get(dimensionPixelSize));
                }
            }
            oVar = this.Y;
            if (oVar != null) {
                oVar.a(this.U, this.C, this.D);
            }
            this.q = null;
            return new a(this);
        }
        this.f.setTypeface(typeface);
        typeface = this.u;
        if (typeface == null) {
            typeface = this.s;
            if (typeface != null) {
            }
            this.f.setTextColor(dimensionPixelSize);
            this.g.setTextColor(dimensionPixelSize);
            this.h = (BezelImageView) this.a.findViewById(R.id.material_drawer_account_header_small_first);
            this.i = (BezelImageView) this.a.findViewById(R.id.material_drawer_account_header_small_second);
            this.j = (BezelImageView) this.a.findViewById(R.id.material_drawer_account_header_small_third);
            g();
            h();
            bundle = this.Z;
            if (bundle != null) {
                dimensionPixelSize = bundle.getInt("bundle_selection_header", -1);
                if (dimensionPixelSize != -1) {
                    list = this.V;
                    a((afj) this.V.get(dimensionPixelSize));
                }
            }
            oVar = this.Y;
            if (oVar != null) {
                oVar.a(this.U, this.C, this.D);
            }
            this.q = null;
            return new a(this);
        }
        this.g.setTypeface(typeface);
        this.f.setTextColor(dimensionPixelSize);
        this.g.setTextColor(dimensionPixelSize);
        this.h = (BezelImageView) this.a.findViewById(R.id.material_drawer_account_header_small_first);
        this.i = (BezelImageView) this.a.findViewById(R.id.material_drawer_account_header_small_second);
        this.j = (BezelImageView) this.a.findViewById(R.id.material_drawer_account_header_small_third);
        g();
        h();
        bundle = this.Z;
        if (bundle != null) {
            dimensionPixelSize = bundle.getInt("bundle_selection_header", -1);
            if (dimensionPixelSize != -1) {
                list = this.V;
                a((afj) this.V.get(dimensionPixelSize));
            }
        }
        oVar = this.Y;
        if (oVar != null) {
            oVar.a(this.U, this.C, this.D);
        }
        this.q = null;
        return new a(this);
    }

    protected final void f() {
        o oVar = this.Y;
        if (oVar != null) {
            if (oVar.f()) {
                i();
                this.o = false;
                return;
            }
            int i = -1;
            List arrayList = new ArrayList();
            List<afj> list = this.V;
            if (list != null) {
                int i2 = 0;
                for (afj afj : list) {
                    if (afj == this.k) {
                        if (!this.x) {
                            i = this.Y.a.d().c(i2);
                        }
                    }
                    if (afj instanceof afi) {
                        afi afi = (afi) afj;
                        afi.b(false);
                        arrayList.add(afi);
                    }
                    i2++;
                }
            }
            this.Y.a(this.af, this.ag, arrayList, i);
            this.e.clearAnimation();
            ViewCompat.animate(this.e).rotation(180.0f).start();
            this.o = true;
        }
    }
}
