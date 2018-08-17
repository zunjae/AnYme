package com.zunjae.anyme.rewrite.adapters;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.github.ivbaranov.mfb.MaterialFavoriteButton;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.anyme.activities.misc.KanonExplanation;
import com.zunjae.anyme.rewrite.viewmodels.KanonViewModel;
import defpackage.ajm;
import defpackage.anq;
import defpackage.arh;
import defpackage.asp;
import defpackage.ct;
import defpackage.de;
import defpackage.fa;
import defpackage.tw;
import java.util.ArrayList;
import java.util.List;

public class AnimeCharactersAdapterR2 extends Adapter<ViewHolder> {
    private static final String a = "AnimeCharactersAdapterR2";
    private final AbstractActivity b;
    private final KanonViewModel c;
    private List<arh> d;
    private final int e;
    private final String f;
    private final int g;
    private boolean h = false;

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
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public AnimeCharactersAdapterR2(AbstractActivity abstractActivity, List<arh> list, int i, KanonViewModel kanonViewModel, String str, int i2) {
        this.b = abstractActivity;
        this.d = list;
        this.e = i;
        this.c = kanonViewModel;
        this.f = str;
        this.g = i2;
    }

    private /* synthetic */ void a(arh arh, View view) {
        ajm.a(this.b, arh.d());
    }

    private /* synthetic */ void a(arh arh, ViewHolder viewHolder, int i, View view) {
        if (anq.b()) {
            AbstractActivity abstractActivity = this.b;
            abstractActivity.startActivity(new Intent(abstractActivity, KanonExplanation.class));
        } else if (arh.f() == -1) {
            Toast.makeText(this.b, "Could not add this waifu to your favorites (it has an unknown ID)", 1).show();
        } else {
            int i2;
            asp asp = new asp(arh.f(), this.e, arh.d(), arh.g());
            viewHolder.favoriteButton.b();
            if (viewHolder.favoriteButton.a()) {
                arh.a(true);
                i2 = 0;
            } else {
                arh.a(false);
                i2 = 1;
            }
            new b(this, this.b, asp, i2, arh, i, this.c).f();
        }
    }

    private /* synthetic */ void b(arh arh, View view) {
        ajm.a(this.b, arh.d(), arh.e(), this.f);
    }

    public final void a(List<arh> list) {
        this.d = list;
        this.h = true;
        notifyDataSetChanged();
    }

    public final boolean a() {
        List list = this.d;
        return list != null && list.size() > 0;
    }

    public final ArrayList<Integer> b() {
        ArrayList<Integer> arrayList = new ArrayList();
        for (arh arh : this.d) {
            if (arh.a()) {
                arrayList.add(Integer.valueOf(arh.f()));
            }
        }
        return arrayList;
    }

    public int getItemCount() {
        return this.d.size();
    }

    public int getItemViewType(int i) {
        return this.g;
    }

    public /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        arh arh = (arh) this.d.get(i);
        viewHolder2.characterName.setText(Html.fromHtml(arh.d()));
        de.a(this.b).a(arh.g()).b((int) R.drawable.transparent_to_black).a(fa.RESULT).a(viewHolder2.characterImage);
        if (this.h) {
            viewHolder2.gradientOverlay.setVisibility(0);
            viewHolder2.favoriteButton.setVisibility(0);
            viewHolder2.favoriteButton.setFavorite(arh.a());
        } else {
            viewHolder2.gradientOverlay.setVisibility(8);
            viewHolder2.favoriteButton.setVisibility(8);
        }
        viewHolder2.container.setOnClickListener(new -$$Lambda$AnimeCharactersAdapterR2$mizNrfkDjdUBQaOQyGZ2qKpN7wU(this, arh));
        viewHolder2.characterName.setOnClickListener(new -$$Lambda$AnimeCharactersAdapterR2$hgZ4qPNj_aicz4DG7ZS3fgjEAk0(this, arh));
        viewHolder2.favoriteButton.setOnClickListener(new -$$Lambda$AnimeCharactersAdapterR2$ua-wugjjPA3zSIoCqxyENtT5y1U(this, arh, viewHolder2, i));
    }

    public /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from;
        int i2;
        switch (i) {
            case mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                from = LayoutInflater.from(viewGroup.getContext());
                i2 = R.layout.cardview_anime_character;
                break;
            case tw.a /*1*/:
                from = LayoutInflater.from(viewGroup.getContext());
                i2 = R.layout.cardview_anime_character_vertical;
                break;
            default:
                throw new IllegalStateException("incorrect viewtype");
        }
        return new ViewHolder(from.inflate(i2, viewGroup, false));
    }
}
