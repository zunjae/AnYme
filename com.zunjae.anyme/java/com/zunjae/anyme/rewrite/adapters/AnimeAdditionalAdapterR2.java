package com.zunjae.anyme.rewrite.adapters;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView.Adapter;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.browsers.BasicWebViewBrowser;
import com.zunjae.anyme.rewrite.activities.AnimeInfoActivityR2;
import defpackage.ane;
import defpackage.anf;
import defpackage.aue;
import defpackage.ct;
import defpackage.tw;
import java.util.ArrayList;

public final class AnimeAdditionalAdapterR2 extends Adapter<ViewHolder> {
    private final String a = getClass().getSimpleName();
    private final Activity b;
    private final ArrayList<ane> c;
    private final int d;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView
        View separator;
        @BindView
        TextView text;
        @BindView
        TextView title;
        @BindView
        ViewGroup viewGroup;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.b = viewHolder;
            viewHolder.text = (TextView) ct.a(view, (int) R.id.content_text, "field 'text'", TextView.class);
            viewHolder.title = (TextView) ct.a(view, (int) R.id.content_title, "field 'title'", TextView.class);
            viewHolder.separator = ct.a(view, R.id.lineSeparator, "field 'separator'");
            viewHolder.viewGroup = (ViewGroup) ct.a(view, (int) R.id.viewGroupNoAnimeHere, "field 'viewGroup'", ViewGroup.class);
        }

        public final void a() {
            ViewHolder viewHolder = this.b;
            if (viewHolder != null) {
                this.b = null;
                viewHolder.text = null;
                viewHolder.title = null;
                viewHolder.separator = null;
                viewHolder.viewGroup = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public AnimeAdditionalAdapterR2(Activity activity, ArrayList<ane> arrayList) {
        this.c = arrayList;
        this.b = activity;
        this.d = aue.b(activity);
    }

    private /* synthetic */ void a(ane ane, View view) {
        Context context;
        switch (a.a[ane.b() - 1]) {
            case tw.a /*1*/:
            case tw.b /*2*/:
                context = this.b;
                context.startActivity(BasicWebViewBrowser.a(context, ane.e()));
                return;
            case f.c /*3*/:
                context = this.b;
                context.startActivity(AnimeInfoActivityR2.a(context, ane.d()));
                return;
            default:
                return;
        }
    }

    public final boolean a() {
        ArrayList arrayList = this.c;
        return arrayList != null && arrayList.size() > 0;
    }

    public final int getItemCount() {
        return this.c.size();
    }

    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        Object obj;
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        ane ane = (ane) this.c.get(viewHolder2.getAdapterPosition());
        viewHolder2.title.setText(ane.a());
        if (!(ane.b() == anf.b || ane.b() == anf.d || ane.b() == anf.g)) {
            if (ane.b() != anf.f) {
                obj = null;
                if (obj == null) {
                    viewHolder2.text.setText(Html.fromHtml(String.format("<strong>%s</strong>", new Object[]{ane.c()})));
                    viewHolder2.text.setTextColor(this.d);
                } else {
                    viewHolder2.text.setText(ane.c());
                }
                viewHolder2.viewGroup.setOnClickListener(new -$$Lambda$AnimeAdditionalAdapterR2$fUbvd7Z2WhL1lR4p46l1QEOtcDk(this, ane));
                if (i != getItemCount() - 1) {
                    viewHolder2.separator.setVisibility(8);
                } else {
                    viewHolder2.separator.setVisibility(0);
                }
            }
        }
        obj = 1;
        if (obj == null) {
            viewHolder2.text.setText(ane.c());
        } else {
            viewHolder2.text.setText(Html.fromHtml(String.format("<strong>%s</strong>", new Object[]{ane.c()})));
            viewHolder2.text.setTextColor(this.d);
        }
        viewHolder2.viewGroup.setOnClickListener(new -$$Lambda$AnimeAdditionalAdapterR2$fUbvd7Z2WhL1lR4p46l1QEOtcDk(this, ane));
        if (i != getItemCount() - 1) {
            viewHolder2.separator.setVisibility(0);
        } else {
            viewHolder2.separator.setVisibility(8);
        }
    }

    public final /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_anime_additional_info, viewGroup, false));
    }
}
