package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public abstract class nc<Z> extends nj<ImageView, Z> implements mr {
    public nc(ImageView imageView) {
        super(imageView);
    }

    public final void a(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    protected abstract void a(Z z);

    public void a(Z z, mq<? super Z> mqVar) {
        if (mqVar == null || !mqVar.a(z, this)) {
            a((Object) z);
        }
    }

    public final void b(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    public final void c(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    public final Drawable d() {
        return ((ImageView) this.a).getDrawable();
    }

    public final void d(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }
}
