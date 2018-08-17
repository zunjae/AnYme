package com.zunjae.anyme.activities.explore;

import android.arch.lifecycle.as;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.anyme.adapters.animes.AnimeSongsAdapter;
import com.zunjae.anyme.rewrite.viewmodels.AnimeViewModel;
import com.zunjae.zrecyclerview.a;
import com.zunjae.zrecyclerview.b;
import defpackage.are;
import defpackage.asc;
import defpackage.bid;
import java.util.List;

public final class SongsActivity extends AbstractActivity {
    private final String c = getClass().getSimpleName();
    private are d;
    @BindView
    TextView errorMessage;
    @BindView
    RecyclerView recyclerView;
    @BindView
    SwipeRefreshLayout swipeRefreshLayout;
    @BindView
    Toolbar toolbar;

    public static Intent a(Context context, are are) {
        Intent intent = new Intent(context, SongsActivity.class);
        intent.putExtra("anime", are);
        return intent;
    }

    private void a(asc asc) {
        this.swipeRefreshLayout.setEnabled(true);
        if (asc != null) {
            if (asc.a()) {
                this.errorMessage.setVisibility(8);
                boolean b = bid.b(asc.t);
                if (bid.b(asc.u) || b) {
                    Context context = this.b;
                    List c = asc.c();
                    Iterable d = asc.d();
                    boolean b2 = bid.b(c);
                    boolean b3 = bid.b(d);
                    if (!b3 && !b2) {
                        c = null;
                    } else if (b2 && b3) {
                        bid.a(c, d);
                    } else if (b3) {
                        c = d;
                    }
                    new b(this.b, this.recyclerView, new AnimeSongsAdapter(context, c)).a(1, 2).b(a.b).a();
                    this.swipeRefreshLayout.setEnabled(false);
                    return;
                }
                this.errorMessage.setVisibility(0);
                this.errorMessage.setText("This Anime has no Opening or Ending theme songs.");
                return;
            }
        }
        this.errorMessage.setVisibility(0);
        this.errorMessage.setText("Could not connect to MAL. Swipe down to try again");
    }

    private static /* synthetic */ void c() {
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.abstract_activity_basic_recyclerview_with_error);
        ButterKnife.a(this);
        this.d = (are) getIntent().getParcelableExtra("anime");
        a(this.toolbar, "Theme Songs", this.d.g(), true);
        this.swipeRefreshLayout.setOnRefreshListener(-$$Lambda$SongsActivity$E42K11366fuotkERPkbDRI7k_z4.INSTANCE);
        ((AnimeViewModel) as.a(this).a(AnimeViewModel.class)).f(this.d.c()).observe(this, new -$$Lambda$SongsActivity$C166AqJwMLPAoOpJ6XbQsMlwjDg(this));
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_songs, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.activity_ost) {
            a(String.format("https://www.youtube.com/results?sp=EgIQA1AU&q=%s OST", new Object[]{this.d.E()}));
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
