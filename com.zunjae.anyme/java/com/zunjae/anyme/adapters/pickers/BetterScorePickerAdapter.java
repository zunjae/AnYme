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
import defpackage.amo;
import defpackage.ct;
import java.util.ArrayList;

public final class BetterScorePickerAdapter extends Adapter<ViewHolder> {
    private final a a;
    private final String b = "BetterScorePAd";
    private final Context c;
    private final int d;
    private final int e;
    private ArrayList<amo> f = amo.a();

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView
        LinearLayout linearLayout;
        @BindView
        TextView scoreDescription;
        @BindView
        TextView scoreNumber;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.b = viewHolder;
            viewHolder.scoreNumber = (TextView) ct.a(view, (int) R.id.scoreNumber, "field 'scoreNumber'", TextView.class);
            viewHolder.scoreDescription = (TextView) ct.a(view, (int) R.id.scoreDescription, "field 'scoreDescription'", TextView.class);
            viewHolder.linearLayout = (LinearLayout) ct.a(view, (int) R.id.viewGroupNoAnimeHere, "field 'linearLayout'", LinearLayout.class);
        }

        public final void a() {
            ViewHolder viewHolder = this.b;
            if (viewHolder != null) {
                this.b = null;
                viewHolder.scoreNumber = null;
                viewHolder.scoreDescription = null;
                viewHolder.linearLayout = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public BetterScorePickerAdapter(Context context, int i, a aVar) {
        this.a = aVar;
        this.c = context;
        this.d = i;
        this.e = ContextCompat.getColor(context, R.color.colorAccent);
    }

    private /* synthetic */ void a(amo amo, View view) {
        this.a.onScoreClicked(amo.b());
    }

    public final int getItemCount() {
        return this.f.size();
    }

    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        Context context;
        int i2;
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        amo amo = (amo) this.f.get(viewHolder2.getAdapterPosition());
        TextView textView = viewHolder2.scoreNumber;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(amo.b());
        textView.setText(stringBuilder.toString());
        textView = viewHolder2.scoreDescription;
        stringBuilder = new StringBuilder();
        stringBuilder.append(amo.c());
        textView.setText(stringBuilder.toString());
        if (amo.b() == this.d) {
            viewHolder2.linearLayout.setBackgroundColor(this.e);
            textView = viewHolder2.scoreNumber;
            context = this.c;
            i2 = R.color.md_white_1000;
        } else {
            viewHolder2.linearLayout.setBackgroundColor(ContextCompat.getColor(this.c, 17170443));
            textView = viewHolder2.scoreNumber;
            context = this.c;
            i2 = R.color.transparent_black95;
        }
        textView.setTextColor(ContextCompat.getColor(context, i2));
        viewHolder2.scoreDescription.setTextColor(ContextCompat.getColor(this.c, i2));
        viewHolder2.linearLayout.setOnClickListener(new -$$Lambda$BetterScorePickerAdapter$0-5l1IwtHSsh9kL8dt2LtDXSI34(this, amo));
    }

    public final /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_score_list, viewGroup, false));
    }
}
