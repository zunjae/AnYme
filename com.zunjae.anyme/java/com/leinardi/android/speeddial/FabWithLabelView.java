package com.leinardi.android.speeddial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.widget.CardView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FabWithLabelView extends LinearLayout {
    private static final String a = "FabWithLabelView";
    private TextView b;
    private FloatingActionButton c;
    private CardView d;
    private boolean e;
    private d f;
    private n g;
    private int h;
    private float i;
    private Drawable j;

    public FabWithLabelView(Context context) {
        super(context);
        a(context, null);
    }

    public FabWithLabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public FabWithLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    private void a(android.content.Context r6, android.util.AttributeSet r7) {
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
        r5 = this;
        r0 = com.leinardi.android.speeddial.R.layout.sd_fab_with_label_view;
        r0 = inflate(r6, r0, r5);
        r1 = com.leinardi.android.speeddial.R.id.fab;
        r1 = r0.findViewById(r1);
        r1 = (android.support.design.widget.FloatingActionButton) r1;
        r5.c = r1;
        r1 = com.leinardi.android.speeddial.R.id.label;
        r1 = r0.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r5.b = r1;
        r1 = com.leinardi.android.speeddial.R.id.label_container;
        r0 = r0.findViewById(r1);
        r0 = (android.support.v7.widget.CardView) r0;
        r5.d = r0;
        r0 = 1;
        r5.setFabSize(r0);
        r1 = 0;
        r5.setOrientation(r1);
        r5.setClipChildren(r1);
        r5.setClipToPadding(r1);
        r2 = com.leinardi.android.speeddial.R.styleable.FabWithLabelView;
        r7 = r6.obtainStyledAttributes(r7, r2, r1, r1);
        r1 = com.leinardi.android.speeddial.R.styleable.FabWithLabelView_srcCompat;	 Catch:{ Exception -> 0x0092, all -> 0x008d }
        r2 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;	 Catch:{ Exception -> 0x0092, all -> 0x008d }
        r1 = r7.getResourceId(r1, r2);	 Catch:{ Exception -> 0x0092, all -> 0x008d }
        if (r1 != r2) goto L_0x0048;	 Catch:{ Exception -> 0x0092, all -> 0x008d }
    L_0x0042:
        r1 = com.leinardi.android.speeddial.R.styleable.FabWithLabelView_android_src;	 Catch:{ Exception -> 0x0092, all -> 0x008d }
        r1 = r7.getResourceId(r1, r2);	 Catch:{ Exception -> 0x0092, all -> 0x008d }
    L_0x0048:
        r3 = new com.leinardi.android.speeddial.f;	 Catch:{ Exception -> 0x0092, all -> 0x008d }
        r4 = r5.getId();	 Catch:{ Exception -> 0x0092, all -> 0x008d }
        r3.<init>(r4, r1);	 Catch:{ Exception -> 0x0092, all -> 0x008d }
        r1 = com.leinardi.android.speeddial.R.styleable.FabWithLabelView_fabLabel;	 Catch:{ Exception -> 0x0092, all -> 0x008d }
        r1 = r7.getString(r1);	 Catch:{ Exception -> 0x0092, all -> 0x008d }
        r3.a(r1);	 Catch:{ Exception -> 0x0092, all -> 0x008d }
        r6 = com.leinardi.android.speeddial.p.a(r6);	 Catch:{ Exception -> 0x0092, all -> 0x008d }
        r1 = com.leinardi.android.speeddial.R.styleable.FabWithLabelView_fabBackgroundColor;	 Catch:{ Exception -> 0x0092, all -> 0x008d }
        r6 = r7.getColor(r1, r6);	 Catch:{ Exception -> 0x0092, all -> 0x008d }
        r3.a(r6);	 Catch:{ Exception -> 0x0092, all -> 0x008d }
        r6 = com.leinardi.android.speeddial.R.styleable.FabWithLabelView_fabLabelColor;	 Catch:{ Exception -> 0x0092, all -> 0x008d }
        r6 = r7.getColor(r6, r2);	 Catch:{ Exception -> 0x0092, all -> 0x008d }
        r3.b(r6);	 Catch:{ Exception -> 0x0092, all -> 0x008d }
        r6 = com.leinardi.android.speeddial.R.styleable.FabWithLabelView_fabLabelBackgroundColor;	 Catch:{ Exception -> 0x0092, all -> 0x008d }
        r6 = r7.getColor(r6, r2);	 Catch:{ Exception -> 0x0092, all -> 0x008d }
        r3.c(r6);	 Catch:{ Exception -> 0x0092, all -> 0x008d }
        r6 = com.leinardi.android.speeddial.R.styleable.FabWithLabelView_fabLabelClickable;	 Catch:{ Exception -> 0x0092, all -> 0x008d }
        r6 = r7.getBoolean(r6, r0);	 Catch:{ Exception -> 0x0092, all -> 0x008d }
        r3.a(r6);	 Catch:{ Exception -> 0x0092, all -> 0x008d }
        r6 = r3.a();	 Catch:{ Exception -> 0x0092, all -> 0x008d }
        r5.setSpeedDialActionItem(r6);	 Catch:{ Exception -> 0x0092, all -> 0x008d }
        r7.recycle();
        return;
    L_0x008d:
        r6 = move-exception;
        r7.recycle();
        throw r6;
    L_0x0092:
        r7.recycle();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leinardi.android.speeddial.FabWithLabelView.a(android.content.Context, android.util.AttributeSet):void");
    }

    private void setFabBackgroundColor(int i) {
        this.c.setBackgroundTintList(ColorStateList.valueOf(i));
    }

    private void setFabIcon(Drawable drawable) {
        this.c.setImageDrawable(drawable);
    }

    private void setFabSize(int i) {
        LayoutParams layoutParams;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.sd_fab_normal_size);
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(R.dimen.sd_fab_mini_size);
        int dimensionPixelSize3 = getContext().getResources().getDimensionPixelSize(R.dimen.sd_fab_side_margin);
        int i2 = i == 0 ? dimensionPixelSize : dimensionPixelSize2;
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.c.getLayoutParams();
        if (getOrientation() == 0) {
            layoutParams = new LinearLayout.LayoutParams(-2, i2);
            layoutParams.gravity = 8388613;
            if (i == 0) {
                dimensionPixelSize3 -= (dimensionPixelSize - dimensionPixelSize2) / 2;
            }
            layoutParams2.setMargins(dimensionPixelSize3, 0, dimensionPixelSize3, 0);
        } else {
            layoutParams = new LinearLayout.LayoutParams(i2, -2);
            layoutParams.gravity = 16;
            layoutParams2.setMargins(0, 0, 0, 0);
        }
        setLayoutParams(layoutParams);
        this.c.setLayoutParams(layoutParams2);
        this.h = i;
    }

    private void setLabel(CharSequence charSequence) {
        boolean z = false;
        if (TextUtils.isEmpty(charSequence)) {
            setLabelEnabled(false);
            return;
        }
        this.b.setText(charSequence);
        if (getOrientation() == 0) {
            z = true;
        }
        setLabelEnabled(z);
    }

    private void setLabelBackgroundColor(int i) {
        if (i == 0) {
            this.d.setCardBackgroundColor(0);
            if (VERSION.SDK_INT >= 21) {
                this.i = this.d.getElevation();
                this.d.setElevation(0.0f);
                return;
            }
            this.d.setBackgroundColor(0);
            this.j = this.d.getBackground();
            return;
        }
        this.d.setCardBackgroundColor(ColorStateList.valueOf(i));
        i = VERSION.SDK_INT;
        if (i >= 21) {
            float f = this.i;
            if (f != 0.0f) {
                this.d.setElevation(f);
                this.i = 0.0f;
                return;
            }
        }
        Drawable drawable = this.j;
        if (drawable != null) {
            if (i >= 16) {
                this.d.setBackground(drawable);
            } else {
                this.d.setBackgroundDrawable(drawable);
            }
            this.j = null;
        }
    }

    private void setLabelClickable(boolean z) {
        getLabelBackground().setClickable(z);
        getLabelBackground().setFocusable(z);
        getLabelBackground().setEnabled(z);
    }

    private void setLabelColor(int i) {
        this.b.setTextColor(i);
    }

    private void setLabelEnabled(boolean z) {
        this.e = z;
        this.d.setVisibility(z ? 0 : 8);
    }

    public final boolean a() {
        return this.e;
    }

    public FloatingActionButton getFab() {
        return this.c;
    }

    public CardView getLabelBackground() {
        return this.d;
    }

    public d getSpeedDialActionItem() {
        return this.f;
    }

    public void setOnActionSelectedListener(n nVar) {
        CardView labelBackground;
        OnClickListener cVar;
        this.g = nVar;
        if (this.g != null) {
            setOnClickListener(new a(this));
            getFab().setOnClickListener(new b(this));
            labelBackground = getLabelBackground();
            cVar = new c(this);
        } else {
            cVar = null;
            getFab().setOnClickListener(null);
            labelBackground = getLabelBackground();
        }
        labelBackground.setOnClickListener(cVar);
    }

    public void setOrientation(int i) {
        super.setOrientation(i);
        setFabSize(this.h);
        if (i == 1) {
            setLabelEnabled(false);
        } else {
            setLabel(this.b.getText().toString());
        }
    }

    public void setSpeedDialActionItem(d dVar) {
        FloatingActionButton fab;
        this.f = dVar;
        setId(dVar.a());
        setLabel(dVar.b());
        d speedDialActionItem = getSpeedDialActionItem();
        int i = 1;
        boolean z = speedDialActionItem != null && speedDialActionItem.g();
        setLabelClickable(z);
        int c = dVar.c();
        Drawable a = dVar.a(getContext());
        if (!(a == null || c == Integer.MIN_VALUE)) {
            a = DrawableCompat.wrap(a);
            DrawableCompat.setTint(a.mutate(), c);
        }
        setFabIcon(a);
        c = dVar.d();
        if (c == Integer.MIN_VALUE) {
            c = p.a(getContext());
        }
        setFabBackgroundColor(c);
        c = dVar.e();
        if (c == Integer.MIN_VALUE) {
            c = ResourcesCompat.getColor(getResources(), R.color.sd_label_text_color, getContext().getTheme());
        }
        setLabelColor(c);
        c = dVar.f();
        if (c == Integer.MIN_VALUE) {
            c = ResourcesCompat.getColor(getResources(), R.color.cardview_light_background, getContext().getTheme());
        }
        setLabelBackgroundColor(c);
        if (dVar.i() == -1) {
            fab = getFab();
        } else {
            fab = getFab();
            i = dVar.i();
        }
        fab.setSize(i);
        setFabSize(dVar.i());
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        getFab().setVisibility(i);
        if (this.e) {
            getLabelBackground().setVisibility(i);
        }
    }
}
