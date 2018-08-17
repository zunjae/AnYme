package com.zunjae.anyme.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.zunjae.anyme.R;
import com.zunjae.anyme.adapters.animes.AnimeGenreTitlesAdapter;

public class FragmentGenres extends Fragment {
    private Context a;
    @BindView
    RecyclerView recyclerViewGenre;

    public static FragmentGenres a() {
        return new FragmentGenres();
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.recyclerViewGenre.setLayoutManager(new GridLayoutManager(this.a, 1, 0, false));
        this.recyclerViewGenre.setAdapter(new AnimeGenreTitlesAdapter(this.a));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_show_genres, viewGroup, false);
        ButterKnife.a(this, inflate);
        this.a = inflate.getContext();
        return inflate;
    }
}
