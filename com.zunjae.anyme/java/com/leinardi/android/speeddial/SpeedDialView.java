package com.leinardi.android.speeddial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.R;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.AttachedBehavior;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.design.widget.CoordinatorLayout.LayoutParams;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.FloatingActionButton.OnVisibilityChangedListener;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import defpackage.tw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class SpeedDialView extends LinearLayout implements AttachedBehavior {
    private static final String a = "SpeedDialView";
    private final l b = new l();
    private List<FabWithLabelView> c = new ArrayList();
    private Drawable d = null;
    private Drawable e = null;
    private Drawable f;
    private FloatingActionButton g;
    private int h;
    private SpeedDialOverlayLayout i;
    private o j;
    private n k;
    private n l = new g(this);

    public class NoBehavior extends Behavior<View> {
        public NoBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public class SnackbarBehavior extends Behavior<View> {
        private Rect a;
        private OnVisibilityChangedListener b;
        private boolean c;

        public SnackbarBehavior() {
            this.c = true;
        }

        public SnackbarBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FloatingActionButton_Behavior_Layout);
            this.c = obtainStyledAttributes.getBoolean(R.styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        private static int a(AppBarLayout appBarLayout) {
            int minimumHeight = ViewCompat.getMinimumHeight(appBarLayout);
            if (minimumHeight != 0) {
                return minimumHeight * 2;
            }
            minimumHeight = appBarLayout.getChildCount();
            return minimumHeight > 0 ? ViewCompat.getMinimumHeight(appBarLayout.getChildAt(minimumHeight - 1)) * 2 : 0;
        }

        private boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            if (!a(appBarLayout, view)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            w.a((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
            if (rect.bottom <= a(appBarLayout)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
            return true;
        }

        private boolean a(View view, View view2) {
            return this.c && ((LayoutParams) view2.getLayoutParams()).getAnchorId() == view.getId() && view2.getVisibility() == 0;
        }

        private boolean b(View view, View view2) {
            if (!a(view, view2)) {
                return false;
            }
            if (view.getTop() < (view2.getHeight() / 2) + ((LayoutParams) view2.getLayoutParams()).topMargin) {
                b(view2);
            } else {
                a(view2);
            }
            return true;
        }

        private static boolean c(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            return layoutParams instanceof LayoutParams ? ((LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior : false;
        }

        protected final void a(View view) {
            if (view instanceof FloatingActionButton) {
                ((FloatingActionButton) view).show(this.b);
            } else if (view instanceof SpeedDialView) {
                ((SpeedDialView) view).a(this.b);
            } else {
                view.setVisibility(0);
            }
        }

        protected final void b(View view) {
            if (view instanceof FloatingActionButton) {
                ((FloatingActionButton) view).hide(this.b);
            } else if (view instanceof SpeedDialView) {
                ((SpeedDialView) view).b(this.b);
            } else {
                view.setVisibility(4);
            }
        }

        public void onAttachedToLayoutParams(LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                a(coordinatorLayout, (AppBarLayout) view2, view);
            } else if (c(view2)) {
                b(view2, view);
            }
            return false;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            List dependencies = coordinatorLayout.getDependencies(view);
            int size = dependencies.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) dependencies.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    if (c(view2) && b(view2, view)) {
                        break;
                    }
                } else if (a(coordinatorLayout, (AppBarLayout) view2, view)) {
                    break;
                }
            }
            coordinatorLayout.onLayoutChild(view, i);
            return true;
        }
    }

    public class ScrollingViewSnackbarBehavior extends SnackbarBehavior {
        private boolean a = false;

        public ScrollingViewSnackbarBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (!this.a && (view2 instanceof RecyclerView)) {
                RecyclerView recyclerView = (RecyclerView) view2;
                if (recyclerView.getAdapter() == null || recyclerView.getAdapter().getItemCount() == 0) {
                    a(view);
                    this.a = true;
                }
            }
            if (!(view2 instanceof RecyclerView)) {
                if (!super.layoutDependsOn(coordinatorLayout, view, view2)) {
                    return false;
                }
            }
            return true;
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
            super.onNestedScroll(coordinatorLayout, view, view2, i, i2, i3, i4, i5);
            this.a = false;
            if (i2 <= 0 || view.getVisibility() != 0) {
                if (i2 < 0) {
                    a(view);
                }
                return;
            }
            b(view);
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            return true;
        }
    }

    public SpeedDialView(Context context) {
        super(context);
        a(context, null);
    }

    public SpeedDialView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public SpeedDialView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    private int a(int i) {
        if (getExpansionMode() != 0) {
            if (getExpansionMode() != 2) {
                return i + 1;
            }
        }
        return this.c.size() - i;
    }

    private d a(FabWithLabelView fabWithLabelView, Iterator<FabWithLabelView> it, boolean z) {
        if (fabWithLabelView == null) {
            return null;
        }
        d speedDialActionItem = fabWithLabelView.getSpeedDialActionItem();
        if (it != null) {
            it.remove();
        } else {
            this.c.remove(fabWithLabelView);
        }
        if (this.b.a) {
            if (this.c.isEmpty()) {
                a(false, true);
            }
            if (z) {
                p.a((View) fabWithLabelView, true);
                return speedDialActionItem;
            }
        }
        removeView(fabWithLabelView);
        return speedDialActionItem;
    }

    private void a(int i, boolean z) {
        if (this.b.d != i || z) {
            this.b.d = i;
            switch (i) {
                case mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                case tw.a /*1*/:
                    setOrientation(1);
                    for (FabWithLabelView orientation : this.c) {
                        orientation.setOrientation(0);
                    }
                    break;
                case tw.b /*2*/:
                case f.c /*3*/:
                    setOrientation(0);
                    for (FabWithLabelView orientation2 : this.c) {
                        orientation2.setOrientation(1);
                    }
                    break;
                default:
                    break;
            }
            a(false, false);
            Collection actionItems = getActionItems();
            e();
            a(actionItems);
        }
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
        r0 = r3.f();
        r3.g = r0;
        r0 = r3.g;
        r3.addView(r0);
        r0 = 0;
        r3.setClipChildren(r0);
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 21;
        if (r1 < r2) goto L_0x0022;
    L_0x0015:
        r1 = r3.getResources();
        r2 = com.leinardi.android.speeddial.R.dimen.sd_close_elevation;
        r1 = r1.getDimension(r2);
        r3.setElevation(r1);
    L_0x0022:
        r1 = com.leinardi.android.speeddial.R.styleable.SpeedDialView;
        r5 = r4.obtainStyledAttributes(r5, r1, r0, r0);
        r0 = com.leinardi.android.speeddial.R.styleable.SpeedDialView_sdUseReverseAnimationOnClose;	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        r1 = r3.getUseReverseAnimationOnClose();	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        r0 = r5.getBoolean(r0, r1);	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        r3.setUseReverseAnimationOnClose(r0);	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        r0 = com.leinardi.android.speeddial.R.styleable.SpeedDialView_sdMainFabAnimationRotateAngle;	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        r1 = r3.getMainFabAnimationRotateAngle();	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        r0 = r5.getFloat(r0, r1);	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        r3.setMainFabAnimationRotateAngle(r0);	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        r0 = com.leinardi.android.speeddial.R.styleable.SpeedDialView_sdMainFabClosedSrc;	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        r1 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        r0 = r5.getResourceId(r0, r1);	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        if (r0 == r1) goto L_0x0057;	 Catch:{ Exception -> 0x009f, all -> 0x009a }
    L_0x004c:
        r2 = r3.getContext();	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        r0 = defpackage.bv.b(r2, r0);	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        r3.setMainFabClosedDrawable(r0);	 Catch:{ Exception -> 0x009f, all -> 0x009a }
    L_0x0057:
        r0 = com.leinardi.android.speeddial.R.styleable.SpeedDialView_sdMainFabOpenedSrc;	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        r0 = r5.getResourceId(r0, r1);	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        if (r0 == r1) goto L_0x0066;	 Catch:{ Exception -> 0x009f, all -> 0x009a }
    L_0x005f:
        r4 = defpackage.bv.b(r4, r0);	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        r3.setMainFabOpenedDrawable(r4);	 Catch:{ Exception -> 0x009f, all -> 0x009a }
    L_0x0066:
        r4 = com.leinardi.android.speeddial.R.styleable.SpeedDialView_sdExpansionMode;	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        r0 = r3.getExpansionMode();	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        r4 = r5.getInt(r4, r0);	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        r0 = 1;	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        r3.a(r4, r0);	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        r4 = com.leinardi.android.speeddial.R.styleable.SpeedDialView_sdMainFabClosedBackgroundColor;	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        r0 = r3.getMainFabClosedBackgroundColor();	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        r4 = r5.getColor(r4, r0);	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        r3.setMainFabClosedBackgroundColor(r4);	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        r4 = com.leinardi.android.speeddial.R.styleable.SpeedDialView_sdMainFabOpenedBackgroundColor;	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        r0 = r3.getMainFabOpenedBackgroundColor();	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        r4 = r5.getColor(r4, r0);	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        r3.setMainFabOpenedBackgroundColor(r4);	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        r4 = com.leinardi.android.speeddial.R.styleable.SpeedDialView_sdOverlayLayout;	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        r4 = r5.getResourceId(r4, r1);	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        r3.h = r4;	 Catch:{ Exception -> 0x009f, all -> 0x009a }
        r5.recycle();
        return;
    L_0x009a:
        r4 = move-exception;
        r5.recycle();
        throw r4;
    L_0x009f:
        r5.recycle();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leinardi.android.speeddial.SpeedDialView.a(android.content.Context, android.util.AttributeSet):void");
    }

    private void a(FabWithLabelView fabWithLabelView, int i) {
        ViewCompat.animate(fabWithLabelView).cancel();
        long j = (long) i;
        p.a(fabWithLabelView.getFab(), j);
        if (fabWithLabelView.a()) {
            CardView labelBackground = fabWithLabelView.getLabelBackground();
            ViewCompat.animate(labelBackground).cancel();
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.sd_fade_and_translate_in);
            loadAnimation.setStartOffset(j);
            labelBackground.startAnimation(loadAnimation);
        }
    }

    private void a(d dVar, int i, boolean z) {
        FabWithLabelView b = b(dVar.a());
        if (b != null) {
            a(b.getSpeedDialActionItem(), dVar);
            return;
        }
        FabWithLabelView b2 = b(dVar);
        addView(b2, a(i));
        this.c.add(i, b2);
        if (!this.b.a) {
            b2.setVisibility(8);
        } else if (z) {
            a(b2, 0);
        }
    }

    private void a(Collection<d> collection) {
        for (d a : collection) {
            a(a);
        }
    }

    private void a(boolean z) {
        if (this.b.a) {
            Drawable drawable = this.e;
            if (drawable != null) {
                this.g.setImageDrawable(drawable);
            }
            p.a(this.g, getMainFabAnimationRotateAngle(), z);
            return;
        }
        p.b(this.g, z);
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            this.g.setImageDrawable(drawable2);
        }
    }

    private void a(boolean z, boolean z2) {
        if (this.b.a != z) {
            this.b.a = z;
            a(z, z2, this.b.f);
            a(z2);
            g();
            b(z, z2);
        }
    }

    private void a(boolean z, boolean z2, boolean z3) {
        int size = this.c.size();
        int i;
        if (z) {
            for (i = 0; i < size; i++) {
                FabWithLabelView fabWithLabelView = (FabWithLabelView) this.c.get(i);
                fabWithLabelView.setAlpha(1.0f);
                fabWithLabelView.setVisibility(0);
                if (z2) {
                    a(fabWithLabelView, i * 25);
                }
            }
            return;
        }
        i = 0;
        while (i < size) {
            View view = (FabWithLabelView) this.c.get(z3 ? (size - 1) - i : i);
            if (!z2) {
                view.setAlpha(0.0f);
                view.setVisibility(8);
            } else if (z3) {
                b((FabWithLabelView) view, i * 25);
            } else {
                p.a(view, false);
            }
            i++;
        }
    }

    private boolean a(d dVar, d dVar2) {
        if (dVar == null) {
            return false;
        }
        FabWithLabelView b = b(dVar.a());
        if (b == null) {
            return false;
        }
        int indexOf = this.c.indexOf(b);
        if (indexOf < 0) {
            return false;
        }
        a(b(dVar2.a()), null, false);
        a(b(dVar.a()), null, false);
        a(dVar2, indexOf, false);
        return true;
    }

    private FabWithLabelView b(int i) {
        for (FabWithLabelView fabWithLabelView : this.c) {
            if (fabWithLabelView.getId() == i) {
                return fabWithLabelView;
            }
        }
        return null;
    }

    private FabWithLabelView b(d dVar) {
        int h = dVar.h();
        FabWithLabelView fabWithLabelView = h == Integer.MIN_VALUE ? new FabWithLabelView(getContext()) : new FabWithLabelView(new ContextThemeWrapper(getContext(), h), null, h);
        fabWithLabelView.setSpeedDialActionItem(dVar);
        int i = 1;
        if (getOrientation() == 1) {
            i = 0;
        }
        fabWithLabelView.setOrientation(i);
        fabWithLabelView.setOnActionSelectedListener(this.l);
        return fabWithLabelView;
    }

    private void b(FabWithLabelView fabWithLabelView, int i) {
        ViewCompat.animate(fabWithLabelView).cancel();
        long j = (long) i;
        p.b(fabWithLabelView.getFab(), j);
        if (fabWithLabelView.a()) {
            CardView labelBackground = fabWithLabelView.getLabelBackground();
            ViewCompat.animate(labelBackground).cancel();
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.sd_fade_and_translate_out);
            loadAnimation.setAnimationListener(new k(this, labelBackground));
            loadAnimation.setStartOffset(j);
            labelBackground.startAnimation(loadAnimation);
        }
    }

    private void b(boolean z, boolean z2) {
        SpeedDialOverlayLayout speedDialOverlayLayout = this.i;
        if (speedDialOverlayLayout != null) {
            if (z) {
                speedDialOverlayLayout.a(z2);
                return;
            }
            speedDialOverlayLayout.b(z2);
        }
    }

    private void e() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            a((FabWithLabelView) it.next(), it, true);
        }
    }

    private FloatingActionButton f() {
        FloatingActionButton floatingActionButton = new FloatingActionButton(getContext());
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388613;
        int a = p.a(getContext(), 4.0f);
        int a2 = p.a(getContext(), -2.0f);
        layoutParams.setMargins(a, a2, a, a2);
        floatingActionButton.setUseCompatPadding(true);
        floatingActionButton.setLayoutParams(layoutParams);
        floatingActionButton.setClickable(true);
        floatingActionButton.setFocusable(true);
        floatingActionButton.setSize(0);
        floatingActionButton.setOnClickListener(new j(this));
        return floatingActionButton;
    }

    private void g() {
        int mainFabOpenedBackgroundColor = this.b.a ? getMainFabOpenedBackgroundColor() : getMainFabClosedBackgroundColor();
        if (mainFabOpenedBackgroundColor != Integer.MIN_VALUE) {
            this.g.setBackgroundTintList(ColorStateList.valueOf(mainFabOpenedBackgroundColor));
        } else {
            this.g.setBackgroundTintList(ColorStateList.valueOf(p.b(getContext())));
        }
    }

    public final void a() {
        a(true, true);
    }

    public final void a(OnVisibilityChangedListener onVisibilityChangedListener) {
        setVisibility(0);
        this.g.show(onVisibilityChangedListener);
    }

    public final void a(d dVar) {
        a(dVar, this.c.size(), true);
    }

    public final void b() {
        a(false, true);
    }

    public final void b(OnVisibilityChangedListener onVisibilityChangedListener) {
        if (this.b.a) {
            a(false, true);
            ViewCompat.animate(this.g).rotation(0.0f).setDuration(0).start();
        }
        this.g.hide(new h(this, onVisibilityChangedListener));
    }

    public final void c() {
        a(false, false);
    }

    public final boolean d() {
        return this.b.a;
    }

    public ArrayList<d> getActionItems() {
        ArrayList<d> arrayList = new ArrayList(this.c.size());
        for (FabWithLabelView speedDialActionItem : this.c) {
            arrayList.add(speedDialActionItem.getSpeedDialActionItem());
        }
        return arrayList;
    }

    public Behavior getBehavior() {
        return new SnackbarBehavior();
    }

    public int getExpansionMode() {
        return this.b.d;
    }

    public FloatingActionButton getMainFab() {
        return this.g;
    }

    public float getMainFabAnimationRotateAngle() {
        return this.b.e;
    }

    public int getMainFabClosedBackgroundColor() {
        return this.b.b;
    }

    public int getMainFabOpenedBackgroundColor() {
        return this.b.c;
    }

    public SpeedDialOverlayLayout getOverlayLayout() {
        return this.i;
    }

    public boolean getUseReverseAnimationOnClose() {
        return this.b.f;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.i == null) {
            setOverlayLayout((SpeedDialOverlayLayout) getRootView().findViewById(this.h));
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            l lVar = (l) bundle.getParcelable(l.class.getName());
            if (!(lVar == null || lVar.g == null || lVar.g.isEmpty())) {
                setUseReverseAnimationOnClose(lVar.f);
                setMainFabAnimationRotateAngle(lVar.e);
                setMainFabOpenedBackgroundColor(lVar.c);
                setMainFabClosedBackgroundColor(lVar.b);
                a(lVar.d, true);
                a(lVar.g);
                a(lVar.a, false);
            }
            parcelable = bundle.getParcelable("superState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        this.b.g = getActionItems();
        bundle.putParcelable(l.class.getName(), this.b);
        bundle.putParcelable("superState", super.onSaveInstanceState());
        return bundle;
    }

    public void setExpansionMode(int i) {
        a(i, false);
    }

    public void setMainFabAnimationRotateAngle(float f) {
        this.b.e = f;
        setMainFabOpenedDrawable(this.f);
    }

    public void setMainFabClosedBackgroundColor(int i) {
        this.b.b = i;
        g();
    }

    public void setMainFabClosedDrawable(Drawable drawable) {
        this.d = drawable;
        a(false);
    }

    public void setMainFabOpenedBackgroundColor(int i) {
        this.b.c = i;
        g();
    }

    public void setMainFabOpenedDrawable(Drawable drawable) {
        this.f = drawable;
        drawable = this.f;
        if (drawable == null) {
            drawable = null;
        } else {
            float f = -getMainFabAnimationRotateAngle();
            if (f != 0.0f) {
                drawable = new u(new Drawable[]{drawable}, f, drawable);
            }
        }
        this.e = drawable;
        a(false);
    }

    public void setOnActionSelectedListener(n nVar) {
        this.k = nVar;
        for (int i = 0; i < this.c.size(); i++) {
            ((FabWithLabelView) this.c.get(i)).setOnActionSelectedListener(this.l);
        }
    }

    public void setOnChangeListener(o oVar) {
        this.j = oVar;
    }

    public void setOrientation(int i) {
        super.setOrientation(i);
    }

    public void setOverlayLayout(SpeedDialOverlayLayout speedDialOverlayLayout) {
        if (this.i != null) {
            setOnClickListener(null);
        }
        this.i = speedDialOverlayLayout;
        if (speedDialOverlayLayout != null) {
            speedDialOverlayLayout.setOnClickListener(new i(this));
            b(this.b.a, false);
        }
    }

    public void setUseReverseAnimationOnClose(boolean z) {
        this.b.f = z;
    }
}
