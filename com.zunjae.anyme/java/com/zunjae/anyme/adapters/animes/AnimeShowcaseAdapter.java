package com.zunjae.anyme.adapters.animes;

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
import com.mikepenz.iconics.view.IconicsTextView;
import com.zunjae.anyme.R;
import com.zunjae.anyme.rewrite.activities.AnimeInfoActivityR2;
import defpackage.anb;
import defpackage.arn;
import defpackage.ct;
import defpackage.de;
import defpackage.fa;
import java.util.List;

public final class AnimeShowcaseAdapter extends Adapter<ViewHolder> {
    private final Activity a;
    private final List<anb> b;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView
        ImageView animeCoverImage;
        @BindView
        IconicsTextView score;
        @BindView
        TextView title;
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
            viewHolder.animeCoverImage = (ImageView) ct.a(view, (int) R.id.animeCoverImage, "field 'animeCoverImage'", ImageView.class);
            viewHolder.title = (TextView) ct.a(view, (int) me.zhanghai.android.materialprogressbar.R.id.title, "field 'title'", TextView.class);
            viewHolder.viewGroup = (ViewGroup) ct.a(view, (int) R.id.cardViewContainer, "field 'viewGroup'", ViewGroup.class);
            viewHolder.score = (IconicsTextView) ct.a(view, (int) R.id.score, "field 'score'", IconicsTextView.class);
        }

        public final void a() {
            ViewHolder viewHolder = this.b;
            if (viewHolder != null) {
                this.b = null;
                viewHolder.animeCoverImage = null;
                viewHolder.title = null;
                viewHolder.viewGroup = null;
                viewHolder.score = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public AnimeShowcaseAdapter(Activity activity, List<anb> list) {
        this.a = activity;
        this.b = list;
    }

    private /* synthetic */ void a(anb anb, View view) {
        arn arn = new arn((long) anb.e().intValue(), anb.b(), anb.a());
        Context context = this.a;
        context.startActivity(AnimeInfoActivityR2.a(context, arn));
    }

    public final int getItemCount() {
        return this.b.size();
    }

    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        IconicsTextView iconicsTextView;
        int i2;
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        anb anb = (anb) this.b.get(i);
        double c = anb.c();
        if (c > 0.0d) {
            viewHolder2.score.setText("{faw-star} ".concat(String.valueOf(c)));
            iconicsTextView = viewHolder2.score;
            i2 = 0;
        } else {
            iconicsTextView = viewHolder2.score;
            i2 = 8;
        }
        iconicsTextView.setVisibility(i2);
        de.a(this.a).a(anb.a()).a(fa.RESULT).a(viewHolder2.animeCoverImage);
        viewHolder2.title.setText(anb.b());
        viewHolder2.viewGroup.setOnClickListener(new -$$Lambda$AnimeShowcaseAdapter$1Ztm53hS5vO2FQ9-2qEB_KxsT2E(this, anb));
    }

    public final /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_anime_showcase, viewGroup, false));
    }
}
