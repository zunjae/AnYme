package me.zhanghai.android.materialprogressbar;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;

public interface TintableDrawable {
    void setTint(int i);

    void setTintList(ColorStateList colorStateList);

    void setTintMode(Mode mode);
}
