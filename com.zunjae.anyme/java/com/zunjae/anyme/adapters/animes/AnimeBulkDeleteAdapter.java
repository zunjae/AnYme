package com.zunjae.anyme.adapters.animes;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import defpackage.are;
import defpackage.ct;
import defpackage.de;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.zhanghai.android.materialprogressbar.R;

public final class AnimeBulkDeleteAdapter extends Adapter<ViewHolder> {
    private final String a = getClass().getSimpleName();
    private final Context b;
    private List<are> c;
    private final a d;
    private List<are> e = new ArrayList();
    private ArrayList<are> f;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView
        CheckBox checkBox;
        @BindView
        CardView container;
        @BindView
        ImageView coverImage;
        @BindView
        TextView lastUpdated;
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
            viewHolder.coverImage = (ImageView) ct.a(view, (int) R.id.image, "field 'coverImage'", ImageView.class);
            viewHolder.title = (TextView) ct.a(view, (int) R.id.title, "field 'title'", TextView.class);
            viewHolder.container = (CardView) ct.a(view, (int) com.zunjae.anyme.R.id.cardViewContainer, "field 'container'", CardView.class);
            viewHolder.checkBox = (CheckBox) ct.a(view, (int) R.id.checkbox, "field 'checkBox'", CheckBox.class);
            viewHolder.lastUpdated = (TextView) ct.a(view, (int) com.zunjae.anyme.R.id.lastUpdated, "field 'lastUpdated'", TextView.class);
        }

        public final void a() {
            ViewHolder viewHolder = this.b;
            if (viewHolder != null) {
                this.b = null;
                viewHolder.coverImage = null;
                viewHolder.title = null;
                viewHolder.container = null;
                viewHolder.checkBox = null;
                viewHolder.lastUpdated = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public AnimeBulkDeleteAdapter(Context context, a aVar) {
        this.b = context;
        this.d = aVar;
    }

    private /* synthetic */ void a(ViewHolder viewHolder, are are, View view) {
        CheckBox checkBox;
        boolean z;
        if (viewHolder.checkBox.isChecked()) {
            this.e.remove(are);
            checkBox = viewHolder.checkBox;
            z = false;
        } else {
            this.e.add(are);
            checkBox = viewHolder.checkBox;
            z = true;
        }
        checkBox.setChecked(z);
        this.d.clicked(this.e.size());
    }

    public final void a() {
        this.e.clear();
        this.e.addAll(this.f);
        notifyDataSetChanged();
    }

    public final void a(List<are> list) {
        this.c = list;
        this.f = new ArrayList(list);
        notifyDataSetChanged();
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        this.f.clear();
        this.f = new ArrayList(this.c);
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            are are = (are) it.next();
            if (!z || are.C() >= 30) {
                if (!z2 || are.v() == 6) {
                    if (z3 && are.i() != 1) {
                    }
                }
            }
            it.remove();
        }
        notifyDataSetChanged();
    }

    public final void b() {
        this.e.clear();
        notifyDataSetChanged();
    }

    public final List<are> c() {
        return this.e;
    }

    public final List<are> d() {
        return this.f;
    }

    public final int getItemCount() {
        ArrayList arrayList = this.f;
        return arrayList != null ? arrayList.size() : 0;
    }

    @SuppressLint({"DefaultLocale"})
    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        are are = (are) this.f.get(i);
        de.b(this.b).a(are.n()).a().a(viewHolder2.coverImage);
        viewHolder2.title.setText(are.g());
        viewHolder2.lastUpdated.setText(String.format("%d days ago", new Object[]{Integer.valueOf(are.C())}));
        viewHolder2.container.setOnClickListener(new -$$Lambda$AnimeBulkDeleteAdapter$kZKFipwK-g1c5i0vLUn-OAz8j7s(this, viewHolder2, are));
        viewHolder2.checkBox.setChecked(this.e.contains(are));
    }

    public final /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(com.zunjae.anyme.R.layout.cardview_anime_bulk_delete, viewGroup, false));
    }
}
