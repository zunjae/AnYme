package com.zunjae.anyme.adapters.animes;

import android.annotation.SuppressLint;
import android.app.Activity;
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
import defpackage.ama;
import defpackage.ct;
import defpackage.de;
import defpackage.fa;
import java.util.ArrayList;

public final class AnimeGenreAdapter extends Adapter<ViewHolder> {
    private final Activity a;
    private final ArrayList<ama> b;
    private final int c;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView
        ImageView animeCoverImage;
        @BindView
        TextView description;
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
            viewHolder.animeCoverImage = (ImageView) ct.a(view, (int) R.id.animeCoverImage, "field 'animeCoverImage'", ImageView.class);
            viewHolder.seriesTitle = (TextView) ct.a(view, (int) R.id.seriesTitle, "field 'seriesTitle'", TextView.class);
            viewHolder.description = (TextView) ct.a(view, (int) R.id.description, "field 'description'", TextView.class);
            viewHolder.viewGroup = (ViewGroup) ct.a(view, (int) R.id.cardViewContainer, "field 'viewGroup'", ViewGroup.class);
        }

        public final void a() {
            ViewHolder viewHolder = this.b;
            if (viewHolder != null) {
                this.b = null;
                viewHolder.animeCoverImage = null;
                viewHolder.seriesTitle = null;
                viewHolder.description = null;
                viewHolder.viewGroup = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public AnimeGenreAdapter(Activity activity, ArrayList<ama> arrayList, int i) {
        this.a = activity;
        this.b = arrayList;
        this.c = i;
    }

    public final int getItemCount() {
        return this.b.size();
    }

    @SuppressLint({"DefaultLocale"})
    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        ama ama = (ama) this.b.get(i);
        de.a(this.a).a(ama.f()).a(fa.NONE).a(viewHolder2.animeCoverImage);
        viewHolder2.seriesTitle.setText(String.format("#%d %s", new Object[]{Integer.valueOf((((this.c - 1) * 100) + i) + 1), ama.e()}));
        viewHolder2.description.setText(String.format("%s\nScore: %s\nMembers: %s", new Object[]{ama.a(), Double.valueOf(ama.d()), ama.b()}));
        viewHolder2.seriesTitle.setOnClickListener(new b(this, ama));
        viewHolder2.viewGroup.setOnClickListener(new c(this, ama));
    }

    public final /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_anime_genre_result, viewGroup, false));
    }
}
