package com.leinardi.android.speeddial;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public final class p {
    public static int a(Context context) {
        int identifier = VERSION.SDK_INT >= 21 ? 16843827 : context.getResources().getIdentifier("colorPrimary", "attr", context.getPackageName());
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(identifier, typedValue, true);
        return typedValue.data;
    }

    public static int a(Context context, float f) {
        return Math.round(TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics()));
    }

    public static void a(View view) {
        view.setPressed(true);
        view.postDelayed(new v(view), (long) ViewConfiguration.getTapTimeout());
    }

    public static void a(View view, float f, boolean z) {
        ViewCompat.animate(view).rotation(f).withLayer().setDuration(z ? (long) view.getContext().getResources().getInteger(R.integer.sd_rotate_animation_duration) : 0).setInterpolator(new FastOutSlowInInterpolator()).start();
    }

    public static void a(View view, long j) {
        ViewCompat.animate(view).cancel();
        view.setVisibility(0);
        Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.sd_scale_fade_and_translate_in);
        loadAnimation.setStartOffset(j);
        view.startAnimation(loadAnimation);
    }

    public static void a(View view, boolean z) {
        ViewCompat.animate(view).cancel();
        ViewCompat.animate(view).alpha(0.0f).withLayer().setDuration((long) view.getContext().getResources().getInteger(R.integer.sd_close_animation_duration)).setInterpolator(new FastOutSlowInInterpolator()).withEndAction(new t(z, view)).start();
    }

    public static int b(Context context) {
        int identifier = VERSION.SDK_INT >= 21 ? 16843829 : context.getResources().getIdentifier("colorAccent", "attr", context.getPackageName());
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(identifier, typedValue, true);
        return typedValue.data;
    }

    public static void b(View view, long j) {
        ViewCompat.animate(view).cancel();
        view.setVisibility(0);
        Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.sd_scale_fade_and_translate_out);
        loadAnimation.setStartOffset(j);
        loadAnimation.setAnimationListener(new s(view));
        view.startAnimation(loadAnimation);
    }

    public static void b(View view, boolean z) {
        ViewCompat.animate(view).rotation(0.0f).withLayer().setDuration(z ? (long) view.getContext().getResources().getInteger(R.integer.sd_rotate_animation_duration) : 0).setInterpolator(new FastOutSlowInInterpolator()).start();
    }
}
