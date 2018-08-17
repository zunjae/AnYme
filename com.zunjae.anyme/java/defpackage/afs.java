package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.mikepenz.materialdrawer.R;

@SuppressLint({"InlinedApi"})
public final class afs {
    public static int a(Context context) {
        return Math.min(afz.d(context) - afz.b(context), context.getResources().getDimensionPixelSize(R.dimen.material_drawer_width));
    }

    public static ColorStateList a(int i, int i2) {
        r2 = new int[2][];
        r2[0] = new int[]{16842913};
        r2[1] = new int[0];
        return new ColorStateList(r2, new int[]{i2, i});
    }

    public static void a(View view) {
        int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.material_drawer_vertical_padding);
        view.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    public static Drawable b(Context context) {
        return new adf(context, adz.mdf_person).b(R.color.accent).k(R.color.primary).g(56).d(16);
    }
}
