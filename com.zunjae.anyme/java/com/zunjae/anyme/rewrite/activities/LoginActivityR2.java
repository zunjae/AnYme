package com.zunjae.anyme.rewrite.activities;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.Button;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.afollestad.materialdialogs.j;
import com.afollestad.materialdialogs.o;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.zpagerwrapper.a;
import defpackage.aog;
import defpackage.aun;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class LoginActivityR2 extends AbstractActivity {
    @BindView
    Button loginButton;
    @BindView
    ViewPager viewPager;

    private static /* synthetic */ void a(j jVar, CharSequence charSequence) {
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_login_r2);
        ButterKnife.a(this);
        a aVar = new a(this.viewPager, new aog(getSupportFragmentManager(), this));
    }

    @OnClick
    public final void onCreateAccountButtonClicked() {
        b("https://myanimelist.net/register.php");
        Toast.makeText(this.b, "MAKE SURE YOU PICK A PASSWORD YOU DO NOT USE ANYWHERE ELSE!", 1).show();
        aun.a();
    }

    @OnClick
    public final void onLoginButtonClicked() {
        new o(this).a((CharSequence) "Please login").b(129).a("Username", BuildConfig.FLAVOR, -$$Lambda$LoginActivityR2$N3AZp_ngWN023qeBtwiI427aTmw.INSTANCE).l();
    }
}
