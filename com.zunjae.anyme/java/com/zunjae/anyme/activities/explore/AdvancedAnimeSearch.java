package com.zunjae.anyme.activities.explore;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.greenfrvr.hashtagview.HashtagView;
import com.greenfrvr.hashtagview.h;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.anyme.activities.browsers.SearchResultsBrowser;
import defpackage.alv;
import defpackage.alx;
import defpackage.aml;
import defpackage.amo;
import java.util.ArrayList;
import mehdi.sakout.fancybuttons.FancyButton;

public final class AdvancedAnimeSearch extends AbstractActivity {
    private final String c = getClass().getSimpleName();
    private final h<aml> d = new a(this);
    private ArrayList<Integer> e;
    @BindView
    HashtagView hashtagView;
    @BindView
    EditText inputName;
    @BindView
    Spinner scoreSpinner;
    @BindView
    FancyButton searchButton;
    @BindView
    Spinner statusSpinner;
    @BindView
    Toolbar toolbar;

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_searchanimeactivity);
        ButterKnife.a(this);
        this.e = getIntent().getIntegerArrayListExtra("preselectedIntegers");
        c(this.toolbar);
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 17367048, amo.a());
        arrayAdapter.setDropDownViewResource(17367049);
        this.scoreSpinner.setAdapter(arrayAdapter);
        SpinnerAdapter arrayAdapter2 = new ArrayAdapter(this, 17367048, alv.a());
        arrayAdapter2.setDropDownViewResource(17367049);
        this.statusSpinner.setAdapter(arrayAdapter2);
        this.hashtagView.a(aml.a(true), this.d, new b(this));
        this.hashtagView.setComposeMode(1);
    }

    @OnClick
    public final void onSearchButtonClick() {
        Parcelable alv = new alv();
        alv.a(this.inputName.getText().toString());
        alv.a(((amo) this.scoreSpinner.getSelectedItem()).b());
        alv.a((alx) this.statusSpinner.getSelectedItem());
        alv.a(this.hashtagView.getSelectedItems());
        Intent intent = new Intent(this.b, SearchResultsBrowser.class);
        intent.putExtra("animeSearchResult", alv);
        startActivity(intent);
    }
}
