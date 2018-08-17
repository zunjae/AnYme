package com.zunjae.anyme.adapters.animes;

import android.app.Activity;
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
import com.zunjae.anyme.rewrite.activities.AnimeInfoActivityR2;
import com.zunjae.anyme.rewrite.viewmodels.AnimeViewModel;
import defpackage.alg;
import defpackage.are;
import defpackage.arn;
import defpackage.ask;
import defpackage.aty;
import defpackage.aub;
import defpackage.aug;
import defpackage.bit;
import defpackage.ct;
import defpackage.de;
import java.util.ArrayList;
import java.util.List;
import mehdi.sakout.fancybuttons.FancyButton;

public final class AnimeSeasonalAdapter extends Adapter<ViewHolder> {
    private final String a = "AnimeSeasonalAdapter";
    private final Activity b;
    private List<ask> c;
    private List<Long> d;
    private final ArrayList<Integer> e = new ArrayList();
    private final AnimeViewModel f;
    private ArrayList<ask> g = new ArrayList();
    private boolean h = true;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView
        FancyButton addButton;
        @BindView
        TextView animeGenres;
        @BindView
        ImageView animeImage;
        @BindView
        TextView animeStatus;
        @BindView
        FancyButton moreInfoButton;
        @BindView
        TextView synopsis;
        @BindView
        TextView title;
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
            viewHolder.synopsis = (TextView) ct.a(view, (int) R.id.synopsis, "field 'synopsis'", TextView.class);
            viewHolder.title = (TextView) ct.a(view, (int) me.zhanghai.android.materialprogressbar.R.id.title, "field 'title'", TextView.class);
            viewHolder.addButton = (FancyButton) ct.a(view, (int) R.id.addToPtwButton, "field 'addButton'", FancyButton.class);
            viewHolder.moreInfoButton = (FancyButton) ct.a(view, (int) R.id.moreInfoButton, "field 'moreInfoButton'", FancyButton.class);
            viewHolder.transparentToWhite = ct.a(view, R.id.transparentToWhiteView, "field 'transparentToWhite'");
            viewHolder.animeImage = (ImageView) ct.a(view, (int) R.id.animeImage, "field 'animeImage'", ImageView.class);
            viewHolder.animeGenres = (TextView) ct.a(view, (int) R.id.animeGenres, "field 'animeGenres'", TextView.class);
            viewHolder.animeStatus = (TextView) ct.a(view, (int) R.id.animeStatus, "field 'animeStatus'", TextView.class);
        }

        public final void a() {
            ViewHolder viewHolder = this.b;
            if (viewHolder != null) {
                this.b = null;
                viewHolder.synopsis = null;
                viewHolder.title = null;
                viewHolder.addButton = null;
                viewHolder.moreInfoButton = null;
                viewHolder.transparentToWhite = null;
                viewHolder.animeImage = null;
                viewHolder.animeGenres = null;
                viewHolder.animeStatus = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public AnimeSeasonalAdapter(Activity activity, AnimeViewModel animeViewModel) {
        this.b = activity;
        this.c = new ArrayList();
        this.f = animeViewModel;
        this.d = new ArrayList();
        a();
    }

    private void a() {
        this.g.clear();
        if (this.h) {
            for (ask ask : this.c) {
                if (!a(ask)) {
                    this.g.add(ask);
                }
            }
            return;
        }
        this.g = new ArrayList(this.c);
    }

    private /* synthetic */ void a(ask ask, View view) {
        aug.a(this.b, ask.b);
        Toast.makeText(this.b, "Title copied to your clipboard", 0).show();
    }

    private /* synthetic */ void a(ask ask, ViewHolder viewHolder, alg alg) {
        if (alg.c()) {
            Toast.makeText(this.b, String.format("Successfully added %s to your profile", new Object[]{ask.b}), 0).show();
            viewHolder.addButton.setVisibility(8);
            this.e.add(Integer.valueOf(ask.a));
            return;
        }
        aub.a(this.b, alg);
    }

    private /* synthetic */ void a(ask ask, ViewHolder viewHolder, View view) {
        new aty(this.b, are.a((long) ask.a, ask.b, ask.c), this.f, new -$$Lambda$AnimeSeasonalAdapter$gZVKvWWw2_cFYlfq-OToTv0VFTk(this, ask, viewHolder)).f();
    }

    private boolean a(ask ask) {
        return this.d.contains(Long.valueOf((long) ask.a)) ? true : this.e.contains(Integer.valueOf(ask.a));
    }

    private /* synthetic */ void b(ask ask, View view) {
        arn arn = new arn((long) ask.a, ask.b, ask.c);
        Context context = this.b;
        context.startActivity(AnimeInfoActivityR2.a(context, arn));
    }

    private /* synthetic */ void c(ask ask, View view) {
        new o(this.b).a((CharSequence) "Synopsis").b(ask.e).c((CharSequence) "ok").l();
    }

    public final void a(List<ask> list, List<Long> list2) {
        this.c = list;
        this.d = list2;
        notifyDataSetChanged();
        a();
    }

    public final void a(boolean z) {
        this.h = z;
        a();
        notifyDataSetChanged();
    }

    public final int getItemCount() {
        return this.g.size();
    }

    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        ask ask = (ask) this.g.get(i);
        viewHolder2.title.setText(ask.b);
        viewHolder2.synopsis.setText(ask.e);
        viewHolder2.animeStatus.setText(String.format("%s (%.2f)", new Object[]{ask.d, Double.valueOf(ask.g)}));
        viewHolder2.animeGenres.setText(bit.a(new String[]{ask.a(), ", "}, null));
        de.a(this.b).a(ask.c).a(viewHolder2.animeImage);
        if (this.e.contains(Integer.valueOf(ask.a))) {
            viewHolder2.addButton.setVisibility(8);
        } else {
            viewHolder2.addButton.setVisibility(0);
        }
        viewHolder2.addButton.setOnClickListener(new -$$Lambda$AnimeSeasonalAdapter$1S9YfzDlwkfpb--N1NuBuf1sesI(this, ask, viewHolder2));
        viewHolder2.synopsis.setOnClickListener(new -$$Lambda$AnimeSeasonalAdapter$LHeRluSmkzs8vmTMJTSftyIrjXE(this, ask));
        viewHolder2.moreInfoButton.setOnClickListener(new -$$Lambda$AnimeSeasonalAdapter$2cxhaf4jVa4ptLYhtukxxpLIz9Q(this, ask));
        viewHolder2.title.setOnClickListener(new -$$Lambda$AnimeSeasonalAdapter$_VPfsqMzV7ntWjTdjZVrRCuW7jE(this, ask));
    }

    public final /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_anime_seasonal, viewGroup, false));
    }
}
