package com.zunjae.anyme.rewrite.ui.fragments;

import android.arch.lifecycle.as;
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
import com.zunjae.anyme.adapters.EpisodeNoteAdapter;
import com.zunjae.anyme.rewrite.viewmodels.AnimeViewModel;
import com.zunjae.anyme.rewrite.viewmodels.KanonViewModel;
import com.zunjae.zrecyclerview.a;
import com.zunjae.zrecyclerview.b;
import defpackage.are;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class FragmentEpisodeNotesR2 extends Fragment {
    static final /* synthetic */ boolean a = true;
    private Context b;
    private are c;
    private AnimeViewModel d;
    private KanonViewModel e;
    @BindView
    TextView errorMessage;
    @BindView
    RecyclerView recyclerView;
    @BindView
    SwipeRefreshLayout swipeRefreshLayout;

    public static FragmentEpisodeNotesR2 a(long j) {
        FragmentEpisodeNotesR2 fragmentEpisodeNotesR2 = new FragmentEpisodeNotesR2();
        Bundle bundle = new Bundle();
        bundle.putLong("animeId", j);
        fragmentEpisodeNotesR2.setArguments(bundle);
        return fragmentEpisodeNotesR2;
    }

    private /* synthetic */ void a() {
        new f(this, getActivity()).f();
    }

    private /* synthetic */ void a(long j, are are) {
        if (are != null) {
            this.c = are;
            new f(this, getActivity()).f();
            this.errorMessage.setVisibility(8);
            return;
        }
        this.c = are.a(j, BuildConfig.FLAVOR, BuildConfig.FLAVOR);
        this.errorMessage.setVisibility(0);
        this.errorMessage.setText("Add this show to your profile to start adding notes!");
    }

    static /* synthetic */ void a(FragmentEpisodeNotesR2 fragmentEpisodeNotesR2, ArrayList arrayList) {
        b bVar = new b(fragmentEpisodeNotesR2.b, fragmentEpisodeNotesR2.recyclerView, new EpisodeNoteAdapter(fragmentEpisodeNotesR2.getActivity(), arrayList, fragmentEpisodeNotesR2.e));
        int i = 2;
        bVar.a(1, 2).b(a.b).a();
        int y = fragmentEpisodeNotesR2.c.y();
        if (y > 0) {
            if (y == 1) {
                i = 1;
            }
            fragmentEpisodeNotesR2.recyclerView.scrollToPosition(y - i);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (!a) {
            if (getArguments() == null) {
                throw new AssertionError();
            }
        }
        long j = getArguments().getLong("animeId", -1);
        if (j != -1) {
            this.d.a(j).observe(this, new -$$Lambda$FragmentEpisodeNotesR2$izhsXyJEQ0cQwpx5OQ6JHgy6ROU(this, j));
            return;
        }
        throw new IllegalArgumentException("Incorrectly set the arguments");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_add_note_to_anime, viewGroup, false);
        ButterKnife.a(this, inflate);
        this.b = inflate.getContext();
        this.d = (AnimeViewModel) as.a(this).a(AnimeViewModel.class);
        this.e = (KanonViewModel) as.a(this).a(KanonViewModel.class);
        this.swipeRefreshLayout.setOnRefreshListener(new -$$Lambda$FragmentEpisodeNotesR2$SvmdmfmjWP5OhXfp4i6cwqJPvh0(this));
        return inflate;
    }
}
