package com.zunjae.anyme.activities.explore;

import android.arch.lifecycle.as;
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
import com.zunjae.anyme.rewrite.viewmodels.AnimeViewModel;
import defpackage.ami;

public final class CategoryItemsActivity extends AbstractActivity {
    private ami c;
    private AnimeViewModel d;
    @BindView
    TextView errorMessage;
    @BindView
    RecyclerView recyclerView;
    @BindView
    SwipeRefreshLayout swipeRefreshLayout;
    @BindView
    Toolbar toolbar;

    public static Intent a(Context context, ami ami) {
        Intent intent = new Intent(context, CategoryItemsActivity.class);
        intent.putExtra("animeCategory", ami);
        return intent;
    }

    private void c() {
        i iVar = new i(this, this);
        iVar.a(true);
        iVar.f();
    }

    protected final void onActivityResult(int i, int i2, Intent intent) {
        setResult(i2);
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.abstract_activity_basic_recyclerview_with_error);
        ButterKnife.a(this);
        this.d = (AnimeViewModel) as.a(this).a(AnimeViewModel.class);
        this.c = (ami) getIntent().getParcelableExtra("animeCategory");
        a(this.toolbar, "Category", this.c.a(), true);
        this.swipeRefreshLayout.setOnRefreshListener(new h(this));
        c();
    }
}
