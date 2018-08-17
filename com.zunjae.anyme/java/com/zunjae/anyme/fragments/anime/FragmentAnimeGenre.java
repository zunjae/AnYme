package com.zunjae.anyme.fragments.anime;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.zunjae.anyme.R;
import com.zunjae.anyme.adapters.animes.AnimeGenreAdapter;
import com.zunjae.zrecyclerview.a;
import com.zunjae.zrecyclerview.b;
import defpackage.aml;
import java.util.ArrayList;

public final class FragmentAnimeGenre extends Fragment {
    private aml a;
    private int b = 1;
    private Context c;
    @BindView
    TextView errorMessage;
    @BindView
    RecyclerView recyclerView;
    @BindView
    SwipeRefreshLayout swipeRefreshLayout;

    public static FragmentAnimeGenre a(aml aml, int i) {
        FragmentAnimeGenre fragmentAnimeGenre = new FragmentAnimeGenre();
        Bundle bundle = new Bundle();
        bundle.putInt("pageNumber", i);
        bundle.putParcelable("animeGenre", aml);
        fragmentAnimeGenre.setArguments(bundle);
        return fragmentAnimeGenre;
    }

    static /* synthetic */ void a(FragmentAnimeGenre fragmentAnimeGenre, ArrayList arrayList) {
        fragmentAnimeGenre.swipeRefreshLayout.setEnabled(true);
        if (arrayList == null) {
            fragmentAnimeGenre.errorMessage.setVisibility(0);
            fragmentAnimeGenre.errorMessage.setText("Could not connect to MAL. Swipe down to try again");
            return;
        }
        fragmentAnimeGenre.errorMessage.setVisibility(8);
        if (arrayList.size() == 0) {
            fragmentAnimeGenre.errorMessage.setVisibility(0);
            fragmentAnimeGenre.errorMessage.setText("Could not load any Anime for this genre... sorry");
            return;
        }
        int integer = fragmentAnimeGenre.c.getResources().getInteger(R.integer.span_optimized_layout);
        new b(fragmentAnimeGenre.c, fragmentAnimeGenre.recyclerView, new AnimeGenreAdapter(fragmentAnimeGenre.getActivity(), arrayList, fragmentAnimeGenre.b)).a(integer, integer + 1).b(a.b).a();
        fragmentAnimeGenre.swipeRefreshLayout.setEnabled(false);
    }

    private void a(boolean z) {
        h hVar = new h(this, getActivity());
        hVar.a(z);
        hVar.f();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.a = (aml) getArguments().getParcelable("animeGenre");
        this.b = getArguments().getInt("pageNumber");
        this.swipeRefreshLayout.setOnRefreshListener(new g(this));
        a(false);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_anime_genres, viewGroup, false);
        ButterKnife.a(this, inflate);
        this.c = inflate.getContext();
        return inflate;
    }
}
