package com.zunjae.anyme.rewrite.ui.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.zunjae.anyme.R;
import defpackage.de;

public final class g extends Fragment {
    static final /* synthetic */ boolean a = true;

    public static g a(String str, String str2) {
        g gVar = new g();
        Bundle bundle = new Bundle();
        bundle.putString("text", str);
        bundle.putString("imageURL", str2);
        gVar.setArguments(bundle);
        return gVar;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_welcome_screen_explanation, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.backgroundImage);
        TextView textView = (TextView) inflate.findViewById(R.id.welcomeScreenText);
        if (!a) {
            if (getArguments() == null) {
                throw new AssertionError();
            }
        }
        de.b(inflate.getContext()).a(getArguments().getString("imageURL")).a(imageView);
        textView.setText(getArguments().getString("text"));
        return inflate;
    }
}
