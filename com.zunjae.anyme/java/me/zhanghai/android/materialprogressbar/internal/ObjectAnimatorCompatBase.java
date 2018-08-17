package me.zhanghai.android.materialprogressbar.internal;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.Property;

class ObjectAnimatorCompatBase {
    private static final int NUM_POINTS = 201;

    private ObjectAnimatorCompatBase() {
    }

    private static void calculateXYValues(Path path, float[] fArr, float[] fArr2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        float[] fArr3 = new float[2];
        for (int i = 0; i < NUM_POINTS; i++) {
            pathMeasure.getPosTan((((float) i) * length) / 200.0f, fArr3, null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
        }
    }

    private static void calculateXYValues(Path path, int[] iArr, int[] iArr2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        float[] fArr = new float[2];
        for (int i = 0; i < NUM_POINTS; i++) {
            pathMeasure.getPosTan((((float) i) * length) / 200.0f, fArr, null);
            iArr[i] = Math.round(fArr[0]);
            iArr2[i] = Math.round(fArr[1]);
        }
    }

    public static <T> ObjectAnimator ofArgb(T t, Property<T, Integer> property, int... iArr) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(t, property, iArr);
        ofInt.setEvaluator(new ArgbEvaluator());
        return ofInt;
    }

    public static ObjectAnimator ofArgb(Object obj, String str, int... iArr) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(obj, str, iArr);
        ofInt.setEvaluator(new ArgbEvaluator());
        return ofInt;
    }

    public static <T> ObjectAnimator ofFloat(T t, Property<T, Float> property, Property<T, Float> property2, Path path) {
        float[] fArr = new float[NUM_POINTS];
        float[] fArr2 = new float[NUM_POINTS];
        calculateXYValues(path, fArr, fArr2);
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(property, fArr);
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat(property2, fArr2);
        return ObjectAnimator.ofPropertyValuesHolder(t, new PropertyValuesHolder[]{ofFloat, ofFloat2});
    }

    public static ObjectAnimator ofFloat(Object obj, String str, String str2, Path path) {
        float[] fArr = new float[NUM_POINTS];
        float[] fArr2 = new float[NUM_POINTS];
        calculateXYValues(path, fArr, fArr2);
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(str, fArr);
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat(str2, fArr2);
        return ObjectAnimator.ofPropertyValuesHolder(obj, new PropertyValuesHolder[]{ofFloat, ofFloat2});
    }

    public static <T> ObjectAnimator ofInt(T t, Property<T, Integer> property, Property<T, Integer> property2, Path path) {
        int[] iArr = new int[NUM_POINTS];
        int[] iArr2 = new int[NUM_POINTS];
        calculateXYValues(path, iArr, iArr2);
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(property, iArr);
        PropertyValuesHolder ofInt2 = PropertyValuesHolder.ofInt(property2, iArr2);
        return ObjectAnimator.ofPropertyValuesHolder(t, new PropertyValuesHolder[]{ofInt, ofInt2});
    }

    public static ObjectAnimator ofInt(Object obj, String str, String str2, Path path) {
        int[] iArr = new int[NUM_POINTS];
        int[] iArr2 = new int[NUM_POINTS];
        calculateXYValues(path, iArr, iArr2);
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, iArr);
        PropertyValuesHolder ofInt2 = PropertyValuesHolder.ofInt(str2, iArr2);
        return ObjectAnimator.ofPropertyValuesHolder(obj, new PropertyValuesHolder[]{ofInt, ofInt2});
    }
}
