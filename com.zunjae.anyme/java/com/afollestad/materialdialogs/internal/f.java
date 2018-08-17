package com.afollestad.materialdialogs.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.widget.AppCompatEditText;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import com.afollestad.materialdialogs.R;
import defpackage.cu;
import java.lang.reflect.Field;

@SuppressLint({"PrivateResource"})
public final class f {
    public static void a(CheckBox checkBox, int i) {
        int a = cu.a(checkBox.getContext());
        a(checkBox, new ColorStateList(new int[][]{new int[]{16842910, -16842912}, new int[]{16842910, 16842912}, new int[]{-16842910, -16842912}, new int[]{-16842910, 16842912}}, new int[]{cu.a(checkBox.getContext(), R.attr.colorControlNormal, 0), i, a, a}));
    }

    public static void a(CheckBox checkBox, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 22) {
            checkBox.setButtonTintList(colorStateList);
            return;
        }
        Drawable wrap = DrawableCompat.wrap(ContextCompat.getDrawable(checkBox.getContext(), R.drawable.abc_btn_check_material));
        DrawableCompat.setTintList(wrap, colorStateList);
        checkBox.setButtonDrawable(wrap);
    }

    public static void a(EditText editText, int i) {
        Context context = editText.getContext();
        r2 = new int[3][];
        r1 = new int[3];
        r2[0] = new int[]{-16842910};
        r1[0] = cu.a(context, R.attr.colorControlNormal, 0);
        r2[1] = new int[]{-16842919, -16842908};
        r1[1] = cu.a(context, R.attr.colorControlNormal, 0);
        r2[2] = new int[0];
        r1[2] = i;
        ColorStateList colorStateList = new ColorStateList(r2, r1);
        if (editText instanceof AppCompatEditText) {
            ((AppCompatEditText) editText).setSupportBackgroundTintList(colorStateList);
        } else if (VERSION.SDK_INT >= 21) {
            editText.setBackgroundTintList(colorStateList);
        }
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Object obj2 = new Drawable[]{ContextCompat.getDrawable(editText.getContext(), i2), ContextCompat.getDrawable(editText.getContext(), i2)};
            obj2[0].setColorFilter(i, Mode.SRC_IN);
            obj2[1].setColorFilter(i, Mode.SRC_IN);
            declaredField3.set(obj, obj2);
        } catch (NoSuchFieldException e) {
            new StringBuilder("Device issue with cursor tinting: ").append(e.getMessage());
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(RadioButton radioButton, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 22) {
            radioButton.setButtonTintList(colorStateList);
            return;
        }
        Drawable wrap = DrawableCompat.wrap(ContextCompat.getDrawable(radioButton.getContext(), R.drawable.abc_btn_radio_material));
        DrawableCompat.setTintList(wrap, colorStateList);
        radioButton.setButtonDrawable(wrap);
    }
}
