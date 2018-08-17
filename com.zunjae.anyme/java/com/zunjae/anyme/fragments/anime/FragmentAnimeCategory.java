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
import com.zunjae.anyme.R;
import com.zunjae.anyme.adapters.CategoriesAdapter;
import com.zunjae.zrecyclerview.a;
import com.zunjae.zrecyclerview.b;
import defpackage.ami;
import defpackage.anl;
import java.util.ArrayList;
import java.util.Collections;

public final class FragmentAnimeCategory extends Fragment {
    private Context a;
    @BindView
    RecyclerView recyclerViewCategories;

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ami("Romance, Drama, School", "https://i.imgur.com/u2pgqQ5.png", "https://gist.githubusercontent.com/zunjae/45fdc14644816cbeacb4811985ef96ef/raw/"));
        arrayList.add(new ami("Studio Kyoto Animation", "https://i.imgur.com/mFoCuL9.png", "https://gist.githubusercontent.com/zunjae/e9e603ffa804c13a9844fecca9518faa/raw/"));
        arrayList.add(new ami("Studio J.C.Staff", "https://i.imgur.com/O00pwqa.png", "https://gist.githubusercontent.com/zunjae/397c30c086d3fef89352be27abd573d8/raw/"));
        arrayList.add(new ami("Action, Adventure, Comedy", "https://i.imgur.com/gbB4WWC.png", "https://gist.githubusercontent.com/zunjae/b0a3d1594dc1aeabb9033ded705b5724/raw/"));
        arrayList.add(new ami("Best of 2016, 2017, 2018", "https://i.imgur.com/uYLURzr.png", "https://gist.githubusercontent.com/zunjae/9c432866e078da6dfa2a1db7ec6e36ea/raw/"));
        arrayList.add(new ami("Age 17+", "https://i.imgur.com/ZA4UAMk.png", "https://gist.githubusercontent.com/zunjae/2d7676cedbd8d9cadb431a3d1eb27940/raw/"));
        arrayList.add(new ami("Age 13+", "https://i.imgur.com/spsjLge.png", "https://gist.githubusercontent.com/zunjae/aecd2c42f5f22c85ddc9dc1eba250a94/raw/"));
        arrayList.add(new ami("Top Movies", "https://i.imgur.com/n7lamPy.png", "https://gist.githubusercontent.com/zunjae/6e06a5d05516b55f2de272b8c089ed65/raw/"));
        arrayList.add(new ami("Shonen (Guys)", "https://i.imgur.com/qvVtgDd.png", "https://gist.githubusercontent.com/zunjae/798724322953826d36dce41bbd8cc736/raw/"));
        arrayList.add(new ami("Shojo (Girls)", "https://i.imgur.com/lQBiWXo.png", "https://gist.githubusercontent.com/zunjae/089501191a0522758336899928d049a3/raw/"));
        arrayList.add(new ami("Slice of Life", "https://i.imgur.com/uj1TB0O.png", "https://gist.githubusercontent.com/zunjae/289d7c65700cd1af2d66b6ccb92a2f0e/raw/"));
        arrayList.add(new ami("Harem, Comedy", "https://i.imgur.com/yinVa3d.png", "https://gist.githubusercontent.com/zunjae/b1f34d1ebcf599880606ae5096afbbff/raw/"));
        Collections.shuffle(arrayList);
        if (anl.a(this.a)) {
            arrayList.add(new ami("Hentai", "https://i.imgur.com/wts33gz.png", "https://gist.githubusercontent.com/zunjae/a3e7816fd1479f2a1c19022c32b82638/raw/"));
        }
        new b(this.a, this.recyclerViewCategories, new CategoriesAdapter(getActivity(), arrayList)).a(1, 2).b(a.b).a();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_anime_category, viewGroup, false);
        ButterKnife.a(this, inflate);
        this.a = inflate.getContext();
        return inflate;
    }
}
