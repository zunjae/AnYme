package com.zunjae.anyme.activities.settings;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.anyme.services.UpdaterService;
import defpackage.ann;
import defpackage.aux;

public final class DebugActivity extends AbstractActivity {
    @BindView
    TextView adBlockVersion;
    @BindView
    TextView browserConfigVersion;
    @BindView
    Button forceRefreshActivity;
    @BindView
    Button forceUpdateButton;
    @BindView
    TextView nsfwFilterVersion;

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_debug);
        ButterKnife.a(this);
        TextView textView = this.browserConfigVersion;
        StringBuilder stringBuilder = new StringBuilder("Browser Config Version: ");
        stringBuilder.append(ann.a());
        textView.setText(stringBuilder.toString());
        textView = this.adBlockVersion;
        stringBuilder = new StringBuilder("AdBlock Config Version: ");
        stringBuilder.append(aux.b("@@AdBlocker_DAO_list_version", 0));
        textView.setText(stringBuilder.toString());
    }

    @OnClick
    public final void onForceRefreshActivityClicked() {
        finish();
        startActivity(getIntent());
    }

    @OnClick
    public final void onForceUpdateButtonClicked() {
        startService(UpdaterService.a(this.b));
    }
}
