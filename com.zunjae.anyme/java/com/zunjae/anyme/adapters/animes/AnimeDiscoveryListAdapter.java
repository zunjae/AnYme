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
import defpackage.anb;
import defpackage.arn;
import defpackage.ct;
import defpackage.de;
import java.util.ArrayList;

public final class AnimeDiscoveryListAdapter extends Adapter<ViewHolder> {
    private final Activity a;
    private final ArrayList<anb> b;

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

    public AnimeDiscoveryListAdapter(Activity activity, ArrayList<anb> arrayList) {
        this.a = activity;
        this.b = arrayList;
    }

    private /* synthetic */ void a(anb anb, View view) {
        arn arn = new arn((long) anb.e().intValue(), anb.b(), anb.a());
        Context context = this.a;
        context.startActivity(AnimeInfoActivityR2.a(context, arn));
    }

    public final int getItemCount() {
        return this.b.size();
    }

    @SuppressLint({"DefaultLocale"})
    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        anb anb = (anb) this.b.get(i);
        de.a(this.a).a(anb.a()).a(viewHolder2.animeCoverImage);
        viewHolder2.seriesTitle.setText(String.format("#%d %s", new Object[]{Integer.valueOf(i + 1), anb.b()}));
        viewHolder2.description.setText(anb.f().replace("-\\n", "\n"));
        viewHolder2.viewGroup.setOnClickListener(new -$$Lambda$AnimeDiscoveryListAdapter$pfaYklWDc3T6Z3o_a8UEPYqQmBU(this, anb));
    }

    public final /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_anime_discovery_item, viewGroup, false));
    }
}
