package com.zunjae.anyme.dialogs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindString;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.anyme.activities.browsers.BasicWebViewBrowser;

public class MakeAccountDialog extends b {
    @BindString
    String bMalRegisterLink;

    @OnClick
    public void onCloseButtonClick() {
        getDialog().dismiss();
    }

    @OnClick
    public void onCreateAccountButtonClick() {
        getActivity().finish();
        startActivity(BasicWebViewBrowser.a(this.a, this.bMalRegisterLink));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.dialog_make_account, viewGroup, false);
        ButterKnife.a(this, inflate);
        return inflate;
    }

    @OnClick
    public void onExplanationButtonClicked() {
        ((AbstractActivity) getActivity()).a("https://github.com/zunjae/AnYme/blob/master/README.md");
        dismiss();
    }

    @OnClick
    public void onLoginButtonClicked() {
        getDialog().dismiss();
        getActivity().finish();
    }

    public void onStart() {
        super.onStart();
        b();
    }
}
