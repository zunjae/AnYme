package com.zunjae.anyme.dialogs.animeDialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.zunjae.anyme.R;
import com.zunjae.anyme.dialogs.b;
import defpackage.de;
import defpackage.fa;

public class AnimeCoverPreviewDialog extends b {
    @BindView
    ImageView coverImage;
    @BindView
    ProgressBar progressBar;
    @BindView
    TextView title;

    public static AnimeCoverPreviewDialog a(String str, String str2) {
        AnimeCoverPreviewDialog animeCoverPreviewDialog = new AnimeCoverPreviewDialog();
        Bundle bundle = new Bundle();
        bundle.putString("dialogTitle", str);
        bundle.putString("imageURL", str2);
        animeCoverPreviewDialog.setArguments(bundle);
        return animeCoverPreviewDialog;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        CharSequence string = getArguments().getString("dialogTitle");
        String string2 = getArguments().getString("imageURL");
        this.title.setText(string);
        de.b(this.a).a(string2).a(fa.NONE).a(new a(this)).a(this.coverImage);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.dialog_anime_cover_preview, viewGroup, false);
        ButterKnife.a(this, inflate);
        return inflate;
    }
}
