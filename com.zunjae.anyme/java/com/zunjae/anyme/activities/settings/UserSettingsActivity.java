package com.zunjae.anyme.activities.settings;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import defpackage.ajv;
import defpackage.akj;

public final class UserSettingsActivity extends AbstractActivity {
    private final String c = "UserSettingsActivity";
    @BindView
    Toolbar toolbar;

    public final void a(ajv ajv) {
        String name = ajv.getClass().getName();
        FragmentManager fragmentManager = getFragmentManager();
        if (!fragmentManager.popBackStackImmediate(name, 0)) {
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            beginTransaction.replace(R.id.fragmentContainerFrameLayout, ajv);
            if (!(ajv instanceof akj)) {
                beginTransaction.addToBackStack(name);
            }
            beginTransaction.commit();
        }
    }

    public final void c(String str) {
        this.toolbar.setTitle(str);
    }

    protected final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 10) {
            setResult(i2);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_preferences);
        ButterKnife.a(this);
        c(this.toolbar);
        a(new akj());
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int backStackEntryCount = getFragmentManager().getBackStackEntryCount();
        if (menuItem.getItemId() == 16908332) {
            if (backStackEntryCount > 0) {
                getFragmentManager().popBackStackImmediate();
                return true;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
