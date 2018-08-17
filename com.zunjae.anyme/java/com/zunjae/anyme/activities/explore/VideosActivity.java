package com.zunjae.anyme.activities.explore;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.anyme.adapters.animes.AnimeVideoAdapter;
import com.zunjae.zrecyclerview.a;
import com.zunjae.zrecyclerview.b;
import defpackage.aly;
import defpackage.are;
import java.util.ArrayList;

public final class VideosActivity extends AbstractActivity {
    private final String c = "VideosActivity";
    private are d;
    private ArrayList<aly> e;
    @BindView
    TextView errorMessage;
    @BindView
    RecyclerView recyclerView;
    @BindView
    SwipeRefreshLayout swipeRefreshLayout;
    @BindView
    Toolbar toolbar;

    public static Intent a(Context context, are are) {
        Intent intent = new Intent(context, VideosActivity.class);
        intent.putExtra("anime", are);
        return intent;
    }

    private void a(ArrayList<aly> arrayList) {
        if (arrayList == null) {
            this.errorMessage.setVisibility(0);
            this.errorMessage.setText("Could not connect to MAL. Swipe down to try again");
        } else if (arrayList.size() == 0) {
            this.errorMessage.setVisibility(0);
            TextView textView = this.errorMessage;
            StringBuilder stringBuilder = new StringBuilder("No videos found for ");
            stringBuilder.append(this.d.g());
            textView.setText(stringBuilder.toString());
        } else {
            this.errorMessage.setVisibility(8);
            this.e = arrayList;
            new b(this.b, this.recyclerView, new AnimeVideoAdapter(this.b, arrayList)).a(1, 2).b(a.b).a();
        }
    }

    private void c() {
        new x(this, this, this.d).f();
    }

    private /* synthetic */ void d() {
        c();
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.abstract_activity_basic_recyclerview_with_error);
        ButterKnife.a(this);
        this.d = (are) getIntent().getParcelableExtra("anime");
        a(this.toolbar, "Videos", this.d.g(), true);
        if (bundle != null) {
            this.e = bundle.getParcelableArrayList("videos");
            a(this.e);
        } else {
            c();
        }
        this.swipeRefreshLayout.setOnRefreshListener(new -$$Lambda$VideosActivity$TXM6gEBKNwksIZ2TUSOHCrUXN2M(this));
    }

    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ArrayList arrayList = this.e;
        if (arrayList != null) {
            bundle.putParcelableArrayList("videos", arrayList);
        }
    }
}
