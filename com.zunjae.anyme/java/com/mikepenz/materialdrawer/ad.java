package com.mikepenz.materialdrawer;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.widget.DrawerLayout.LayoutParams;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mikepenz.fastadapter.v;
import defpackage.aed;
import defpackage.ael;
import defpackage.aem;
import defpackage.afi;
import defpackage.afl;
import defpackage.afs;
import defpackage.afz;
import java.util.List;

final class ad {
    public static int a(t tVar, long j) {
        if (j != -1) {
            for (int i = 0; i < tVar.c().getItemCount(); i++) {
                if (((afi) tVar.c().b(i)).c() == j) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static LayoutParams a(t tVar, LayoutParams layoutParams) {
        if (layoutParams != null) {
            Integer num = tVar.x;
            if (num != null && (num.intValue() == 5 || tVar.x.intValue() == 8388613)) {
                layoutParams.rightMargin = 0;
                if (VERSION.SDK_INT >= 17) {
                    layoutParams.setMarginEnd(0);
                }
                layoutParams.leftMargin = tVar.d.getResources().getDimensionPixelSize(R.dimen.material_drawer_margin);
                if (VERSION.SDK_INT >= 17) {
                    layoutParams.setMarginEnd(tVar.d.getResources().getDimensionPixelSize(R.dimen.material_drawer_margin));
                }
            }
            int i = tVar.w;
            if (i >= 0) {
                layoutParams.width = i;
            } else {
                layoutParams.width = afs.a(tVar.d);
            }
        }
        return layoutParams;
    }

    public static void a(t tVar) {
        a aVar = tVar.y;
        if (aVar != null) {
            if (tVar.z) {
                tVar.I = aVar.a();
            } else {
                tVar.E = aVar.a();
                f fVar = tVar.y.a;
                tVar.F = fVar.D;
                tVar.G = fVar.C;
            }
        }
        if (tVar.I != null) {
            ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(10, 1);
            tVar.I.setId(R.id.material_drawer_sticky_header);
            tVar.r.addView(tVar.I, 0, layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) tVar.V.getLayoutParams();
            layoutParams2.addRule(3, R.id.material_drawer_sticky_header);
            tVar.V.setLayoutParams(layoutParams2);
            tVar.I.setBackgroundColor(afz.a(tVar.d, R.attr.material_drawer_background, R.color.material_drawer_background));
            if (tVar.J) {
                if (VERSION.SDK_INT >= 21) {
                    tVar.I.setElevation(afz.a(4.0f, tVar.d));
                } else {
                    View view = new View(tVar.d);
                    view.setBackgroundResource(R.drawable.material_drawer_shadow_bottom);
                    tVar.r.addView(view, -1, (int) afz.a(4.0f, tVar.d));
                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) view.getLayoutParams();
                    layoutParams3.addRule(3, R.id.material_drawer_sticky_header);
                    view.setLayoutParams(layoutParams3);
                }
            }
            tVar.V.setPadding(0, 0, 0, 0);
        }
        if (tVar.E == null) {
            return;
        }
        if (tVar.V != null) {
            v e;
            Object[] objArr;
            if (tVar.G) {
                e = tVar.e();
                objArr = new afi[]{new ael().b(tVar.E).a(tVar.H).d(tVar.F).a(aem.a)};
            } else {
                e = tVar.e();
                objArr = new afi[]{new ael().b(tVar.E).a(tVar.H).d(tVar.F).a(aem.c)};
            }
            e.a(objArr);
            RecyclerView recyclerView = tVar.V;
            recyclerView.setPadding(recyclerView.getPaddingLeft(), 0, tVar.V.getPaddingRight(), tVar.V.getPaddingBottom());
            return;
        }
        throw new RuntimeException("can't use a headerView without a recyclerView");
    }

    public static void a(t tVar, int i) {
        if (i >= 0) {
            ViewGroup viewGroup = tVar.N;
            if (viewGroup != null && (viewGroup instanceof LinearLayout)) {
                LinearLayout linearLayout = (LinearLayout) viewGroup;
                if (tVar.O) {
                    i++;
                }
                if (linearLayout.getChildCount() > i && i >= 0) {
                    a(tVar, (afi) linearLayout.getChildAt(i).getTag(), linearLayout.getChildAt(i), null);
                }
            }
        }
    }

    public static void a(t tVar, afi afi, View view, Boolean bool) {
        Object obj;
        ViewGroup viewGroup;
        LinearLayout linearLayout;
        int i;
        aed aed;
        p pVar;
        boolean z = false;
        if (afi != null && (afi instanceof afl)) {
            if (!afi.f()) {
                obj = null;
                if (obj != null) {
                    tVar.i();
                    view.setActivated(true);
                    view.setSelected(true);
                    tVar.c().h();
                    viewGroup = tVar.N;
                    if (viewGroup != null && (viewGroup instanceof LinearLayout)) {
                        linearLayout = (LinearLayout) viewGroup;
                        for (i = 0; i < linearLayout.getChildCount(); i++) {
                            if (linearLayout.getChildAt(i) == view) {
                                tVar.b = i;
                                break;
                            }
                        }
                    }
                }
                if (bool != null) {
                    if (bool.booleanValue()) {
                        if (afi instanceof aed) {
                            aed = (aed) afi;
                            if (aed.m() != null) {
                                z = aed.m().onItemClick(view, -1, afi);
                            }
                        }
                        pVar = tVar.aj;
                        if (pVar != null) {
                            z = pVar.onItemClick(view, -1, afi);
                        }
                    }
                    if (!z) {
                        tVar.h();
                    }
                }
            }
        }
        obj = 1;
        if (obj != null) {
            tVar.i();
            view.setActivated(true);
            view.setSelected(true);
            tVar.c().h();
            viewGroup = tVar.N;
            linearLayout = (LinearLayout) viewGroup;
            for (i = 0; i < linearLayout.getChildCount(); i++) {
                if (linearLayout.getChildAt(i) == view) {
                    tVar.b = i;
                    break;
                }
            }
        }
        if (bool != null) {
            if (bool.booleanValue()) {
                if (afi instanceof aed) {
                    aed = (aed) afi;
                    if (aed.m() != null) {
                        z = aed.m().onItemClick(view, -1, afi);
                    }
                }
                pVar = tVar.aj;
                if (pVar != null) {
                    z = pVar.onItemClick(view, -1, afi);
                }
            }
            if (!z) {
                tVar.h();
            }
        }
    }

    public static void a(t tVar, OnClickListener onClickListener) {
        Context context = tVar.r.getContext();
        List list = tVar.af;
        if (list != null && list.size() > 0) {
            ViewGroup linearLayout = new LinearLayout(context);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setOrientation(1);
            linearLayout.setBackgroundColor(afz.a(context, R.attr.material_drawer_background, R.color.material_drawer_background));
            if (tVar.O) {
                View linearLayout2 = new LinearLayout(context);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                linearLayout2.setMinimumHeight((int) afz.a(1.0f, context));
                linearLayout2.setOrientation(1);
                linearLayout2.setBackgroundColor(afz.a(context, R.attr.material_drawer_divider, R.color.material_drawer_divider));
                linearLayout.addView(linearLayout2, layoutParams);
            }
            a(tVar, linearLayout, onClickListener);
            tVar.N = linearLayout;
        }
        if (tVar.N != null) {
            ViewGroup.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams2.addRule(12, 1);
            tVar.N.setId(R.id.material_drawer_sticky_footer);
            tVar.r.addView(tVar.N, layoutParams2);
            if ((tVar.l || tVar.n) && VERSION.SDK_INT >= 19) {
                tVar.N.setPadding(0, 0, 0, afz.a(context));
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) tVar.V.getLayoutParams();
            layoutParams3.addRule(2, R.id.material_drawer_sticky_footer);
            tVar.V.setLayoutParams(layoutParams3);
            if (tVar.Q) {
                tVar.P = new View(context);
                tVar.P.setBackgroundResource(R.drawable.material_drawer_shadow_top);
                tVar.r.addView(tVar.P, -1, context.getResources().getDimensionPixelSize(R.dimen.material_drawer_sticky_footer_elevation));
                layoutParams3 = (RelativeLayout.LayoutParams) tVar.P.getLayoutParams();
                layoutParams3.addRule(2, R.id.material_drawer_sticky_footer);
                tVar.P.setLayoutParams(layoutParams3);
            }
            RecyclerView recyclerView = tVar.V;
            recyclerView.setPadding(recyclerView.getPaddingLeft(), tVar.V.getPaddingTop(), tVar.V.getPaddingRight(), context.getResources().getDimensionPixelSize(R.dimen.material_drawer_padding));
        }
        if (tVar.K != null) {
            if (tVar.V == null) {
                throw new RuntimeException("can't use a footerView without a recyclerView");
            } else if (tVar.L) {
                tVar.f().a(new ael().b(tVar.K).a(aem.b));
            } else {
                tVar.f().a(new ael().b(tVar.K).a(aem.c));
            }
        }
    }

    private static void a(t tVar, ViewGroup viewGroup, OnClickListener onClickListener) {
        for (afi afi : tVar.af) {
            View a = afi.a(viewGroup.getContext(), viewGroup);
            a.setTag(afi);
            if (afi.d()) {
                a.setOnClickListener(onClickListener);
            }
            viewGroup.addView(a);
            afs.a(a);
        }
        viewGroup.setPadding(0, 0, 0, 0);
    }
}
