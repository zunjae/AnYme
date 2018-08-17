package com.zunjae.anyme.rewrite.ui.dialogs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.zunjae.anyme.R;
import com.zunjae.anyme.dialogs.b;
import mehdi.sakout.fancybuttons.FancyButton;

public final class ManualEpisodeSelectorDialogR2 extends b {
    private final String b = getClass().getSimpleName();
    private int c;
    @BindView
    EditText inputEpisode;
    @BindView
    LinearLayout manualContainer;
    @BindView
    FancyButton saveButton;

    public final void onActivityCreated(android.os.Bundle r3) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r2 = this;
        super.onActivityCreated(r3);
        r3 = r2.getArguments();
        r0 = "myWatchedEpisodes";
        r1 = -10;
        r3 = r3.getInt(r0, r1);
        r2.c = r3;
        r3 = r2.c;
        if (r3 == r1) goto L_0x0035;
    L_0x0015:
        r3 = r2.inputEpisode;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r2.c;
        r0.append(r1);
        r0 = r0.toString();
        r3.setHint(r0);
        r3 = r2.getDialog();	 Catch:{ Exception -> 0x0034 }
        r3 = r3.getWindow();	 Catch:{ Exception -> 0x0034 }
        r0 = 4;	 Catch:{ Exception -> 0x0034 }
        r3.setSoftInputMode(r0);	 Catch:{ Exception -> 0x0034 }
    L_0x0034:
        return;
    L_0x0035:
        r3 = new java.lang.IllegalArgumentException;
        r0 = "Incorrectly set the Anime object";
        r3.<init>(r0);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.rewrite.ui.dialogs.ManualEpisodeSelectorDialogR2.onActivityCreated(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.dialog_manual_episode_picker, viewGroup, false);
        ButterKnife.a(this, inflate);
        return inflate;
    }

    @butterknife.OnClick
    public final void saveButtonClick() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r3 = this;
        r0 = r3.inputEpisode;
        r0 = r0.getText();
        r0 = r0.toString();
        r1 = "";
        r0 = r0.equals(r1);
        r1 = 0;
        if (r0 == 0) goto L_0x001f;
    L_0x0013:
        r0 = r3.a;
        r2 = "Make sure you enter something";
        r0 = android.widget.Toast.makeText(r0, r2, r1);
        r0.show();
        return;
    L_0x001f:
        r0 = r3.inputEpisode;
        r0 = r0.getText();
        r0 = r0.toString();
        r2 = "[0-9]+";
        r0 = r0.matches(r2);
        if (r0 != 0) goto L_0x003d;
    L_0x0031:
        r0 = r3.a;
        r2 = "Make sure you only enter numbers";
        r0 = android.widget.Toast.makeText(r0, r2, r1);
        r0.show();
        return;
    L_0x003d:
        r0 = r3.inputEpisode;	 Catch:{ Exception -> 0x0069 }
        r0 = r0.getText();	 Catch:{ Exception -> 0x0069 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x0069 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ Exception -> 0x0069 }
        if (r0 >= 0) goto L_0x0059;
    L_0x004d:
        r0 = r3.a;
        r2 = "Make sure that the number you enter is greater than 0";
        r0 = android.widget.Toast.makeText(r0, r2, r1);
        r0.show();
        return;
    L_0x0059:
        r1 = defpackage.aui.a();
        r2 = new arw;
        r2.<init>(r0);
        r1.c(r2);
        r3.dismiss();
        return;
    L_0x0069:
        r0 = r3.a;
        r2 = "Your input is invalid";
        r0 = android.widget.Toast.makeText(r0, r2, r1);
        r0.show();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.rewrite.ui.dialogs.ManualEpisodeSelectorDialogR2.saveButtonClick():void");
    }
}
