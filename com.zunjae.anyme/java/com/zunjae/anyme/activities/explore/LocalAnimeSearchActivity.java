package com.zunjae.anyme.activities.explore;

import android.arch.lifecycle.as;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.CheckBox;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import com.miguelcatalan.materialsearchview.MaterialSearchView;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.anyme.rewrite.ui.fragments.FragmentAnimeListR2;
import com.zunjae.anyme.rewrite.viewmodels.AnimeViewModel;
import defpackage.aul;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class LocalAnimeSearchActivity extends AbstractActivity {
    private FragmentAnimeListR2 c;
    private String d = BuildConfig.FLAVOR;
    private AnimeViewModel e;
    @BindView
    CheckBox filterMovies;
    @BindView
    CheckBox filterOther;
    @BindView
    CheckBox filterTV;
    @BindView
    MaterialSearchView searchView;
    @BindView
    Toolbar toolbar;

    private /* synthetic */ void a(List list) {
        if (list != null) {
            this.c = FragmentAnimeListR2.a(0);
            this.c.a(new -$$Lambda$LocalAnimeSearchActivity$ZcZFAVUM7h8nCOWWWik2mH5iG4A(this));
            a((int) R.id.fragmentContainerFrameLayout, (Fragment) this.c);
            d();
            this.searchView.a(false);
            getWindow().setSoftInputMode(4);
        }
    }

    private void c() {
        FragmentAnimeListR2 fragmentAnimeListR2 = this.c;
        if (fragmentAnimeListR2 != null) {
            fragmentAnimeListR2.a(this.d, this.filterTV.isChecked(), this.filterMovies.isChecked(), this.filterOther.isChecked());
            Toolbar toolbar = this.toolbar;
            StringBuilder stringBuilder = new StringBuilder("Searching for \"");
            stringBuilder.append(this.d);
            stringBuilder.append("\"");
            toolbar.setSubtitle(stringBuilder.toString());
        }
    }

    private void d() {
        this.searchView.setOnQueryTextListener(new p(this));
    }

    private /* synthetic */ void e() {
        c();
        this.searchView.a(this.d, false);
    }

    public final void onBackPressed() {
        MaterialSearchView materialSearchView = this.searchView;
        if (materialSearchView == null || !materialSearchView.b()) {
            super.onBackPressed();
            return;
        }
        this.searchView.setOnQueryTextListener(null);
        this.searchView.d();
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.search_local_anime_activity);
        ButterKnife.a(this);
        this.e = (AnimeViewModel) as.a(this).a(AnimeViewModel.class);
        c(this.toolbar);
        this.searchView.setSubmitOnClick(false);
        this.searchView.setOnSearchViewListener(new o(this));
        if (bundle != null) {
            this.d = bundle.getString("filterTextUserInput");
        }
        this.e.g().observe(this, new -$$Lambda$LocalAnimeSearchActivity$xVxfVElkC80XzAj89JEgDn0auGk(this));
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.basic_search, menu);
        new aul(this.b).e(menu);
        this.searchView.setMenuItem(menu.findItem(R.id.action_search));
        return true;
    }

    @OnCheckedChanged
    public final void onFilterChanged() {
        c();
    }

    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("filterTextUserInput", this.d);
    }
}
