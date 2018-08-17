package com.zunjae.anyme.rewrite.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.afollestad.materialdialogs.o;
import com.l4digital.fastscroll.i;
import com.mikepenz.iconics.view.IconicsTextView;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.anyme.rewrite.activities.AnimeInfoActivityR2;
import com.zunjae.anyme.rewrite.adapters.generic.ClassicAdapter;
import com.zunjae.anyme.rewrite.adapters.generic.ClassicAdapterAd;
import com.zunjae.anyme.rewrite.adapters.generic.OptimizedAdapter;
import com.zunjae.anyme.rewrite.adapters.generic.OptimizedAdapterAd;
import com.zunjae.anyme.rewrite.adapters.generic.a;
import com.zunjae.anyme.rewrite.adapters.generic.b;
import com.zunjae.anyme.rewrite.viewmodels.AnimeViewModel;
import defpackage.alc;
import defpackage.alg;
import defpackage.alm;
import defpackage.als;
import defpackage.are;
import defpackage.arq;
import defpackage.art;
import defpackage.asr;
import defpackage.ast;
import defpackage.aub;
import defpackage.aux;
import defpackage.bid;
import defpackage.bit;
import defpackage.di;
import defpackage.fa;
import defpackage.mh;
import defpackage.tw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class c extends Adapter<ViewHolder> implements i {
    private static final String a = "com.zunjae.anyme.rewrite.adapters.c";
    private final int b;
    private List<are> c;
    private List<are> d;
    private boolean e = false;
    private final Activity f;
    private final AnimeViewModel g;
    private boolean h;
    private int i;
    private int j;
    private int k = -1;
    private int l;
    private final di m;

    public c(Activity activity, int i, AnimeViewModel animeViewModel, di diVar) {
        this.f = activity;
        this.g = animeViewModel;
        this.b = i;
        this.m = diVar;
        this.h = aux.b(this.f.getString(R.string.preference_key_show_percentage_anime_watched), true);
        this.k = alc.a(false);
        this.i = this.f.getResources().getInteger(R.integer.imageWidth);
        this.j = this.f.getResources().getInteger(R.integer.imageHeight);
    }

    private /* synthetic */ void a(View view) {
        ((AbstractActivity) this.f).a("https://kanonapp.com/account/register");
    }

    private /* synthetic */ void a(are are, alg alg) {
        if (alg.c()) {
            Toast.makeText(this.f, String.format("Deleted %s from your profile", new Object[]{are.g()}), 0).show();
            return;
        }
        aub.a(this.f, alg);
    }

    private /* synthetic */ void a(are are, View view) {
        Collection arrayList = new ArrayList();
        if (are.v() != 2) {
            arrayList.add("+1 Episode");
        }
        arrayList.add("Open");
        arrayList.add("Watch");
        arrayList.add("Share");
        arrayList.add("Delete");
        arrayList.add("Copy Title To Clipboard");
        new o(this.f).a((CharSequence) "Pick an Action").a(arrayList).a(new -$$Lambda$c$ov7KdDt_5eDy9yGcRmnCkItuLvs(this, arrayList, are)).l();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private /* synthetic */ void a(java.util.ArrayList r1, defpackage.are r2, com.afollestad.materialdialogs.j r3, android.view.View r4, int r5, java.lang.CharSequence r6) {
        /*
        r0 = this;
        r1 = r1.get(r5);
        r1 = (java.lang.String) r1;
        r3 = r1.hashCode();
        r4 = 0;
        switch(r3) {
            case -898508412: goto L_0x0041;
            case 2464362: goto L_0x0037;
            case 79847359: goto L_0x002d;
            case 83350703: goto L_0x0023;
            case 1824469281: goto L_0x0019;
            case 2043376075: goto L_0x000f;
            default: goto L_0x000e;
        };
    L_0x000e:
        goto L_0x004b;
    L_0x000f:
        r3 = "Delete";
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x004b;
    L_0x0017:
        r1 = 3;
        goto L_0x004c;
    L_0x0019:
        r3 = "+1 Episode";
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x004b;
    L_0x0021:
        r1 = 0;
        goto L_0x004c;
    L_0x0023:
        r3 = "Watch";
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x004b;
    L_0x002b:
        r1 = 5;
        goto L_0x004c;
    L_0x002d:
        r3 = "Share";
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x004b;
    L_0x0035:
        r1 = 2;
        goto L_0x004c;
    L_0x0037:
        r3 = "Open";
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x004b;
    L_0x003f:
        r1 = 1;
        goto L_0x004c;
    L_0x0041:
        r3 = "Copy Title To Clipboard";
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x004b;
    L_0x0049:
        r1 = 4;
        goto L_0x004c;
    L_0x004b:
        r1 = -1;
    L_0x004c:
        switch(r1) {
            case 0: goto L_0x00d8;
            case 1: goto L_0x00ca;
            case 2: goto L_0x00a0;
            case 3: goto L_0x008a;
            case 4: goto L_0x0075;
            case 5: goto L_0x005f;
            default: goto L_0x004f;
        };
    L_0x004f:
        r1 = new java.lang.IllegalStateException;
        r2 = java.lang.String.valueOf(r5);
        r3 = "no switch case found for ";
        r2 = r3.concat(r2);
        r1.<init>(r2);
        throw r1;
    L_0x005f:
        r1 = new art;
        r1.<init>();
        r1.b();
        r3 = r0.f;
        r2 = r2.L();
        r1 = com.zunjae.anyme.rewrite.activities.AnimeInfoActivityR2.a(r3, r2, r1);
        r3.startActivity(r1);
        return;
    L_0x0075:
        r1 = r0.f;
        r2 = r2.g();
        defpackage.aug.a(r1, r2);
        r1 = r0.f;
        r2 = "Copied title to your clipboard";
        r1 = android.widget.Toast.makeText(r1, r2, r4);
        r1.show();
        return;
    L_0x008a:
        r1 = new atz;
        r3 = r0.f;
        r4 = r2.d();
        r5 = r0.g;
        r6 = new com.zunjae.anyme.rewrite.adapters.-$$Lambda$c$mu_PgvtjLaGFtdp7348k7oEpYfc;
        r6.<init>(r0, r2);
        r1.<init>(r3, r4, r5, r6);
        r1.f();
        return;
    L_0x00a0:
        r1 = r0.f;
        r3 = new android.content.Intent;
        r4 = "android.intent.action.SEND";
        r3.<init>(r4);
        r4 = "text/plain";
        r3.setType(r4);
        r4 = "android.intent.extra.TEXT";
        r5 = r2.x();
        r3.putExtra(r4, r5);
        r4 = "android.intent.extra.SUBJECT";
        r2 = r2.g();
        r3.putExtra(r4, r2);
        r2 = "Share this Anime";
        r2 = android.content.Intent.createChooser(r3, r2);
        r1.startActivity(r2);
        return;
    L_0x00ca:
        r1 = r0.f;
        r2 = r2.L();
        r2 = com.zunjae.anyme.rewrite.activities.AnimeInfoActivityR2.a(r1, r2);
        r1.startActivity(r2);
        return;
    L_0x00d8:
        r2.G();
        r1 = new aua;
        r3 = r0.f;
        r4 = r0.g;
        r5 = new com.zunjae.anyme.rewrite.adapters.-$$Lambda$c$5Hx03tr_JFmVyh0R662PkhAyhOA;
        r5.<init>(r0, r2);
        r1.<init>(r3, r2, r4, r5);
        r1.f();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.rewrite.adapters.c.a(java.util.ArrayList, are, com.afollestad.materialdialogs.j, android.view.View, int, java.lang.CharSequence):void");
    }

    private void a(boolean z, are are) {
        if (!z) {
            this.d.remove(are);
        } else if (!this.d.contains(are)) {
            this.d.add(are);
        }
    }

    private static boolean a(defpackage.are r1) {
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
        r1 = r1.u();	 Catch:{ Exception -> 0x000f }
        r1 = r1.toLowerCase();	 Catch:{ Exception -> 0x000f }
        r0 = "anyme:favorite";	 Catch:{ Exception -> 0x000f }
        r1 = r1.contains(r0);	 Catch:{ Exception -> 0x000f }
        return r1;
    L_0x000f:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.rewrite.adapters.c.a(are):boolean");
    }

    private /* synthetic */ void b(are are, alg alg) {
        if (!alg.c()) {
            aub.a(this.f, alg);
        } else if (are.v() == 1) {
            Toast.makeText(this.f, String.format("Updated progression from %d to %d", new Object[]{Integer.valueOf(are.o() - 1), Integer.valueOf(are.o())}), 0).show();
        } else if (are.v() == 2) {
            Toast.makeText(this.f, "You've now completed watching this show! :KirbyJam:", 0).show();
        } else {
            Toast.makeText(this.f, "Updated show", 0).show();
        }
    }

    private /* synthetic */ boolean b(are are, View view) {
        art art = new art();
        art.b();
        Context context = this.f;
        context.startActivity(AnimeInfoActivityR2.a(context, are.L(), art));
        return true;
    }

    private /* synthetic */ void c(are are, View view) {
        Context context = this.f;
        context.startActivity(AnimeInfoActivityR2.a(context, are.L()));
    }

    public final String a(int i) {
        if (bid.a(this.d)) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder stringBuilder;
        switch (d.a[this.l - 1]) {
            case tw.a /*1*/:
                return ((are) this.d.get(i)).g().substring(0, 1);
            case tw.b /*2*/:
                stringBuilder = new StringBuilder();
                stringBuilder.append(((are) this.d.get(i)).r());
                return stringBuilder.toString();
            case f.c /*3*/:
                stringBuilder = new StringBuilder();
                stringBuilder.append(((are) this.d.get(i)).j());
                return stringBuilder.toString();
            case mh.d /*4*/:
                stringBuilder = new StringBuilder();
                stringBuilder.append(((are) this.d.get(i)).z());
                stringBuilder.append("%");
                return stringBuilder.toString();
            case mh.e /*5*/:
                asr a = ((are) this.d.get(i)).a();
                if (a != null && bit.c(a.c)) {
                    return a.c.split("-")[0];
                }
            default:
                break;
        }
        return BuildConfig.FLAVOR;
    }

    public final void a(String str, boolean z, boolean z2, boolean z3) {
        List list = this.d;
        if (list == null) {
            return;
        }
        if (this.c != null) {
            list.clear();
            if (bit.b(str) && z && z2 && z3) {
                this.d.addAll(this.c);
            } else {
                for (are are : this.c) {
                    if (are.i(str.toLowerCase())) {
                        this.d.add(are);
                        asr a = are.a();
                        if (a != null) {
                            String str2 = a.g;
                            Object obj = -1;
                            int hashCode = str2.hashCode();
                            if (hashCode != 2690) {
                                if (hashCode == 104087344) {
                                    if (str2.equals("movie")) {
                                        obj = 1;
                                    }
                                }
                            } else if (str2.equals("TV")) {
                                obj = null;
                            }
                            switch (obj) {
                                case mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                                    a(z, are);
                                    continue;
                                case tw.a /*1*/:
                                    a(z2, are);
                                    continue;
                                default:
                                    break;
                            }
                        }
                        a(z3, are);
                    }
                }
            }
            notifyDataSetChanged();
        }
    }

    public final void a(List<are> list, int i) {
        int i2;
        if (!this.e) {
            Object obj = (list.size() <= 0 || aux.c("KEY_KANONAPP_TOKEN")) ? null : 1;
            if (obj != null) {
                are a = are.a(0, BuildConfig.FLAVOR, BuildConfig.FLAVOR);
                a.d = are.b;
                list.add(0, a);
            }
            if (i == 1 && this.b == 1) {
                new are().d = are.c;
            }
            this.e = true;
        }
        this.c = list;
        this.d = new ArrayList(list);
        switch (ast.a()) {
            case tw.b /*2*/:
            case f.c /*3*/:
            case mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_focusColor /*10*/:
            case mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_fontIconResource /*11*/:
                i2 = e.b;
                break;
            case mh.d /*4*/:
            case mh.e /*5*/:
                i2 = e.c;
                break;
            case mh.h /*8*/:
            case mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_disabledTextColor /*9*/:
                i2 = e.e;
                break;
            case mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_fontIconSize /*12*/:
            case mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_ghost /*13*/:
                i2 = e.d;
                break;
            default:
                i2 = e.a;
                break;
        }
        this.l = i2;
        notifyDataSetChanged();
    }

    public final boolean a() {
        List list = this.d;
        return list != null && list.size() == 0;
    }

    public final int getItemCount() {
        List list = this.d;
        return list != null ? list.size() : 0;
    }

    public final int getItemViewType(int i) {
        are are = (are) this.d.get(i);
        if (are.d == are.b) {
            int i2 = this.b;
            if (i2 == 1) {
                return 3;
            }
            if (i2 == 0) {
                return 2;
            }
        }
        return are.d == are.c ? 4 : this.b;
    }

    @SuppressLint({"SetTextI18n"})
    public final void onBindViewHolder(ViewHolder viewHolder, int i) {
        b bVar;
        int i2;
        are are = (are) this.d.get(i);
        arq b = ((are) this.d.get(i)).b();
        int i3 = 8;
        switch (viewHolder.getItemViewType()) {
            case mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                bVar = (ClassicAdapter) viewHolder;
                ClassicAdapter classicAdapter = (ClassicAdapter) bVar;
                if (this.k != -1) {
                    classicAdapter.animeCoverImage.getLayoutParams().height = this.k;
                }
                classicAdapter.userProgress.setText(are.b(b));
                if (this.h && are.v() != 2 && are.j() > 0) {
                    TextView textView = classicAdapter.userProgress;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(classicAdapter.userProgress.getText());
                    StringBuilder stringBuilder2 = new StringBuilder(" (");
                    stringBuilder2.append(are.z());
                    stringBuilder2.append("%)");
                    stringBuilder.append(stringBuilder2.toString());
                    textView.setText(stringBuilder.toString());
                    break;
                }
            case tw.a /*1*/:
                TextView textView2;
                CharSequence format;
                IconicsTextView iconicsTextView;
                Context context;
                int i4;
                bVar = (OptimizedAdapter) viewHolder;
                OptimizedAdapter optimizedAdapter = (OptimizedAdapter) bVar;
                asr a = are.a();
                optimizedAdapter.animeName.setText(are.g());
                optimizedAdapter.userProgress.setText(are.b(b));
                optimizedAdapter.userProgress.setBackground(null);
                optimizedAdapter.userScore.setText(String.format("{faw-star} %d", new Object[]{Integer.valueOf(are.r())}));
                String str;
                String str2;
                if (a != null) {
                    textView2 = optimizedAdapter.releaseDate;
                    str = "%s - %s";
                    Object[] objArr = new Object[2];
                    String str3 = a.c;
                    if (str3 == null) {
                        str3 = "??-??-???";
                    }
                    objArr[0] = str3;
                    str2 = a.d;
                    if (str2 == null) {
                        str2 = "??-??-????";
                    }
                    objArr[1] = str2;
                    format = String.format(str, objArr);
                } else {
                    textView2 = optimizedAdapter.releaseDate;
                    if (!bit.b(are.l())) {
                        if (!bit.b(are.m())) {
                            str2 = are.l();
                            str = are.m();
                            if (str2.equals("0000-00-00")) {
                                str2 = "????-??-??";
                            }
                            if (str.equals("0000-00-00")) {
                                str = "????-??-??";
                            }
                            format = String.format("%s \u2014 %s", new Object[]{str2, str});
                        }
                    }
                    format = "????-??-?? \u2014 ????-??-??";
                }
                textView2.setText(format);
                if (are.j() > 0 && are.j() >= are.o()) {
                    optimizedAdapter.progressBar.setMax(are.j());
                    optimizedAdapter.progressBar.setProgress(are.y());
                    if (are.k() == 1 && b != null) {
                        i2 = b.c;
                        if (i2 >= 0) {
                            optimizedAdapter.progressBar.setSecondaryProgress(i2 - 1);
                            optimizedAdapter.overflowIcon.setOnClickListener(new -$$Lambda$c$ElG6J05kq1fW6n3C4Y_Umt2PDjg(this, are));
                            if (are.r() == 0) {
                                if (are.r() < 4) {
                                    iconicsTextView = optimizedAdapter.userScore;
                                    context = this.f;
                                    i4 = R.drawable.textview_user_score_bad;
                                } else if (are.r() >= 8) {
                                    iconicsTextView = optimizedAdapter.userScore;
                                    context = this.f;
                                    i4 = R.drawable.textview_user_score_decent;
                                } else {
                                    iconicsTextView = optimizedAdapter.userScore;
                                    context = this.f;
                                    i4 = R.drawable.textview_user_score_good;
                                }
                                iconicsTextView.setBackground(ContextCompat.getDrawable(context, i4));
                                break;
                            }
                            optimizedAdapter.userScore.setBackground(null);
                            break;
                        }
                    }
                }
                optimizedAdapter.progressBar.setMax(0);
                optimizedAdapter.progressBar.setProgress(0);
                optimizedAdapter.progressBar.setSecondaryProgress(0);
                optimizedAdapter.overflowIcon.setOnClickListener(new -$$Lambda$c$ElG6J05kq1fW6n3C4Y_Umt2PDjg(this, are));
                if (are.r() == 0) {
                    if (are.r() < 4) {
                        iconicsTextView = optimizedAdapter.userScore;
                        context = this.f;
                        i4 = R.drawable.textview_user_score_bad;
                    } else if (are.r() >= 8) {
                        iconicsTextView = optimizedAdapter.userScore;
                        context = this.f;
                        i4 = R.drawable.textview_user_score_good;
                    } else {
                        iconicsTextView = optimizedAdapter.userScore;
                        context = this.f;
                        i4 = R.drawable.textview_user_score_decent;
                    }
                    iconicsTextView.setBackground(ContextCompat.getDrawable(context, i4));
                } else {
                    optimizedAdapter.userScore.setBackground(null);
                }
                break;
            case tw.b /*2*/:
            case f.c /*3*/:
                a aVar = (a) viewHolder;
                this.m.a("https://i.imgur.com/khszzjM.png").a(aVar.a());
                aVar.b().setOnClickListener(new -$$Lambda$c$KZwOV9FUhb5CWloUKbv6quD0he8(this));
                break;
            default:
                break;
        }
        bVar = null;
        if (bVar != null) {
            IconicsTextView e;
            Context context2;
            int i5;
            bVar.a().setOnClickListener(new -$$Lambda$c$crowzineluWl6m3E4zupCsRyz-s(this, are));
            bVar.a().setOnLongClickListener(new -$$Lambda$c$SscmmleYfvQtV6uKIGCLn5e-kt8(this, are));
            int r = are.r();
            if (r > 0) {
                IconicsTextView b2 = bVar.b();
                stringBuilder = new StringBuilder();
                stringBuilder.append(r);
                stringBuilder.append(" {faw-star}");
                b2.setText(stringBuilder.toString());
                bVar.b().setVisibility(0);
            } else {
                bVar.b().setVisibility(8);
            }
            if (are.f()) {
                bVar.e().setText("RW");
                bVar.e().setVisibility(0);
                e = bVar.e();
                context2 = this.f;
                i5 = R.drawable.textview_rewatching;
            } else if (are.k() == 1) {
                if (b != null) {
                    if ((b.b < System.currentTimeMillis() / 1000 ? 1 : null) == null) {
                        StringBuilder stringBuilder3;
                        r1 = "EP%s in %s";
                        r2 = new Object[2];
                        r2[0] = Integer.valueOf(b.c);
                        alm a2 = als.a(b.b);
                        int i6 = a2.d % 7;
                        int i7 = a2.c;
                        i2 = a2.e % 24;
                        i = a2.f % 60;
                        String str4 = BuildConfig.FLAVOR;
                        if (i7 > 0) {
                            str4 = String.format("%dw", new Object[]{Integer.valueOf(i7)});
                        }
                        if (i6 > 0) {
                            stringBuilder3 = new StringBuilder();
                            stringBuilder3.append(str4);
                            stringBuilder3.append(String.format(" %dd", new Object[]{Integer.valueOf(i6)}));
                            str4 = stringBuilder3.toString();
                        }
                        if (i2 > 0) {
                            stringBuilder3 = new StringBuilder();
                            stringBuilder3.append(str4);
                            stringBuilder3.append(String.format(" %dh", new Object[]{Integer.valueOf(i2)}));
                            str4 = stringBuilder3.toString();
                        }
                        if (i > 0 && i7 <= 0 && i6 <= 0) {
                            StringBuilder stringBuilder4 = new StringBuilder();
                            stringBuilder4.append(str4);
                            stringBuilder4.append(String.format(" %dm", new Object[]{Integer.valueOf(i)}));
                            str4 = stringBuilder4.toString();
                        }
                        r2[1] = str4.trim();
                        bVar.e().setText(String.format(r1, r2));
                        bVar.e().setVisibility(0);
                        e = bVar.e();
                        context2 = this.f;
                        i5 = R.drawable.textview_airing;
                    }
                }
                bVar.e().setText("AIRING");
                bVar.e().setVisibility(0);
                e = bVar.e();
                context2 = this.f;
                i5 = R.drawable.textview_airing;
            } else if (are.k() == 3) {
                bVar.e().setVisibility(0);
                bVar.e().setText("NYA");
                e = bVar.e();
                context2 = this.f;
                i5 = R.drawable.textview_nya;
            } else if (are.k() == 0) {
                bVar.e().setText("UNKNOWN");
                bVar.e().setVisibility(0);
                e = bVar.e();
                context2 = this.f;
                i5 = R.drawable.textview_unknown;
            } else if (are.k() == -1) {
                e = bVar.e();
                r1 = "REFRESH%sPROFILE";
                r2 = new Object[1];
                r2[0] = bVar instanceof OptimizedAdapter ? " " : "\n";
                e.setText(String.format(r1, r2));
                bVar.e().setVisibility(0);
                e = bVar.e();
                context2 = this.f;
                i5 = R.drawable.textview_anime_fav;
            } else {
                bVar.e().setText(BuildConfig.FLAVOR);
                bVar.e().setVisibility(8);
                bVar.e().setBackground(null);
                e = bVar.f();
                if (a(are)) {
                    i3 = 0;
                }
                e.setVisibility(i3);
                bVar.d().setText(are.g());
                this.m.a(are.n()).a(fa.ALL).a(this.i, this.j).a(bVar.c());
            }
            e.setBackground(ContextCompat.getDrawable(context2, i5));
            e = bVar.f();
            if (a(are)) {
                i3 = 0;
            }
            e.setVisibility(i3);
            bVar.d().setText(are.g());
            this.m.a(are.n()).a(fa.ALL).a(this.i, this.j).a(bVar.c());
        }
    }

    public final ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                return new ClassicAdapter(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_anime_main_classic, viewGroup, false));
            case tw.a /*1*/:
                return new OptimizedAdapter(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_anime_main_optimized, viewGroup, false));
            case tw.b /*2*/:
                return new ClassicAdapterAd(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_anime_main_classic_ad, viewGroup, false));
            case f.c /*3*/:
                return new OptimizedAdapterAd(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_anime_main_optimized_ad, viewGroup, false));
            case mh.d /*4*/:
                return new com.zunjae.anyme.rewrite.adapters.generic.c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_app_ad, viewGroup, false));
            default:
                throw new IllegalArgumentException("No viewType found for id".concat(String.valueOf(i)));
        }
    }
}
