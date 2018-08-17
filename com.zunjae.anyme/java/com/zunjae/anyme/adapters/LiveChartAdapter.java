package com.zunjae.anyme.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.anyme.dialogs.animeDialog.AnimeCoverPreviewDialog;
import defpackage.alm;
import defpackage.als;
import defpackage.arl;
import defpackage.aug;
import defpackage.ct;
import defpackage.de;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class LiveChartAdapter extends Adapter<ViewHolder> {
    private final AbstractActivity a;
    @SuppressLint({"SimpleDateFormat"})
    private final DateFormat b = new SimpleDateFormat("MMMM dd HH:mm");
    private List<arl> c;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView
        ImageView animeCoverImage;
        @BindView
        TextView daysUntil;
        @BindView
        TextView episodeNumber;
        @BindView
        TextView seriesTitle;
        @BindView
        TextView trueTimeUntil;
        @BindView
        ViewGroup viewGroup;

        ViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.b = viewHolder;
            viewHolder.viewGroup = (ViewGroup) ct.a(view, (int) R.id.cardViewContainer, "field 'viewGroup'", ViewGroup.class);
            viewHolder.seriesTitle = (TextView) ct.a(view, (int) R.id.seriesTitle, "field 'seriesTitle'", TextView.class);
            viewHolder.daysUntil = (TextView) ct.a(view, (int) R.id.daysUntil, "field 'daysUntil'", TextView.class);
            viewHolder.episodeNumber = (TextView) ct.a(view, (int) R.id.episodeNumber, "field 'episodeNumber'", TextView.class);
            viewHolder.trueTimeUntil = (TextView) ct.a(view, (int) R.id.trueTimeUntil, "field 'trueTimeUntil'", TextView.class);
            viewHolder.animeCoverImage = (ImageView) ct.a(view, (int) R.id.animeCoverImage, "field 'animeCoverImage'", ImageView.class);
        }

        public final void a() {
            ViewHolder viewHolder = this.b;
            if (viewHolder != null) {
                this.b = null;
                viewHolder.viewGroup = null;
                viewHolder.seriesTitle = null;
                viewHolder.daysUntil = null;
                viewHolder.episodeNumber = null;
                viewHolder.trueTimeUntil = null;
                viewHolder.animeCoverImage = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public LiveChartAdapter(AbstractActivity abstractActivity, List<arl> list) {
        this.a = abstractActivity;
        this.c = list;
    }

    private /* synthetic */ void a(arl arl, View view) {
        aug.a(this.a, arl.e);
        Toast.makeText(this.a, "Title copied to your clipboard", 0).show();
    }

    private /* synthetic */ void b(defpackage.arl r4, android.view.View r5) {
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
        r5 = new arn;	 Catch:{ Exception -> 0x001c }
        r0 = r4.a;	 Catch:{ Exception -> 0x001c }
        r0 = r0.intValue();	 Catch:{ Exception -> 0x001c }
        r0 = (long) r0;	 Catch:{ Exception -> 0x001c }
        r2 = r4.e;	 Catch:{ Exception -> 0x001c }
        r4 = r4.c;	 Catch:{ Exception -> 0x001c }
        r5.<init>(r0, r2, r4);	 Catch:{ Exception -> 0x001c }
        r4 = r3.a;	 Catch:{ Exception -> 0x001c }
        r0 = r3.a;	 Catch:{ Exception -> 0x001c }
        r5 = com.zunjae.anyme.rewrite.activities.AnimeInfoActivityR2.a(r0, r5);	 Catch:{ Exception -> 0x001c }
        r4.startActivity(r5);	 Catch:{ Exception -> 0x001c }
        return;
    L_0x001c:
        r4 = r3.a;
        r5 = "Can not open this show (ID unknown)";
        r0 = 0;
        r4 = android.widget.Toast.makeText(r4, r5, r0);
        r4.show();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.adapters.LiveChartAdapter.b(arl, android.view.View):void");
    }

    private /* synthetic */ void c(arl arl, View view) {
        AnimeCoverPreviewDialog.a(arl.e, arl.c).show(this.a.getSupportFragmentManager(), "Anime_Cover_Preview");
    }

    public final void a(List<arl> list) {
        this.c = list;
        notifyDataSetChanged();
    }

    public final int getItemCount() {
        return this.c.size();
    }

    @SuppressLint({"SetTextI18n"})
    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        Context context;
        int i2;
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        arl arl = (arl) this.c.get(i);
        Date date = new Date(arl.b * 1000);
        TextView textView = viewHolder2.daysUntil;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b.format(date));
        textView.setText(stringBuilder.toString());
        TextView textView2 = viewHolder2.episodeNumber;
        StringBuilder stringBuilder2 = new StringBuilder("EP");
        stringBuilder2.append(arl.f);
        textView2.setText(stringBuilder2.toString());
        viewHolder2.seriesTitle.setText(arl.e);
        de.a(this.a).a(arl.c).a(viewHolder2.animeCoverImage);
        textView2 = viewHolder2.trueTimeUntil;
        alm a = als.a(arl.b);
        CharSequence charSequence = BuildConfig.FLAVOR;
        if (a.c > 0) {
            charSequence = String.format("%dw", new Object[]{Integer.valueOf(a.c)});
        }
        if (a.d > 0) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(charSequence);
            stringBuilder3.append(String.format(" %dd", new Object[]{Integer.valueOf(a.d % 7)}));
            charSequence = stringBuilder3.toString();
        }
        if (a.e > 0) {
            stringBuilder3 = new StringBuilder();
            stringBuilder3.append(charSequence);
            stringBuilder3.append(String.format(" %dh", new Object[]{Integer.valueOf(a.e % 24)}));
            charSequence = stringBuilder3.toString();
        }
        if (a.f > 0) {
            stringBuilder3 = new StringBuilder();
            stringBuilder3.append(charSequence);
            stringBuilder3.append(String.format(" %dm", new Object[]{Integer.valueOf(a.f % 60)}));
            charSequence = stringBuilder3.toString();
        }
        if (arl.a() && (a.c > 0 || a.d > 0 || a.e > 0 || a.f > 0)) {
            charSequence = charSequence.concat(" ago");
        }
        textView2.setText(charSequence);
        if (arl.a()) {
            textView2 = viewHolder2.trueTimeUntil;
            context = this.a;
            i2 = R.color.colorAccent;
        } else {
            textView2 = viewHolder2.trueTimeUntil;
            context = this.a;
            i2 = 17170443;
        }
        textView2.setTextColor(ContextCompat.getColor(context, i2));
        viewHolder2.animeCoverImage.setOnClickListener(new -$$Lambda$LiveChartAdapter$q1ylGHYJ3Rka15JcTM-EJleUWVM(this, arl));
        viewHolder2.viewGroup.setOnClickListener(new -$$Lambda$LiveChartAdapter$Q0wji6eHhamWsdDADsdzv3Gao8U(this, arl));
        viewHolder2.seriesTitle.setOnClickListener(new -$$Lambda$LiveChartAdapter$xBk3j8LVDiGtfWUn7yGn0vUBXsQ(this, arl));
    }

    public final /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_anime_livechart, viewGroup, false));
    }
}
