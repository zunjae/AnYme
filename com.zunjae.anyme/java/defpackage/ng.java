package defpackage;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

public final class ng extends js {
    private js a;
    private nh b;
    private boolean c;

    public ng(js jsVar, int i) {
        this(new nh(jsVar.getConstantState(), i), jsVar, null);
    }

    ng(nh nhVar, js jsVar, Resources resources) {
        this.b = nhVar;
        if (jsVar == null) {
            this.a = (js) (resources != null ? nhVar.a.newDrawable(resources) : nhVar.a.newDrawable());
        } else {
            this.a = jsVar;
        }
    }

    public final void a(int i) {
        this.a.a(i);
    }

    public final boolean a() {
        return this.a.a();
    }

    public final void clearColorFilter() {
        this.a.clearColorFilter();
    }

    public final void draw(Canvas canvas) {
        this.a.draw(canvas);
    }

    @TargetApi(19)
    public final int getAlpha() {
        return this.a.getAlpha();
    }

    @TargetApi(11)
    public final Callback getCallback() {
        return this.a.getCallback();
    }

    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    public final ConstantState getConstantState() {
        return this.b;
    }

    public final Drawable getCurrent() {
        return this.a.getCurrent();
    }

    public final int getIntrinsicHeight() {
        return this.b.b;
    }

    public final int getIntrinsicWidth() {
        return this.b.b;
    }

    public final int getMinimumHeight() {
        return this.a.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        return this.a.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.a.getOpacity();
    }

    public final boolean getPadding(Rect rect) {
        return this.a.getPadding(rect);
    }

    public final void invalidateSelf() {
        super.invalidateSelf();
        this.a.invalidateSelf();
    }

    public final boolean isRunning() {
        return this.a.isRunning();
    }

    public final Drawable mutate() {
        if (!this.c && super.mutate() == this) {
            this.a = (js) this.a.mutate();
            this.b = new nh(this.b);
            this.c = true;
        }
        return this;
    }

    public final void scheduleSelf(Runnable runnable, long j) {
        super.scheduleSelf(runnable, j);
        this.a.scheduleSelf(runnable, j);
    }

    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.a.setBounds(i, i2, i3, i4);
    }

    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.a.setBounds(rect);
    }

    public final void setChangingConfigurations(int i) {
        this.a.setChangingConfigurations(i);
    }

    public final void setColorFilter(int i, Mode mode) {
        this.a.setColorFilter(i, mode);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public final void setDither(boolean z) {
        this.a.setDither(z);
    }

    public final void setFilterBitmap(boolean z) {
        this.a.setFilterBitmap(z);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        return this.a.setVisible(z, z2);
    }

    public final void start() {
        this.a.start();
    }

    public final void stop() {
        this.a.stop();
    }

    public final void unscheduleSelf(Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.a.unscheduleSelf(runnable);
    }
}
