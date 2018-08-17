package com.zunjae.anyme.activities.explore;

import android.annotation.SuppressLint;
import android.arch.lifecycle.as;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Menu;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import com.afollestad.materialdialogs.o;
import com.miguelcatalan.materialsearchview.MaterialSearchView;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.anyme.adapters.animes.BetterMALSearchResultsAdapter;
import com.zunjae.anyme.fragments.FragmentGenres;
import com.zunjae.anyme.rewrite.viewmodels.AnimeViewModel;
import com.zunjae.zrecyclerview.a;
import com.zunjae.zrecyclerview.b;
import defpackage.alt;
import defpackage.anl;
import defpackage.aul;
import defpackage.bit;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class FastAnimeSearchActivity extends AbstractActivity {
    private final String c = getClass().getName();
    private BetterMALSearchResultsAdapter d;
    private String e;
    private ArrayList<Integer> f;
    @BindView
    FrameLayout frameLayoutGenres;
    private ArrayList<alt> g;
    private boolean h = true;
    @BindView
    CheckBox hideAlreadyAdded;
    private FastAnimeSearchActivity i;
    private AnimeViewModel j;
    @BindView
    RecyclerView recyclerView;
    @BindView
    TextView removedShowsTextView;
    @BindView
    MaterialSearchView searchView;
    @BindView
    SwipeRefreshLayout swipeRefreshLayout;
    @BindView
    Toolbar toolbar;
    @BindView
    TextView userInfo;

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, FastAnimeSearchActivity.class);
        intent.putExtra("query", str);
        return intent;
    }

    @SuppressLint({"DefaultLocale"})
    private void a(ArrayList<alt> arrayList, ArrayList<Integer> arrayList2) {
        this.g = arrayList;
        this.f = arrayList2;
        ((AnimeViewModel) as.a(this).a(AnimeViewModel.class)).h().observe(this, new -$$Lambda$FastAnimeSearchActivity$kCrwg2lKx-AapoPuAJ8ymnWsdSI(this, new AtomicBoolean(false), arrayList, arrayList2));
    }

    private /* synthetic */ void a(AtomicBoolean atomicBoolean, ArrayList arrayList, ArrayList arrayList2, List list) {
        if (list != null && !atomicBoolean.get()) {
            ArrayList arrayList3 = arrayList;
            List list2 = list;
            this.d = new BetterMALSearchResultsAdapter(this, arrayList3, list2, this.h, anl.b(this.b), arrayList2, this.j);
            int integer = this.b.getResources().getInteger(R.integer.span_fast_anime_search_results);
            new b(this.b, this.recyclerView, this.d).b(a.b).a(integer, integer + 1).a();
            integer = this.d.a();
            if (integer > 0) {
                this.removedShowsTextView.setVisibility(0);
                this.removedShowsTextView.setText(Html.fromHtml(String.format("<u>Number of hidden NSFW shows: %d</u>", new Object[]{Integer.valueOf(integer)})));
            } else {
                this.removedShowsTextView.setVisibility(8);
            }
            if (integer > 5) {
                showDialogFilteredResults();
            }
            atomicBoolean.set(true);
        }
    }

    protected final void onActivityResult(int i, int i2, Intent intent) {
        setResult(i2);
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_better_anime_search);
        ButterKnife.a(this);
        this.i = this;
        this.j = (AnimeViewModel) as.a(this).a(AnimeViewModel.class);
        if (getIntent() != null) {
            this.e = getIntent().getStringExtra("query");
        }
        a((int) R.id.fragmentContainerFrameLayout, (Fragment) FragmentGenres.a());
        this.swipeRefreshLayout.setEnabled(false);
        c(this.toolbar);
        this.searchView.setOnQueryTextListener(new j(this));
        this.searchView.a(false);
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            this.searchView.a(charSequence, true);
        } else {
            getWindow().setSoftInputMode(4);
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_better_fastanimesearch, menu);
        new aul(this.b).d(menu);
        this.searchView.setMenuItem(menu.findItem(R.id.action_search));
        return true;
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.g = bundle.getParcelableArrayList("searchResults");
        this.f = bundle.getIntegerArrayList("nsfwIds");
        if (!(this.g == null || this.f == null)) {
            this.userInfo.setVisibility(8);
            a(this.g, this.f);
        }
        CharSequence string = bundle.getString("toolBarSubTitleText");
        if (!bit.b(string)) {
            this.toolbar.setSubtitle(string);
        }
    }

    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("searchResults", this.g);
        bundle.putIntegerArrayList("nsfwIds", this.f);
        bundle.putString("toolBarSubTitleText", (String) this.toolbar.getSubtitle());
    }

    @OnCheckedChanged
    public final void setShouldHideAlreadyAdded(CheckBox checkBox) {
        this.h = checkBox.isChecked();
        BetterMALSearchResultsAdapter betterMALSearchResultsAdapter = this.d;
        if (betterMALSearchResultsAdapter != null) {
            betterMALSearchResultsAdapter.a(this.h);
        }
    }

    @OnClick
    public final void showDialogFilteredResults() {
        new o(this).a((CharSequence) "Notice").b((CharSequence) "Certain 18+ shows are filtered. You can see them by downloading the 'AnYme Patch' in the Discord server. Join the server and ask someone how to get it").c((CharSequence) "Join").a(new k(this)).l();
    }
}
