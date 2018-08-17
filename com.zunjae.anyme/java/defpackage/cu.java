package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.View;
import com.afollestad.materialdialogs.j;
import com.afollestad.materialdialogs.o;

public final class cu {
    public static int a(int i, float f) {
        return Color.argb(Math.round(((float) Color.alpha(i)) * f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static int a(Context context) {
        return cu.a(cu.a(cu.a(context, 16842806, 0)) ? -16777216 : -1, 0.3f);
    }

    public static int a(Context context, int i, int i2) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            i = obtainStyledAttributes.getColor(0, i2);
            return i;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList a(Context context, int i, ColorStateList colorStateList) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            TypedValue peekValue = obtainStyledAttributes.peekValue(0);
            if (peekValue == null) {
                return colorStateList;
            }
            ColorStateList colorStateList2;
            if (peekValue.type < 28 || peekValue.type > 31) {
                colorStateList2 = obtainStyledAttributes.getColorStateList(0);
                if (colorStateList2 != null) {
                    obtainStyledAttributes.recycle();
                    return colorStateList2;
                }
                obtainStyledAttributes.recycle();
                return colorStateList;
            }
            colorStateList2 = cu.d(context, peekValue.data);
            obtainStyledAttributes.recycle();
            return colorStateList2;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.afollestad.materialdialogs.h a(android.content.Context r3, int r4, com.afollestad.materialdialogs.h r5) {
        /*
        r3 = r3.getTheme();
        r0 = 1;
        r1 = new int[r0];
        r2 = 0;
        r1[r2] = r4;
        r3 = r3.obtainStyledAttributes(r1);
        r4 = defpackage.cw.a;	 Catch:{ all -> 0x0037 }
        r5 = r5.ordinal();	 Catch:{ all -> 0x0037 }
        r4 = r4[r5];	 Catch:{ all -> 0x0037 }
        switch(r4) {
            case 1: goto L_0x001d;
            case 2: goto L_0x001a;
            default: goto L_0x0019;
        };	 Catch:{ all -> 0x0037 }
    L_0x0019:
        goto L_0x001c;
    L_0x001a:
        r0 = 2;
        goto L_0x001d;
    L_0x001c:
        r0 = 0;
    L_0x001d:
        r4 = r3.getInt(r2, r0);	 Catch:{ all -> 0x0037 }
        switch(r4) {
            case 1: goto L_0x002d;
            case 2: goto L_0x0027;
            default: goto L_0x0024;
        };	 Catch:{ all -> 0x0037 }
    L_0x0024:
        r4 = com.afollestad.materialdialogs.h.START;	 Catch:{ all -> 0x0037 }
        goto L_0x0033;
    L_0x0027:
        r4 = com.afollestad.materialdialogs.h.END;	 Catch:{ all -> 0x0037 }
        r3.recycle();
        return r4;
    L_0x002d:
        r4 = com.afollestad.materialdialogs.h.CENTER;	 Catch:{ all -> 0x0037 }
        r3.recycle();
        return r4;
    L_0x0033:
        r3.recycle();
        return r4;
    L_0x0037:
        r4 = move-exception;
        r3.recycle();
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: cu.a(android.content.Context, int, com.afollestad.materialdialogs.h):com.afollestad.materialdialogs.h");
    }

    public static String a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return (String) typedValue.string;
    }

    public static void a(DialogInterface dialogInterface, o oVar) {
        j jVar = (j) dialogInterface;
        if (jVar.f() != null) {
            jVar.f().post(new cv(jVar, oVar));
        }
    }

    public static void a(View view, Drawable drawable) {
        if (VERSION.SDK_INT < 16) {
            view.setBackgroundDrawable(drawable);
        } else {
            view.setBackground(drawable);
        }
    }

    public static boolean a(int i) {
        double red = (double) Color.red(i);
        Double.isNaN(red);
        red *= 0.299d;
        double green = (double) Color.green(i);
        Double.isNaN(green);
        red += green * 0.587d;
        green = (double) Color.blue(i);
        Double.isNaN(green);
        return 1.0d - ((red + (green * 0.114d)) / 255.0d) >= 0.5d;
    }

    public static boolean a(Context context, int i, boolean z) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            boolean z2 = obtainStyledAttributes.getBoolean(0, z);
            return z2;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static Drawable b(Context context, int i) {
        return cu.e(context, i);
    }

    public static int c(Context context, int i) {
        return cu.f(context, i);
    }

    public static ColorStateList d(Context context, int i) {
        int a = cu.a(context, 16842806, 0);
        if (i != 0) {
            a = i;
        }
        r1 = new int[2][];
        r1[0] = new int[]{-16842910};
        r1[1] = new int[0];
        return new ColorStateList(r1, new int[]{cu.a(a, 0.4f), a});
    }

    private static Drawable e(Context context, int i) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            return drawable;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private static int f(Context context, int i) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            i = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            return i;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
