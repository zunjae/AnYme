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
import defpackage.aly;
import defpackage.ct;
import defpackage.de;
import java.util.ArrayList;

public final class AnimeVideoAdapter extends Adapter<ViewHolder> {
    private final String a = "AnimeVideoAdapter";
    private final Context b;
    private final ArrayList<aly> c;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView
        CardView container;
        @BindView
        TextView videoName;
        @BindView
        ImageView videoThumbnail;
        @BindView
        TextView videoURL;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.b = viewHolder;
            viewHolder.videoThumbnail = (ImageView) ct.a(view, (int) R.id.videoThumbnail, "field 'videoThumbnail'", ImageView.class);
            viewHolder.videoName = (TextView) ct.a(view, (int) R.id.videoName, "field 'videoName'", TextView.class);
            viewHolder.container = (CardView) ct.a(view, (int) R.id.cardViewContainer, "field 'container'", CardView.class);
            viewHolder.videoURL = (TextView) ct.a(view, (int) R.id.videoURL, "field 'videoURL'", TextView.class);
        }

        public final void a() {
            ViewHolder viewHolder = this.b;
            if (viewHolder != null) {
                this.b = null;
                viewHolder.videoThumbnail = null;
                viewHolder.videoName = null;
                viewHolder.container = null;
                viewHolder.videoURL = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public AnimeVideoAdapter(Context context, ArrayList<aly> arrayList) {
        this.b = context;
        this.c = arrayList;
    }

    public final int getItemCount() {
        return this.c.size();
    }

    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        aly aly = (aly) this.c.get(i);
        viewHolder2.videoName.setText(aly.a());
        viewHolder2.videoURL.setText(aly.c());
        de.b(this.b).a(aly.b()).a((int) R.drawable.transparent_to_black).a(viewHolder2.videoThumbnail);
        viewHolder2.container.setOnClickListener(new f(this, aly));
    }

    public final /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_anime_video, viewGroup, false));
    }
}
