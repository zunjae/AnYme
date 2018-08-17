package me.zhanghai.android.materialprogressbar.internal;

import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.graphics.Path;
import android.util.Property;

@TargetApi(21)
class ObjectAnimatorCompatLollipop {
    private ObjectAnimatorCompatLollipop() {
    }

    public static <T> ObjectAnimator ofArgb(T t, Property<T, Integer> property, int... iArr) {
        return ObjectAnimator.ofArgb(t, property, iArr);
    }

    public static ObjectAnimator ofArgb(Object obj, String str, int... iArr) {
        return ObjectAnimator.ofArgb(obj, str, iArr);
    }

    public static <T> ObjectAnimator ofFloat(T t, Property<T, Float> property, Property<T, Float> property2, Path path) {
        return ObjectAnimator.ofFloat(t, property, property2, path);
    }

    public static ObjectAnimator ofFloat(Object obj, String str, String str2, Path path) {
        return ObjectAnimator.ofFloat(obj, str, str2, path);
    }

    public static <T> ObjectAnimator ofInt(T t, Property<T, Integer> property, Property<T, Integer> property2, Path path) {
        return ObjectAnimator.ofInt(t, property, property2, path);
    }

    public static ObjectAnimator ofInt(Object obj, String str, String str2, Path path) {
        return ObjectAnimator.ofInt(obj, str, str2, path);
    }
}
