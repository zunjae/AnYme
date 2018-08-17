package com.zunjae.anyme.rewrite.adapters;

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
import defpackage.are;
import defpackage.arn;
import defpackage.arp;
import defpackage.asm;
import defpackage.ct;
import defpackage.de;
import defpackage.tw;
import java.util.List;

@SuppressLint({"DefaultLocale", "SetTextI18n"})
public final class AnimeRecommendationsAdapter extends Adapter<ViewHolder> {
    private static final String a = "com.zunjae.anyme.rewrite.adapters.AnimeRecommendationsAdapter";
    private final int b;
    private final Activity c;
    private List<asm> d;

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
            viewHolder.userStatus = (TextView) ct.a(view, (int) R.id.userStatus, "field 'userStatus'", TextView.class);
            viewHolder.seriesEpisodes = (TextView) ct.a(view, (int) R.id.seriesEpisodes, "field 'seriesEpisodes'", TextView.class);
        }

        public final void a() {
            ViewHolder viewHolder = this.b;
            if (viewHolder != null) {
                this.b = null;
                viewHolder.animeCoverImage = null;
                viewHolder.seriesTitle = null;
                viewHolder.viewGroup = null;
                viewHolder.userStatus = null;
                viewHolder.seriesEpisodes = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public AnimeRecommendationsAdapter(Activity activity, List<asm> list, int i) {
        this.c = activity;
        this.b = i;
        this.d = list;
    }

    private /* synthetic */ void a(arp arp, View view) {
        arn arn = new arn(arp.a(), arp.b(), arp.c());
        Context context = this.c;
        context.startActivity(AnimeInfoActivityR2.a(context, arn));
    }

    public final void a(List<asm> list) {
        this.d = list;
        notifyDataSetChanged();
    }

    public final int getItemCount() {
        return this.d.size();
    }

    public final int getItemViewType(int i) {
        return this.b;
    }

    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        arp arp = ((asm) this.d.get(i)).b;
        are are = ((asm) this.d.get(i)).a;
        de.a(this.c).a(arp.c()).a(viewHolder2.animeCoverImage);
        viewHolder2.seriesTitle.setText(arp.b());
        if (are != null) {
            viewHolder2.userStatus.setText(String.format("%s (%d)", new Object[]{are.D(), Integer.valueOf(are.r())}));
            viewHolder2.seriesEpisodes.setText(String.format("%d/%d", new Object[]{Integer.valueOf(are.o()), Integer.valueOf(are.j())}));
            viewHolder2.userStatus.setVisibility(0);
            viewHolder2.seriesEpisodes.setVisibility(0);
        } else {
            viewHolder2.userStatus.setVisibility(8);
            viewHolder2.seriesEpisodes.setVisibility(8);
        }
        viewHolder2.viewGroup.setOnClickListener(new -$$Lambda$AnimeRecommendationsAdapter$1S4WayQkAJdO0bjoNuXnH4JeGDw(this, arp));
    }

    public final /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from;
        int i2;
        switch (i) {
            case mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                from = LayoutInflater.from(viewGroup.getContext());
                i2 = R.layout.cardview_anime_recommendations_horizontal_fragment;
                break;
            case tw.a /*1*/:
                from = LayoutInflater.from(viewGroup.getContext());
                i2 = R.layout.cardview_anime_recommendations_vertical_fragment;
                break;
            default:
                throw new IllegalStateException("wew");
        }
        return new ViewHolder(from.inflate(i2, viewGroup, false));
    }
}
