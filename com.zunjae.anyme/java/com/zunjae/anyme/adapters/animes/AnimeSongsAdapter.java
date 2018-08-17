package com.zunjae.anyme.adapters.animes;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.asd;
import defpackage.ase;
import defpackage.aue;
import defpackage.aug;
import defpackage.ct;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class AnimeSongsAdapter extends Adapter<ViewHolder> {
    private final String a = "AnimeVideoAdapter";
    private final Context b;
    private final List<asd> c;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView
        CardView container;
        @BindView
        TextView songType;
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
            viewHolder.title = (TextView) ct.a(view, (int) R.id.songTitle, "field 'title'", TextView.class);
            viewHolder.container = (CardView) ct.a(view, (int) R.id.cardViewContainer, "field 'container'", CardView.class);
            viewHolder.songType = (TextView) ct.a(view, (int) R.id.songType, "field 'songType'", TextView.class);
        }

        public final void a() {
            ViewHolder viewHolder = this.b;
            if (viewHolder != null) {
                this.b = null;
                viewHolder.title = null;
                viewHolder.container = null;
                viewHolder.songType = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public AnimeSongsAdapter(Context context, List<asd> list) {
        this.b = context;
        this.c = list;
    }

    private /* synthetic */ boolean a(asd asd, View view) {
        Toast makeText;
        String c = asd.c();
        if (c != null) {
            aug.a(this.b, c);
            makeText = Toast.makeText(this.b, String.format("Copied '%s' to your clipboard", new Object[]{c}), 0);
        } else {
            makeText = Toast.makeText(this.b, "Could not find title", 0);
        }
        makeText.show();
        return true;
    }

    private /* synthetic */ void b(asd asd, View view) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format("https://www.youtube.com/results?search_query=%s", new Object[]{asd.d()})));
        intent.setFlags(268435456);
        this.b.startActivity(intent);
    }

    public final int getItemCount() {
        return this.c.size();
    }

    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        TextView textView;
        CharSequence charSequence;
        ArrayList arrayList;
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        asd asd = (asd) this.c.get(i);
        if (asd.a() == ase.a) {
            textView = viewHolder2.songType;
            charSequence = "Opening Theme";
        } else {
            textView = viewHolder2.songType;
            charSequence = "Ending Theme";
        }
        textView.setText(charSequence);
        CharSequence spannableString = new SpannableString(asd.b());
        Matcher matcher = Pattern.compile("\"([^\"]*)\"").matcher(asd.b());
        if (matcher.find()) {
            arrayList = new ArrayList(2);
            arrayList.add(Integer.valueOf(matcher.start() + 1));
            arrayList.add(Integer.valueOf(matcher.end() - 1));
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            spannableString.setSpan(new ForegroundColorSpan(aue.a(this.b)), ((Integer) arrayList.get(0)).intValue(), ((Integer) arrayList.get(1)).intValue(), 33);
        }
        viewHolder2.title.setText(spannableString);
        viewHolder2.container.setOnClickListener(new -$$Lambda$AnimeSongsAdapter$S0IsfnlZHpV7WzcFfql1gVztUE4(this, asd));
        viewHolder2.container.setOnLongClickListener(new -$$Lambda$AnimeSongsAdapter$89JT1I5E7GKghFDBZk_MT1UsJJA(this, asd));
    }

    public final /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_music, viewGroup, false));
    }
}
