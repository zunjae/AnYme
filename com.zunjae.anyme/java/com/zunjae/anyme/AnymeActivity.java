package com.zunjae.anyme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.zunjae.anyme.activities.LoginActivity;
import com.zunjae.anyme.rewrite.activities.MainActivityR2;
import defpackage.anq;

public final class AnymeActivity extends AppCompatActivity {
    private void a(Class cls) {
        startActivity(new Intent(this, cls));
        finish();
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (isTaskRoot()) {
            a(anq.d() ? MainActivityR2.class : LoginActivity.class);
        } else {
            finish();
        }
    }
}
