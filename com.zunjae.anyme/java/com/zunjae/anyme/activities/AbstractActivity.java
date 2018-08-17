package com.zunjae.anyme.activities;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import com.zunjae.anyme.R;
import com.zunjae.anyme.dialogs.UpdateDialog;
import com.zunjae.zapplib.a;
import defpackage.anl;
import defpackage.aun;
import defpackage.aux;
import io.github.inflationx.viewpump.ViewPumpContextWrapper;

public abstract class AbstractActivity extends AppCompatActivity {
    protected final String a = getClass().getSimpleName();
    protected Context b;

    protected final void a(int i, Fragment fragment) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(i, fragment);
        beginTransaction.commitAllowingStateLoss();
    }

    protected final void a(Toolbar toolbar, String str) {
        a(toolbar, str, null, true);
    }

    protected final void a(Toolbar toolbar, String str, String str2, boolean z) {
        if (str != null) {
            toolbar.setTitle(str);
        }
        if (str2 != null) {
            toolbar.setSubtitle(str2);
        }
        a(toolbar);
        if (z && b() != null) {
            b().a(true);
        }
    }

    public final void a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(268435456);
        this.b.startActivity(intent);
    }

    protected void attachBaseContext(Context context) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(context));
    }

    protected final void b(Toolbar toolbar) {
        a(toolbar, null, null, false);
    }

    public final void b(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(268435456);
        startActivity(Intent.createChooser(intent, "Pick Your Browser"));
    }

    protected final void c(Toolbar toolbar) {
        a(toolbar, null, null, true);
    }

    protected void onCreate(Bundle bundle) {
        this.b = this;
        boolean z = true;
        if (aux.b().getBoolean(this.b.getString(R.string.preference_key_app_fullscreen), true)) {
            getWindow().setFlags(1024, 1024);
        }
        super.onCreate(bundle);
        aun.a(this);
        if (anl.a() <= a.b(this.b)) {
            z = false;
        }
        if (z) {
            new UpdateDialog().show(getSupportFragmentManager(), "UpdateDialog");
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    protected void onResume() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.attributes.IAttribute jadx.core.dex.attributes.AttrNode.get(jadx.core.dex.attributes.AType)' on a null object reference
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r3 = this;
        super.onResume();
        r0 = r3.b;	 Catch:{ Exception -> 0x0050 }
        r0 = defpackage.aug.a(r0);	 Catch:{ Exception -> 0x0050 }
        if (r0 == 0) goto L_0x0050;	 Catch:{ Exception -> 0x0050 }
    L_0x000b:
        r1 = "anymetoken:";	 Catch:{ Exception -> 0x0050 }
        r1 = r0.startsWith(r1);	 Catch:{ Exception -> 0x0050 }
        if (r1 == 0) goto L_0x0050;	 Catch:{ Exception -> 0x0050 }
    L_0x0013:
        r1 = "anymetoken:";	 Catch:{ Exception -> 0x0050 }
        r2 = "";	 Catch:{ Exception -> 0x0050 }
        r0 = r0.replace(r1, r2);	 Catch:{ Exception -> 0x0050 }
        r1 = r0.length();	 Catch:{ Exception -> 0x0050 }
        r2 = 10;	 Catch:{ Exception -> 0x0050 }
        if (r1 == r2) goto L_0x0024;	 Catch:{ Exception -> 0x0050 }
    L_0x0023:
        return;	 Catch:{ Exception -> 0x0050 }
    L_0x0024:
        r1 = "KEY_KANONAPP_TOKEN";	 Catch:{ Exception -> 0x0050 }
        r2 = 0;	 Catch:{ Exception -> 0x0050 }
        r1 = defpackage.aux.b(r1, r2);	 Catch:{ Exception -> 0x0050 }
        if (r1 == 0) goto L_0x0041;	 Catch:{ Exception -> 0x0050 }
    L_0x002d:
        r1 = r1.equalsIgnoreCase(r0);	 Catch:{ Exception -> 0x0050 }
        if (r1 != 0) goto L_0x0034;	 Catch:{ Exception -> 0x0050 }
    L_0x0033:
        goto L_0x0041;	 Catch:{ Exception -> 0x0050 }
    L_0x0034:
        r0 = r3.b;	 Catch:{ Exception -> 0x0050 }
        r1 = "You are already logged in into KanonApp :D";	 Catch:{ Exception -> 0x0050 }
        r2 = 0;	 Catch:{ Exception -> 0x0050 }
        r0 = android.widget.Toast.makeText(r0, r1, r2);	 Catch:{ Exception -> 0x0050 }
        r0.show();	 Catch:{ Exception -> 0x0050 }
        goto L_0x0049;	 Catch:{ Exception -> 0x0050 }
    L_0x0041:
        r1 = "KEY_KANONAPP_TOKEN";	 Catch:{ Exception -> 0x0050 }
        defpackage.aux.a(r1, r0);	 Catch:{ Exception -> 0x0050 }
        com.zunjae.anyme.activities.misc.AuthUserActivity.a(r3);	 Catch:{ Exception -> 0x0050 }
    L_0x0049:
        r0 = r3.b;	 Catch:{ Exception -> 0x0050 }
        r1 = "";	 Catch:{ Exception -> 0x0050 }
        defpackage.aug.a(r0, r1);	 Catch:{ Exception -> 0x0050 }
    L_0x0050:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.activities.AbstractActivity.onResume():void");
    }
}
