package com.zunjae.anyme.fragments;

import android.arch.lifecycle.as;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.zunjae.anyme.R;
import com.zunjae.anyme.adapters.LiveChartAdapter;
import com.zunjae.anyme.rewrite.viewmodels.AnimeViewModel;
import java.util.List;

public final class FragmentLiveChart extends Fragment {
    private Context a;
    private int b;
    private LiveChartAdapter c;
    private AnimeViewModel d;
    @BindView
    RecyclerView recyclerView;

    public static FragmentLiveChart a(int i) {
        FragmentLiveChart fragmentLiveChart = new FragmentLiveChart();
        Bundle bundle = new Bundle();
        bundle.putInt("tabContentType", i);
        fragmentLiveChart.setArguments(bundle);
        return fragmentLiveChart;
    }

    private /* synthetic */ void a(List list) {
        if (list != null) {
            this.c.a(list);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityCreated(android.os.Bundle r5) {
        /*
        r4 = this;
        super.onActivityCreated(r5);
        r5 = new com.zunjae.anyme.adapters.LiveChartAdapter;
        r0 = r4.getActivity();
        r0 = (com.zunjae.anyme.activities.AbstractActivity) r0;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r5.<init>(r0, r1);
        r4.c = r5;
        r5 = r4.a;
        r5 = r5.getResources();
        r0 = 2131361814; // 0x7f0a0016 float:1.834339E38 double:1.053032651E-314;
        r5 = r5.getInteger(r0);
        r0 = new com.zunjae.zrecyclerview.b;
        r1 = r4.a;
        r2 = r4.recyclerView;
        r3 = r4.c;
        r0.<init>(r1, r2, r3);
        r1 = r5 + 1;
        r5 = r0.a(r5, r1);
        r0 = com.zunjae.zrecyclerview.a.b;
        r5 = r5.b(r0);
        r5.a();
        r5 = new com.zunjae.anyme.fragments.-$$Lambda$FragmentLiveChart$bljAX8-98tT9BMcbFRnXpw9NLRw;
        r5.<init>(r4);
        r0 = r4.b;
        switch(r0) {
            case 100: goto L_0x0078;
            case 101: goto L_0x006a;
            case 102: goto L_0x0066;
            case 103: goto L_0x0062;
            case 104: goto L_0x005e;
            case 105: goto L_0x005a;
            case 106: goto L_0x0056;
            case 107: goto L_0x0052;
            case 108: goto L_0x0047;
            default: goto L_0x0046;
        };
    L_0x0046:
        goto L_0x0083;
    L_0x0047:
        r0 = r4.d;
        r1 = 1;
    L_0x004a:
        r0 = r0.d(r1);
    L_0x004e:
        r0.observe(r4, r5);
        return;
    L_0x0052:
        r0 = r4.d;
        r1 = 7;
        goto L_0x004a;
    L_0x0056:
        r0 = r4.d;
        r1 = 6;
        goto L_0x004a;
    L_0x005a:
        r0 = r4.d;
        r1 = 5;
        goto L_0x004a;
    L_0x005e:
        r0 = r4.d;
        r1 = 4;
        goto L_0x004a;
    L_0x0062:
        r0 = r4.d;
        r1 = 3;
        goto L_0x004a;
    L_0x0066:
        r0 = r4.d;
        r1 = 2;
        goto L_0x004a;
    L_0x006a:
        r0 = r4.d;
        r0 = r0.a();
        r0 = r0.f();
        r0.observe(r4, r5);
        goto L_0x0083;
    L_0x0078:
        r0 = r4.d;
        r0 = r0.a();
        r0 = r0.g();
        goto L_0x004e;
    L_0x0083:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.fragments.FragmentLiveChart.onActivityCreated(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_anime_livechart, viewGroup, false);
        ButterKnife.a(this, inflate);
        this.a = inflate.getContext();
        this.d = (AnimeViewModel) as.a(this).a(AnimeViewModel.class);
        this.b = getArguments().getInt("tabContentType", 0);
        if (this.b > 0) {
            return inflate;
        }
        throw new IllegalStateException("Incorrectly set the argument");
    }
}
