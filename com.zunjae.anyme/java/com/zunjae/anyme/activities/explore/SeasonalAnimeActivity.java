package com.zunjae.anyme.activities.explore;

import android.arch.lifecycle.as;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.anyme.adapters.animes.AnimeSeasonalAdapter;
import com.zunjae.anyme.rewrite.viewmodels.AnimeViewModel;
import com.zunjae.zrecyclerview.a;
import com.zunjae.zrecyclerview.b;
import defpackage.anj;
import defpackage.asg;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class SeasonalAnimeActivity extends AbstractActivity {
    final ArrayList<asg> c;
    private final String d = getClass().getSimpleName();
    private AnimeSeasonalAdapter e;
    @BindView
    TextView errorMessage;
    private AnimeViewModel f;
    @BindView
    CheckBox hideAlreadyAdded;
    @BindView
    RecyclerView recyclerView;
    @BindView
    Spinner spinner;
    @BindView
    SwipeRefreshLayout swipeRefreshLayout;
    @BindView
    Toolbar toolbar;

    public SeasonalAnimeActivity() {
        Object arrayList = new ArrayList();
        int i = Calendar.getInstance().get(1);
        String[] strArr = new String[]{"Spring", "Summer", "Fall", "Winter"};
        for (int i2 = i - 30; i2 <= i; i2++) {
            for (int i3 = 0; i3 < 4; i3++) {
                arrayList.add(new asg(i2, strArr[i3]));
            }
        }
        Collections.reverse(arrayList);
        this.c = arrayList;
    }

    private void a(asg asg) {
        new v(this, this, asg).f();
    }

    static /* synthetic */ void a(SeasonalAnimeActivity seasonalAnimeActivity, anj anj) {
        if (anj != null) {
            if (anj.a() != null) {
                if (anj.a().size() == 0) {
                    seasonalAnimeActivity.errorMessage.setText("Could not find any seasonal Anime ):");
                    seasonalAnimeActivity.errorMessage.setVisibility(0);
                    return;
                }
                seasonalAnimeActivity.e.a(anj.a(), anj.b());
                seasonalAnimeActivity.swipeRefreshLayout.setEnabled(false);
                seasonalAnimeActivity.errorMessage.setVisibility(8);
                return;
            }
        }
        seasonalAnimeActivity.errorMessage.setText("Could not connect to MAL. Swipe down to try again");
        seasonalAnimeActivity.errorMessage.setVisibility(0);
    }

    private /* synthetic */ void c() {
        a(null);
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_seasonal_anime);
        ButterKnife.a(this);
        this.f = (AnimeViewModel) as.a(this).a(AnimeViewModel.class);
        this.c.add(0, new asg(-1, "Current Season"));
        a(this.toolbar, "Seasonal Anime", BuildConfig.FLAVOR, true);
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 17367048, this.c);
        arrayAdapter.setDropDownViewResource(17367049);
        this.spinner.setAdapter(arrayAdapter);
        this.spinner.setOnItemSelectedListener(new u(this));
        int integer = this.b.getResources().getInteger(R.integer.span_optimized_layout);
        this.e = new AnimeSeasonalAdapter(this, this.f);
        new b(this.b, this.recyclerView, this.e).b(a.b).a(integer, integer + 1).a();
        a(null);
        this.swipeRefreshLayout.setOnRefreshListener(new -$$Lambda$SeasonalAnimeActivity$BUISNpPRZnw0v4yVu5GqRWqLkBI(this));
    }

    @OnCheckedChanged
    public final void setShouldHideAlreadyAdded(CheckBox checkBox) {
        boolean isChecked = checkBox.isChecked();
        AnimeSeasonalAdapter animeSeasonalAdapter = this.e;
        if (animeSeasonalAdapter != null) {
            animeSeasonalAdapter.a(isChecked);
        }
    }
}
