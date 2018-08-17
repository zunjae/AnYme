package com.github.ivbaranov.mfb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;

public class MaterialFavoriteButton extends ImageView {
    private static final int a = R.drawable.ic_star_black_24dp;
    private static final int b = R.drawable.ic_star_border_black_24dp;
    private static final int c = R.drawable.ic_star_white_24dp;
    private static final int d = R.drawable.ic_star_border_white_24dp;
    private static final int e = R.drawable.ic_favorite_black_24dp;
    private static final int f = R.drawable.ic_favorite_border_black_24dp;
    private static final int g = R.drawable.ic_favorite_white_24dp;
    private static final int h = R.drawable.ic_favorite_border_white_24dp;
    private static final AccelerateInterpolator i = new AccelerateInterpolator();
    private static final OvershootInterpolator j = new OvershootInterpolator(4.0f);
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private e w;
    private d x;
    private boolean y;

    public MaterialFavoriteButton(Context context) {
        super(context);
        a(context, null);
    }

    public MaterialFavoriteButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public MaterialFavoriteButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    private static TypedArray a(Context context, AttributeSet attributeSet, int[] iArr) {
        return context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    private void a(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                this.p = a;
                i = b;
            } else {
                this.p = e;
                i = f;
            }
        } else if (i2 == 0) {
            this.p = c;
            i = d;
        } else {
            this.p = g;
            i = h;
        }
        this.q = i;
    }

    private void a(Context context, AttributeSet attributeSet) {
        this.k = f.a(48.0f, getResources());
        this.l = f.a(12.0f, getResources());
        this.m = false;
        this.n = true;
        this.o = false;
        this.p = a;
        this.q = b;
        this.r = 400;
        this.s = 360;
        this.t = 300;
        this.u = 0;
        this.v = 0;
        if (!isInEditMode()) {
            if (attributeSet != null) {
                b(context, attributeSet);
            }
            setOnClickListener(new a(this));
        }
        setImageResource(this.m ? this.p : this.q);
        int i = this.l;
        setPadding(i, i, i, i);
    }

    private void a(boolean z) {
        int i;
        float f;
        if (z) {
            i = this.s;
            f = 0.2f;
        } else {
            i = -this.s;
            f = 1.3f;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        Animator ofFloat = ObjectAnimator.ofFloat(this, "rotation", new float[]{0.0f, (float) i});
        ofFloat.setDuration((long) this.r);
        ofFloat.setInterpolator(i);
        Animator ofFloat2 = ObjectAnimator.ofFloat(this, "scaleX", new float[]{f, 1.0f});
        ofFloat2.setDuration((long) this.t);
        ofFloat2.setInterpolator(j);
        Animator ofFloat3 = ObjectAnimator.ofFloat(this, "scaleY", new float[]{f, 1.0f});
        ofFloat3.setDuration((long) this.t);
        ofFloat3.setInterpolator(j);
        ofFloat3.addListener(new b(this));
        animatorSet.play(ofFloat);
        animatorSet.play(ofFloat2).with(ofFloat3).after(ofFloat);
        animatorSet.addListener(new c(this));
        animatorSet.start();
    }

    private void b(Context context, AttributeSet attributeSet) {
        TypedArray a = a(context, attributeSet, R.styleable.MaterialFavoriteButton);
        if (a != null) {
            try {
                this.k = f.a((float) a.getInt(R.styleable.MaterialFavoriteButton_mfb_size, 48), getResources());
                this.n = a.getBoolean(R.styleable.MaterialFavoriteButton_mfb_animate_favorite, this.n);
                this.o = a.getBoolean(R.styleable.MaterialFavoriteButton_mfb_animate_unfavorite, this.o);
                this.l = f.a((float) a.getInt(R.styleable.MaterialFavoriteButton_mfb_padding, 12), getResources());
                if (a.getResourceId(R.styleable.MaterialFavoriteButton_mfb_favorite_image, 0) == 0 || a.getResourceId(R.styleable.MaterialFavoriteButton_mfb_not_favorite_image, 0) == 0) {
                    a(a.getInt(R.styleable.MaterialFavoriteButton_mfb_color, 0), a.getInt(R.styleable.MaterialFavoriteButton_mfb_type, 0));
                } else {
                    this.p = a.getResourceId(R.styleable.MaterialFavoriteButton_mfb_favorite_image, a);
                    this.q = a.getResourceId(R.styleable.MaterialFavoriteButton_mfb_not_favorite_image, b);
                }
                this.r = a.getInt(R.styleable.MaterialFavoriteButton_mfb_rotation_duration, this.r);
                this.s = a.getInt(R.styleable.MaterialFavoriteButton_mfb_rotation_angle, this.s);
                this.t = a.getInt(R.styleable.MaterialFavoriteButton_mfb_bounce_duration, this.t);
            } finally {
                a.recycle();
            }
        }
    }

    public final boolean a() {
        return this.m;
    }

    public final void b() {
        setFavorite(this.m ^ 1);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        i = this.k;
        setMeasuredDimension(i, i);
    }

    public void setAnimateFavorite(boolean z) {
        this.n = z;
    }

    public void setAnimateUnfavorite(boolean z) {
        this.o = z;
    }

    public void setBounceDuration(int i) {
        this.t = i;
    }

    public void setColor(int i) {
        this.u = i;
        a(i, this.v);
    }

    public void setFavorite(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (!this.y) {
                this.y = true;
                if (z) {
                    if (!this.n) {
                        super.setImageResource(this.p);
                        d dVar = this.x;
                        this.y = false;
                    }
                } else if (!this.o) {
                    super.setImageResource(this.q);
                    this.y = false;
                }
                a(z);
                this.y = false;
            }
        }
    }

    public void setFavoriteResource(int i) {
        this.p = i;
    }

    public void setNotFavoriteResource(int i) {
        this.q = i;
    }

    public void setOnFavoriteAnimationEndListener(d dVar) {
        this.x = dVar;
    }

    public void setOnFavoriteChangeListener(e eVar) {
        this.w = eVar;
    }

    public void setPadding(int i) {
        this.l = f.a((float) i, getResources());
        i = this.l;
        setPadding(i, i, i, i);
    }

    public void setRotationAngle(int i) {
        this.s = i;
    }

    public void setRotationDuration(int i) {
        this.r = i;
    }

    public void setSize(int i) {
        this.k = f.a((float) i, getResources());
    }

    public void setType(int i) {
        this.v = i;
        a(this.u, i);
    }
}
