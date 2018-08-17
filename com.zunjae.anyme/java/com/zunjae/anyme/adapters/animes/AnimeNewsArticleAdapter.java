package com.zunjae.anyme.adapters.animes;

import android.content.Context;
import android.support.v7.widget.CardView;
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
import defpackage.ame;
import defpackage.bit;
import defpackage.ct;
import defpackage.de;
import java.util.ArrayList;

public final class AnimeNewsArticleAdapter extends Adapter<ViewHolder> {
    private final String a = getClass().getSimpleName();
    private final Context b;
    private final ArrayList<ame> c;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView
        CardView cardViewContainer;
        @BindView
        TextView newsArticleDate;
        @BindView
        ImageView newsArticleImage;
        @BindView
        TextView newsArticleNumberOfComments;
        @BindView
        TextView newsArticleTitle;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.b = viewHolder;
            viewHolder.newsArticleImage = (ImageView) ct.a(view, (int) R.id.newsArticleImage, "field 'newsArticleImage'", ImageView.class);
            viewHolder.newsArticleTitle = (TextView) ct.a(view, (int) R.id.newsArticleTitle, "field 'newsArticleTitle'", TextView.class);
            viewHolder.newsArticleDate = (TextView) ct.a(view, (int) R.id.newsArticleDate, "field 'newsArticleDate'", TextView.class);
            viewHolder.newsArticleNumberOfComments = (TextView) ct.a(view, (int) R.id.newsArticleNumberOfComments, "field 'newsArticleNumberOfComments'", TextView.class);
            viewHolder.cardViewContainer = (CardView) ct.a(view, (int) R.id.cardViewContainer, "field 'cardViewContainer'", CardView.class);
        }

        public final void a() {
            ViewHolder viewHolder = this.b;
            if (viewHolder != null) {
                this.b = null;
                viewHolder.newsArticleImage = null;
                viewHolder.newsArticleTitle = null;
                viewHolder.newsArticleDate = null;
                viewHolder.newsArticleNumberOfComments = null;
                viewHolder.cardViewContainer = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public AnimeNewsArticleAdapter(Context context, ArrayList<ame> arrayList) {
        this.c = arrayList;
        this.b = context;
    }

    public final boolean a() {
        return this.c.size() > 0;
    }

    public final int getItemCount() {
        return this.c.size();
    }

    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        ImageView imageView;
        int i2;
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        ame ame = (ame) this.c.get(i);
        viewHolder2.newsArticleTitle.setText(ame.a());
        viewHolder2.newsArticleDate.setText(ame.c());
        viewHolder2.newsArticleNumberOfComments.setText(ame.d());
        if (bit.c(ame.b())) {
            de.b(this.b).a(ame.b()).a((int) R.drawable.transparent_to_black).a(viewHolder2.newsArticleImage);
            imageView = viewHolder2.newsArticleImage;
            i2 = 0;
        } else {
            imageView = viewHolder2.newsArticleImage;
            i2 = 8;
        }
        imageView.setVisibility(i2);
        viewHolder2.cardViewContainer.setOnClickListener(new e(this, ame));
    }

    public final /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_anime_newsarticle, viewGroup, false));
    }
}
