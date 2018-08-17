package com.afollestad.materialdialogs;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.os.Build.VERSION;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.afollestad.materialdialogs.internal.f;
import defpackage.cu;
import defpackage.tw;
import java.util.ArrayList;

final class a extends Adapter<c> {
    private final j a;
    private final int b;
    private final h c;
    private d d;

    a(j jVar, int i) {
        this.a = jVar;
        this.b = i;
        this.c = jVar.b.f;
    }

    @TargetApi(17)
    private boolean a() {
        return VERSION.SDK_INT >= 17 && this.a.b().a().getResources().getConfiguration().getLayoutDirection() == 1;
    }

    final void a(d dVar) {
        this.d = dVar;
    }

    public final int getItemCount() {
        ArrayList arrayList = this.a.b.l;
        return arrayList != null ? arrayList.size() : 0;
    }

    public final /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        int i2;
        int i3 = i;
        c cVar = (c) viewHolder;
        View view = cVar.itemView;
        Integer valueOf = Integer.valueOf(i);
        Integer[] numArr = this.a.b.P;
        int i4 = 1;
        if (numArr != null) {
            if (numArr.length != 0) {
                for (Object equals : numArr) {
                    if (equals.equals(valueOf)) {
                        i2 = 1;
                        break;
                    }
                }
            }
        }
        i2 = 0;
        int a = i2 != 0 ? cu.a(r0.a.b.ag, 0.4f) : r0.a.b.ag;
        cVar.itemView.setEnabled(i2 ^ 1);
        int[] iArr = b.a;
        j jVar = r0.a;
        boolean z;
        o oVar;
        ColorStateList colorStateList;
        switch (iArr[jVar.r - 1]) {
            case tw.a /*1*/:
                RadioButton radioButton = (RadioButton) cVar.a;
                z = jVar.b.N == i3;
                oVar = r0.a.b;
                colorStateList = oVar.u;
                if (colorStateList != null) {
                    f.a(radioButton, colorStateList);
                } else {
                    int i5 = oVar.t;
                    int a2 = cu.a(radioButton.getContext());
                    int[][] iArr2 = new int[][]{new int[]{16842910, -16842912}, new int[]{16842910, 16842912}, new int[]{-16842910, -16842912}, new int[]{-16842910, 16842912}};
                    r14 = new int[4];
                    i4 = 1;
                    r14[1] = i5;
                    r14[2] = a2;
                    r14[3] = a2;
                    f.a(radioButton, new ColorStateList(iArr2, r14));
                }
                radioButton.setChecked(z);
                radioButton.setEnabled(i2 ^ i4);
                break;
            case tw.b /*2*/:
                CheckBox checkBox = (CheckBox) cVar.a;
                z = jVar.s.contains(Integer.valueOf(i));
                oVar = r0.a.b;
                colorStateList = oVar.u;
                if (colorStateList != null) {
                    f.a(checkBox, colorStateList);
                } else {
                    f.a(checkBox, oVar.t);
                }
                checkBox.setChecked(z);
                checkBox.setEnabled(i2 ^ true);
                break;
            default:
                break;
        }
        cVar.b.setText((CharSequence) r0.a.b.l.get(i3));
        cVar.b.setTextColor(a);
        j.a(cVar.b, r0.a.b.R);
        ViewGroup viewGroup = (ViewGroup) view;
        ((LinearLayout) viewGroup).setGravity(r0.c.getGravityInt() | 16);
        if (viewGroup.getChildCount() == 2) {
            View view2;
            View view3;
            if (r0.c == h.END && !a() && (viewGroup.getChildAt(0) instanceof CompoundButton)) {
                view2 = (CompoundButton) viewGroup.getChildAt(0);
                viewGroup.removeView(view2);
                view3 = (TextView) viewGroup.getChildAt(0);
                viewGroup.removeView(view3);
                view3.setPadding(view3.getPaddingRight(), view3.getPaddingTop(), view3.getPaddingLeft(), view3.getPaddingBottom());
            } else if (r0.c == h.START && a() && (viewGroup.getChildAt(1) instanceof CompoundButton)) {
                CompoundButton compoundButton = (CompoundButton) viewGroup.getChildAt(1);
                viewGroup.removeView(compoundButton);
                TextView textView = (TextView) viewGroup.getChildAt(0);
                viewGroup.removeView(textView);
                textView.setPadding(textView.getPaddingRight(), textView.getPaddingTop(), textView.getPaddingRight(), textView.getPaddingBottom());
            }
            viewGroup.addView(view3);
            viewGroup.addView(view2);
        }
        int[] iArr3 = r0.a.b.au;
        if (iArr3 != null) {
            view.setId(i3 < iArr3.length ? iArr3[i3] : -1);
        }
        if (VERSION.SDK_INT >= 21 && viewGroup.getChildCount() == 2) {
            if (viewGroup.getChildAt(0) instanceof CompoundButton) {
                viewGroup.getChildAt(0).setBackground(null);
            } else if (viewGroup.getChildAt(1) instanceof CompoundButton) {
                viewGroup.getChildAt(1).setBackground(null);
            }
        }
    }

    public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.b, viewGroup, false);
        cu.a(inflate, this.a.d());
        return new c(inflate, this);
    }
}
