package com.zunjae.anyme.adapters.animes;

import android.content.Context;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.aml;
import defpackage.anl;
import defpackage.ct;
import java.util.ArrayList;
import mehdi.sakout.fancybuttons.FancyButton;

public final class AnimeGenreTitlesAdapter extends Adapter<ViewHolder> {
    private final Context a;
    private final ArrayList<aml> b;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView
        FancyButton genreButton;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.b = viewHolder;
            viewHolder.genreButton = (FancyButton) ct.a(view, (int) R.id.genreButton, "field 'genreButton'", FancyButton.class);
        }

        public final void a() {
            ViewHolder viewHolder = this.b;
            if (viewHolder != null) {
                this.b = null;
                viewHolder.genreButton = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public AnimeGenreTitlesAdapter(Context context) {
        this.a = context;
        this.b = aml.a(anl.a(context));
    }

    public final int getItemCount() {
        return this.b.size();
    }

    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        aml aml = (aml) this.b.get(i);
        viewHolder2.genreButton.setText(aml.a());
        viewHolder2.genreButton.setOnClickListener(new d(this, aml));
    }

    public final /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.basic_anime_genre, viewGroup, false));
    }
}
