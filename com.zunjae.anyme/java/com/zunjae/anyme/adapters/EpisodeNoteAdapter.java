package com.zunjae.anyme.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import com.zunjae.anyme.rewrite.viewmodels.KanonViewModel;
import defpackage.aso;
import defpackage.bit;
import defpackage.ct;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public class EpisodeNoteAdapter extends Adapter<ViewHolder> {
    private final String a = EpisodeNoteAdapter.class.getSimpleName();
    @SuppressLint({"SimpleDateFormat"})
    private final DateFormat b = new SimpleDateFormat("MMMM dd HH:mm");
    private final Activity c;
    private final ArrayList<aso> d;
    private final KanonViewModel e;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView
        CardView cardViewContainer;
        @BindView
        TextView episodeNote;
        @BindView
        TextView episodeNoteCreated;
        @BindView
        TextView episodeNumber;

        ViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.b = viewHolder;
            viewHolder.episodeNumber = (TextView) ct.a(view, (int) R.id.episodeNumber, "field 'episodeNumber'", TextView.class);
            viewHolder.episodeNote = (TextView) ct.a(view, (int) R.id.episodeNote, "field 'episodeNote'", TextView.class);
            viewHolder.episodeNoteCreated = (TextView) ct.a(view, (int) R.id.episodeNoteCreated, "field 'episodeNoteCreated'", TextView.class);
            viewHolder.cardViewContainer = (CardView) ct.a(view, (int) R.id.cardViewContainer, "field 'cardViewContainer'", CardView.class);
        }

        public final void a() {
            ViewHolder viewHolder = this.b;
            if (viewHolder != null) {
                this.b = null;
                viewHolder.episodeNumber = null;
                viewHolder.episodeNote = null;
                viewHolder.episodeNoteCreated = null;
                viewHolder.cardViewContainer = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public EpisodeNoteAdapter(Activity activity, ArrayList<aso> arrayList, KanonViewModel kanonViewModel) {
        this.c = activity;
        this.d = arrayList;
        this.e = kanonViewModel;
    }

    public int getItemCount() {
        return this.d.size();
    }

    public /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        TextView textView;
        CharSequence charSequence;
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        aso aso = (aso) this.d.get(i);
        viewHolder2.episodeNumber.setText(aso.b());
        if (bit.b(aso.c())) {
            viewHolder2.episodeNote.setHint("Tap to add a note");
            textView = viewHolder2.episodeNote;
            charSequence = BuildConfig.FLAVOR;
        } else {
            viewHolder2.episodeNote.setHint(BuildConfig.FLAVOR);
            textView = viewHolder2.episodeNote;
            charSequence = aso.c();
        }
        textView.setText(charSequence);
        if (aso.e() <= 0 || aso.c().length() <= 0) {
            viewHolder2.episodeNoteCreated.setVisibility(8);
        } else {
            viewHolder2.episodeNoteCreated.setVisibility(0);
            viewHolder2.episodeNoteCreated.setText(this.b.format(new Date(aso.e() * 1000)));
        }
        viewHolder2.cardViewContainer.setOnClickListener(new c(this, aso, i));
    }

    public /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_episode_add_note, viewGroup, false));
    }
}
