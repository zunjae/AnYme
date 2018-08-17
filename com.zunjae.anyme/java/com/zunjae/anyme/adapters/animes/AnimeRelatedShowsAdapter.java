package com.zunjae.anyme.adapters.animes;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import com.zunjae.anyme.rewrite.activities.AnimeInfoActivityR2;
import defpackage.amg;
import defpackage.are;
import defpackage.arn;
import defpackage.asn;
import defpackage.ct;
import defpackage.de;
import defpackage.tw;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"DefaultLocale"})
public final class AnimeRelatedShowsAdapter extends Adapter<ViewHolder> {
    private final Activity a;
    private final int b;
    private List<asn> c = new ArrayList();

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView
        ImageView animeCoverImage;
        @BindView
        TextView seriesEpisodes;
        @BindView
        TextView seriesTitle;
        @BindView
        TextView userStatus;
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
            viewHolder.animeCoverImage = (ImageView) ct.a(view, (int) R.id.seriesImage, "field 'animeCoverImage'", ImageView.class);
            viewHolder.seriesTitle = (TextView) ct.a(view, (int) R.id.seriesTitle, "field 'seriesTitle'", TextView.class);
            viewHolder.viewGroup = (ViewGroup) ct.a(view, (int) R.id.cardViewContainer, "field 'viewGroup'", ViewGroup.class);
            viewHolder.seriesEpisodes = (TextView) ct.a(view, (int) R.id.seriesEpisodes, "field 'seriesEpisodes'", TextView.class);
            viewHolder.userStatus = (TextView) ct.a(view, (int) R.id.userStatus, "field 'userStatus'", TextView.class);
        }

        public final void a() {
            ViewHolder viewHolder = this.b;
            if (viewHolder != null) {
                this.b = null;
                viewHolder.animeCoverImage = null;
                viewHolder.seriesTitle = null;
                viewHolder.viewGroup = null;
                viewHolder.seriesEpisodes = null;
                viewHolder.userStatus = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public AnimeRelatedShowsAdapter(Activity activity, int i) {
        this.a = activity;
        this.b = i;
    }

    private /* synthetic */ void a(amg amg, View view) {
        arn arn = new arn((long) amg.d().intValue(), amg.b(), amg.h());
        Context context = this.a;
        context.startActivity(AnimeInfoActivityR2.a(context, arn));
    }

    public final void a(List<asn> list) {
        this.c = list;
        notifyDataSetChanged();
    }

    public final boolean a() {
        List list = this.c;
        return list != null && list.size() > 0;
    }

    public final boolean b() {
        for (asn asn : this.c) {
            if (asn.a == null) {
                return true;
            }
        }
        return false;
    }

    public final int getItemCount() {
        return this.c.size();
    }

    public final int getItemViewType(int i) {
        return this.b;
    }

    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        amg amg = ((asn) this.c.get(i)).b;
        are are = ((asn) this.c.get(i)).a;
        de.a(this.a).a(amg.h()).a(viewHolder2.animeCoverImage);
        viewHolder2.seriesTitle.setText(amg.b());
        viewHolder2.viewGroup.setOnClickListener(new -$$Lambda$AnimeRelatedShowsAdapter$iQFsgVFt3rfHZl6wECYtWRia4P4(this, amg));
        if (are != null) {
            viewHolder2.userStatus.setText(String.format("%s (%d)", new Object[]{are.D(), Integer.valueOf(are.r())}));
            viewHolder2.userStatus.setVisibility(0);
        } else {
            viewHolder2.userStatus.setVisibility(8);
        }
        TextView textView = viewHolder2.seriesEpisodes;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(amg.c());
        stringBuilder.append("\n");
        stringBuilder.append(amg.e());
        stringBuilder.append("Eps");
        textView.setText(stringBuilder.toString());
    }

    public final /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from;
        int i2;
        switch (i) {
            case mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                from = LayoutInflater.from(viewGroup.getContext());
                i2 = R.layout.cardview_anime_related;
                break;
            case tw.a /*1*/:
                from = LayoutInflater.from(viewGroup.getContext());
                i2 = R.layout.cardview_anime_related_vertical;
                break;
            default:
                throw new IllegalStateException("hm");
        }
        return new ViewHolder(from.inflate(i2, viewGroup, false));
    }
}
