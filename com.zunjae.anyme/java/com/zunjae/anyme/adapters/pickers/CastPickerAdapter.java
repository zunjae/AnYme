package com.zunjae.anyme.adapters.pickers;

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
import com.zunjae.zapplib.a;
import defpackage.alf;
import defpackage.ct;
import defpackage.de;
import java.util.ArrayList;

public final class CastPickerAdapter extends Adapter<ViewHolder> {
    private final ArrayList<alf> a = alf.a();
    private final Context b;
    private final d c;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView
        TextView appIsInstalled;
        @BindView
        TextView appName;
        @BindView
        ImageView castImageIcon;
        @BindView
        CardView container;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.b = viewHolder;
            viewHolder.castImageIcon = (ImageView) ct.a(view, (int) R.id.castImage, "field 'castImageIcon'", ImageView.class);
            viewHolder.appName = (TextView) ct.a(view, (int) R.id.castAppName, "field 'appName'", TextView.class);
            viewHolder.appIsInstalled = (TextView) ct.a(view, (int) R.id.castAppNameInstalled, "field 'appIsInstalled'", TextView.class);
            viewHolder.container = (CardView) ct.a(view, (int) R.id.cardViewContainer, "field 'container'", CardView.class);
        }

        public final void a() {
            ViewHolder viewHolder = this.b;
            if (viewHolder != null) {
                this.b = null;
                viewHolder.castImageIcon = null;
                viewHolder.appName = null;
                viewHolder.appIsInstalled = null;
                viewHolder.container = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public CastPickerAdapter(Context context, d dVar) {
        this.b = context;
        this.c = dVar;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        TextView textView;
        int i2;
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        alf alf = (alf) this.a.get(viewHolder2.getAdapterPosition());
        de.b(this.b).a(Integer.valueOf(alf.d())).a(viewHolder2.castImageIcon);
        viewHolder2.appName.setText(alf.b());
        boolean a = a.a(this.b, alf.c());
        if (a) {
            textView = viewHolder2.appIsInstalled;
            i2 = 8;
        } else {
            viewHolder2.appIsInstalled.setText("(click to install app)");
            textView = viewHolder2.appIsInstalled;
            i2 = 0;
        }
        textView.setVisibility(i2);
        viewHolder2.container.setOnClickListener(new c(this, a, alf));
    }

    public final /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_castapp_list, viewGroup, false));
    }
}
