package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import com.rd.pageindicatorview.R;

public final class ahl {
    private ahq a;

    public ahl(ahq ahq) {
        this.a = ahq;
    }

    public final void a(Context context, AttributeSet attributeSet) {
        ago ago;
        ahu ahu;
        int i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PageIndicatorView, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.PageIndicatorView_piv_viewPager, -1);
        boolean z = obtainStyledAttributes.getBoolean(R.styleable.PageIndicatorView_piv_autoVisibility, true);
        boolean z2 = obtainStyledAttributes.getBoolean(R.styleable.PageIndicatorView_piv_dynamicCount, false);
        int i2 = obtainStyledAttributes.getInt(R.styleable.PageIndicatorView_piv_count, -1);
        if (i2 == -1) {
            i2 = 3;
        }
        int i3 = obtainStyledAttributes.getInt(R.styleable.PageIndicatorView_piv_select, 0);
        if (i3 < 0) {
            i3 = 0;
        } else if (i2 > 0) {
            int i4 = i2 - 1;
            if (i3 > i4) {
                i3 = i4;
            }
        }
        this.a.p(resourceId);
        this.a.b(z);
        this.a.c(z2);
        this.a.o(i2);
        this.a.l(i3);
        this.a.m(i3);
        this.a.n(i3);
        resourceId = obtainStyledAttributes.getColor(R.styleable.PageIndicatorView_piv_unselectedColor, Color.parseColor("#33ffffff"));
        i3 = obtainStyledAttributes.getColor(R.styleable.PageIndicatorView_piv_selectedColor, Color.parseColor("#ffffff"));
        this.a.j(resourceId);
        this.a.k(i3);
        boolean z3 = obtainStyledAttributes.getBoolean(R.styleable.PageIndicatorView_piv_interactiveAnimation, false);
        i3 = obtainStyledAttributes.getInt(R.styleable.PageIndicatorView_piv_animationDuration, 350);
        if (i3 < 0) {
            i3 = 0;
        }
        switch (obtainStyledAttributes.getInt(R.styleable.PageIndicatorView_piv_animationType, ago.NONE.ordinal())) {
            case tw.a /*1*/:
                ago = ago.COLOR;
                break;
            case tw.b /*2*/:
                ago = ago.SCALE;
                break;
            case f.c /*3*/:
                ago = ago.WORM;
                break;
            case mh.d /*4*/:
                ago = ago.SLIDE;
                break;
            case mh.e /*5*/:
                ago = ago.FILL;
                break;
            case mh.f /*6*/:
                ago = ago.THIN_WORM;
                break;
            case mh.g /*7*/:
                ago = ago.DROP;
                break;
            case mh.h /*8*/:
                ago = ago.SWAP;
                break;
            case mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_disabledTextColor /*9*/:
                ago = ago.SCALE_DOWN;
                break;
            default:
                ago = ago.NONE;
                break;
        }
        switch (obtainStyledAttributes.getInt(R.styleable.PageIndicatorView_piv_rtl_mode, ahu.Off.ordinal())) {
            case mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                ahu = ahu.On;
                break;
            case tw.a /*1*/:
                ahu = ahu.Off;
                break;
            default:
                ahu = ahu.Auto;
                break;
        }
        this.a.a((long) i3);
        this.a.a(z3);
        this.a.a(ago);
        this.a.a(ahu);
        ahr ahr = obtainStyledAttributes.getInt(R.styleable.PageIndicatorView_piv_orientation, ahr.HORIZONTAL.ordinal()) == 0 ? ahr.HORIZONTAL : ahr.VERTICAL;
        i3 = (int) obtainStyledAttributes.getDimension(R.styleable.PageIndicatorView_piv_radius, (float) aii.a(6));
        if (i3 < 0) {
            i3 = 0;
        }
        int dimension = (int) obtainStyledAttributes.getDimension(R.styleable.PageIndicatorView_piv_padding, (float) aii.a(8));
        if (dimension < 0) {
            dimension = 0;
        }
        float f = obtainStyledAttributes.getFloat(R.styleable.PageIndicatorView_piv_scaleFactor, 0.7f);
        if (f < 0.3f) {
            f = 0.3f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        int dimension2 = (int) obtainStyledAttributes.getDimension(R.styleable.PageIndicatorView_piv_strokeWidth, (float) aii.a(1));
        if (dimension2 > i3) {
            dimension2 = i3;
        }
        if (this.a.t() == ago.FILL) {
            i = dimension2;
        }
        this.a.c(i3);
        this.a.a(ahr);
        this.a.d(dimension);
        this.a.a(f);
        this.a.i(i);
        obtainStyledAttributes.recycle();
    }
}
