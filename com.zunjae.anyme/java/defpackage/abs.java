package defpackage;

import android.animation.Animator;
import android.annotation.TargetApi;
import android.support.v4.view.ViewCompat;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewAnimationUtils;

public final class abs {
    public static int a = 150;
    public static int b = 400;
    public static int c = 800;

    public static void a(View view, int i, abv abv) {
        view.setVisibility(0);
        view.setAlpha(0.0f);
        ViewCompat.animate(view).alpha(1.0f).setDuration((long) i).setListener(new abt(abv));
    }

    @TargetApi(21)
    public static void a(View view, abv abv) {
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, view.getWidth() - ((int) TypedValue.applyDimension(1, 24.0f, view.getResources().getDisplayMetrics())), view.getHeight() / 2, 0.0f, (float) Math.max(view.getWidth(), view.getHeight()));
        view.setVisibility(0);
        createCircularReveal.addListener(new abu(abv, view));
        createCircularReveal.start();
    }
}
