package com.zunjae.anyme.activities.misc;

import android.app.Activity;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.afollestad.materialdialogs.o;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import defpackage.anq;
import defpackage.aux;
import defpackage.bit;

public final class AuthUserActivity extends AbstractActivity {
    public static void a(Activity activity) {
        a(activity, "Success", "You have successfully logged in through Kanon. You are now able to add notes to episodes and add unlimited waifus to your profile!");
    }

    private static void a(Activity activity, String str, String str2) {
        new o(activity).a((CharSequence) str).b((CharSequence) str2).c((CharSequence) "ok").a(new a(activity)).l();
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_blank);
        ButterKnife.a(this);
        if ((anq.d() ^ 1) != 0) {
            a(this, "Error", "You need to login first within AnYme before you can use Kanon");
            return;
        }
        String queryParameter = getIntent().getData().getQueryParameter("token");
        if (bit.b(queryParameter)) {
            a(this, "Error", "Incorrect token. Could not verify your account");
        } else if (queryParameter.length() != 10) {
            a(this, "Error", "invalid token");
        } else {
            aux.a("KEY_KANONAPP_TOKEN", queryParameter);
            a(this);
        }
    }
}
