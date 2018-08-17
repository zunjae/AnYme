package com.zunjae.anyme.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;

public final class FragmentNoKanon extends Fragment {
    private Unbinder a;
    private Context b;
    @BindView
    TextView message;

    public static FragmentNoKanon a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("message", str);
        FragmentNoKanon fragmentNoKanon = new FragmentNoKanon();
        fragmentNoKanon.setArguments(bundle);
        return fragmentNoKanon;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.message.setText(getArguments().getString("message", "This feature requires you to be logged in on Kanon"));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_no_kanon, viewGroup, false);
        this.a = ButterKnife.a(this, inflate);
        this.b = inflate.getContext();
        return inflate;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.a.a();
    }

    @OnClick
    public final void onGetStartedButtonClicked() {
        ((AbstractActivity) getActivity()).a("https://kanonapp.com/account/register");
    }
}
