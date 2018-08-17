package com.zunjae.anyme.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import defpackage.alj;
import defpackage.ct;
import defpackage.de;
import defpackage.fa;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.R;

public class Rule34Adapter extends Adapter<ViewHolder> {
    private final String a = Rule34Adapter.class.getSimpleName();
    private final Context b;
    private final ArrayList<alj> c;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView
        ImageView image;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.b = viewHolder;
            viewHolder.image = (ImageView) ct.a(view, (int) R.id.image, "field 'image'", ImageView.class);
        }

        public final void a() {
            ViewHolder viewHolder = this.b;
            if (viewHolder != null) {
                this.b = null;
                viewHolder.image = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public Rule34Adapter(Context context, ArrayList<alj> arrayList) {
        this.b = context;
        this.c = arrayList;
    }

    public int getItemCount() {
        return this.c.size();
    }

    public /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        alj alj = (alj) this.c.get(i);
        de.b(this.b).a(alj.a()).a(fa.NONE).b((int) com.zunjae.anyme.R.drawable.gradient_dark).a(((ViewHolder) viewHolder).image);
    }

    public /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(com.zunjae.anyme.R.layout.cardview_rule34_items, viewGroup, false));
    }
}
