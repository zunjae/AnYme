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
import defpackage.arg;
import defpackage.arn;
import defpackage.ct;
import defpackage.de;
import java.util.List;

@SuppressLint({"DefaultLocale", "SetTextI18n"})
public final class AnimeUserRecommendationsAdapter extends Adapter<ViewHolder> {
    private static final String a = "com.zunjae.anyme.rewrite.adapters.AnimeUserRecommendationsAdapter";
    private final Activity b;
    private List<arg> c;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView
        ImageView animeCoverImage;
        @BindView
        TextView seriesTitle;
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
        }

        public final void a() {
            ViewHolder viewHolder = this.b;
            if (viewHolder != null) {
                this.b = null;
                viewHolder.animeCoverImage = null;
                viewHolder.seriesTitle = null;
                viewHolder.viewGroup = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public AnimeUserRecommendationsAdapter(Activity activity, List<arg> list) {
        this.b = activity;
        this.c = list;
    }

    private /* synthetic */ void a(arg arg, View view) {
        arn arn = new arn(arg.a(), arg.g(), arg.h());
        Context context = this.b;
        context.startActivity(AnimeInfoActivityR2.a(context, arn));
    }

    public final void a(List<arg> list) {
        this.c = list;
        notifyDataSetChanged();
    }

    public final int getItemCount() {
        return this.c.size();
    }

    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        arg arg = (arg) this.c.get(i);
        de.a(this.b).a(arg.h()).a(viewHolder2.animeCoverImage);
        viewHolder2.seriesTitle.setText(arg.g());
        viewHolder2.viewGroup.setOnClickListener(new -$$Lambda$AnimeUserRecommendationsAdapter$crLKf6PwmQWsSPZCq-s9xA4nVNA(this, arg));
        viewHolder2.viewGroup.setBackground(null);
    }

    public final /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_anime_recommendations_horizontal, viewGroup, false));
    }
}
