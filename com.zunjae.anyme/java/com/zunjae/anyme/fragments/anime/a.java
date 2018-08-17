package com.zunjae.anyme.fragments.anime;

import android.app.Activity;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.anyme.adapters.AllWaifusAdapter;
import com.zunjae.zasync.c;
import defpackage.asp;
import defpackage.ata;
import java.util.List;

final class a extends c<List<asp>> {
    final /* synthetic */ FragmentAnimeDiscover a;

    a(FragmentAnimeDiscover fragmentAnimeDiscover, Activity activity) {
        this.a = fragmentAnimeDiscover;
        super(activity);
    }

    protected final /* synthetic */ void a(Object obj) {
        obj = (List) obj;
        super.a(obj);
        if (obj == null) {
            this.a.errorMessage.setText("Could not connect to Kanon. Swipe down to retry");
            this.a.errorMessage.setVisibility(0);
        } else if (obj.size() == 0) {
            this.a.errorMessage.setText("You have no waifus saved ):\nIf you want to add waifus to your profile then click on the heart-icon in the 'info' tab");
            this.a.errorMessage.setVisibility(0);
        } else {
            this.a.errorMessage.setVisibility(8);
            AllWaifusAdapter allWaifusAdapter = new AllWaifusAdapter((AbstractActivity) this.a.getActivity(), obj, 1, this.a.g);
            FragmentAnimeDiscover fragmentAnimeDiscover = this.a;
            fragmentAnimeDiscover.recyclerViewTopWaifus.setLayoutManager(fragmentAnimeDiscover.a(2));
            this.a.recyclerViewTopWaifus.setAdapter(allWaifusAdapter);
        }
    }

    public final /* synthetic */ Object b() {
        this.a.g;
        return ata.c();
    }
}
