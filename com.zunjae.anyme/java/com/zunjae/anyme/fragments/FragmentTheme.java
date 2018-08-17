package com.zunjae.anyme.fragments;

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
import com.zunjae.anyme.adapters.ThemePickerAdapter;
import com.zunjae.zrecyclerview.a;
import com.zunjae.zrecyclerview.b;
import defpackage.alk;
import defpackage.aux;
import java.util.ArrayList;

public final class FragmentTheme extends Fragment {
    private static final String a = "FragmentTheme";
    private Context b;
    private boolean c = false;
    @BindView
    RecyclerView recyclerView;

    private /* synthetic */ void a(alk alk) {
        aux.a("KEY_APP_THEMEV4", alk.b());
        this.c = true;
        getActivity().recreate();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null) {
            this.c = bundle.getBoolean("userHasClickedTheme", false);
            if (this.c) {
                getActivity().setResult(5);
            }
        }
        ArrayList parcelableArrayList = getArguments().getParcelableArrayList("themeEntries");
        if (parcelableArrayList == null || parcelableArrayList.size() == 0) {
            throw new NullPointerException("Incorrectly set the arguments");
        }
        new b(this.b, this.recyclerView, new ThemePickerAdapter(this.b, parcelableArrayList, new -$$Lambda$FragmentTheme$0GRs3XIktmJ0u8Gnm53N7U-84kk(this))).b(a.b).a(2, 3).a();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_app_theme, viewGroup, false);
        ButterKnife.a(this, inflate);
        this.b = inflate.getContext();
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("userHasClickedTheme", this.c);
    }
}
