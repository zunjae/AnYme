package com.zunjae.anyme.activities.explore;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.anyme.fragments.anime.FragmentAnimeDiscoverSingleList;

public final class DiscoveryListActivity extends AbstractActivity {
    private final String c = getClass().getSimpleName();

    public static Intent a(Context context, int i, String str) {
        Intent intent = new Intent(context, DiscoveryListActivity.class);
        intent.putExtra("discoveryListType", i);
        intent.putExtra("title", str);
        return intent;
    }

    protected final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 10 && i2 == 1) {
            setResult(1);
        }
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_with_fragment);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        int intExtra = getIntent().getIntExtra("discoveryListType", -1);
        String stringExtra = getIntent().getStringExtra("title");
        if (intExtra == -1 || stringExtra == null) {
            throw new IllegalArgumentException("Incorrectly set the argument");
        }
        a(toolbar, stringExtra);
        a((int) R.id.viewGroup, (Fragment) FragmentAnimeDiscoverSingleList.a(intExtra));
    }
}
