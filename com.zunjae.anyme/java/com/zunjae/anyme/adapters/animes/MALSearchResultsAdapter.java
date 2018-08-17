package com.zunjae.anyme.adapters.animes;

import android.annotation.SuppressLint;
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
import com.afollestad.materialdialogs.o;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.anyme.dialogs.animeDialog.AnimeCoverPreviewDialog;
import com.zunjae.anyme.rewrite.activities.AnimeInfoActivityR2;
import com.zunjae.anyme.rewrite.viewmodels.AnimeViewModel;
import defpackage.alg;
import defpackage.amc;
import defpackage.are;
import defpackage.arn;
import defpackage.aty;
import defpackage.aub;
import defpackage.aug;
import defpackage.ct;
import defpackage.de;
import defpackage.fa;
import java.util.ArrayList;
import java.util.Iterator;
import mehdi.sakout.fancybuttons.FancyButton;

@Deprecated
public final class MALSearchResultsAdapter extends Adapter<ViewHolder> {
    private final ArrayList<Long> a;
    private final ArrayList<Integer> b;
    private final ArrayList<Integer> c;
    private final AbstractActivity d;
    private final AnimeViewModel e;
    private final int[] f;
    private ArrayList<amc> g;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView
        FancyButton addButton;
        @BindView
        TextView animeDate;
        @BindView
        TextView animeExtraInfo;
        @BindView
        ImageView animeImage;
        @BindView
        TextView animeName;
        @BindView
        TextView animeScore;
        @BindView
        TextView animeSynopsis;
        @BindView
        FancyButton moreInfoButton;
        @BindView
        TextView nsfwWarning;
        @BindView
        View transparentToWhite;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.b = viewHolder;
            viewHolder.animeName = (TextView) ct.a(view, (int) R.id.animeAltName, "field 'animeName'", TextView.class);
            viewHolder.animeExtraInfo = (TextView) ct.a(view, (int) R.id.animeStatus, "field 'animeExtraInfo'", TextView.class);
            viewHolder.animeImage = (ImageView) ct.a(view, (int) R.id.animeImage, "field 'animeImage'", ImageView.class);
            viewHolder.animeSynopsis = (TextView) ct.a(view, (int) R.id.animeSynopsis, "field 'animeSynopsis'", TextView.class);
            viewHolder.addButton = (FancyButton) ct.a(view, (int) R.id.addToPtwButton, "field 'addButton'", FancyButton.class);
            viewHolder.moreInfoButton = (FancyButton) ct.a(view, (int) R.id.moreInfoButton, "field 'moreInfoButton'", FancyButton.class);
            viewHolder.nsfwWarning = (TextView) ct.a(view, (int) R.id.nsfwWarningMessage, "field 'nsfwWarning'", TextView.class);
            viewHolder.animeScore = (TextView) ct.a(view, (int) R.id.animeScore, "field 'animeScore'", TextView.class);
            viewHolder.animeDate = (TextView) ct.a(view, (int) R.id.animeDate, "field 'animeDate'", TextView.class);
            viewHolder.transparentToWhite = ct.a(view, R.id.transparentToWhiteView, "field 'transparentToWhite'");
        }

        public final void a() {
            ViewHolder viewHolder = this.b;
            if (viewHolder != null) {
                this.b = null;
                viewHolder.animeName = null;
                viewHolder.animeExtraInfo = null;
                viewHolder.animeImage = null;
                viewHolder.animeSynopsis = null;
                viewHolder.addButton = null;
                viewHolder.moreInfoButton = null;
                viewHolder.nsfwWarning = null;
                viewHolder.animeScore = null;
                viewHolder.animeDate = null;
                viewHolder.transparentToWhite = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    private /* synthetic */ void a(amc amc, View view) {
        aug.a(this.d, amc.e());
        Toast.makeText(this.d, "Title copied to your clipboard", 0).show();
    }

    private /* synthetic */ void a(amc amc, ViewHolder viewHolder, alg alg) {
        if (alg.c()) {
            Toast.makeText(this.d, String.format("Successfully added %s to your profile", new Object[]{amc.e()}), 0).show();
            viewHolder.addButton.setVisibility(8);
            this.c.add(Integer.valueOf(amc.d()));
            return;
        }
        aub.a(this.d, alg);
    }

    private /* synthetic */ void a(amc amc, ViewHolder viewHolder, View view) {
        new aty(this.d, are.a((long) amc.d(), amc.e(), amc.c()), this.e, new -$$Lambda$MALSearchResultsAdapter$jweEtjfNXqoA7_SW-uWefWQNdcM(this, amc, viewHolder)).f();
    }

    private /* synthetic */ void a(ViewHolder viewHolder, View view) {
        viewHolder.nsfwWarning.setVisibility(8);
        this.b.add(Integer.valueOf(viewHolder.getAdapterPosition()));
    }

    private boolean a(amc amc) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((Long) it.next()).longValue() == ((long) amc.d())) {
                return true;
            }
        }
        return this.c.contains(Integer.valueOf(amc.d()));
    }

    private /* synthetic */ void b(amc amc, View view) {
        AnimeCoverPreviewDialog.a(amc.e(), amc.c()).show(this.d.getSupportFragmentManager(), "Anime_Cover_Preview");
    }

    private /* synthetic */ void c(amc amc, View view) {
        arn arn = new arn((long) amc.d(), amc.e(), amc.c());
        Context context = this.d;
        context.startActivity(AnimeInfoActivityR2.a(context, arn));
    }

    private /* synthetic */ void d(amc amc, View view) {
        new o(this.d).a((CharSequence) "Synopsis").b(amc.h()).c((CharSequence) "ok").l();
    }

    public final int getItemCount() {
        return this.g.size();
    }

    @SuppressLint({"SetTextI18n"})
    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        amc amc = (amc) this.g.get(viewHolder2.getAdapterPosition());
        viewHolder2.animeImage.setVisibility(0);
        de.a(this.d).a(amc.c()).a(fa.NONE).a(viewHolder2.animeImage);
        viewHolder2.transparentToWhite.setVisibility(0);
        viewHolder2.animeName.setText(amc.e());
        TextView textView = viewHolder2.animeExtraInfo;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(amc.f());
        stringBuilder.append("  \u25cf  ");
        stringBuilder.append(amc.b());
        stringBuilder.append(" Eps  \u25cf  ");
        stringBuilder.append(amc.g());
        textView.setText(stringBuilder.toString());
        viewHolder2.animeSynopsis.setText(amc.h());
        textView = viewHolder2.animeScore;
        stringBuilder = new StringBuilder("Score: ");
        stringBuilder.append(amc.a());
        textView.setText(stringBuilder.toString());
        viewHolder2.animeDate.setText(String.format("(%s - %s)", new Object[]{amc.i(), amc.j()}));
        if (amc.a(this.f)) {
            viewHolder2.nsfwWarning.setVisibility(0);
        } else {
            viewHolder2.nsfwWarning.setVisibility(8);
        }
        if (this.b.contains(Integer.valueOf(viewHolder2.getAdapterPosition()))) {
            viewHolder2.nsfwWarning.setVisibility(8);
        }
        if (a(amc)) {
            viewHolder2.addButton.setVisibility(8);
        } else {
            viewHolder2.addButton.setVisibility(0);
        }
        viewHolder2.nsfwWarning.setOnClickListener(new -$$Lambda$MALSearchResultsAdapter$wNA0R5_o6hnxfUgp2toxnV4KEwI(this, viewHolder2));
        viewHolder2.addButton.setOnClickListener(new -$$Lambda$MALSearchResultsAdapter$XR0swQdKtwkWJsbvQE0VI6pnJ2A(this, amc, viewHolder2));
        viewHolder2.animeSynopsis.setOnClickListener(new -$$Lambda$MALSearchResultsAdapter$tA0CJ5Dhz60D8evvIdsGu6r_zkY(this, amc));
        viewHolder2.moreInfoButton.setOnClickListener(new -$$Lambda$MALSearchResultsAdapter$2cDdozsFdL7UztVfR8cWitSJjpA(this, amc));
        viewHolder2.animeImage.setOnClickListener(new -$$Lambda$MALSearchResultsAdapter$NbQfd7zAXq2yeKSNSgk5Oy3m2to(this, amc));
        viewHolder2.animeName.setOnClickListener(new -$$Lambda$MALSearchResultsAdapter$PAP1XILnDAWVCJLdjeTFV-nsvGk(this, amc));
    }

    public final /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_mal_search_results, viewGroup, false));
    }
}
