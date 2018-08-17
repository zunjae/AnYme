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

public final class FragmentRule34 extends Fragment {
    private Context a;
    @BindView
    RecyclerView recyclerView;

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        new b(this, getActivity()).f();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_rule_34, viewGroup, false);
        ButterKnife.a(this, inflate);
        this.a = inflate.getContext();
        return inflate;
    }
}
