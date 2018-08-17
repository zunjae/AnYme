package com.zunjae.anyme.adapters;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
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
import defpackage.alk;
import defpackage.aue;
import defpackage.ct;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.R;

public final class ThemePickerAdapter extends Adapter<ViewHolder> {
    private final g a;
    private final Context b;
    private final ArrayList<alk> c;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView
        CardView container;
        @BindView
        TextView themeTitle;
        @BindView
        TextView useText;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.b = viewHolder;
            viewHolder.themeTitle = (TextView) ct.a(view, (int) R.id.title, "field 'themeTitle'", TextView.class);
            viewHolder.useText = (TextView) ct.a(view, (int) com.zunjae.anyme.R.id.applyText, "field 'useText'", TextView.class);
            viewHolder.container = (CardView) ct.a(view, (int) com.zunjae.anyme.R.id.cardViewContainer, "field 'container'", CardView.class);
        }

        public final void a() {
            ViewHolder viewHolder = this.b;
            if (viewHolder != null) {
                this.b = null;
                viewHolder.themeTitle = null;
                viewHolder.useText = null;
                viewHolder.container = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public ThemePickerAdapter(Context context, ArrayList<alk> arrayList, g gVar) {
        this.b = context;
        this.c = arrayList;
        this.a = gVar;
    }

    public final int getItemCount() {
        return this.c.size();
    }

    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        alk alk = (alk) this.c.get(i);
        int a = aue.a(this.b, alk.c(), R.attr.colorAccent, ContextCompat.getColor(this.b, com.zunjae.anyme.R.color.accent));
        int a2 = aue.a(this.b, alk.c(), R.attr.colorPrimary, ContextCompat.getColor(this.b, com.zunjae.anyme.R.color.colorPrimary));
        viewHolder2.themeTitle.setText(alk.a());
        viewHolder2.container.setBackground(new GradientDrawable(Orientation.RIGHT_LEFT, new int[]{a2, a}));
        viewHolder2.container.setOnClickListener(new f(this, alk));
    }

    public final /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(com.zunjae.anyme.R.layout.cardview_theme_entry, viewGroup, false));
    }
}
