package com.zunjae.anyme.adapters;

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
import defpackage.ank;
import defpackage.ct;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.R;

public final class TroubleshootAdapter extends Adapter<ViewHolder> {
    private final String a = "TroubleshootAdapter";
    private final Context b;
    private final ArrayList<ank> c;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView
        TextView bottomText;
        @BindView
        TextView title;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.b = viewHolder;
            viewHolder.title = (TextView) ct.a(view, (int) R.id.title, "field 'title'", TextView.class);
            viewHolder.bottomText = (TextView) ct.a(view, (int) com.zunjae.anyme.R.id.explanation, "field 'bottomText'", TextView.class);
        }

        public final void a() {
            ViewHolder viewHolder = this.b;
            if (viewHolder != null) {
                this.b = null;
                viewHolder.title = null;
                viewHolder.bottomText = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public TroubleshootAdapter(Context context, ArrayList<ank> arrayList) {
        this.b = context;
        this.c = arrayList;
    }

    public final int getItemCount() {
        return this.c.size();
    }

    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        TextView textView;
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        ank ank = (ank) this.c.get(i);
        viewHolder2.title.setText(ank.a());
        viewHolder2.bottomText.setText(ank.b());
        if (ank.c()) {
            viewHolder2.title.setTextColor(ContextCompat.getColor(this.b, com.zunjae.anyme.R.color.colorPrimary));
            textView = viewHolder2.bottomText;
            i = 8;
        } else {
            viewHolder2.title.setTextColor(ContextCompat.getColor(this.b, 17170455));
            textView = viewHolder2.bottomText;
            i = 0;
        }
        textView.setVisibility(i);
    }

    public final /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(com.zunjae.anyme.R.layout.cardview_troubleshoot, viewGroup, false));
    }
}
