package com.zunjae.anyme.adapters.pickers;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;
import java.util.ArrayList;

public final class NumberPickerAdapter extends Adapter<ViewHolder> {
    private final ArrayList<Integer> a = new ArrayList();
    private final f b;
    private final int c;
    private final Context d;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView
        TextView episodeNumber;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.b = viewHolder;
            viewHolder.episodeNumber = (TextView) ct.a(view, (int) R.id.episodeNumber, "field 'episodeNumber'", TextView.class);
        }

        public final void a() {
            ViewHolder viewHolder = this.b;
            if (viewHolder != null) {
                this.b = null;
                viewHolder.episodeNumber = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public NumberPickerAdapter(int i, int i2, Context context, f fVar) {
        this.b = fVar;
        this.c = i;
        this.d = context;
        for (i = 0; i <= i2; i++) {
            this.a.add(Integer.valueOf(i));
        }
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        TextView textView;
        Context context;
        int i2;
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        Integer num = (Integer) this.a.get(viewHolder2.getAdapterPosition());
        if (num.intValue() <= this.c) {
            viewHolder2.episodeNumber.setBackgroundColor(ContextCompat.getColor(this.d, R.color.colorAccent));
            textView = viewHolder2.episodeNumber;
            context = this.d;
            i2 = R.color.md_white_1000;
        } else {
            viewHolder2.episodeNumber.setBackgroundColor(ContextCompat.getColor(this.d, 17170443));
            textView = viewHolder2.episodeNumber;
            context = this.d;
            i2 = R.color.transparent_black95;
        }
        textView.setTextColor(ContextCompat.getColor(context, i2));
        viewHolder2.episodeNumber.setText(String.valueOf(num));
        viewHolder2.episodeNumber.setOnClickListener(new e(this, num));
    }

    public final /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_episode_list, viewGroup, false));
    }
}
