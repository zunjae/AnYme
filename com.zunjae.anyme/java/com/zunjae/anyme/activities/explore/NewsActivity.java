package com.zunjae.anyme.activities.explore;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.anyme.fragments.anime.FragmentAnimeNews;
import defpackage.are;

public final class NewsActivity extends AbstractActivity {
    private final String c = "NewsActivity";

    public static Intent a(Context context, are are) {
        Intent intent = new Intent(context, NewsActivity.class);
        intent.putExtra("anime", are);
        return intent;
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_with_fragment);
        are are = (are) getIntent().getParcelableExtra("anime");
        a((int) R.id.viewGroup, (Fragment) FragmentAnimeNews.a(are));
        a((Toolbar) findViewById(R.id.toolbar), "News", are.g(), true);
    }
}
