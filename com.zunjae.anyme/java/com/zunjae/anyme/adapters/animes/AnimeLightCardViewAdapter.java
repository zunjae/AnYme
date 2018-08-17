package com.zunjae.anyme.adapters.animes;

import android.annotation.SuppressLint;
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
import defpackage.are;
import defpackage.ct;
import defpackage.de;
import java.util.List;

public final class AnimeLightCardViewAdapter extends Adapter<ViewHolder> {
    private final List<are> a;
    private final Context b;
    private int c = -1;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView
        ImageView animeCoverImage;
        @BindView
        TextView animeName;
        @BindView
        TextView animeStatus;
        @BindView
        TextView userProgress;
        @BindView
        TextView userScore;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.b = viewHolder;
            viewHolder.animeCoverImage = (ImageView) ct.a(view, (int) R.id.animeCardViewCoverImage, "field 'animeCoverImage'", ImageView.class);
            viewHolder.animeName = (TextView) ct.a(view, (int) R.id.animeCardViewName, "field 'animeName'", TextView.class);
            viewHolder.userProgress = (TextView) ct.a(view, (int) R.id.animeCardViewProgress, "field 'userProgress'", TextView.class);
            viewHolder.userScore = (TextView) ct.a(view, (int) R.id.animeCardViewScore, "field 'userScore'", TextView.class);
            viewHolder.animeStatus = (TextView) ct.a(view, (int) R.id.animeCardViewStatus, "field 'animeStatus'", TextView.class);
        }

        public final void a() {
            ViewHolder viewHolder = this.b;
            if (viewHolder != null) {
                this.b = null;
                viewHolder.animeCoverImage = null;
                viewHolder.animeName = null;
                viewHolder.userProgress = null;
                viewHolder.userScore = null;
                viewHolder.animeStatus = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public AnimeLightCardViewAdapter(List<are> list, Context context) {
        this.a = list;
        this.b = context;
    }

    public final void a(int i) {
        this.c = i;
        notifyDataSetChanged();
    }

    public final int getItemCount() {
        return this.a.size();
    }

    @SuppressLint({"SetTextI18n"})
    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        are are = (are) this.a.get(i);
        de.b(this.b).a(are.n()).a(R.integer.imageWidth, R.integer.imageHeight).a(viewHolder2.animeCoverImage);
        if (this.c != -1) {
            viewHolder2.animeCoverImage.getLayoutParams().height = this.c;
        }
        viewHolder2.animeName.setText(are.g());
        viewHolder2.userProgress.setText(are.b(null));
        TextView textView = viewHolder2.userScore;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(are.r());
        textView.setText(stringBuilder.toString());
    }

    public final /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_anime_main_classic, viewGroup, false);
        ButterKnife.a(this, inflate);
        return new ViewHolder(inflate);
    }
}
