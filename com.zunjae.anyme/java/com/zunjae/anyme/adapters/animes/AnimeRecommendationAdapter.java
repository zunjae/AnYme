package com.zunjae.anyme.adapters.animes;

import android.content.Context;
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
import com.zunjae.anyme.rewrite.activities.AnimeInfoActivityR2;
import com.zunjae.anyme.rewrite.viewmodels.AnimeViewModel;
import defpackage.alg;
import defpackage.are;
import defpackage.arg;
import defpackage.arn;
import defpackage.aty;
import defpackage.aub;
import defpackage.aug;
import defpackage.ct;
import defpackage.de;
import java.util.ArrayList;
import java.util.List;
import mehdi.sakout.fancybuttons.FancyButton;

public final class AnimeRecommendationAdapter extends Adapter<ViewHolder> {
    private final String a = "AnimeRecommendationAd";
    private final AbstractActivity b;
    private final ArrayList<Integer> c = new ArrayList();
    private List<arg> d;
    private final AnimeViewModel e;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView
        FancyButton addToPtwButton;
        @BindView
        ImageView animeSeriesCover;
        @BindView
        FancyButton moreInfoButton;
        @BindView
        TextView recommendedBy;
        @BindView
        TextView seriesTitle;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.b = viewHolder;
            viewHolder.animeSeriesCover = (ImageView) ct.a(view, (int) R.id.animeSeriesCover, "field 'animeSeriesCover'", ImageView.class);
            viewHolder.seriesTitle = (TextView) ct.a(view, (int) R.id.seriesTitle, "field 'seriesTitle'", TextView.class);
            viewHolder.recommendedBy = (TextView) ct.a(view, (int) R.id.recommendedBy, "field 'recommendedBy'", TextView.class);
            viewHolder.addToPtwButton = (FancyButton) ct.a(view, (int) R.id.addToPtwButton, "field 'addToPtwButton'", FancyButton.class);
            viewHolder.moreInfoButton = (FancyButton) ct.a(view, (int) R.id.moreInfoButton, "field 'moreInfoButton'", FancyButton.class);
        }

        public final void a() {
            ViewHolder viewHolder = this.b;
            if (viewHolder != null) {
                this.b = null;
                viewHolder.animeSeriesCover = null;
                viewHolder.seriesTitle = null;
                viewHolder.recommendedBy = null;
                viewHolder.addToPtwButton = null;
                viewHolder.moreInfoButton = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public AnimeRecommendationAdapter(AbstractActivity abstractActivity, ArrayList<arg> arrayList, AnimeViewModel animeViewModel) {
        this.b = abstractActivity;
        this.d = arrayList;
        this.e = animeViewModel;
    }

    private /* synthetic */ void a(arg arg, View view) {
        aug.a(this.b, arg.g());
        Toast.makeText(this.b, "Title copied to your clipboard", 0).show();
    }

    private /* synthetic */ void a(arg arg, ViewHolder viewHolder, alg alg) {
        if (alg.c()) {
            Toast.makeText(this.b, String.format("Successfully added %s to your profile", new Object[]{arg.g()}), 0).show();
            viewHolder.addToPtwButton.setVisibility(8);
            this.c.add(Integer.valueOf((int) arg.a()));
            return;
        }
        aub.a(this.b, alg);
    }

    private /* synthetic */ void a(arg arg, ViewHolder viewHolder, View view) {
        new aty(this.b, are.a(arg.a(), arg.g(), arg.h()), this.e, new -$$Lambda$AnimeRecommendationAdapter$01vcokKjNoMdmOAwbGHHivdQ3r0(this, arg, viewHolder)).f();
    }

    private /* synthetic */ void b(arg arg, View view) {
        AnimeCoverPreviewDialog.a(arg.g(), arg.h()).show(this.b.getSupportFragmentManager(), "Anime_Cover_Preview");
    }

    private /* synthetic */ void c(arg arg, View view) {
        arn arn = new arn(arg.a(), arg.g(), arg.h());
        Context context = this.b;
        context.startActivity(AnimeInfoActivityR2.a(context, arn));
    }

    public final void a(List<arg> list) {
        this.d = list;
        notifyDataSetChanged();
    }

    public final boolean a() {
        return this.d.size() > 0;
    }

    public final int getItemCount() {
        return this.d.size();
    }

    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        FancyButton fancyButton;
        int i2;
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        arg arg = (arg) this.d.get(i);
        viewHolder2.seriesTitle.setText(arg.g());
        viewHolder2.recommendedBy.setText(arg.i());
        de.a(this.b).a(arg.h()).a((int) R.drawable.transparent_to_black).b().a(viewHolder2.animeSeriesCover);
        if (this.c.contains(Integer.valueOf((int) arg.a()))) {
            fancyButton = viewHolder2.addToPtwButton;
            i2 = 8;
        } else {
            fancyButton = viewHolder2.addToPtwButton;
            i2 = 0;
        }
        fancyButton.setVisibility(i2);
        viewHolder2.addToPtwButton.setOnClickListener(new -$$Lambda$AnimeRecommendationAdapter$J0pCWDCPZUWXXu6GhynyUGpxfFc(this, arg, viewHolder2));
        viewHolder2.moreInfoButton.setOnClickListener(new -$$Lambda$AnimeRecommendationAdapter$ASAtQP44CEh2bsvhSvw06imlRHE(this, arg));
        viewHolder2.animeSeriesCover.setOnClickListener(new -$$Lambda$AnimeRecommendationAdapter$wDVK0K0Q2D5dNKZUihW0LByS4SU(this, arg));
        viewHolder2.seriesTitle.setOnClickListener(new -$$Lambda$AnimeRecommendationAdapter$oegv_MidMJbebERFYGaOA2qlRSM(this, arg));
    }

    public final /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_anime_recommendation, viewGroup, false));
    }
}
