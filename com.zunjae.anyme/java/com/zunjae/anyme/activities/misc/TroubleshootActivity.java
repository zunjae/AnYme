package com.zunjae.anyme.activities.misc;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.anyme.adapters.TroubleshootAdapter;
import com.zunjae.zrecyclerview.b;
import java.util.ArrayList;

public final class TroubleshootActivity extends AbstractActivity {
    @BindView
    RecyclerView recyclerView;
    @BindView
    Toolbar toolbar;

    static /* synthetic */ void a(TroubleshootActivity troubleshootActivity, ArrayList arrayList) {
        Context context = troubleshootActivity.b;
        new b(context, troubleshootActivity.recyclerView, new TroubleshootAdapter(context, arrayList)).a();
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_troubleshoot);
        ButterKnife.a(this);
        c(this.toolbar);
        new g(this, this).f();
    }
}
