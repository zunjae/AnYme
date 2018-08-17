package com.zunjae.anyme.adapters;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.alo;
import defpackage.anr;
import defpackage.aux;
import defpackage.ct;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public final class VideoHistoryAdapter extends Adapter<ViewHolder> {
    @SuppressLint({"SimpleDateFormat"})
    private final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd - HH:mm");
    private final String b;
    private final Dialog c;
    private ArrayList<alo> d;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView
        TextView animeName;
        @BindView
        LinearLayout container;
        @BindView
        ImageButton deleteEntryButton;
        @BindView
        TextView lastUpdated;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.b = viewHolder;
            viewHolder.animeName = (TextView) ct.a(view, (int) R.id.animeAltName, "field 'animeName'", TextView.class);
            viewHolder.lastUpdated = (TextView) ct.a(view, (int) R.id.animeUrl, "field 'lastUpdated'", TextView.class);
            viewHolder.container = (LinearLayout) ct.a(view, (int) R.id.cardViewContainer, "field 'container'", LinearLayout.class);
            viewHolder.deleteEntryButton = (ImageButton) ct.a(view, (int) R.id.deleteEntryButton, "field 'deleteEntryButton'", ImageButton.class);
        }

        public final void a() {
            ViewHolder viewHolder = this.b;
            if (viewHolder != null) {
                this.b = null;
                viewHolder.animeName = null;
                viewHolder.lastUpdated = null;
                viewHolder.container = null;
                viewHolder.deleteEntryButton = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public VideoHistoryAdapter(String str, Dialog dialog) {
        this.b = str;
        this.c = dialog;
        this.d = anr.a(str);
    }

    private /* synthetic */ void a(alo alo, View view) {
        aux.b(this.b, alo, alo.class);
        this.d = anr.a(this.b);
        if (this.d.size() == 0) {
            this.c.dismiss();
        } else {
            notifyDataSetChanged();
        }
    }

    public final int getItemCount() {
        return this.d.size();
    }

    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        alo alo = (alo) this.d.get(viewHolder2.getAdapterPosition());
        viewHolder2.animeName.setText(alo.b());
        viewHolder2.lastUpdated.setText(this.a.format(Long.valueOf(alo.d())));
        viewHolder2.deleteEntryButton.setOnClickListener(new -$$Lambda$VideoHistoryAdapter$wRWrbFS0nQwDUJ-z2ZQ736RG_Ww(this, alo));
        viewHolder2.container.setOnClickListener(new h(this, alo));
    }

    public final /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_video_history, viewGroup, false));
    }
}
