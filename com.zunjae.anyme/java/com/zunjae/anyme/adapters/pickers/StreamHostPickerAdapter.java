package com.zunjae.anyme.adapters.pickers;

import android.content.Context;
import android.support.v4.content.ContextCompat;
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
import defpackage.alr;
import defpackage.anl;
import defpackage.ann;
import defpackage.aue;
import defpackage.ct;
import java.util.ArrayList;

public class StreamHostPickerAdapter extends Adapter<ViewHolder> {
    private final String a = StreamHostPickerAdapter.class.getSimpleName();
    private final ArrayList<alr> b;
    private final h c;
    private final Context d;
    private final alr e;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView
        CardView container;
        @BindView
        TextView hostName;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.b = viewHolder;
            viewHolder.hostName = (TextView) ct.a(view, (int) R.id.streamingSiteName, "field 'hostName'", TextView.class);
            viewHolder.container = (CardView) ct.a(view, (int) R.id.cardViewContainer, "field 'container'", CardView.class);
        }

        public final void a() {
            ViewHolder viewHolder = this.b;
            if (viewHolder != null) {
                this.b = null;
                viewHolder.hostName = null;
                viewHolder.container = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public StreamHostPickerAdapter(Context context, int i, boolean z, h hVar) {
        this.c = hVar;
        this.d = context;
        boolean z2 = z && anl.a(context);
        this.b = alr.a(z2);
        this.e = ann.a(i);
    }

    public int getItemCount() {
        return this.b.size();
    }

    public /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        alr alr = (alr) this.b.get(viewHolder2.getAdapterPosition());
        if (this.e.c() == alr.c()) {
            viewHolder2.container.setCardBackgroundColor(aue.a(this.d));
            viewHolder2.hostName.setTextColor(ContextCompat.getColor(this.d, R.color.md_white_1000));
        }
        viewHolder2.hostName.setText(alr.b());
        viewHolder2.container.setOnClickListener(new g(this, alr));
    }

    public /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_host_picker, viewGroup, false));
    }
}
