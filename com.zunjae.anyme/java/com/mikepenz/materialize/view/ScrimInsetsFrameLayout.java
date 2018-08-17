package com.mikepenz.materialize.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.mikepenz.materialize.R;

public class ScrimInsetsFrameLayout extends FrameLayout implements a {
    private Drawable a;
    private Rect b;
    private Rect c = new Rect();
    private b d;
    private boolean e = true;
    private boolean f = true;
    private boolean g = true;

    public ScrimInsetsFrameLayout(Context context) {
        super(context);
        a(context, null, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ScrimInsetsView, i, R.style.Widget_Materialize_ScrimInsetsRelativeLayout);
        this.a = obtainStyledAttributes.getDrawable(R.styleable.ScrimInsetsView_siv_insetForeground);
        obtainStyledAttributes.recycle();
        setWillNotDraw(true);
        ViewCompat.setOnApplyWindowInsetsListener(this, new c(this));
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.b != null && this.a != null) {
            Rect rect;
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            if (!this.g) {
                rect = this.b;
                rect.top = 0;
                rect.right = 0;
                rect.bottom = 0;
                rect.left = 0;
            }
            if (this.e) {
                this.c.set(0, 0, width, this.b.top);
                this.a.setBounds(this.c);
                this.a.draw(canvas);
            }
            if (this.f) {
                this.c.set(0, height - this.b.bottom, width, height);
                this.a.setBounds(this.c);
                this.a.draw(canvas);
            }
            rect = this.c;
            Rect rect2 = this.b;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.a.setBounds(this.c);
            this.a.draw(canvas);
            rect = this.c;
            Rect rect3 = this.b;
            rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
            this.a.setBounds(this.c);
            this.a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public Drawable getInsetForeground() {
        return this.a;
    }

    public b getOnInsetsCallback() {
        return this.d;
    }

    public ViewGroup getView() {
        return this;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setInsetForeground(int i) {
        this.a = new ColorDrawable(i);
    }

    public void setInsetForeground(Drawable drawable) {
        this.a = drawable;
    }

    public void setOnInsetsCallback(b bVar) {
        this.d = bVar;
    }

    public void setSystemUIVisible(boolean z) {
        this.g = z;
    }

    public void setTintNavigationBar(boolean z) {
        this.f = z;
    }

    public void setTintStatusBar(boolean z) {
        this.e = z;
    }
}
