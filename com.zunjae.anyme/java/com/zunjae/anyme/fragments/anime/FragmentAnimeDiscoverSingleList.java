package com.zunjae.anyme.fragments.anime;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.zunjae.anyme.adapters.animes.AnimeDiscoveryListAdapter;
import com.zunjae.zrecyclerview.a;
import com.zunjae.zrecyclerview.b;
import defpackage.amz;
import defpackage.anp;
import defpackage.tw;
import java.util.ArrayList;
import mehdi.sakout.fancybuttons.R;

public class FragmentAnimeDiscoverSingleList extends Fragment {
    private Context a;
    @BindView
    RecyclerView recyclerView;

    public static FragmentAnimeDiscoverSingleList a(int i) {
        FragmentAnimeDiscoverSingleList fragmentAnimeDiscoverSingleList = new FragmentAnimeDiscoverSingleList();
        Bundle bundle = new Bundle();
        bundle.putInt("listType", i);
        fragmentAnimeDiscoverSingleList.setArguments(bundle);
        return fragmentAnimeDiscoverSingleList;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        amz b = anp.b();
        if (b != null) {
            ArrayList a;
            switch (getArguments().getInt("listType")) {
                case R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                    a = b.a().a();
                    break;
                case tw.a /*1*/:
                    a = b.a().b();
                    break;
                case tw.b /*2*/:
                    a = b.a().c();
                    break;
                default:
                    throw new IllegalArgumentException("Forgot to set a list type");
            }
            int integer = this.a.getResources().getInteger(com.zunjae.anyme.R.integer.span_optimized_layout);
            new b(this.a, this.recyclerView, new AnimeDiscoveryListAdapter(getActivity(), a)).a(integer, integer + 1).b(a.b).a();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(com.zunjae.anyme.R.layout.fragment_anime_discovery_single_list, viewGroup, false);
        ButterKnife.a(this, inflate);
        this.a = inflate.getContext();
        return inflate;
    }
}
