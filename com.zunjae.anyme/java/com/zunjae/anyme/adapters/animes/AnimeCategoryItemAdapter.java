package com.zunjae.anyme.adapters.animes;

import android.annotation.SuppressLint;
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
import com.afollestad.materialdialogs.o;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.anyme.dialogs.animeDialog.AnimeCoverPreviewDialog;
import com.zunjae.anyme.rewrite.viewmodels.AnimeViewModel;
import defpackage.alg;
import defpackage.amk;
import defpackage.are;
import defpackage.aty;
import defpackage.aub;
import defpackage.aug;
import defpackage.biq;
import defpackage.ct;
import defpackage.de;
import java.util.ArrayList;
import mehdi.sakout.fancybuttons.FancyButton;

public final class AnimeCategoryItemAdapter extends Adapter<ViewHolder> {
    private final ArrayList<Integer> a = new ArrayList();
    private final AbstractActivity b;
    private final ArrayList<amk> c;
    private final AnimeViewModel d;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView
        FancyButton addButton;
        @BindView
        ImageView animeCoverImage;
        @BindView
        FancyButton moreInfoButton;
        @BindView
        TextView seriesEpisodes;
        @BindView
        TextView seriesTitle;
        @BindView
        TextView seriesType;
        @BindView
        TextView summary;
        @BindView
        ViewGroup viewGroup;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.b = viewHolder;
            viewHolder.viewGroup = (ViewGroup) ct.a(view, (int) R.id.cardViewContainer, "field 'viewGroup'", ViewGroup.class);
            viewHolder.summary = (TextView) ct.a(view, (int) R.id.summary, "field 'summary'", TextView.class);
            viewHolder.seriesTitle = (TextView) ct.a(view, (int) R.id.seriesTitle, "field 'seriesTitle'", TextView.class);
            viewHolder.seriesType = (TextView) ct.a(view, (int) R.id.seriesStatus, "field 'seriesType'", TextView.class);
            viewHolder.seriesEpisodes = (TextView) ct.a(view, (int) R.id.seriesEpisodes, "field 'seriesEpisodes'", TextView.class);
            viewHolder.animeCoverImage = (ImageView) ct.a(view, (int) R.id.animeCoverImage, "field 'animeCoverImage'", ImageView.class);
            viewHolder.addButton = (FancyButton) ct.a(view, (int) R.id.addToPtwButton, "field 'addButton'", FancyButton.class);
            viewHolder.moreInfoButton = (FancyButton) ct.a(view, (int) R.id.moreInfoButton, "field 'moreInfoButton'", FancyButton.class);
        }

        public final void a() {
            ViewHolder viewHolder = this.b;
            if (viewHolder != null) {
                this.b = null;
                viewHolder.viewGroup = null;
                viewHolder.summary = null;
                viewHolder.seriesTitle = null;
                viewHolder.seriesType = null;
                viewHolder.seriesEpisodes = null;
                viewHolder.animeCoverImage = null;
                viewHolder.addButton = null;
                viewHolder.moreInfoButton = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public AnimeCategoryItemAdapter(AbstractActivity abstractActivity, ArrayList<amk> arrayList, AnimeViewModel animeViewModel) {
        this.b = abstractActivity;
        this.d = animeViewModel;
        this.c = arrayList;
    }

    private /* synthetic */ void a(amk amk, View view) {
        new o(this.b).a((CharSequence) "Synopsis").b(biq.b(amk.f())).c((CharSequence) "ok").l();
    }

    private /* synthetic */ void a(amk amk, ViewHolder viewHolder, alg alg) {
        if (alg.c()) {
            Toast.makeText(this.b, String.format("Successfully added %s to your profile", new Object[]{amk.h()}), 0).show();
            viewHolder.addButton.setVisibility(8);
            this.a.add(Integer.valueOf(amk.c()));
            return;
        }
        aub.a(this.b, alg);
    }

    private /* synthetic */ void a(amk amk, ViewHolder viewHolder, View view) {
        new aty(this.b, are.a((long) amk.c(), amk.h(), amk.e()), this.d, new -$$Lambda$AnimeCategoryItemAdapter$Zsw5Fp0-Hyy8NCBW4v2m28Ps3sA(this, amk, viewHolder)).f();
    }

    private /* synthetic */ void b(amk amk, View view) {
        AnimeCoverPreviewDialog.a(amk.h(), amk.e()).show(this.b.getSupportFragmentManager(), "Anime_Cover_Preview");
    }

    private /* synthetic */ void c(defpackage.amk r4, android.view.View r5) {
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
        r5 = new arn;	 Catch:{ Exception -> 0x001e }
        r0 = r4.c();	 Catch:{ Exception -> 0x001e }
        r0 = (long) r0;	 Catch:{ Exception -> 0x001e }
        r2 = r4.h();	 Catch:{ Exception -> 0x001e }
        r4 = r4.e();	 Catch:{ Exception -> 0x001e }
        r5.<init>(r0, r2, r4);	 Catch:{ Exception -> 0x001e }
        r4 = r3.b;	 Catch:{ Exception -> 0x001e }
        r0 = r3.b;	 Catch:{ Exception -> 0x001e }
        r5 = com.zunjae.anyme.rewrite.activities.AnimeInfoActivityR2.a(r0, r5);	 Catch:{ Exception -> 0x001e }
        r4.startActivity(r5);	 Catch:{ Exception -> 0x001e }
        return;
    L_0x001e:
        r4 = r3.b;
        r5 = "Can not open this show (ID unknown)";
        r0 = 0;
        r4 = android.widget.Toast.makeText(r4, r5, r0);
        r4.show();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.adapters.animes.AnimeCategoryItemAdapter.c(amk, android.view.View):void");
    }

    private /* synthetic */ void d(amk amk, View view) {
        aug.a(this.b, amk.h());
        Toast.makeText(this.b, "Title copied to your clipboard", 0).show();
    }

    public final int getItemCount() {
        return this.c.size();
    }

    @SuppressLint({"DefaultLocale", "SetTextI18n"})
    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        amk amk = (amk) this.c.get(i);
        String b = biq.b(amk.h());
        CharSequence b2 = biq.b(amk.f());
        viewHolder2.seriesTitle.setText(String.format("#%d %s", new Object[]{Integer.valueOf(i + 1), b}));
        viewHolder2.summary.setText(b2);
        viewHolder2.seriesType.setText(amk.g());
        if (amk.d().intValue() > 0) {
            TextView textView = viewHolder2.seriesEpisodes;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(amk.d());
            stringBuilder.append("Eps");
            textView.setText(stringBuilder.toString());
            viewHolder2.seriesEpisodes.setVisibility(0);
        } else {
            viewHolder2.seriesEpisodes.setVisibility(8);
        }
        viewHolder2.seriesTitle.setOnClickListener(new -$$Lambda$AnimeCategoryItemAdapter$rsxkyq5DplXNyQBIkhyqipxcCMU(this, amk));
        if (!amk.a()) {
            if (!this.a.contains(Integer.valueOf(amk.c()))) {
                viewHolder2.addButton.setVisibility(0);
                viewHolder2.addButton.setOnClickListener(new -$$Lambda$AnimeCategoryItemAdapter$s5jVkjXNp4Xeo_jcwhmpbLH6FF0(this, amk, viewHolder2));
                viewHolder2.moreInfoButton.setOnClickListener(new -$$Lambda$AnimeCategoryItemAdapter$11iTt8mpvoqHeWdPdcYufJ7YRvI(this, amk));
                viewHolder2.animeCoverImage.setOnClickListener(new -$$Lambda$AnimeCategoryItemAdapter$mIg81z458gg8RYMR71hde8pMUYU(this, amk));
                viewHolder2.summary.setOnClickListener(new -$$Lambda$AnimeCategoryItemAdapter$TuCPhPcYxxe5XNHkfupFIhHagP4(this, amk));
                de.a(this.b).a(amk.e()).a(viewHolder2.animeCoverImage);
            }
        }
        viewHolder2.addButton.setVisibility(8);
        viewHolder2.addButton.setOnClickListener(new -$$Lambda$AnimeCategoryItemAdapter$s5jVkjXNp4Xeo_jcwhmpbLH6FF0(this, amk, viewHolder2));
        viewHolder2.moreInfoButton.setOnClickListener(new -$$Lambda$AnimeCategoryItemAdapter$11iTt8mpvoqHeWdPdcYufJ7YRvI(this, amk));
        viewHolder2.animeCoverImage.setOnClickListener(new -$$Lambda$AnimeCategoryItemAdapter$mIg81z458gg8RYMR71hde8pMUYU(this, amk));
        viewHolder2.summary.setOnClickListener(new -$$Lambda$AnimeCategoryItemAdapter$TuCPhPcYxxe5XNHkfupFIhHagP4(this, amk));
        de.a(this.b).a(amk.e()).a(viewHolder2.animeCoverImage);
    }

    public final /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_anime_category_item, viewGroup, false));
    }
}
