package com.zunjae.anyme.adapters;

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
import com.github.ivbaranov.mfb.MaterialFavoriteButton;
import com.mikepenz.iconics.view.IconicsTextView;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.anyme.rewrite.viewmodels.KanonViewModel;
import defpackage.ajm;
import defpackage.asp;
import defpackage.aux;
import defpackage.ct;
import defpackage.de;
import defpackage.fa;
import defpackage.tw;
import java.util.List;

public final class AllWaifusAdapter extends Adapter<ViewHolder> {
    private final String a = "AnimeVideoAdapter";
    private final AbstractActivity b;
    private List<asp> c;
    private final int d;
    private final KanonViewModel e;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView
        ImageView characterImage;
        @BindView
        TextView characterName;
        @BindView
        CardView container;
        @BindView
        MaterialFavoriteButton favoriteButton;
        @BindView
        View gradientOverlay;
        @BindView
        IconicsTextView waifuStars;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.b = viewHolder;
            viewHolder.characterImage = (ImageView) ct.a(view, (int) R.id.characterImage, "field 'characterImage'", ImageView.class);
            viewHolder.characterName = (TextView) ct.a(view, (int) R.id.characterName, "field 'characterName'", TextView.class);
            viewHolder.container = (CardView) ct.a(view, (int) R.id.cardViewContainer, "field 'container'", CardView.class);
            viewHolder.favoriteButton = (MaterialFavoriteButton) ct.a(view, (int) R.id.favoriteButton, "field 'favoriteButton'", MaterialFavoriteButton.class);
            viewHolder.gradientOverlay = ct.a(view, R.id.gradientOverlay, "field 'gradientOverlay'");
            viewHolder.waifuStars = (IconicsTextView) ct.a(view, (int) R.id.waifuStars, "field 'waifuStars'", IconicsTextView.class);
        }

        public final void a() {
            ViewHolder viewHolder = this.b;
            if (viewHolder != null) {
                this.b = null;
                viewHolder.characterImage = null;
                viewHolder.characterName = null;
                viewHolder.container = null;
                viewHolder.favoriteButton = null;
                viewHolder.gradientOverlay = null;
                viewHolder.waifuStars = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public AllWaifusAdapter(AbstractActivity abstractActivity, List<asp> list, int i, KanonViewModel kanonViewModel) {
        this.b = abstractActivity;
        this.c = list;
        this.d = i;
        this.e = kanonViewModel;
    }

    private /* synthetic */ void a(asp asp, int i, View view) {
        new b(this, this.b, asp, i).f();
    }

    private /* synthetic */ void a(asp asp, View view) {
        ajm.a(this.b, asp.d(), String.format("https://myanimelist.net/character/%d", new Object[]{Integer.valueOf(asp.b())}), null);
    }

    public final void a() {
        asp.a(this.c, aux.b("KEY_SORT_ORDER_WAIFU", 0));
        notifyDataSetChanged();
    }

    public final void a(List<asp> list) {
        this.c = list;
        notifyDataSetChanged();
    }

    public final boolean b() {
        return getItemCount() > 0;
    }

    public final int getItemCount() {
        return this.c.size();
    }

    public final int getItemViewType(int i) {
        return this.d;
    }

    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        asp asp = (asp) this.c.get(i);
        de.a(this.b).a(asp.e()).b((int) R.drawable.transparent_to_black).a(fa.RESULT).a(viewHolder2.characterImage);
        viewHolder2.gradientOverlay.setVisibility(0);
        viewHolder2.favoriteButton.setVisibility(0);
        viewHolder2.favoriteButton.setFavorite(true);
        viewHolder2.characterName.setText(asp.d());
        if (asp.a() > 0) {
            IconicsTextView iconicsTextView = viewHolder2.waifuStars;
            StringBuilder stringBuilder = new StringBuilder("{faw-star} ");
            stringBuilder.append(asp.a());
            iconicsTextView.setText(stringBuilder.toString());
            viewHolder2.waifuStars.setVisibility(0);
            viewHolder2.gradientOverlay.setVisibility(8);
        } else {
            viewHolder2.waifuStars.setVisibility(8);
            viewHolder2.gradientOverlay.setVisibility(0);
        }
        if (getItemViewType(i) == 1) {
            viewHolder2.favoriteButton.setVisibility(8);
        } else {
            viewHolder2.favoriteButton.setVisibility(0);
        }
        viewHolder2.container.setOnClickListener(new -$$Lambda$AllWaifusAdapter$zC64xICn6wshQJvlmqkEh3UF9-M(this, asp));
        viewHolder2.characterName.setOnClickListener(new a(this, asp));
        viewHolder2.favoriteButton.setOnClickListener(new -$$Lambda$AllWaifusAdapter$pV7GMdxODimnWZayGVGFNCTMAPA(this, asp, i));
    }

    public final /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from;
        int i2;
        switch (i) {
            case mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                from = LayoutInflater.from(viewGroup.getContext());
                i2 = R.layout.cardview_user_waifus;
                break;
            case tw.a /*1*/:
                from = LayoutInflater.from(viewGroup.getContext());
                i2 = R.layout.cardview_all_waifus_top;
                break;
            default:
                throw new IllegalArgumentException("No switch case found for viewType ".concat(String.valueOf(i)));
        }
        return new ViewHolder(from.inflate(i2, viewGroup, false));
    }
}
