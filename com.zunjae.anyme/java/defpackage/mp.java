package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

public final class mp<T extends Drawable> implements mq<T> {
    private final mq<T> a;
    private final int b;

    public mp(mq<T> mqVar, int i) {
        this.a = mqVar;
        this.b = i;
    }

    public final /* synthetic */ boolean a(Object obj, mr mrVar) {
        Drawable drawable = (Drawable) obj;
        if (mrVar.d() != null) {
            Drawable transitionDrawable = new TransitionDrawable(new Drawable[]{mrVar.d(), drawable});
            transitionDrawable.setCrossFadeEnabled(true);
            transitionDrawable.startTransition(this.b);
            mrVar.d(transitionDrawable);
            return true;
        }
        this.a.a(drawable, mrVar);
        return false;
    }
}
