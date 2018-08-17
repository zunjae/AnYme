package com.zunjae.anyme.adapters.animes;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView.Adapter;
import android.text.Html;
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
import defpackage.ana;
import defpackage.arn;
import defpackage.ct;
import defpackage.de;
import defpackage.fa;
import java.util.ArrayList;
import java.util.List;

public final class AnimeDiscordSuggestionAdapter extends Adapter<ViewHolder> {
    private final Activity a;
    private final List<ana> b;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView
        ImageView animeCoverImage;
        @BindView
        TextView title;
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
            viewHolder.animeCoverImage = (ImageView) ct.a(view, (int) R.id.animeCoverImage, "field 'animeCoverImage'", ImageView.class);
            viewHolder.title = (TextView) ct.a(view, (int) me.zhanghai.android.materialprogressbar.R.id.title, "field 'title'", TextView.class);
            viewHolder.viewGroup = (ViewGroup) ct.a(view, (int) R.id.cardViewContainer, "field 'viewGroup'", ViewGroup.class);
            viewHolder.userStatus = (TextView) ct.a(view, (int) R.id.userStatus, "field 'userStatus'", TextView.class);
        }

        public final void a() {
            ViewHolder viewHolder = this.b;
            if (viewHolder != null) {
                this.b = null;
                viewHolder.animeCoverImage = null;
                viewHolder.title = null;
                viewHolder.viewGroup = null;
                viewHolder.userStatus = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public AnimeDiscordSuggestionAdapter(Activity activity, ArrayList<ana> arrayList) {
        this.a = activity;
        this.b = arrayList;
    }

    private /* synthetic */ void a(ana ana, View view) {
        arn arn = new arn((long) ana.d(), ana.b(), ana.c());
        Context context = this.a;
        context.startActivity(AnimeInfoActivityR2.a(context, arn));
    }

    public final int getItemCount() {
        return this.b.size();
    }

    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        ana ana = (ana) this.b.get(i);
        de.a(this.a).a(ana.c()).a(fa.RESULT).a(viewHolder2.animeCoverImage);
        viewHolder2.title.setText(Html.fromHtml(String.format("%s<br><small><i>Recommended by: %s</i></small>", new Object[]{ana.b(), ana.e()})));
        viewHolder2.viewGroup.setOnClickListener(new -$$Lambda$AnimeDiscordSuggestionAdapter$p0fj6WwzldgRLsCa6UA-y1zt5Iw(this, ana));
        if (ana.a() != null) {
            viewHolder2.userStatus.setText(ana.a());
            viewHolder2.userStatus.setVisibility(0);
            return;
        }
        viewHolder2.userStatus.setVisibility(8);
    }

    public final /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_discord_suggestion_showcase, viewGroup, false));
    }
}
