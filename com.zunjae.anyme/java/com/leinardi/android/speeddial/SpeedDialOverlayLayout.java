package com.leinardi.android.speeddial;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

public class SpeedDialOverlayLayout extends RelativeLayout {
    private static final String a = "SpeedDialOverlayLayout";
    private boolean b;
    private int c;
    private OnClickListener d;

    public SpeedDialOverlayLayout(Context context) {
        super(context);
    }

    public SpeedDialOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public SpeedDialOverlayLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    private void a(android.content.Context r4, android.util.AttributeSet r5) {
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
        r3 = this;
        r0 = r4.getTheme();
        r1 = com.leinardi.android.speeddial.R.styleable.SpeedDialOverlayLayout;
        r2 = 0;
        r5 = r0.obtainStyledAttributes(r5, r1, r2, r2);
        r0 = r3.getResources();
        r1 = com.leinardi.android.speeddial.R.color.sd_overlay_color;
        r4 = r4.getTheme();
        r4 = android.support.v4.content.res.ResourcesCompat.getColor(r0, r1, r4);
        r0 = com.leinardi.android.speeddial.R.styleable.SpeedDialOverlayLayout_android_background;	 Catch:{ Exception -> 0x002e, all -> 0x0029 }
        r0 = r5.getColor(r0, r4);	 Catch:{ Exception -> 0x002e, all -> 0x0029 }
        r4 = com.leinardi.android.speeddial.R.styleable.SpeedDialOverlayLayout_clickable_overlay;	 Catch:{ Exception -> 0x002f, all -> 0x0029 }
        r1 = 1;	 Catch:{ Exception -> 0x002f, all -> 0x0029 }
        r4 = r5.getBoolean(r4, r1);	 Catch:{ Exception -> 0x002f, all -> 0x0029 }
        r3.b = r4;	 Catch:{ Exception -> 0x002f, all -> 0x0029 }
        goto L_0x002f;
    L_0x0029:
        r4 = move-exception;
        r5.recycle();
        throw r4;
    L_0x002e:
        r0 = r4;
    L_0x002f:
        r5.recycle();
        r4 = android.os.Build.VERSION.SDK_INT;
        r5 = 21;
        if (r4 < r5) goto L_0x0045;
    L_0x0038:
        r4 = r3.getResources();
        r5 = com.leinardi.android.speeddial.R.dimen.sd_overlay_elevation;
        r4 = r4.getDimension(r5);
        r3.setElevation(r4);
    L_0x0045:
        r3.setBackgroundColor(r0);
        r4 = 8;
        r3.setVisibility(r4);
        r4 = r3.getResources();
        r5 = 17694722; // 0x10e0002 float:2.6081287E-38 double:8.7423543E-317;
        r4 = r4.getInteger(r5);
        r3.c = r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leinardi.android.speeddial.SpeedDialOverlayLayout.a(android.content.Context, android.util.AttributeSet):void");
    }

    public final void a(boolean z) {
        if (z) {
            ViewCompat.animate(this).cancel();
            setAlpha(0.0f);
            setVisibility(0);
            ViewCompat.animate(this).alpha(1.0f).withLayer().setDuration((long) getContext().getResources().getInteger(R.integer.sd_open_animation_duration)).setInterpolator(new FastOutSlowInInterpolator()).start();
            return;
        }
        setVisibility(0);
    }

    public final void b(boolean z) {
        if (z) {
            ViewCompat.animate(this).cancel();
            setAlpha(1.0f);
            setVisibility(0);
            ViewCompat.animate(this).alpha(0.0f).withLayer().setDuration((long) getContext().getResources().getInteger(R.integer.sd_close_animation_duration)).setInterpolator(new FastOutSlowInInterpolator()).withEndAction(new q(this)).start();
            return;
        }
        setVisibility(8);
    }

    public void setAnimationDuration(int i) {
        this.c = i;
    }

    public void setClickableOverlay(boolean z) {
        this.b = z;
        setOnClickListener(this.d);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.d = onClickListener;
        if (!this.b) {
            onClickListener = null;
        }
        super.setOnClickListener(onClickListener);
    }
}
