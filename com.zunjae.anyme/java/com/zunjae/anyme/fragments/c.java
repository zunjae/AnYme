package com.zunjae.anyme.fragments;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import defpackage.aux;
import defpackage.tw;
import java.util.ArrayList;

final class c implements OnItemSelectedListener {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ FragmentWaifus b;

    c(FragmentWaifus fragmentWaifus, ArrayList arrayList) {
        this.b = fragmentWaifus;
        this.a = arrayList;
    }

    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (!this.b.b) {
            this.b.b = true;
        } else if (!((String) this.a.get(i)).equals("Pick a sort order")) {
            String str = (String) this.a.get(i);
            Object obj = -1;
            i = str.hashCode();
            if (i != 2420395) {
                if (i != 2576157) {
                    if (i == 1017894414) {
                        if (str.equals("Date Added")) {
                            obj = null;
                        }
                    }
                } else if (str.equals("Show")) {
                    obj = 2;
                }
            } else if (str.equals("Name")) {
                obj = 1;
            }
            switch (obj) {
                case tw.a /*1*/:
                    aux.a("KEY_SORT_ORDER_WAIFU", 1);
                    break;
                case tw.b /*2*/:
                    aux.a("KEY_SORT_ORDER_WAIFU", 2);
                    break;
                default:
                    aux.a("KEY_SORT_ORDER_WAIFU", 0);
                    break;
            }
            if (this.b.d != null && this.b.d.b()) {
                this.b.d.a();
            }
        }
    }

    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
