package me.zhanghai.android.materialprogressbar.internal;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.os.Build.VERSION;
import android.util.Property;

public class ObjectAnimatorCompat {
    private ObjectAnimatorCompat() {
    }

    public static <T> ObjectAnimator ofArgb(T t, Property<T, Integer> property, int... iArr) {
        return VERSION.SDK_INT >= 21 ? ObjectAnimatorCompatLollipop.ofArgb((Object) t, (Property) property, iArr) : ObjectAnimatorCompatBase.ofArgb((Object) t, (Property) property, iArr);
    }

    public static ObjectAnimator ofArgb(Object obj, String str, int... iArr) {
        return VERSION.SDK_INT >= 21 ? ObjectAnimatorCompatLollipop.ofArgb(obj, str, iArr) : ObjectAnimatorCompatBase.ofArgb(obj, str, iArr);
    }

    public static <T> ObjectAnimator ofFloat(T t, Property<T, Float> property, Property<T, Float> property2, Path path) {
        return VERSION.SDK_INT >= 21 ? ObjectAnimatorCompatLollipop.ofFloat((Object) t, (Property) property, (Property) property2, path) : ObjectAnimatorCompatBase.ofFloat((Object) t, (Property) property, (Property) property2, path);
    }

    public static ObjectAnimator ofFloat(Object obj, String str, String str2, Path path) {
        return VERSION.SDK_INT >= 21 ? ObjectAnimatorCompatLollipop.ofFloat(obj, str, str2, path) : ObjectAnimatorCompatBase.ofFloat(obj, str, str2, path);
    }

    public static <T> ObjectAnimator ofInt(T t, Property<T, Integer> property, Property<T, Integer> property2, Path path) {
        return VERSION.SDK_INT >= 21 ? ObjectAnimatorCompatLollipop.ofInt((Object) t, (Property) property, (Property) property2, path) : ObjectAnimatorCompatBase.ofInt((Object) t, (Property) property, (Property) property2, path);
    }

    public static ObjectAnimator ofInt(Object obj, String str, String str2, Path path) {
        return VERSION.SDK_INT >= 21 ? ObjectAnimatorCompatLollipop.ofInt(obj, str, str2, path) : ObjectAnimatorCompatBase.ofInt(obj, str, str2, path);
    }
}
