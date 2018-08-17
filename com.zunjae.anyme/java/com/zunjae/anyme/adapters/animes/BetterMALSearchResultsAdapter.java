package com.zunjae.anyme.adapters.animes;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView.Adapter;
import android.text.Html;
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
import com.zunjae.anyme.rewrite.activities.AnimeInfoActivityR2;
import com.zunjae.anyme.rewrite.viewmodels.AnimeViewModel;
import defpackage.alg;
import defpackage.alt;
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
import java.util.List;
import mehdi.sakout.fancybuttons.FancyButton;

@SuppressLint({"SetTextI18n"})
public final class BetterMALSearchResultsAdapter extends Adapter<ViewHolder> {
    private final Activity a;
    private final String b = "BetterMALSearchResultsAdapter";
    private final ArrayList<alt> c;
    private final List<are> d;
    private final AnimeViewModel e;
    private final ArrayList<Integer> f = new ArrayList();
    private final ArrayList<Integer> g = new ArrayList();
    private final List<Integer> h;
    private ArrayList<alt> i = new ArrayList();
    private boolean j;
    private int k = 0;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView
        FancyButton addButton;
        @BindView
        ImageView animeImage;
        @BindView
        TextView animeName;
        @BindView
        TextView animeStatus;
        @BindView
        TextView animeSynopsis;
        @BindView
        FancyButton moreInfoButton;
        @BindView
        TextView nsfwWarning;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.b = viewHolder;
            viewHolder.animeName = (TextView) ct.a(view, (int) R.id.animeTitle, "field 'animeName'", TextView.class);
            viewHolder.animeImage = (ImageView) ct.a(view, (int) R.id.animeImage, "field 'animeImage'", ImageView.class);
            viewHolder.animeSynopsis = (TextView) ct.a(view, (int) R.id.animeSynopsis, "field 'animeSynopsis'", TextView.class);
            viewHolder.animeStatus = (TextView) ct.a(view, (int) R.id.animeStatus, "field 'animeStatus'", TextView.class);
            viewHolder.addButton = (FancyButton) ct.a(view, (int) R.id.addToPtwButton, "field 'addButton'", FancyButton.class);
            viewHolder.moreInfoButton = (FancyButton) ct.a(view, (int) R.id.moreInfoButton, "field 'moreInfoButton'", FancyButton.class);
            viewHolder.nsfwWarning = (TextView) ct.a(view, (int) R.id.nsfwWarningMessage, "field 'nsfwWarning'", TextView.class);
        }

        public final void a() {
            ViewHolder viewHolder = this.b;
            if (viewHolder != null) {
                this.b = null;
                viewHolder.animeName = null;
                viewHolder.animeImage = null;
                viewHolder.animeSynopsis = null;
                viewHolder.animeStatus = null;
                viewHolder.addButton = null;
                viewHolder.moreInfoButton = null;
                viewHolder.nsfwWarning = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public BetterMALSearchResultsAdapter(Activity activity, ArrayList<alt> arrayList, List<are> list, boolean z, boolean z2, List<Integer> list2, AnimeViewModel animeViewModel) {
        this.a = activity;
        this.c = arrayList;
        this.d = list;
        this.e = animeViewModel;
        this.j = z;
        this.h = list2;
        if (z2) {
            b();
        }
        c();
    }

    private /* synthetic */ void a(alt alt, View view) {
        aug.a(this.a, alt.a());
        Toast.makeText(this.a, "Title copied to your clipboard", 0).show();
    }

    private /* synthetic */ void a(alt alt, ViewHolder viewHolder, alg alg) {
        if (alg.c()) {
            Toast.makeText(this.a, String.format("Successfully added %s to your profile", new Object[]{alt.a()}), 0).show();
            viewHolder.addButton.setVisibility(8);
            this.g.add(Integer.valueOf(alt.f()));
            return;
        }
        aub.a(this.a, alg);
    }

    private /* synthetic */ void a(alt alt, ViewHolder viewHolder, View view) {
        new aty(this.a, are.a((long) alt.f(), alt.a(), alt.e()), this.e, new -$$Lambda$BetterMALSearchResultsAdapter$YLvMdTEu7v4rmYCw10yZZSEujsw(this, alt, viewHolder)).f();
    }

    private /* synthetic */ void a(ViewHolder viewHolder, View view) {
        viewHolder.nsfwWarning.setVisibility(8);
        this.f.add(Integer.valueOf(viewHolder.getAdapterPosition()));
    }

    private boolean a(alt alt) {
        for (are d : this.d) {
            if (d.d() == alt.f()) {
                return true;
            }
        }
        return this.g.contains(Integer.valueOf(alt.f()));
    }

    private void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            if (this.h.contains(Integer.valueOf(((alt) it.next()).f()))) {
                it.remove();
                this.k++;
            }
        }
    }

    private /* synthetic */ void b(alt alt, View view) {
        arn arn = new arn((long) alt.f(), alt.a(), alt.e());
        Context context = this.a;
        context.startActivity(AnimeInfoActivityR2.a(context, arn));
    }

    private void c() {
        this.i.clear();
        if (this.j) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                alt alt = (alt) it.next();
                if (!a(alt)) {
                    this.i.add(alt);
                }
            }
            return;
        }
        this.i = new ArrayList(this.c);
    }

    public final int a() {
        return this.k;
    }

    public final void a(boolean z) {
        this.j = z;
        c();
        notifyDataSetChanged();
    }

    public final int getItemCount() {
        return this.i.size();
    }

    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        alt alt = (alt) this.i.get(viewHolder2.getAdapterPosition());
        viewHolder2.animeImage.setVisibility(0);
        de.a(this.a).a(alt.e()).a(fa.NONE).a(viewHolder2.animeImage);
        viewHolder2.animeName.setText(alt.a());
        viewHolder2.animeSynopsis.setText(Html.fromHtml(alt.d()));
        TextView textView = viewHolder2.animeStatus;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(alt.b());
        stringBuilder.append(" | ");
        stringBuilder.append(alt.c());
        textView.setText(stringBuilder.toString());
        if (this.h.contains(Integer.valueOf(alt.f()))) {
            viewHolder2.nsfwWarning.setVisibility(0);
        } else {
            viewHolder2.nsfwWarning.setVisibility(8);
        }
        if (this.f.contains(Integer.valueOf(viewHolder2.getAdapterPosition()))) {
            viewHolder2.nsfwWarning.setVisibility(8);
        }
        if (a(alt)) {
            viewHolder2.addButton.setVisibility(8);
        } else {
            viewHolder2.addButton.setVisibility(0);
        }
        viewHolder2.nsfwWarning.setOnClickListener(new -$$Lambda$BetterMALSearchResultsAdapter$egzqOLM_uLN4HQX5IH0rl_gE8wI(this, viewHolder2));
        viewHolder2.addButton.setOnClickListener(new -$$Lambda$BetterMALSearchResultsAdapter$DuA_IqFS7sA233NAkXgQTMdBQGs(this, alt, viewHolder2));
        viewHolder2.moreInfoButton.setOnClickListener(new -$$Lambda$BetterMALSearchResultsAdapter$dlmfeyW5ZJuW6LjQqUqRMentW1o(this, alt));
        viewHolder2.animeName.setOnClickListener(new -$$Lambda$BetterMALSearchResultsAdapter$a7qsuk3fA_75Vl7yfz4VmzqRqxo(this, alt));
    }

    public final /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_better_mal_search_results, viewGroup, false));
    }
}
