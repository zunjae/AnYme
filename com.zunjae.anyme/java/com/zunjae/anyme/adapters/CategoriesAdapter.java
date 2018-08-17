package com.zunjae.anyme.adapters;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.explore.CategoryItemsActivity;
import defpackage.ami;
import defpackage.ct;
import defpackage.de;
import java.util.ArrayList;

public final class CategoriesAdapter extends Adapter<ViewHolder> {
    private final ArrayList<ami> a;
    private final Activity b;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView
        TextView categoryName;
        @BindView
        CardView container;
        @BindView
        ImageView coverImage;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.b = viewHolder;
            viewHolder.coverImage = (ImageView) ct.a(view, (int) R.id.coverImage, "field 'coverImage'", ImageView.class);
            viewHolder.categoryName = (TextView) ct.a(view, (int) R.id.categoryName, "field 'categoryName'", TextView.class);
            viewHolder.container = (CardView) ct.a(view, (int) R.id.cardViewContainer, "field 'container'", CardView.class);
        }

        public final void a() {
            ViewHolder viewHolder = this.b;
            if (viewHolder != null) {
                this.b = null;
                viewHolder.coverImage = null;
                viewHolder.categoryName = null;
                viewHolder.container = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public CategoriesAdapter(Activity activity, ArrayList<ami> arrayList) {
        this.a = arrayList;
        this.b = activity;
    }

    private /* synthetic */ void a(ami ami, View view) {
        Context context = this.b;
        context.startActivity(CategoryItemsActivity.a(context, ami));
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        ami ami = (ami) this.a.get(i);
        viewHolder2.categoryName.setText(ami.a());
        de.a(this.b).a(ami.b()).a(viewHolder2.coverImage);
        viewHolder2.container.setOnClickListener(new -$$Lambda$CategoriesAdapter$qPi16c3PYXOT4yZ8i18oLVEVxuY(this, ami));
    }

    public final /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_anime_category, viewGroup, false));
    }
}
