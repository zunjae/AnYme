package com.afollestad.materialdialogs;

import defpackage.cu;

final class g {
    static int a(o oVar) {
        boolean a = cu.a(oVar.a, R.attr.md_dark_theme, oVar.J == z.b);
        oVar.J = a ? z.b : z.a;
        return a ? R.style.MD_Dark : R.style.MD_Light;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(com.afollestad.materialdialogs.j r14) {
        /*
        r0 = r14.b;
        r1 = r0.K;
        r14.setCancelable(r1);
        r1 = r0.L;
        r14.setCanceledOnTouchOutside(r1);
        r1 = r0.af;
        r2 = 0;
        if (r1 != 0) goto L_0x0025;
    L_0x0011:
        r1 = r0.a;
        r3 = com.afollestad.materialdialogs.R.attr.md_background_color;
        r4 = r14.getContext();
        r5 = com.afollestad.materialdialogs.R.attr.colorBackgroundFloating;
        r4 = defpackage.cu.a(r4, r5, r2);
        r1 = defpackage.cu.a(r1, r3, r4);
        r0.af = r1;
    L_0x0025:
        r1 = r0.af;
        if (r1 == 0) goto L_0x0049;
    L_0x0029:
        r1 = new android.graphics.drawable.GradientDrawable;
        r1.<init>();
        r3 = r0.a;
        r3 = r3.getResources();
        r4 = com.afollestad.materialdialogs.R.dimen.md_bg_corner_radius;
        r3 = r3.getDimension(r4);
        r1.setCornerRadius(r3);
        r3 = r0.af;
        r1.setColor(r3);
        r3 = r14.getWindow();
        r3.setBackgroundDrawable(r1);
    L_0x0049:
        r1 = r0.aE;
        if (r1 != 0) goto L_0x0059;
    L_0x004d:
        r1 = r0.a;
        r3 = com.afollestad.materialdialogs.R.attr.md_positive_color;
        r4 = r0.v;
        r1 = defpackage.cu.a(r1, r3, r4);
        r0.v = r1;
    L_0x0059:
        r1 = r0.aF;
        if (r1 != 0) goto L_0x0069;
    L_0x005d:
        r1 = r0.a;
        r3 = com.afollestad.materialdialogs.R.attr.md_neutral_color;
        r4 = r0.x;
        r1 = defpackage.cu.a(r1, r3, r4);
        r0.x = r1;
    L_0x0069:
        r1 = r0.aG;
        if (r1 != 0) goto L_0x0079;
    L_0x006d:
        r1 = r0.a;
        r3 = com.afollestad.materialdialogs.R.attr.md_negative_color;
        r4 = r0.w;
        r1 = defpackage.cu.a(r1, r3, r4);
        r0.w = r1;
    L_0x0079:
        r1 = r0.aH;
        if (r1 != 0) goto L_0x0089;
    L_0x007d:
        r1 = r0.a;
        r3 = com.afollestad.materialdialogs.R.attr.md_widget_color;
        r4 = r0.t;
        r1 = defpackage.cu.a(r1, r3, r4);
        r0.t = r1;
    L_0x0089:
        r1 = r0.aB;
        r3 = 16842806; // 0x1010036 float:2.369371E-38 double:8.321452E-317;
        if (r1 != 0) goto L_0x00a2;
    L_0x0090:
        r1 = r14.getContext();
        r1 = defpackage.cu.a(r1, r3, r2);
        r4 = r0.a;
        r5 = com.afollestad.materialdialogs.R.attr.md_title_color;
        r1 = defpackage.cu.a(r4, r5, r1);
        r0.i = r1;
    L_0x00a2:
        r1 = r0.aC;
        if (r1 != 0) goto L_0x00bb;
    L_0x00a6:
        r1 = r14.getContext();
        r4 = 16842808; // 0x1010038 float:2.3693715E-38 double:8.321453E-317;
        r1 = defpackage.cu.a(r1, r4, r2);
        r4 = r0.a;
        r5 = com.afollestad.materialdialogs.R.attr.md_content_color;
        r1 = defpackage.cu.a(r4, r5, r1);
        r0.j = r1;
    L_0x00bb:
        r1 = r0.aD;
        if (r1 != 0) goto L_0x00cb;
    L_0x00bf:
        r1 = r0.a;
        r4 = com.afollestad.materialdialogs.R.attr.md_item_color;
        r5 = r0.j;
        r1 = defpackage.cu.a(r1, r4, r5);
        r0.ag = r1;
    L_0x00cb:
        r1 = r14.a;
        r4 = com.afollestad.materialdialogs.R.id.md_title;
        r1 = r1.findViewById(r4);
        r1 = (android.widget.TextView) r1;
        r14.d = r1;
        r1 = r14.a;
        r4 = com.afollestad.materialdialogs.R.id.md_icon;
        r1 = r1.findViewById(r4);
        r1 = (android.widget.ImageView) r1;
        r14.c = r1;
        r1 = r14.a;
        r4 = com.afollestad.materialdialogs.R.id.md_titleFrame;
        r1 = r1.findViewById(r4);
        r14.h = r1;
        r1 = r14.a;
        r4 = com.afollestad.materialdialogs.R.id.md_content;
        r1 = r1.findViewById(r4);
        r1 = (android.widget.TextView) r1;
        r14.e = r1;
        r1 = r14.a;
        r4 = com.afollestad.materialdialogs.R.id.md_contentRecyclerView;
        r1 = r1.findViewById(r4);
        r1 = (android.support.v7.widget.RecyclerView) r1;
        r14.g = r1;
        r1 = r14.a;
        r4 = com.afollestad.materialdialogs.R.id.md_promptCheckbox;
        r1 = r1.findViewById(r4);
        r1 = (android.widget.CheckBox) r1;
        r14.n = r1;
        r1 = r14.a;
        r4 = com.afollestad.materialdialogs.R.id.md_buttonDefaultPositive;
        r1 = r1.findViewById(r4);
        r1 = (com.afollestad.materialdialogs.internal.MDButton) r1;
        r14.o = r1;
        r1 = r14.a;
        r4 = com.afollestad.materialdialogs.R.id.md_buttonDefaultNeutral;
        r1 = r1.findViewById(r4);
        r1 = (com.afollestad.materialdialogs.internal.MDButton) r1;
        r14.p = r1;
        r1 = r14.a;
        r4 = com.afollestad.materialdialogs.R.id.md_buttonDefaultNegative;
        r1 = r1.findViewById(r4);
        r1 = (com.afollestad.materialdialogs.internal.MDButton) r1;
        r14.q = r1;
        r1 = r0.an;
        if (r1 == 0) goto L_0x0148;
    L_0x0139:
        r1 = r0.m;
        if (r1 != 0) goto L_0x0148;
    L_0x013d:
        r1 = r0.a;
        r4 = 17039370; // 0x104000a float:2.42446E-38 double:8.4185673E-317;
        r1 = r1.getText(r4);
        r0.m = r1;
    L_0x0148:
        r1 = r14.o;
        r4 = r0.m;
        r5 = 8;
        if (r4 == 0) goto L_0x0152;
    L_0x0150:
        r4 = 0;
        goto L_0x0154;
    L_0x0152:
        r4 = 8;
    L_0x0154:
        r1.setVisibility(r4);
        r1 = r14.p;
        r4 = r0.n;
        if (r4 == 0) goto L_0x015f;
    L_0x015d:
        r4 = 0;
        goto L_0x0161;
    L_0x015f:
        r4 = 8;
    L_0x0161:
        r1.setVisibility(r4);
        r1 = r14.q;
        r4 = r0.o;
        if (r4 == 0) goto L_0x016c;
    L_0x016a:
        r4 = 0;
        goto L_0x016e;
    L_0x016c:
        r4 = 8;
    L_0x016e:
        r1.setVisibility(r4);
        r1 = r14.o;
        r4 = 1;
        r1.setFocusable(r4);
        r1 = r14.p;
        r1.setFocusable(r4);
        r1 = r14.q;
        r1.setFocusable(r4);
        r1 = r0.p;
        if (r1 == 0) goto L_0x018a;
    L_0x0185:
        r1 = r14.o;
        r1.requestFocus();
    L_0x018a:
        r1 = r0.q;
        if (r1 == 0) goto L_0x0193;
    L_0x018e:
        r1 = r14.p;
        r1.requestFocus();
    L_0x0193:
        r1 = r0.r;
        if (r1 == 0) goto L_0x019c;
    L_0x0197:
        r1 = r14.q;
        r1.requestFocus();
    L_0x019c:
        r1 = r0.T;
        if (r1 == 0) goto L_0x01ad;
    L_0x01a0:
        r1 = r14.c;
        r1.setVisibility(r2);
        r1 = r14.c;
        r6 = r0.T;
        r1.setImageDrawable(r6);
        goto L_0x01c7;
    L_0x01ad:
        r1 = r0.a;
        r6 = com.afollestad.materialdialogs.R.attr.md_icon;
        r1 = defpackage.cu.b(r1, r6);
        if (r1 == 0) goto L_0x01c2;
    L_0x01b7:
        r6 = r14.c;
        r6.setVisibility(r2);
        r6 = r14.c;
        r6.setImageDrawable(r1);
        goto L_0x01c7;
    L_0x01c2:
        r1 = r14.c;
        r1.setVisibility(r5);
    L_0x01c7:
        r1 = r0.V;
        r6 = -1;
        if (r1 != r6) goto L_0x01d4;
    L_0x01cc:
        r1 = r0.a;
        r7 = com.afollestad.materialdialogs.R.attr.md_icon_max_size;
        r1 = defpackage.cu.c(r1, r7);
    L_0x01d4:
        r7 = r0.U;
        if (r7 != 0) goto L_0x01e2;
    L_0x01d8:
        r7 = r0.a;
        r8 = com.afollestad.materialdialogs.R.attr.md_icon_limit_icon_to_default_size;
        r7 = defpackage.cu.a(r7, r8, r2);
        if (r7 == 0) goto L_0x01ee;
    L_0x01e2:
        r1 = r0.a;
        r1 = r1.getResources();
        r7 = com.afollestad.materialdialogs.R.dimen.md_icon_max_size;
        r1 = r1.getDimensionPixelSize(r7);
    L_0x01ee:
        if (r1 < 0) goto L_0x0204;
    L_0x01f0:
        r7 = r14.c;
        r7.setAdjustViewBounds(r4);
        r7 = r14.c;
        r7.setMaxHeight(r1);
        r7 = r14.c;
        r7.setMaxWidth(r1);
        r1 = r14.c;
        r1.requestLayout();
    L_0x0204:
        r1 = r0.aI;
        if (r1 != 0) goto L_0x021c;
    L_0x0208:
        r1 = r14.getContext();
        r7 = com.afollestad.materialdialogs.R.attr.md_divider;
        r1 = defpackage.cu.a(r1, r7, r2);
        r7 = r0.a;
        r8 = com.afollestad.materialdialogs.R.attr.md_divider_color;
        r1 = defpackage.cu.a(r7, r8, r1);
        r0.ae = r1;
    L_0x021c:
        r1 = r14.a;
        r7 = r0.ae;
        r1.setDividerColor(r7);
        r1 = r14.d;
        r7 = 17;
        if (r1 == 0) goto L_0x0263;
    L_0x0229:
        r8 = r0.S;
        com.afollestad.materialdialogs.j.a(r1, r8);
        r1 = r14.d;
        r8 = r0.i;
        r1.setTextColor(r8);
        r1 = r14.d;
        r8 = r0.c;
        r8 = r8.getGravityInt();
        r1.setGravity(r8);
        r1 = android.os.Build.VERSION.SDK_INT;
        if (r1 < r7) goto L_0x024f;
    L_0x0244:
        r1 = r14.d;
        r8 = r0.c;
        r8 = r8.getTextAlignment();
        r1.setTextAlignment(r8);
    L_0x024f:
        r1 = r0.b;
        if (r1 != 0) goto L_0x0259;
    L_0x0253:
        r1 = r14.h;
        r1.setVisibility(r5);
        goto L_0x0263;
    L_0x0259:
        r8 = r14.d;
        r8.setText(r1);
        r1 = r14.h;
        r1.setVisibility(r2);
    L_0x0263:
        r1 = r14.e;
        if (r1 == 0) goto L_0x02ca;
    L_0x0267:
        r8 = new android.text.method.LinkMovementMethod;
        r8.<init>();
        r1.setMovementMethod(r8);
        r1 = r14.e;
        r8 = r0.R;
        com.afollestad.materialdialogs.j.a(r1, r8);
        r1 = r14.e;
        r8 = 0;
        r9 = r0.M;
        r1.setLineSpacing(r8, r9);
        r1 = r0.y;
        if (r1 != 0) goto L_0x0290;
    L_0x0282:
        r1 = r14.e;
        r8 = r14.getContext();
        r3 = defpackage.cu.a(r8, r3, r2);
        r1.setLinkTextColor(r3);
        goto L_0x0295;
    L_0x0290:
        r3 = r14.e;
        r3.setLinkTextColor(r1);
    L_0x0295:
        r1 = r14.e;
        r3 = r0.j;
        r1.setTextColor(r3);
        r1 = r14.e;
        r3 = r0.d;
        r3 = r3.getGravityInt();
        r1.setGravity(r3);
        r1 = android.os.Build.VERSION.SDK_INT;
        if (r1 < r7) goto L_0x02b6;
    L_0x02ab:
        r1 = r14.e;
        r3 = r0.d;
        r3 = r3.getTextAlignment();
        r1.setTextAlignment(r3);
    L_0x02b6:
        r1 = r0.k;
        if (r1 == 0) goto L_0x02c5;
    L_0x02ba:
        r3 = r14.e;
        r3.setText(r1);
        r1 = r14.e;
        r1.setVisibility(r2);
        goto L_0x02ca;
    L_0x02c5:
        r1 = r14.e;
        r1.setVisibility(r5);
    L_0x02ca:
        r1 = r14.n;
        if (r1 == 0) goto L_0x02f6;
    L_0x02ce:
        r3 = r0.av;
        r1.setText(r3);
        r1 = r14.n;
        r3 = r0.aw;
        r1.setChecked(r3);
        r1 = r14.n;
        r3 = r0.ax;
        r1.setOnCheckedChangeListener(r3);
        r1 = r14.n;
        r3 = r0.R;
        com.afollestad.materialdialogs.j.a(r1, r3);
        r1 = r14.n;
        r3 = r0.j;
        r1.setTextColor(r3);
        r1 = r14.n;
        r3 = r0.t;
        com.afollestad.materialdialogs.internal.f.a(r1, r3);
    L_0x02f6:
        r1 = r14.a;
        r3 = r0.g;
        r1.setButtonGravity(r3);
        r1 = r14.a;
        r3 = r0.e;
        r1.setButtonStackedGravity(r3);
        r1 = r14.a;
        r3 = r0.ac;
        r1.setStackingBehavior(r3);
        r1 = android.os.Build.VERSION.SDK_INT;
        r3 = 14;
        if (r1 < r3) goto L_0x031c;
    L_0x0311:
        r1 = r0.a;
        r7 = 16843660; // 0x101038c float:2.3696103E-38 double:8.321874E-317;
        r1 = defpackage.cu.a(r1, r7, r4);
        if (r1 == 0) goto L_0x0324;
    L_0x031c:
        r1 = r0.a;
        r7 = com.afollestad.materialdialogs.R.attr.textAllCaps;
        r1 = defpackage.cu.a(r1, r7, r4);
    L_0x0324:
        r7 = r14.o;
        r8 = r0.S;
        com.afollestad.materialdialogs.j.a(r7, r8);
        r7.setAllCapsCompat(r1);
        r8 = r0.m;
        r7.setText(r8);
        r8 = r0.v;
        r7.setTextColor(r8);
        r7 = r14.o;
        r8 = com.afollestad.materialdialogs.e.POSITIVE;
        r8 = r14.a(r8, r4);
        r7.setStackedSelector(r8);
        r7 = r14.o;
        r8 = com.afollestad.materialdialogs.e.POSITIVE;
        r8 = r14.a(r8, r2);
        r7.setDefaultSelector(r8);
        r7 = r14.o;
        r8 = com.afollestad.materialdialogs.e.POSITIVE;
        r7.setTag(r8);
        r7 = r14.o;
        r7.setOnClickListener(r14);
        r7 = r14.q;
        r8 = r0.S;
        com.afollestad.materialdialogs.j.a(r7, r8);
        r7.setAllCapsCompat(r1);
        r8 = r0.o;
        r7.setText(r8);
        r8 = r0.w;
        r7.setTextColor(r8);
        r7 = r14.q;
        r8 = com.afollestad.materialdialogs.e.NEGATIVE;
        r8 = r14.a(r8, r4);
        r7.setStackedSelector(r8);
        r7 = r14.q;
        r8 = com.afollestad.materialdialogs.e.NEGATIVE;
        r8 = r14.a(r8, r2);
        r7.setDefaultSelector(r8);
        r7 = r14.q;
        r8 = com.afollestad.materialdialogs.e.NEGATIVE;
        r7.setTag(r8);
        r7 = r14.q;
        r7.setOnClickListener(r14);
        r7 = r14.p;
        r8 = r0.S;
        com.afollestad.materialdialogs.j.a(r7, r8);
        r7.setAllCapsCompat(r1);
        r1 = r0.n;
        r7.setText(r1);
        r1 = r0.x;
        r7.setTextColor(r1);
        r1 = r14.p;
        r7 = com.afollestad.materialdialogs.e.NEUTRAL;
        r7 = r14.a(r7, r4);
        r1.setStackedSelector(r7);
        r1 = r14.p;
        r7 = com.afollestad.materialdialogs.e.NEUTRAL;
        r7 = r14.a(r7, r2);
        r1.setDefaultSelector(r7);
        r1 = r14.p;
        r7 = com.afollestad.materialdialogs.e.NEUTRAL;
        r1.setTag(r7);
        r1 = r14.p;
        r1.setOnClickListener(r14);
        r1 = r0.G;
        if (r1 == 0) goto L_0x03d1;
    L_0x03ca:
        r1 = new java.util.ArrayList;
        r1.<init>();
        r14.s = r1;
    L_0x03d1:
        r1 = r14.g;
        r7 = 0;
        if (r1 == 0) goto L_0x040d;
    L_0x03d6:
        r1 = r0.W;
        if (r1 != 0) goto L_0x040d;
    L_0x03da:
        r1 = r0.F;
        if (r1 == 0) goto L_0x03e3;
    L_0x03de:
        r1 = com.afollestad.materialdialogs.w.b;
    L_0x03e0:
        r14.r = r1;
        goto L_0x0400;
    L_0x03e3:
        r1 = r0.G;
        if (r1 == 0) goto L_0x03fd;
    L_0x03e7:
        r1 = com.afollestad.materialdialogs.w.c;
        r14.r = r1;
        r1 = r0.O;
        if (r1 == 0) goto L_0x0400;
    L_0x03ef:
        r8 = new java.util.ArrayList;
        r1 = java.util.Arrays.asList(r1);
        r8.<init>(r1);
        r14.s = r8;
        r0.O = r7;
        goto L_0x0400;
    L_0x03fd:
        r1 = com.afollestad.materialdialogs.w.a;
        goto L_0x03e0;
    L_0x0400:
        r1 = new com.afollestad.materialdialogs.a;
        r8 = r14.r;
        r8 = com.afollestad.materialdialogs.w.a(r8);
        r1.<init>(r14, r8);
        r0.W = r1;
    L_0x040d:
        r1 = r14.b;
        r8 = r1.ah;
        r9 = 2;
        r10 = -2;
        if (r8 != 0) goto L_0x0419;
    L_0x0415:
        r8 = r1.aj;
        if (r8 <= r10) goto L_0x0549;
    L_0x0419:
        r8 = r14.a;
        r11 = 16908301; // 0x102000d float:2.3877265E-38 double:8.3538107E-317;
        r8 = r8.findViewById(r11);
        r8 = (android.widget.ProgressBar) r8;
        r14.j = r8;
        r8 = r14.j;
        if (r8 == 0) goto L_0x0562;
    L_0x042a:
        r11 = android.os.Build.VERSION.SDK_INT;
        if (r11 < r3) goto L_0x046d;
    L_0x042e:
        r3 = r1.ah;
        if (r3 == 0) goto L_0x0454;
    L_0x0432:
        r3 = r1.aA;
        if (r3 == 0) goto L_0x0445;
    L_0x0436:
        r3 = new me.zhanghai.android.materialprogressbar.IndeterminateHorizontalProgressDrawable;
        r8 = r1.a();
        r3.<init>(r8);
        r8 = r1.t;
        r3.setTint(r8);
        goto L_0x0462;
    L_0x0445:
        r3 = new me.zhanghai.android.materialprogressbar.IndeterminateCircularProgressDrawable;
        r8 = r1.a();
        r3.<init>(r8);
        r8 = r1.t;
        r3.setTint(r8);
        goto L_0x0462;
    L_0x0454:
        r3 = new me.zhanghai.android.materialprogressbar.HorizontalProgressDrawable;
        r8 = r1.a();
        r3.<init>(r8);
        r8 = r1.t;
        r3.setTint(r8);
    L_0x0462:
        r8 = r14.j;
        r8.setProgressDrawable(r3);
        r8 = r14.j;
        r8.setIndeterminateDrawable(r3);
        goto L_0x04a7;
    L_0x046d:
        r3 = r1.t;
        r11 = android.content.res.ColorStateList.valueOf(r3);
        r12 = android.os.Build.VERSION.SDK_INT;
        r13 = 21;
        if (r12 < r13) goto L_0x0483;
    L_0x0479:
        r8.setProgressTintList(r11);
        r8.setSecondaryProgressTintList(r11);
        r8.setIndeterminateTintList(r11);
        goto L_0x04a7;
    L_0x0483:
        r11 = android.graphics.PorterDuff.Mode.SRC_IN;
        r12 = android.os.Build.VERSION.SDK_INT;
        r13 = 10;
        if (r12 > r13) goto L_0x048d;
    L_0x048b:
        r11 = android.graphics.PorterDuff.Mode.MULTIPLY;
    L_0x048d:
        r12 = r8.getIndeterminateDrawable();
        if (r12 == 0) goto L_0x049a;
    L_0x0493:
        r12 = r8.getIndeterminateDrawable();
        r12.setColorFilter(r3, r11);
    L_0x049a:
        r12 = r8.getProgressDrawable();
        if (r12 == 0) goto L_0x04a7;
    L_0x04a0:
        r8 = r8.getProgressDrawable();
        r8.setColorFilter(r3, r11);
    L_0x04a7:
        r3 = r1.ah;
        if (r3 == 0) goto L_0x04af;
    L_0x04ab:
        r3 = r1.aA;
        if (r3 == 0) goto L_0x0549;
    L_0x04af:
        r3 = r14.j;
        r8 = r1.ah;
        if (r8 == 0) goto L_0x04bb;
    L_0x04b5:
        r8 = r1.aA;
        if (r8 == 0) goto L_0x04bb;
    L_0x04b9:
        r8 = 1;
        goto L_0x04bc;
    L_0x04bb:
        r8 = 0;
    L_0x04bc:
        r3.setIndeterminate(r8);
        r3 = r14.j;
        r3.setProgress(r2);
        r3 = r14.j;
        r8 = r1.ak;
        r3.setMax(r8);
        r3 = r14.a;
        r8 = com.afollestad.materialdialogs.R.id.md_label;
        r3 = r3.findViewById(r8);
        r3 = (android.widget.TextView) r3;
        r14.k = r3;
        r3 = r14.k;
        if (r3 == 0) goto L_0x04f4;
    L_0x04db:
        r8 = r1.j;
        r3.setTextColor(r8);
        r3 = r14.k;
        r8 = r1.S;
        com.afollestad.materialdialogs.j.a(r3, r8);
        r3 = r14.k;
        r8 = r1.az;
        r11 = 0;
        r8 = r8.format(r11);
        r3.setText(r8);
    L_0x04f4:
        r3 = r14.a;
        r8 = com.afollestad.materialdialogs.R.id.md_minMax;
        r3 = r3.findViewById(r8);
        r3 = (android.widget.TextView) r3;
        r14.l = r3;
        r3 = r14.l;
        if (r3 == 0) goto L_0x0547;
    L_0x0504:
        r8 = r1.j;
        r3.setTextColor(r8);
        r3 = r14.l;
        r8 = r1.R;
        com.afollestad.materialdialogs.j.a(r3, r8);
        r3 = r1.ai;
        if (r3 == 0) goto L_0x0541;
    L_0x0514:
        r3 = r14.l;
        r3.setVisibility(r2);
        r3 = r14.l;
        r8 = r1.ay;
        r11 = new java.lang.Object[r9];
        r12 = java.lang.Integer.valueOf(r2);
        r11[r2] = r12;
        r1 = r1.ak;
        r1 = java.lang.Integer.valueOf(r1);
        r11[r4] = r1;
        r1 = java.lang.String.format(r8, r11);
        r3.setText(r1);
        r1 = r14.j;
        r1 = r1.getLayoutParams();
        r1 = (android.view.ViewGroup.MarginLayoutParams) r1;
        r1.leftMargin = r2;
        r1.rightMargin = r2;
        goto L_0x0549;
    L_0x0541:
        r1 = r14.l;
        r1.setVisibility(r5);
        goto L_0x0549;
    L_0x0547:
        r1.ai = r2;
    L_0x0549:
        r1 = r14.j;
        if (r1 == 0) goto L_0x0562;
    L_0x054d:
        r3 = android.os.Build.VERSION.SDK_INT;
        r8 = 18;
        if (r3 >= r8) goto L_0x0562;
    L_0x0553:
        r3 = r1.isHardwareAccelerated();
        if (r3 == 0) goto L_0x0562;
    L_0x0559:
        r3 = r1.getLayerType();
        if (r3 == r4) goto L_0x0562;
    L_0x055f:
        r1.setLayerType(r4, r7);
    L_0x0562:
        r1 = r14.b;
        r3 = r14.a;
        r8 = 16908297; // 0x1020009 float:2.3877254E-38 double:8.3538087E-317;
        r3 = r3.findViewById(r8);
        r3 = (android.widget.EditText) r3;
        r14.f = r3;
        r3 = r14.f;
        if (r3 == 0) goto L_0x0607;
    L_0x0575:
        r8 = r1.R;
        com.afollestad.materialdialogs.j.a(r3, r8);
        r3 = r1.al;
        if (r3 == 0) goto L_0x0583;
    L_0x057e:
        r8 = r14.f;
        r8.setText(r3);
    L_0x0583:
        r3 = r14.f;
        if (r3 == 0) goto L_0x058f;
    L_0x0587:
        r8 = new com.afollestad.materialdialogs.m;
        r8.<init>(r14);
        r3.addTextChangedListener(r8);
    L_0x058f:
        r3 = r14.f;
        r8 = r1.am;
        r3.setHint(r8);
        r3 = r14.f;
        r3.setSingleLine();
        r3 = r14.f;
        r8 = r1.j;
        r3.setTextColor(r8);
        r3 = r14.f;
        r8 = r1.j;
        r11 = 1050253722; // 0x3e99999a float:0.3 double:5.188942835E-315;
        r8 = defpackage.cu.a(r8, r11);
        r3.setHintTextColor(r8);
        r3 = r14.f;
        r8 = r14.b;
        r8 = r8.t;
        com.afollestad.materialdialogs.internal.f.a(r3, r8);
        r3 = r1.ap;
        if (r3 == r6) goto L_0x05d6;
    L_0x05bd:
        r8 = r14.f;
        r8.setInputType(r3);
        r3 = r1.ap;
        r8 = 144; // 0x90 float:2.02E-43 double:7.1E-322;
        if (r3 == r8) goto L_0x05d6;
    L_0x05c8:
        r8 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r3 = r3 & r8;
        if (r3 != r8) goto L_0x05d6;
    L_0x05cd:
        r3 = r14.f;
        r8 = android.text.method.PasswordTransformationMethod.getInstance();
        r3.setTransformationMethod(r8);
    L_0x05d6:
        r3 = r14.a;
        r8 = com.afollestad.materialdialogs.R.id.md_minMax;
        r3 = r3.findViewById(r8);
        r3 = (android.widget.TextView) r3;
        r14.m = r3;
        r3 = r1.ar;
        if (r3 > 0) goto L_0x05f3;
    L_0x05e6:
        r3 = r1.as;
        if (r3 < 0) goto L_0x05eb;
    L_0x05ea:
        goto L_0x05f3;
    L_0x05eb:
        r1 = r14.m;
        r1.setVisibility(r5);
        r14.m = r7;
        goto L_0x0607;
    L_0x05f3:
        r3 = r14.f;
        r3 = r3.getText();
        r3 = r3.toString();
        r3 = r3.length();
        r1 = r1.ao;
        r1 = r1 ^ r4;
        r14.a(r3, r1);
    L_0x0607:
        r1 = r0.s;
        if (r1 == 0) goto L_0x067e;
    L_0x060b:
        r1 = r14.a;
        r3 = com.afollestad.materialdialogs.R.id.md_root;
        r1 = r1.findViewById(r3);
        r1 = (com.afollestad.materialdialogs.internal.MDRootLayout) r1;
        r1.a();
        r1 = r14.a;
        r3 = com.afollestad.materialdialogs.R.id.md_customViewFrame;
        r1 = r1.findViewById(r3);
        r1 = (android.widget.FrameLayout) r1;
        r14.i = r1;
        r3 = r0.s;
        r4 = r3.getParent();
        if (r4 == 0) goto L_0x0635;
    L_0x062c:
        r4 = r3.getParent();
        r4 = (android.view.ViewGroup) r4;
        r4.removeView(r3);
    L_0x0635:
        r4 = r0.ad;
        if (r4 == 0) goto L_0x0676;
    L_0x0639:
        r4 = r14.getContext();
        r4 = r4.getResources();
        r5 = com.afollestad.materialdialogs.R.dimen.md_dialog_frame_margin;
        r5 = r4.getDimensionPixelSize(r5);
        r7 = new android.widget.ScrollView;
        r8 = r14.getContext();
        r7.<init>(r8);
        r8 = com.afollestad.materialdialogs.R.dimen.md_content_padding_top;
        r8 = r4.getDimensionPixelSize(r8);
        r11 = com.afollestad.materialdialogs.R.dimen.md_content_padding_bottom;
        r4 = r4.getDimensionPixelSize(r11);
        r7.setClipToPadding(r2);
        r11 = r3 instanceof android.widget.EditText;
        if (r11 == 0) goto L_0x0667;
    L_0x0663:
        r7.setPadding(r5, r8, r5, r4);
        goto L_0x066d;
    L_0x0667:
        r7.setPadding(r2, r8, r2, r4);
        r3.setPadding(r5, r2, r5, r2);
    L_0x066d:
        r2 = new android.widget.FrameLayout$LayoutParams;
        r2.<init>(r6, r10);
        r7.addView(r3, r2);
        r3 = r7;
    L_0x0676:
        r2 = new android.view.ViewGroup$LayoutParams;
        r2.<init>(r6, r10);
        r1.addView(r3, r2);
    L_0x067e:
        r1 = r0.ab;
        if (r1 == 0) goto L_0x0685;
    L_0x0682:
        r14.setOnShowListener(r1);
    L_0x0685:
        r1 = r0.Z;
        if (r1 == 0) goto L_0x068c;
    L_0x0689:
        r14.setOnCancelListener(r1);
    L_0x068c:
        r1 = r0.Y;
        if (r1 == 0) goto L_0x0693;
    L_0x0690:
        r14.setOnDismissListener(r1);
    L_0x0693:
        r1 = r0.aa;
        if (r1 == 0) goto L_0x069a;
    L_0x0697:
        r14.setOnKeyListener(r1);
    L_0x069a:
        r14.a();
        r14.c();
        r1 = r14.a;
        r14.a(r1);
        r1 = r14.g;
        if (r1 == 0) goto L_0x06b5;
    L_0x06a9:
        r1 = r1.getViewTreeObserver();
        r2 = new com.afollestad.materialdialogs.k;
        r2.<init>(r14);
        r1.addOnGlobalLayoutListener(r2);
    L_0x06b5:
        r1 = r14.getWindow();
        r1 = r1.getWindowManager();
        r1 = r1.getDefaultDisplay();
        r2 = new android.graphics.Point;
        r2.<init>();
        r1.getSize(r2);
        r1 = r2.x;
        r2 = r2.y;
        r3 = r0.a;
        r3 = r3.getResources();
        r4 = com.afollestad.materialdialogs.R.dimen.md_dialog_vertical_margin;
        r3 = r3.getDimensionPixelSize(r4);
        r4 = r0.a;
        r4 = r4.getResources();
        r5 = com.afollestad.materialdialogs.R.dimen.md_dialog_horizontal_margin;
        r4 = r4.getDimensionPixelSize(r5);
        r0 = r0.a;
        r0 = r0.getResources();
        r5 = com.afollestad.materialdialogs.R.dimen.md_dialog_max_width;
        r0 = r0.getDimensionPixelSize(r5);
        r4 = r4 * 2;
        r1 = r1 - r4;
        r4 = r14.a;
        r3 = r3 * 2;
        r2 = r2 - r3;
        r4.setMaxHeight(r2);
        r2 = new android.view.WindowManager$LayoutParams;
        r2.<init>();
        r3 = r14.getWindow();
        r3 = r3.getAttributes();
        r2.copyFrom(r3);
        r0 = java.lang.Math.min(r0, r1);
        r2.width = r0;
        r14 = r14.getWindow();
        r14.setAttributes(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.g.a(com.afollestad.materialdialogs.j):void");
    }

    static int b(o oVar) {
        if (oVar.s != null) {
            return R.layout.md_dialog_custom;
        }
        if (oVar.l == null) {
            if (oVar.W == null) {
                return oVar.aj > -2 ? R.layout.md_dialog_progress : oVar.ah ? oVar.aA ? R.layout.md_dialog_progress_indeterminate_horizontal : R.layout.md_dialog_progress_indeterminate : oVar.an != null ? oVar.av != null ? R.layout.md_dialog_input_check : R.layout.md_dialog_input : oVar.av != null ? R.layout.md_dialog_basic_check : R.layout.md_dialog_basic;
            }
        }
        return oVar.av != null ? R.layout.md_dialog_list_check : R.layout.md_dialog_list;
    }
}
