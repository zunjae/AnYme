package com.zunjae.anyme.adapters.pickers;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.are;
import defpackage.ct;
import java.util.ArrayList;
import java.util.List;

public final class BetterStatusPickerAdapter extends Adapter<ViewHolder> {
    private final List<Integer> a = new ArrayList();
    private final b b;
    private final String c = "BetterStatusPAd";
    private final int d;
    private final int e;
    private final Context f;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView
        LinearLayout linearLayout;
        @BindView
        TextView statusTextView;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.b = viewHolder;
            viewHolder.statusTextView = (TextView) ct.a(view, (int) R.id.status, "field 'statusTextView'", TextView.class);
            viewHolder.linearLayout = (LinearLayout) ct.a(view, (int) R.id.viewGroupNoAnimeHere, "field 'linearLayout'", LinearLayout.class);
        }

        public final void a() {
            ViewHolder viewHolder = this.b;
            if (viewHolder != null) {
                this.b = null;
                viewHolder.statusTextView = null;
                viewHolder.linearLayout = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public BetterStatusPickerAdapter(Context context, int i, b bVar) {
        this.a.add(Integer.valueOf(1));
        this.a.add(Integer.valueOf(6));
        this.a.add(Integer.valueOf(3));
        this.a.add(Integer.valueOf(2));
        this.a.add(Integer.valueOf(4));
        this.f = context;
        this.b = bVar;
        this.d = i;
        this.e = ContextCompat.getColor(context, R.color.colorAccent);
    }

    private /* synthetic */ void a(int i, View view) {
        this.b.onStatusClicked(i);
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        TextView textView;
        Context context;
        int i2;
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        i = ((Integer) this.a.get(viewHolder2.getAdapterPosition())).intValue();
        if (i == this.d) {
            viewHolder2.linearLayout.setBackgroundColor(this.e);
            textView = viewHolder2.statusTextView;
            context = this.f;
            i2 = R.color.md_white_1000;
        } else {
            viewHolder2.linearLayout.setBackgroundColor(ContextCompat.getColor(this.f, 17170443));
            textView = viewHolder2.statusTextView;
            context = this.f;
            i2 = R.color.transparent_black95;
        }
        textView.setTextColor(ContextCompat.getColor(context, i2));
        viewHolder2.statusTextView.setText(are.i(i));
        viewHolder2.statusTextView.setOnClickListener(new -$$Lambda$BetterStatusPickerAdapter$JjutPjXjaNIqbcYjoBjYqQYYH3Q(this, i));
    }

    public final /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_status_list, viewGroup, false));
    }
}
