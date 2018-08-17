package com.zunjae.anyme.activities;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.afollestad.materialdialogs.e;
import com.afollestad.materialdialogs.j;
import com.afollestad.materialdialogs.o;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.browsers.UserLoginBrowser;
import com.zunjae.anyme.activities.browsers.light_browsers.LightKissBrowser;
import com.zunjae.anyme.rewrite.activities.MainActivityR2;
import defpackage.aln;
import defpackage.aun;
import defpackage.aux;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import mehdi.sakout.fancybuttons.FancyButton;

public final class LoginActivity extends AbstractActivity {
    @BindView
    TextView appName;
    @BindString
    String bEmptyTextWarning;
    @BindString
    String bIncorrectLoginMessage;
    @BindString
    String bInvalidLoginMessage;
    @BindString
    String bLoadingTextMessage;
    @BindString
    String bMalForgotPasswordLink;
    @BindString
    String bMalRegisterLink;
    @BindString
    String bNoInternetConnectionMessage;
    @BindString
    String bOkayMessage;
    @BindString
    String bWarningTitleMessage;
    @BindView
    TextView cantLoginText;
    @BindView
    FancyButton loginButton;
    @BindView
    FancyButton registerButton;
    @BindView
    TextView setupInputPassword;
    @BindView
    TextView setupInputUsername;
    @BindView
    CheckBox showPasswordCheckBox;
    @BindView
    TextView useKissAnimeLight;

    private void a(aln aln) {
        aux.a("KEY_USER_CREDENTIALSV3", (Object) aln);
        startActivity(new Intent(this, MainActivityR2.class));
        finish();
    }

    private /* synthetic */ void a(j jVar, e eVar) {
        a("https://myanimelist.net/editprofile.php?go=myoptions");
    }

    protected final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 100 && i2 == 1) {
            a(new aln(this.setupInputUsername.getText().toString(), this.setupInputPassword.getText().toString()));
        }
    }

    public final void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @OnClick
    public final void onCantLoginTextClicked() {
        new o(this).b().a((int) R.string.cantLoginMessage).c((CharSequence) "Okay").l();
    }

    protected final void onCreate(Bundle bundle) {
        Object obj;
        super.onCreate(bundle);
        setContentView(R.layout.activity_setup);
        ButterKnife.a(this);
        if (!(Build.FINGERPRINT.startsWith("generic") || Build.FINGERPRINT.startsWith("unknown") || Build.MODEL.contains("google_sdk") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")))) {
            if (!"google_sdk".equals(Build.PRODUCT)) {
                obj = null;
                if (obj != null) {
                    new o(this).a((CharSequence) "Warning").a((int) R.string.emulator_warning).d().l();
                }
            }
        }
        obj = 1;
        if (obj != null) {
            new o(this).a((CharSequence) "Warning").a((int) R.string.emulator_warning).d().l();
        }
    }

    @OnClick
    public final void onCreateAccountButtonClicked() {
        b(this.bMalRegisterLink);
        Toast.makeText(this.b, "MAKE SURE YOU PICK A PASSWORD YOU DO NOT USE ANYWHERE ELSE!", 1).show();
        aun.a();
    }

    @OnClick
    public final void onForgotPasswordClicked() {
        b(this.bMalForgotPasswordLink);
    }

    @OnClick
    public final void onKissAnimeTextViewClick() {
        startActivity(new Intent(this, LightKissBrowser.class));
    }

    @OnClick
    public final void onLoginButtonClicked() {
        String charSequence = this.setupInputUsername.getText().toString();
        String charSequence2 = this.setupInputPassword.getText().toString();
        if (!charSequence.isEmpty()) {
            if (!charSequence2.isEmpty()) {
                if (aux.b("KEY_USE_ALT_API", true)) {
                    startActivityForResult(UserLoginBrowser.a(this.b, charSequence, charSequence2), 100);
                    return;
                } else if (charSequence2.contains(":")) {
                    new o(this).a((CharSequence) "Error").b((CharSequence) "Due to the way MyAnimeList is designed, you can not use a semicolon (:) in your password. Change your password on their site.").c((CharSequence) "Change Password").a(new -$$Lambda$LoginActivity$YsM_VyR2b_BC5J2g6I1FEqA6Gtg(this)).l();
                    this.setupInputPassword.setText(BuildConfig.FLAVOR);
                    return;
                } else {
                    new a(this, this, new aln(charSequence, charSequence2)).f();
                    return;
                }
            }
        }
        Toast.makeText(this.b, this.bEmptyTextWarning, 1).show();
    }

    @OnClick
    public final void onShowPasswordCheckBoxClicked(CheckBox checkBox) {
        TextView textView;
        int i;
        CharSequence charSequence = this.setupInputPassword.getText().toString();
        if (checkBox.isChecked()) {
            textView = this.setupInputPassword;
            i = 1;
        } else {
            textView = this.setupInputPassword;
            i = 129;
        }
        textView.setInputType(i);
        this.setupInputPassword.setText(BuildConfig.FLAVOR);
        this.setupInputPassword.append(charSequence);
    }
}
