package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.util.TypedValue;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.mikepenz.materialize.R;

@SuppressLint({"InlinedApi"})
public final class afz {
    public static float a(float f, Context context) {
        return f * (((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f);
    }

    public static int a(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(context.getResources().getConfiguration().orientation == 1 ? "navigation_bar_height" : "navigation_bar_height_landscape", "dimen", "android");
        return identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
    }

    private static int a(Context context, int i) {
        Throwable th;
        TypedArray typedArray = null;
        try {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
            try {
                i = obtainStyledAttributes.getDimensionPixelSize(0, 0);
                if (obtainStyledAttributes != null) {
                    obtainStyledAttributes.recycle();
                }
                return i;
            } catch (Throwable th2) {
                th = th2;
                typedArray = obtainStyledAttributes;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    public static int a(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        i = context.getTheme().resolveAttribute(i, typedValue, true) ? typedValue.data : 0;
        return i == 0 ? ResourcesCompat.getColor(context.getResources(), i2, context.getTheme()) : i;
    }

    public static int a(Context context, boolean z) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        identifier = identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.tool_bar_top_padding);
        return (dimensionPixelSize != 0 || z) ? identifier == 0 ? dimensionPixelSize : identifier : 0;
    }

    public static StateListDrawable a(Context context, int i, boolean z) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable colorDrawable = new ColorDrawable(i);
        stateListDrawable.addState(new int[]{16842913}, colorDrawable);
        stateListDrawable.addState(new int[0], ContextCompat.getDrawable(context, afz.c(context)));
        if (z) {
            int integer = context.getResources().getInteger(17694720);
            stateListDrawable.setEnterFadeDuration(integer);
            stateListDrawable.setExitFadeDuration(integer);
        }
        return stateListDrawable;
    }

    public static StateListDrawable a(Drawable drawable, Drawable drawable2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842913}, drawable2);
        stateListDrawable.addState(new int[0], drawable);
        return stateListDrawable;
    }

    public static void a(Activity activity) {
        if (VERSION.SDK_INT >= 19) {
            afz.a(activity, 67108864, false);
        }
    }

    private static void a(Activity activity, int i, boolean z) {
        Window window = activity.getWindow();
        LayoutParams attributes = window.getAttributes();
        if (z) {
            i |= attributes.flags;
        } else {
            i = (i ^ -1) & attributes.flags;
        }
        attributes.flags = i;
        window.setAttributes(attributes);
    }

    public static int b(Context context) {
        int a = afz.a(context, R.attr.actionBarSize);
        return a == 0 ? context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_default_height_material) : a;
    }

    public static void b(Activity activity) {
        if (VERSION.SDK_INT >= 19) {
            afz.a(activity, 134217728, true);
        }
    }

    public static int c(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        return typedValue.resourceId;
    }

    public static int d(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}
