package com.zunjae.anyme.dialogs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.zunjae.anyme.R;
import com.zunjae.anyme.adapters.pickers.CastPickerAdapter;
import com.zunjae.zapplib.a;
import com.zunjae.zrecyclerview.b;
import defpackage.alf;
import defpackage.ann;

public final class CastDialog extends b {
    public static String b = "TAG_IGNORE_CASTING";
    static final /* synthetic */ boolean c = true;
    private final String d = "CastDialog";
    private String e;
    private String f;
    @BindView
    RecyclerView recyclerView;
    @BindView
    CheckBox rememberCastingAppCheckbox;

    public static CastDialog a(String str, String str2) {
        CastDialog castDialog = new CastDialog();
        Bundle bundle = new Bundle();
        bundle.putString("videoURL", str);
        bundle.putString("videoTitle", str2);
        castDialog.setArguments(bundle);
        return castDialog;
    }

    private void a(alf alf) {
        if (this.e.equals(b)) {
            dismiss();
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(Uri.parse(this.e), "video/*");
        intent.putExtra("title", this.f);
        intent.setPackage(alf.c());
        if (a.a(this.a, intent)) {
            if (this.rememberCastingAppCheckbox.isChecked()) {
                ann.c(alf.a(alf));
            }
            startActivity(intent);
            dismiss();
            return;
        }
        Toast.makeText(this.a, String.format("Can not cast using %s app. Try again with a different app", new Object[]{alf.b()}), 1).show();
    }

    static /* synthetic */ void a(com.zunjae.anyme.dialogs.CastDialog r4, java.lang.String r5) {
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
        r0 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r1 = "android.intent.action.VIEW";	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r2 = "market://details?id=";	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r3 = java.lang.String.valueOf(r5);	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r2 = r2.concat(r3);	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r2 = android.net.Uri.parse(r2);	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r0.<init>(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r4.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x0019 }
        return;
    L_0x0019:
        r0 = new android.content.Intent;
        r1 = "android.intent.action.VIEW";
        r2 = "https://play.google.com/store/apps/details?id=";
        r5 = java.lang.String.valueOf(r5);
        r5 = r2.concat(r5);
        r5 = android.net.Uri.parse(r5);
        r0.<init>(r1, r5);
        r4.startActivity(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.dialogs.CastDialog.a(com.zunjae.anyme.dialogs.CastDialog, java.lang.String):void");
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (!c) {
            if (getArguments() == null) {
                throw new AssertionError();
            }
        }
        this.e = getArguments().getString("videoURL");
        this.f = getArguments().getString("videoTitle");
        if (this.f == null || this.e == null) {
            throw new NullPointerException("Incorrectly set the arguments");
        }
        alf a = ann.a(this.a);
        if (a != null) {
            this.rememberCastingAppCheckbox.setChecked(c);
            a(a);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.dialog_cast, viewGroup, false);
        ButterKnife.a(this, inflate);
        return inflate;
    }

    public final void onResume() {
        super.onResume();
        new b(this.a, this.recyclerView, new CastPickerAdapter(this.a, new c(this))).a(1, 2).b(com.zunjae.zrecyclerview.a.b).a();
    }

    public final void onStart() {
        super.onStart();
        b();
    }
}
